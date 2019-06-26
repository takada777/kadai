<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession httpSession=request.getSession();
String empid=(String)session.getAttribute("empid");


%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者ページ</title>
</head>
<body>
<jsp:useBean id="eBean2" class="kadai1.EmpBean" scope="session"/>
<%  eBean2.getEmpfname();
if(eBean2.getEmpfname()!=null){%>
<h5>管理者ページ</h5>
<br>
<form action="register.jsp" method="post">
<input type="submit"  value="従業員登録">
</form>
<br>
<form action="SerchEmp.jsp" method="post">
<input type="submit"  value="従業員更新" >
</form>
<br>
<p></p>
<form action="AdminOutput" method="post">
<input type="submit"  value="管理者一覧">
</form>
<br>
<p></p>
<form action="TabyouinRegister.jsp" method="post">
<input type="submit" value="他病院登録">
</form>
<br>
<p></p>

<br>
<p></p>
<form action="SerchTabyouin.jsp" method="post">
<input type="submit" value="病院検索">
</form>
<br>
<p></p>
<form action="TabyouinIchiran" method="post">
<input type="submit" value="病院一覧">
</form>
<br>
<p></p>
<input type="button" value="ログアウト"
			onclick="location.href='Select.html'" />
			<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>

</body>
</html>