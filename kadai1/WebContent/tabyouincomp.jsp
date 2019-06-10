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
//String emprole=(String)session.getAttribute("emprole");
int tabyouinshihonkin=1;
int kyukyu=1;




%>
<p>かんりょうしました</p>
<%

	Dao1 dao=new Dao1();

			dao.TabyouinRegister(tabyouinid, tabyouinmei, tabyouinaddress, tabyouintel, tabyouinshihonkin, kyukyu);
			dao.close();

			%>
</body>
</html>