<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>患者登録</title>
</head>
<body>
<%  HttpSession session2=request.getSession();
String empfname555=(String)session.getAttribute("empfname555");
 if(empfname555!=null){%>
<form action="RegisterPatientServlet" method="get">
<fieldset>
<font size="5">
患者登録
</font>
<p>患者ID<br>
<input type="text" name="patid"></p>
<p>苗字<br>
<input type="text" name="patlname"></p>
<p>名前<br>
<input type="text" name="patfname"></p>
<p>保険証記号番号<br>
<input type="text" name="hokenmei"></p>
<p>有効期限<br></p>
<input type="text" name="hokenexp" placeholder="例）20190610">
<br><br>
<input type="submit" value="登録する">
</fieldset>
</form>
<input type="button" value="戻る"
			onclick="location.href='UketsukeMain.jsp'" />
			<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>