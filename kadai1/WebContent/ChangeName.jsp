<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>変更画面</title>
</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  eBean.getEmpfname();
if(eBean.getEmpfname()!=null){%>
<% String newemplname = request.getParameter("newemplname");
 String newempfname = request.getParameter("newempfname");
String originempfname = request.getParameter("originempfname");
String originemplname = request.getParameter("originemplname");
String empid = request.getParameter("empid");

%>
<%if(newempfname=="" || newemplname==""){ %>
<p>入力されていない箇所があります</p>
<form action="SerchEmp.jsp" method="post">
<input type="submit" value="戻る" name="action">
</form>
<%}else{ %>
 <TABLE >
<TR>
<TD ALIGN="LEFT">変更前
<TD ALIGN="CEnter">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<TD ALIGN="RIGHT">変更後
</TABLE>

 <TABLE>
<TR>
<TD ALIGN="CENTER"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;苗字
<TD ALIGN="RIGHT">
</TABLE>

<TABLE>
<TR>
<TD ALIGN="LEFT"><%=originemplname%>
<TD ALIGN="CENTER">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→
<TD ALIGN="RIGHT">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=newemplname %>
</TABLE>

<TABLE>
<TR>
<TD ALIGN="CENTER"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名前
<TD ALIGN="RIGHT">
</TABLE>



<TABLE>
<TR>
<TD ALIGN="LEFT"><%=originempfname %>
<TD ALIGN="CENTER">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→
<TD ALIGN="RIGHT">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=newempfname %>
</TABLE>
<form action="SerchEmp.jsp" method="post">
<input type="submit" value="戻る">
</form>
<form action="UpdateServlet" method="post">
<input type="submit" value="送信">
<input type="hidden" name="originemplname" value="<%=originemplname%>">
<input type="hidden" name="originempfname" value="<%= originempfname%>">
<input type="hidden" name="newemplname" value="<%= newemplname%>">
<input type="hidden" name="newempfname" value="<%= newempfname%>">
<input type="hidden" name="empid" value="<%= empid%>">
<% } %>
</form>
<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>