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
<form action="CheckEmpPass.jsp" method="post">
<% String empid = request.getParameter("empid");
%>
<p>変更後のパスワードを入力してください</p>
パスワード
<br>
<input type="password" name="newemppasswd" size="20"><br>
パスワード再入力
<br>
<input type="password" name="newemppasswd2" size="20">


<br>
<input type="submit" value="送信">

<input type="hidden" name="emppasswd" value="<%=eBean.getEmppasswd()%>">
<input type="hidden" name="empid" value="<%=eBean.getEmpid()%>">
</form>
<input type="button" value="戻る"
			onclick="location.href='UketsukeMain.jsp'" />
</body>
</html>