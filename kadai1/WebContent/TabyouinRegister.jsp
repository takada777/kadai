<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>他病院登録</title>
</head>
<body>
<form action="TabyouinRegisterServlet" method="get">
<font size="5">
従業員登録
</font>
<p>他病院ID<br>
<input type="text" name="tabyouinid"></p>
<p>	他病院名<br>
<input type="text" name="tabyouinmei"></p>
<p>他病院住所<br>
<input type="text" name="tabyouinaddress"></p>
<p>他病院電話番号<br>
<input type="text" name="tabyouintel"></p>
<p>資本金<br>
<input type="text" name="tabyouinshihonkin"></p>
<p>救急対応<br>
<input type="text" name="kyukyu"></p>
<input type="submit" value="登録する">
</form>
</body>
</html>