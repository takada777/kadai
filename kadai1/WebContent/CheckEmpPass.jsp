<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<% String newemppasswd = request.getParameter("newemppasswd");
 String emppasswd = request.getParameter("emppasswd");
 //System.out.println(eBean.getBeforepass());

%>

 <TABLE >
<TR>
<TD ALIGN="LEFT">変更前
<TD ALIGN="CEnter">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<TD ALIGN="RIGHT">変更後
</TABLE>

 <TABLE>
<TR>
<TD ALIGN="CENTER"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;パスワード
<TD ALIGN="RIGHT">
</TABLE>

<TABLE>
<TR>
<TD ALIGN="LEFT"><%=emppasswd%>
<TD ALIGN="CENTER">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→
<TD ALIGN="RIGHT">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=newemppasswd %>
</TABLE>


<form action="ChangeempPass.jsp" method="post">
<input type="submit" value="戻る">
</form>
<form action="ChangeEmppass2" method="post">
<input type="hidden" name="newemppasswd" value="<%= newemppasswd%>">
<input type="hidden" name="empid" value="<%= eBean.getEmpid()%>">
<input type="submit" value="送信">
</form>
</body>
</html>