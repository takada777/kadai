<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession httpSession=request.getSession();
String empid=(String)session.getAttribute("empid");
String empfname111=(String)session.getAttribute("empfname111");

%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受付ページ</title>
</head>
<body>
<%
if(empfname111!=null){%>
<h5>受付ページ</h5>
<br>
<form action="ChangeEmpPass" method="post">
<input type="submit"  value="パスワード変更">
<input type="hidden" name="empid" value="<%=empid%>">
</form>
<br>
<form action="registerpatient.jsp" method="post">
<input type="submit"  value="患者登録" >
</form>
<br>
<p></p>
<form action="PatientOutput" method="post">
<input type="submit"  value="保険証情報">
</form>
<br>
<p></p>
<form action="SerchPatient.jsp" method="post">
<input type="submit" value="患者検索">
</form>
<input type="button" value="ログアウト"
			onclick="location.href='Select.html'" />
			<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>
