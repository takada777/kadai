<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="kadai1.*"%>
     <%@ page import="java.util.ArrayList" %>
       <%@ page import="java.text.DateFormat" %>
         <%@ page import="java.text.SimpleDateFormat" %>
           <%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="saBean" class="kadai1.SyochiArrayBean" scope="session"/>
<%//Date date=new Date();

//DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");

//String formattedDate=dateFormat.format(date);
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){ %>
<table border="1">
<tr><th>患者ID</th><th>苗字</th><th>名前</th><th>薬名</th><th>単位</th><th>個数</th><th>日付</th><th></th></tr>
<%

ArrayList<SyochiBean> sa=saBean.getsyochiArray();
//System.out.println(saBean.getArraysize());
int i=0;
for(SyochiBean sBean : sa){

	%>

 <tr>

   <td><%= sBean.getPatid()%></td>
    <td><%= sBean.getPatlname()%></td>
    <td><%= sBean.getPatfname()%></td>
     <td><%= sBean.getMedicinename()%></td>
    <td><%= sBean.getUnit()%></td>
    <td><%= sBean.getKosu()%></td>
<td><%=sBean.getDate() %></td>
    <td><form action="Delirireki" method="get">
    <input type="submit" value="削除">
     <input type="hidden" name="i" value="<%=i%>">
    <input type="hidden" name="patid" value="<%=sBean.getPatid()%>">
	<input type="hidden" name="patlname" value="<%=sBean.getPatlname()%>">
	<input type="hidden" name="patfname" value="<%=sBean.getPatfname()%>">
	<input type="hidden" name="medicinename" value="<%=sBean.getMedicinename()%>">
	<input type="hidden" name="kosu" value="<%=sBean.getKosu()%>">
	<input type="hidden" name="unit" value="<%=sBean.getUnit()%>">
         </form></td>




  </tr>





<%
i++;

} %>

</table>





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