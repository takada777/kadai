<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession httpSession=request.getSession();
String empid=(String)session.getAttribute("empid");
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){ %>


<form action="PatQueryServlet2" method="get">
<font size="5">
患者検索
</font>
<p>患者名の一部を入力してください<br>
<input type="text" name="patname"></p>
<input type="submit" value="検索する">
<input type="button" value="戻る"
			onclick="location.href='IshiMain.jsp'" />
</form>
<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>