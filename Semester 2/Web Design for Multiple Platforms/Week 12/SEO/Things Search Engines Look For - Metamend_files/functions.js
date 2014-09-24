function showdiv(layer_ref){var state='block';if(document.getElementById){hza=document.getElementById(layer_ref);hza.style.display=state;return;}
if(document.all){eval("document.all."+ layer_ref+".style.display = state");}
if(document.layers){document.layers[layer_ref].display=state;}}
function hidediv(layer_ref){var state='none';if(document.getElementById){hza=document.getElementById(layer_ref);hza.style.display=state;return;}
if(document.all){eval("document.all."+ layer_ref+".style.display = state");}
if(document.layers){document.layers[layer_ref].display=state;}}