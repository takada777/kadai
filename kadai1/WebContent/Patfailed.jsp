<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>エラー</title>
</head>
<% String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){ %>
<body>
<h3>エラー</h3>
<p>入力されたIDに該当するユーザが見つかりません</p>
<input type="button" value="戻る"
			onclick="location.href='SerchPatient.jsp'" />
			<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>