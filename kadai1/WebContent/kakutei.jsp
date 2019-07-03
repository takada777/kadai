<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>完了</title>
<%
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){
%>
</head>
<body>
<p>登録完了しました</p>
<input type="button" value="メニューへ戻る"
			onclick="location.href='IshiMain.jsp'" />
			<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>