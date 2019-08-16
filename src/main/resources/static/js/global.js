$(function(){
      var xsrfToken=$.cookie('XSRF-TOKEN');
      $.ajaxSetup( {
          headers: { // 默认添加请求头
              "X-XSRF-TOKEN": xsrfToken
          }
      });
});