<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.Dao1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession httpSession=request.getSession();
String tabyouinid=(String)session.getAttribute("tabyouinid");
String tabyouinmei=(String)session.getAttribute("tabyouinmei");
String tabyouinaddress=(String)session.getAttribute("tabyouinaddress");
String tabyouintel=(String)session.getAttribute("tabyouintel");
//String tabyouinshihonkin=(String)session.getAttribute("tabyouinshihonkin");
//String kyukyu=(String)session.getAttribute("kyukyu");





%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>確認</title>
</head>
<body>
<p>この内容で登録しますか？</p>
<p>他病院ID</p>
<%=tabyouinid %>
<p>他病院名</p>
<%=tabyouinmei %>
<p>住所</p>
<%=tabyouinaddress %>
<p>電話番号</p>
<%=tabyouintel %>
<p>資本金</p>

<p>救急</p>

<form action="tabyouincomp.jsp" method="post">
<input type="submit" value="登録する" name="action">

</form>
<form action="TabyouinRegister.jsp" method="post">
<input type="submit" value="戻る" name="action">
</form>
</body>
</html>