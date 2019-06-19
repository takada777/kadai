<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page import="dao.Dao1"%>
      <%@page import="com.sun.corba.se.spi.orbutil.fsm.Action"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>完了</title>
</head>
<body>
<%
HttpSession httpSession=request.getSession();
String patid=(String)session.getAttribute("patid");
String patfname=(String)session.getAttribute("patfname");
String patlname=(String)session.getAttribute("patlname");
String hokenmei=(String)session.getAttribute("hokenmei");
String hokenexp=(String)session.getAttribute("hokenexp");





%>
<p>完了しました</p>
<form action="UketsukeMain.jsp" method="post">
<input type="submit" value="メニューへ" name="action">
</form>
<%
	Dao1 dao=new Dao1();
	dao.PatRegister(patid, patfname, patlname, hokenmei, hokenexp);
	dao.close();
%>
</body>
</html>