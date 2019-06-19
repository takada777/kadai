<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="kadai1.*"%>
    <%@page import="dao.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<form action="ChangeAdminPass.jsp" method="post">
<%
 %>
<p>変更後のパスワードを入力してください</p>
パスワード
<br>
<input type="text" name="newemppasswd" size="20">
<br>
パスワード再入力
<br>
<input type="text" name="newemppasswd2" size="20">


<br>
<input type="submit" value="送信">

<input type="hidden" name="emppasswd" value="<%=eBean.getEmppasswd()%>">
<input type="hidden" name="empid" value="<%=eBean.getEmpid()%>">
</form>
<form action="DisAdmin.jsp" method="post">
<input type="submit" value="戻る">
</form>
</body>
</html>