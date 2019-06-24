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
 <form action="Test22" method="post">
<%
HttpSession httpSession=request.getSession();
String kosu[]=(String[])session.getAttribute("kosu");
//String kosu2[]=(String[])session.getAttribute("kosu2");
int kazu;
int kazu2;
//kazu=Integer.parseInt(kosu);


int i=0;
kazu=Integer.parseInt(kosu[i]) ;
//kazu2=Integer.parseInt(kosu2[i]);
if(kazu==0){
		kazu=kazu+0;

		}else if( kazu==1){
			kazu=kazu+1;

		}else if( kazu==2){
			kazu=kazu+2;

		}else if( kazu==3){
			kazu=kazu+3;

		}else if( kazu==4){
			kazu=kazu+4;

		}else if( kazu==5){
			kazu=kazu+5;

		}else if( kazu==6){

			kazu=kazu+6;

		}else if( kazu==7){
			kazu=kazu+7;

		}else if( kazu==8){
			kazu=kazu+8;


		}else if( kazu==9){
			kazu=kazu+9;

		}





int hiku=kazu;
//kazu=kazu-hiku;
//sum+=kazu2;
%>
<table border="1">
<tr><th>薬剤ID</th><th>薬剤名</th><th>単位</th><th>個数</th><th></th></tr>
<%


ArrayList<MedicineBean> ma=maBean.getMediArray();

for(MedicineBean mBean : ma){

	%>

 <tr>
    <td><%= mBean.getMedicineid()%></td>
    <td><%= mBean.getMedicinename() %></td>
    <td><%= mBean.getUnit()%></td>

	<td>
         <%=kazu%></td>
<%i++; %>
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
  <% }%>
</table>
	<input type="submit" value="投与">
</form>
<input type="button" value="戻る"
			onclick="location.href='outputmedicine.jsp'" />
</body>
</html>