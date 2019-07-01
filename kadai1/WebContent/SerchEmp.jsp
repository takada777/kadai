<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>従業員変更検索画面</title>
</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  eBean.getEmpfname();
if(eBean.getEmpfname()!=null){%>
<form action="SerchEmpServlet" method="post">
<p>従業員検索<br>
<input type="text" name="empid"></p>
<input type="submit" value="検索">

</form>
<input type="button" value="戻る"
			onclick="location.href='AdminMain.jsp'" />
			<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>