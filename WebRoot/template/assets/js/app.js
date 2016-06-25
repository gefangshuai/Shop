(function($) {
  'use strict';

  $(function() {
    var $fullText = $('.admin-fullText');
    $('#admin-fullscreen').on('click', function() {
      $.AMUI.fullscreen.toggle();
    });

    $(document).on($.AMUI.fullscreen.raw.fullscreenchange, function() {
      $.AMUI.fullscreen.isFullscreen ? $fullText.text('关闭全屏') : $fullText.text('开启全屏');
    });
  });
  
})(jQuery);

$('a.delete').on('click', function(e){
	 e.preventDefault();
	 var $this = $(this);
	 if(confirm('确认要删除记录吗？')){
		 $.get($this.href, function(data){
			alert(data)
		 })
	 }
 });