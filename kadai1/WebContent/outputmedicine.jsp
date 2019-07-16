<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="kadai1.*"%>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="maBean" class="kadai1.MedicineArrayBean" scope="session"/>
 <form action="Test21" method="post">
<table border="1">
<tr><th>薬剤ID</th><th>薬剤名</th><th>単位</th><th>個数</th><th></th></tr>
<%String patid=(String)session.getAttribute("patid");
String patlname=(String)session.getAttribute("patlname");
String patfname=(String)session.getAttribute("patfname");
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){
ArrayList<MedicineBean> ma=maBean.getMediArray();

for(MedicineBean mBean : ma){

	%>

 <tr>
    <td><%= mBean.getMedicineid()%></td>
    <td><%= mBean.getMedicinename() %></td>
    <td><%= mBean.getUnit()%></td>

	<th><select name="kosu">
				<option value="0">-</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
			</select>
			</th>

  </tr>





<%


} %>

</table>



		<input type="submit" value="投与">
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



<form action="PatRetrieval2.jsp" method="post">
<input type="submit" value="戻る">
</form>
<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>