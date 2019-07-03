<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="pBean" class="kadai1.PatBean" scope="session"/>
<form action="checkhoken.jsp" method="post">
<% String hokenmei = request.getParameter("hokenmei");
String hokenexp = request.getParameter("hokenexp");
String patid = request.getParameter("patid");
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){
%>
<p>変更後の保険証記号番号または有効期限を入力してください</p>
保険証記号番号
<br>
<input type="text" name="newhokenmei" size="20"><br>
有効期限
<br>
<input type="text" name="newhokenexp" size="20">


<br>
<input type="submit" value="送信">

<input type="hidden" name="hokenmei" value="<%=hokenmei%>">
<input type="hidden" name="hokenexp" value="<%=hokenexp%>">
<input type="hidden" name="patid" value="<%=patid%>">
</form>
<form action="PatientOutput" method="post">
<input type="submit" value="戻る" name="action">
</form>
<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>