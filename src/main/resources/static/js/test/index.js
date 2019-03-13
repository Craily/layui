//JavaScript代码区域
layui.use('element', function() {
	var element = layui.element;

	var $ = layui.$ // 由于layer弹层依赖jQuery，所以可以直接得到
	, layer = layui.layer;

	element.on('nav(navigation)', function(elem) {
		$.ajaxSetup ({cache: false});
		$.get('table', function(date){
			element.tabAdd('tabnav', {
				title : '选项卡的标题',
				content : date,
				id : '1'
			});
		});
		
		
		
	});

});