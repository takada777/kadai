<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.Dao1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>完了</title>
</head>
<body>
<%
HttpSession httpSession=request.getSession();
String tabyouinid=(String)session.getAttribute("tabyouinid");
String tabyouinmei=(String)session.getAttribute("tabyouinmei");
String tabyouinaddress=(String)session.getAttribute("tabyouinaddress");
String tabyouintel=(String)session.getAttribute("tabyouintel");
String tabyouinshihonkin=(String)session.getAttribute("tabyouinshihonkin");
String kyukyu=(String)session.getAttribute("kyukyu");




%>
<p>完了しました</p>
<form action="TabyouinRegister.jsp" method="post">
<input type="submit" value="続けて登録">
</form>
<form action="AdminMain.jsp" method="post">
<input type="submit" value="メニューへ">
</form>
<%

	Dao1 dao=new Dao1();

			dao.TabyouinRegister(tabyouinid, tabyouinmei, tabyouinaddress, tabyouintel, tabyouinshihonkin, kyukyu);
			dao.close();

			%>
</body>
</html>