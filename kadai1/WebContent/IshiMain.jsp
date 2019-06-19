<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%
HttpSession httpSession=request.getSession();
String empid=(String)session.getAttribute("empid");

%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>医師ページ</title>
</head>
<body>
<h3>医師メニュー</h3>
<br>
<form action="SerchPatient2.jsp" method="post">
<input type="submit"  value="患者検索">
<input type="hidden" name="empid" value="<%=empid%>">
</form>
<br>
<form action="ChangeEmpPass3" method="post">
<input type="submit"  value="パスワード変更" >
<input type="hidden" name="empid" value="<%=empid%>">
</form>
<br>

</body>
</html>