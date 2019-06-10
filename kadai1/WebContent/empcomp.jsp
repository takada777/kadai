<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.Dao1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>官僚</title>
</head>
<body>
<%
HttpSession httpSession=request.getSession();
String empid=(String)session.getAttribute("empid");
String empfname=(String)session.getAttribute("empfname");
String emplname=(String)session.getAttribute("emplname");
String emppasswd=(String)session.getAttribute("emppasswd");
String emprole=(String)session.getAttribute("emprole");





%>
<p>かんりょうしました</p>
<% String action=request.getParameter("action");

	Dao1 dao=new Dao1();

			dao.Register(empid, empfname, emplname, emppasswd, emprole);
			dao.close();

			%>
</body>
</html>