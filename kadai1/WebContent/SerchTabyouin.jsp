<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>病院検索</title>
</head>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  eBean.getEmpfname();
if(eBean.getEmpfname()!=null){%>
<body>
<form action="TabyouinQueryServlet" method="get">
<font size="5">
病院検索
</font>
<p>住所の一部を入力してください<br>
<input type="text" name="tabyouinaddress"></p>
<input type="submit" value="検索する">
</form>
<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>