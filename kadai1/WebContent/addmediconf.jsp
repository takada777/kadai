<%@page import="com.sun.corba.se.spi.orbutil.fsm.Action"%>
<%@page import="dao.Dao1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession httpSession=request.getSession();
String medicineid=request.getParameter("medicineid");
String medicinename=request.getParameter("medicinename");
String unit=request.getParameter("unit");
String empfname111=(String)session.getAttribute("empfname111");





if(empfname111!=null){%>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>確認画面</title>
</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>

<%if(medicineid=="" || medicinename=="" || unit==""){ %>
<p>入力されていない箇所があります</p>
<form action="addmedicine.jsp" method="post">
<input type="submit" value="戻る" name="action">
</form>
<% }else{ %>
<p>この内容で登録しますか？</p>
<p>薬ID</p>
<%=medicineid %>
<p>薬名</p>
<%=medicinename %>
<p>単位</p>
<%=unit %>





<form action="addmedicomp.jsp" method="post">
<input type="submit" value="登録する" name="action">
<input type="hidden" name="medicineid" value="<%=medicineid%>">
<input type="hidden" name="medicinename" value="<%=medicinename%>">
<input type="hidden" name="unit" value="<%=unit%>">
</form>
<form action="addmedicine.jsp" method="post">
<input type="submit" value="戻る" name="action">
</form>
<%} %>
<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>



</body>
</html>