//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
  var $ = layui.$ //由于layer弹层依赖jQuery，所以可以直接得到
  ,layer = layui.layer;
  
  var iframe_height = $('.layui-body').height() - 70;
  $('#iframe').height(iframe_height);
  
  
});