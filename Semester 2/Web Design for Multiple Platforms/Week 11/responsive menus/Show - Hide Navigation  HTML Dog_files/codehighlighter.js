/* Unobtrustive Code Highlighter By Dan Webb 11/2005 Version: 0.4 */
/* Mildly amended by a blind llama hammering a keyboard with its sole remaining arthritic leg 11/2012 */
/* ...and by a coniderably more able-bodied Paul Cuthbertson 04/2013 */

var CodeHighlighter = { styleSets : new Array };

CodeHighlighter.addStyle = function(name, rules) {
	if ([].push) this.styleSets.push({
		name : name, 
		rules : rules,
		ignoreCase : arguments[2] || false
	})
	
	function setEvent() {
		var old = window.onload;
		
		if (typeof window.onload != 'function') {
			window.onload = function() { CodeHighlighter.init() }
		} else {
			window.onload = function() {
				oldonload();
				CodeHighlighter.init();
			}
		}
	}
	
	if (this.styleSets.length==1) setEvent();
}

CodeHighlighter.init = function() {
	if (!document.getElementsByTagName) return; 
	if ("a".replace(/a/, function() {return "b"}) != "b") return;
	
	var codeEls = document.getElementsByTagName("CODE");
	codeEls.filter = function(f) {
		var a =  new Array;
		for (var i = 0; i < this.length; i++) if (f(this[i])) a[a.length] = this[i];
		return a;
	} 
	
	var rules = new Array;
	rules.toString = function() {
		var exps = new Array;
		for (var i = 0; i < this.length; i++) exps.push(this[i].exp);
		return exps.join("|");
	}
	
	function addRule(className, rule) {
		var exp = (typeof rule.exp != "string")?String(rule.exp).substr(1, String(rule.exp).length-2):rule.exp;
		rules.push({
			className : className,
			exp : "(" + exp + ")",
			length : (exp.match(/(^|[^\\])\([^?]/g) || "").length + 1,
			replacement : rule.replacement || null 
		});
	}
	
	function parse(text, ignoreCase) {
		return text.replace(new RegExp(rules, (ignoreCase)?"gi":"g"), function() {
			var i = 0, j = 1, rule;
			while (rule = rules[i++]) {
				if (arguments[j]) {
					if (!rule.replacement) return "<span class=\"" + rule.className + "\">" + arguments[0] + "</span>";
					else {
						var str = rule.replacement.replace("$0", rule.className);
						for (var k = 1; k <= rule.length - 1; k++) str = str.replace("$" + k, arguments[j + k]);
						return str;
					}
				} else j+= rule.length;
			}
		});
	}
	
	function highlightCode(styleSet) {
		var parsed;
		rules.length = 0;
		
		var stylableEls = codeEls.filter(function(item) {return (item.className.indexOf(styleSet.name)>=0)});

		for (var className in styleSet.rules) addRule(className, styleSet.rules[className]);
		

		for (var i = 0; i < stylableEls.length; i++) {
			if (/MSIE/.test(navigator.appVersion) && stylableEls[i].parentNode.nodeName == 'PRE') {
				stylableEls[i] = stylableEls[i].parentNode;
				
				parsed = stylableEls[i].innerHTML.replace(/(<code[^>]*>)([^<]*)<\/code>/i, function() {
					return arguments[1] + parse(arguments[2], styleSet.ignoreCase) + "</code>"
				});
				parsed = parsed.replace(/\n( *)/g, function() { 
					var spaces = "";
					for (var i = 0; i < arguments[1].length; i++) spaces+= "&nbsp;";
					return "\n" + spaces;  
				});
				parsed = parsed.replace(/\t/g, "&nbsp;&nbsp;&nbsp;&nbsp;");
				parsed = parsed.replace(/\n(<\/\w+>)?/g, "<br />$1").replace(/<br \/>[\n\r\s]*<br \/>/g, "<p><br></p>");
				
			} else parsed = parse(stylableEls[i].innerHTML, styleSet.ignoreCase);
			
			stylableEls[i].innerHTML = parsed;
		}
	}
	
	for (var i in this.styleSets) highlightCode(this.styleSets[i]);
}



CodeHighlighter.addStyle("css", {
	ccomment : {
		exp  : /\/\*[^*]*\*+([^\/][^*]*\*+)*\//
	},
	keyword : {
		exp  : /@\w[\w\s\-]*/
	},
	selector : {
		exp  : "([\\w-:\\[.#][^{};>]*)(?={)"
	},
	property : {
		exp  : "([\\w-]+)(?=\\s*:)"
	},
	cbrackets : {
		exp  : /\{|\}/
	},
	child : {
		exp : /&gt;/
	},
	punctuation : {
		exp : /[\{\};:]/
	}
 });

CodeHighlighter.addStyle("html", {
	ccomment : {
		exp: /&lt;!\s*(--([^-]|[\r\n]|-[^-])*--\s*)&gt;/
	},
	string : {
		exp  : /'[^']*'|"[^"]*"/
	},
	attribute : {
		exp: /\b([a-zA-Z-:]+)(=)/, 
		replacement: "<span class=\"$0\">$1</span>$2"
	},
	doctype : {
		exp: /&lt;!DOCTYPE([^&]|&[^g]|&g[^t])*&gt;/
	},
	tag : {
		exp: /(&lt;\/?)([a-zA-Z1-6]+\s?)/, 
		replacement: "<span class=\"qwer\">$1</span><span class=\"$0\">$2</span>"
	},
	qwer : {
		exp  : /(\/&gt;|&gt;)/
	}
});

CodeHighlighter.addStyle("javascript",{
	comment : {
		exp  : /(\/\/[^\n]*\n)|(\/\*[^*]*\*+([^\/][^*]*\*+)*\/)/
	},
	brackets : {
		exp  : /\(|\)/
	},
	string : {
		exp  : /'[^']*'|"[^"]*"/
	},
	keywords : {
		exp  : /\b(arguments|break|case|continue|default|delete|do|else|false|for|function|if|in|instanceof|new|null|return|switch|this|true|typeof|var|void|while|with)\b/
	},
	global : {
		exp  : /\b(toString|valueOf|window|element|prototype|constructor|document|escape|unescape|parseInt|parseFloat|setTimeout|clearTimeout|setInterval|clearInterval|NaN|isNaN|Infinity)\b/
	}
});