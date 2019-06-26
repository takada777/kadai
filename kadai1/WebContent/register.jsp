<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>従業員登録</title>
</head>
<body>
<jsp:useBean id="eBean2" class="kadai1.EmpBean" scope="session"/>
<%  eBean2.getEmpfname();
if(eBean2.getEmpfname()!=null){%>
<form action="RegisterServlet" method="get">
<font size="5">
従業員登録
</font>
<p>従業員ID<br>
<input type="text" name="empid"></p>
<p>	苗字<br>
<input type="text" name="emplname"></p>
<p>氏名<br>
<input type="text" name="empfname"></p>
<p>従業員パスワード<br>
<input type="text" name="emppasswd"></p>
<p>役割<br>
<input type="radio" name="yakuwari" value="1"checked> 管理者
<input type="radio" name="yakuwari" value="2" > 受付
<input type="radio" name="yakuwari" value="3"> 医師</p>
<input type="submit" value="登録する">
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