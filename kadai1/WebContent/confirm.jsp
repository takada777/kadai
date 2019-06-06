<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession httpSession=request.getSession();
String empid=(String)session.getAttribute("empid");
String empfname=(String)session.getAttribute("empfname");
String emplname=(String)session.getAttribute("emplname");
String emppasswd=(String)session.getAttribute("emppasswd");
int emprole=Integer.parseInt((String)session.getAttribute("emprole"));





%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>確認画面</title>
</head>
<body>
<p>この内容で登録しますか？</p>
<p>従業員ID</p>
<%=empid %>
<p>従業員名</p>
<%=empfname %>
<p>従業員姓</p>
<%=emplname %>
<p>パスワード</p>
<%=emppasswd %>
<p>役割</p>

<form action="test3.html" method="post">
<input type="submit" value="登録する">
</form>
<form action="register.jsp" method="post">
<input type="submit" value="戻る">
</form>
</body>
</html>