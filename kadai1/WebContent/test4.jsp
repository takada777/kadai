<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  String empfname777= (String)session.getAttribute("empfname777");
if(empfname777!=null){%>
<title>変更完了</title>
</head>
<body>
<p>変更されました</p>
<form action="SerchEmp.jsp" method="post">
<input type="submit" value="続けて変更">
</form>
<form action="AdminMain.jsp" method="post">
<input type="submit" value="メニューに戻る">
</form>
<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>