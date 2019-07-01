<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="kadai1.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>従業員</title>
</head>
<body>

<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  eBean.getEmpfname();
if(eBean.getEmpfname()!=null){%>
<form action="Updateconfirm.jsp" method="post">

<table border="1">
<tr><th>従業員ID</th><th>苗字</th><th>名前</th><th>パスワード</th><th>役割</th><th></th></tr>
<tr>
<td><%=eBean.getEmpid() %></td>
<td><%=eBean.getEmplname() %></td>
<td><%=eBean.getEmpfname() %></td>
<td><%=eBean.getEmppasswd() %></td>
<td><% if (eBean.getEmprole()==1){
	%>
	<p>管理者</p>
	<%
	}else if (eBean.getEmprole()==2){
		%>
		<p>受付</p>
		<% }else if (eBean.getEmprole()==3){ %>
			<p>医師</p>
			<% }%></td>

<td><input type="submit" value="編集"></td>
</tr>
</table>

<input type="hidden" name="emplname" value="<%= eBean.getEmplname() %>">
<input type="hidden" name="empfname" value="<%= eBean.getEmpfname() %>">
<input type="hidden" name="empid" value="<%= eBean.getEmpid()%>">

</form>
<form action="SerchEmp.jsp" method="post">
<input type="submit" value="従業員検索に戻る">
</form>
<form action="AdminMain.jsp" method="post">
<input type="submit" value="メニューに戻る">
</form>
<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>