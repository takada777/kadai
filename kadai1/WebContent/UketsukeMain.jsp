<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受付ページ</title>
</head>
<body>
<br>
<form action="ChangeEmpPass.jsp" method="post">
<input type="submit"  value="パスワード変更">
</form>
<br>
<form action="SerchEmp.jsp" method="post">
<input type="submit"  value="患者登録" >
</form>
<br>
<p></p>
<form action="AdminOutput" method="post">
<input type="submit"  value="保険証情報">
</form>
<br>
<p></p>
<form action="TabyouinRegister.jsp" method="post">
<input type="submit" value="患者検索">
</form>

</body>
</html>