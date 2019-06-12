<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.Dao1"%>
    <%@page import="kadai1.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>変更画面</title>

</head>
<body>

<% String newemppasswd = request.getParameter("newemppasswd");
 String emppasswd = request.getParameter("emppasswd");

EmpBean eBean=new EmpBean();
%>

 <TABLE >
<TR>
<TD ALIGN="LEFT">変更前
<TD ALIGN="CEnter">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<TD ALIGN="RIGHT">変更後
</TABLE>

 <TABLE>
<TR>
<TD ALIGN="CENTER"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;パスワード
<TD ALIGN="RIGHT">
</TABLE>

<TABLE>
<TR>
<TD ALIGN="LEFT"><%=eBean.getEmppasswd()%>
<TD ALIGN="CENTER">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→
<TD ALIGN="RIGHT">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=newemppasswd %>
</TABLE>



<form action="Updateconfirm.jsp" method="post">
<input type="submit" value="戻る">
</form>
<form action="UpdateServlet" method="post">
<input type="submit" value="送信">
</form>
</body>
</html>