<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Spring Boot Sample</title>

</head>

<body>
    Time: ${time}
    <br>
    Message: ${message}
    <br>
        <button id="btnGet" >get请求</button>
     <div >换行</div>
     <br>
        <button id="btnPost" >post请求</button>
<script type="text/javascript" src="webjars/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script>
</body>
</html>
<script language="javascript">
$(function(){
      var xsrfToken=$.cookie('XSRF-TOKEN');
      $.ajaxSetup( {
          headers: { // 默认添加请求头
              "X-XSRF-TOKEN": xsrfToken
          }
      });

       $("#btnGet").click(function(){
             $.ajax({
                     url : 'user/jack',
                     type : 'get',
                     dataType : 'json',
                     success : function(result) {
                         if (result.code == 0) {
                                 alert(result.data);
                         } else {

                         }
                     },
                     error : function(e) {
                         alert("系统异常");
                     }
                 });
       });

        $("#btnPost").click(function(){
            $.ajax({
                           url : 'user/jerry',
                           /*beforeSend: function(request) {
                                       request.setRequestHeader("X-XSRF-TOKEN",xsrfToken);
                            },*/
                           type : 'post',
                           contentType: 'application/json',
                           data: JSON.stringify({"id":"id0003","name":"name0003"}),
                           dataType : 'json',
                           success : function(result) {
                               if (result.code == 0) {
                                    alert(result.data.name);
                               } else {

                               }
                           },
                           error : function(e) {
                               alert("系统异常");
                           }
                       });
        });

});



</script>