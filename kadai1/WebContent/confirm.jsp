<%@page import="com.sun.corba.se.spi.orbutil.fsm.Action"%>
<%@page import="dao.Dao1"%>
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
String emprole=(String)session.getAttribute("emprole");





%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>確認画面</title>
</head>
<body>
<p>この内容で登録しますか？</p>
<p>従業員ID</p>
<%=empid %>
<p>苗字</p>
<%=emplname %>
<p>名前</p>
<%=empfname %>
<p>パスワード</p>
<%=emppasswd %>
<p>役割</p>
<% if (emprole.equals("1")){
	%>
	<p>管理者</p>
	<%
	}else if (emprole.equals("2")){
		%>
		<p>受付</p>
		<% }else if (emprole.equals("3")){ %>
			<p>医師</p>
			<% }%>



<form action="empcomp.jsp" method="post">
<input type="submit" value="登録する" name="action">

</form>
<form action="register.jsp" method="post">
<input type="submit" value="戻る" name="action">
</form>



</body>
</html>