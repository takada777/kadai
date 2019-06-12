<%@page import="kadai1.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者一覧</title>
</head>
<%
HttpSession httpSession=request.getSession();


%>
<body>
<form action="UPdatePassServlet" method="post">
<jsp:useBean id="EABean" class="kadai1.EmpArrayBean" scope="session"/>

<table border="1">
<tr><th>ユーザID</th><th>苗字</th><th>名前</th><th>パスワード</th><th></th></tr>
<%
ArrayList<EmpBean> EA=EABean.getEmpArray();
for(EmpBean eBean : EA){
	%>
 <tr>
    <td><%= eBean.getEmpid() %></td>
    <td><%= eBean.getEmplname() %></td>
    <td><%= eBean.getEmpfname()%></td>
    <td><%= eBean.getEmppasswd() %></td>
    <td><input type="hidden" name="empid" value="<%= eBean.getEmpid()%>"><input type="submit" value="編集"></td>








  </tr>

<%
  }
%>

</table>


</form>
</body>
</html>