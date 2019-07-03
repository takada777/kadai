<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薬登録</title>
</head>
<body>

<%  String empfname=(String) session.getAttribute("empfname111");
if(empfname!=null){%>
<form action="addmediconf.jsp" method="get">
<font size="5">
薬登録
</font>
<p>薬ID<br>
<input type="text" name="medicineid"></p>
<p>薬名<br>
<input type="text" name="medicinename"></p>
<p>単位<br>
<input type="text" name="unit"></p>

<input type="submit" value="登録する">
</form>
<input type="button" value="戻る"
			onclick="location.href='IshiMain.jsp'" />
			<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>