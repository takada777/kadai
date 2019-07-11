<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="kadai1.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="maBean" class="kadai1.MedicineArrayBean" scope="session"/>
 <form action="Kakute" method="post">

<%
HttpSession httpSession=request.getSession();
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){
String medicineid=(String)session.getAttribute("medicineid");
String kosu1=(String)session.getAttribute(("kosu1"));
String kosu[]=(String[])session.getAttribute("kosu");
//String kosu2[]=(String[])session.getAttribute("kosu2");
String patid=request.getParameter("patid");
String patfname=request.getParameter("patfname");
String patlname=request.getParameter("patlname");
System.out.println(patid);
//String kosu2[]=(String[])session.getAttribute("kosu2");

//String kosu2=request.getParameter("kosu2");
//String kosu3=request.getParameter("kosu3");
int sum=0;


int i=0;

%>

<table border="1">
<tr><th>薬剤ID</th><th>薬剤名</th><th>単位</th><th>個数</th></tr>
<%


ArrayList<MedicineBean> ma=maBean.getMediArray();

for(MedicineBean mBean : ma){
	if(!kosu[i].equals("0")){
	%>

 <tr>
    <td><%= mBean.getMedicineid()%></td>
    <td><%= mBean.getMedicinename() %></td>
    <td><%= mBean.getUnit()%></td>

	<td>
         <%=kosu[i]%></td>
<% }
i++;
%>

  </tr>

  <% }%>

</table>
<input type="submit" value="確定">
<input type="hidden" name="patid" value="<%=patid%>">


<% for(i=0;i<kosu.length; i++){%>
<input type="hidden" name="kosu" value=<%=kosu[i] %>>
<% } %>
	 <input type="hidden" name="patfname" value="<%=patfname%>">
<%


ArrayList<MedicineBean> ma2=maBean.getMediArray();

for(MedicineBean mBean : ma2){

	%>
<input type="hidden" name="patlname" value="<%=patlname%>">
	<input type="hidden" name="patfname" value="<%=patfname%>">
	<input type="hidden" name="medicineid" value="<%=mBean.getMedicineid()%>">
	<input type="hidden" name="medicinename" value="<%=mBean.getMedicinename()%>">
	<input type="hidden" name="unit" value="<%=mBean.getUnit()%>">


<%}
%>
</form>
<input type="button" value="戻る"
			onclick="location.href='IshiMain.jsp'" />
			<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>