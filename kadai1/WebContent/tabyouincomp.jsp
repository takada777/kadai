<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.Dao1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>完了</title>
</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  eBean.getEmpfname();
String empfname777= (String)session.getAttribute("empfname777");
if(eBean.getEmpfname()!=null||empfname777!=null){%>
<%
HttpSession httpSession=request.getSession();
String tabyouinid=(String)session.getAttribute("tabyouinid");
String tabyouinmei=(String)session.getAttribute("tabyouinmei");
String tabyouinaddress=(String)session.getAttribute("tabyouinaddress");
String tabyouintel=(String)session.getAttribute("tabyouintel");
String tabyouinshihonkin=(String)session.getAttribute("tabyouinshihonkin");
String kyukyu=(String)session.getAttribute("kyukyu");
System.out.println(kyukyu);





 Dao1 dao1=new Dao1();
if(dao1.SerchTabyouin3(tabyouinid)){
%>
<p>入力されたIDは使用されています</p>
<input type="button" value="戻る"
			onclick="location.href='TabyouinRegister.jsp'" />
<% }else if(tabyouinid==""||tabyouinmei==""||tabyouinaddress==""||tabyouintel==""||tabyouinshihonkin==""||kyukyu==""){ %>
<p>入力されていない箇所があります</p>
<input type="button" value="戻る"
			onclick="location.href='TabyouinRegister.jsp'" />
<% }else { %>
<p>完了しました</p>

<form action="TabyouinRegister.jsp" method="post">
<input type="submit" value="続けて登録">
</form>
<form action="AdminMain.jsp" method="post">
<input type="submit" value="メニューへ">
</form>
 <%

	Dao1 dao=new Dao1();

			dao.TabyouinRegister(tabyouinid, tabyouinmei, tabyouinaddress, tabyouintel, tabyouinshihonkin, kyukyu);
			dao.close();

			%>


			<input type="button" value="戻る"
			onclick="location.href='TabyouinRegister.jsp'" />
			<% } %>
			<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>