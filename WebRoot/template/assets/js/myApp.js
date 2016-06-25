(function(){
	$('a.delete').on('click', function(e){
		 e.preventDefault();
		 var $this = $(this);
		 if(confirm('确认要删除记录吗？')){
			 $.get($this.attr('href'), function(data){
				alert(data.message)
				location.reload()
			 })
		 }
	 });
})();
