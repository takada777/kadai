<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.Dao1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession httpSession=request.getSession();
String patid=(String)session.getAttribute("patid");
String patfname=(String)session.getAttribute("patfname");
String patlname=(String)session.getAttribute("patlname");
String hokenmei=(String)session.getAttribute("hokenmei");
String hokenexp=(String)session.getAttribute("hokenexp");





%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>確認画面</title>
</head>
<body>
<p>この内容で登録しますか？</p>
<p>患者ID</p>
<%=patid %>
<p>苗字</p>
<%=patfname %>
<p>名前</p>
<%=patlname %>
<p>保険証記号番号</p>
<%=hokenmei %>
<p>有効期限</p>
<%=hokenexp %>
<form action="patcomp.jsp" method="post">
<input type="submit" value="登録する" name="action">

</form>
<form action="registerpatient.jsp" method="post">
<input type="submit" value="戻る" name="action">
</form>

</body>
</html>