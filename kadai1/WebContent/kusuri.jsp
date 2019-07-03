<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="kadai1.*"%>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薬一覧</title>

</head>
<body>
<jsp:useBean id="maBean" class="kadai1.MedicineArrayBean" scope="session"/>
 <form action="Test21" method="post">
<table border="1">
<tr><th>薬剤ID</th><th>薬剤名</th><th>単位</th><th></th></tr>
<%String patid=request.getParameter("patid");
String patlname=request.getParameter("patlname");
String patfname=request.getParameter("patfname");
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){
ArrayList<MedicineBean> ma=maBean.getMediArray();

for(MedicineBean mBean : ma){

	%>

 <tr>
    <td><%= mBean.getMedicineid()%></td>
    <td><%= mBean.getMedicinename() %></td>
    <td><%= mBean.getUnit()%></td>
<td><input type="submit" value="削除"></td>
  </tr>





<%


} %>

</table>



		<input type="submit" value="薬追加">
<% for(MedicineBean mBean : ma){%>
	<input type="hidden" name="medicineid" value="<%=mBean.getMedicineid()%>">
	<input type="hidden" name="patid" value="<%=patid%>">
	<input type="hidden" name="patlname" value="<%=patlname%>">
	<input type="hidden" name="patfname" value="<%=patfname%>">
	<input type="hidden" name="medicinename" value="<%=mBean.getMedicinename()%>">
	<input type="hidden" name="unit" value="<%=mBean.getUnit()%>">


<%
HttpSession httpSession=request.getSession();
session. setAttribute("maBean", maBean);
session. setAttribute("mBean", mBean);

}%>

    	 </form>



<form action="IshiMain.jsp" method="post">
<input type="submit" value="メニューに戻る">
</form>
<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>
</body>
</html>