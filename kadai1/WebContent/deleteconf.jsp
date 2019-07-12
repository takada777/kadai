<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="kadai1.*"%>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="mBean" class="kadai1.MedicineBean" scope="session"/>
<% String medicineid=request.getParameter("medicineid");
String medicinename=request.getParameter("medicinename");
String unit=request.getParameter("unit");
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){

%>
<p>削除しますか？</p>
<p>薬ID:

<%=medicineid %></p>
<p>薬名:

<%=medicinename %></p>
<p>単位:

<%=unit %></p>











<form action="medidelicomp.jsp" method="post">
<input type="submit" value="削除する" name="action">
<input type="hidden" name="medicineid" value="<%=medicineid%>">
<input type="hidden" name="medicinename" value="<%=medicinename%>">
<input type="hidden" name="unit" value="<%=unit%>">
</form><br>
			<input type="button" value="戻る"
			onclick="location.href='kusuri.jsp'" />






<% } %>
</body>
</html>