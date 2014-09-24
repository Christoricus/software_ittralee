$(window).load(function() {

    var topic_list = $.cookie("article-topics");

    var popular_topics = $('#article-popular-topics');
    var all_topics = $('#article-all-topics');

    if(topic_list == 1) {
        popular_topics.hide();
        all_topics.show();
    }

    $('#article-see-all-topics').click(function() {
        $.cookie("article-topics", 1, {path: '/'});
        popular_topics.hide();
        all_topics.show();
    });

    $('#article-hide-all-topics').click(function() {
        $.cookie("article-topics", 0, {path: '/'});
        all_topics.hide();
        popular_topics.show();
    });

});