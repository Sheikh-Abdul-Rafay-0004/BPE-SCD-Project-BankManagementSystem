<%@page import="main.SingUpSimpleAcountProxy"%>
<%@page import="main.SingUpSimpleAcount"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


String First_Name = request.getParameter("First_Name");
String Last_Name = request.getParameter("Last_Name");
String Phone_Number= request.getParameter("Phone_Number");
String CNIC = request.getParameter("CNIC");
String Address = request.getParameter("Address");
String Email = request.getParameter("Email");
String D_O_B = request.getParameter("D_O_B");
String account_type = request.getParameter("account_type");
String acc_number = request.getParameter("acc_number");
String pswd = request.getParameter("pswd");
String amnt = request.getParameter("amnt");
String country = request.getParameter("country");
String cuty = request.getParameter("cuty");
String occupation = request.getParameter("occupation");





SingUpSimpleAcount services = new SingUpSimpleAcountProxy().getSingUpSimpleAcount();

String recpaswd=services.tableres(acc_number, First_Name, Last_Name, Phone_Number, Email, account_type, country, cuty, Address, CNIC, occupation, D_O_B, pswd, amnt);

%>
<h1>Register Successfully</h1>
<p>Your Recovery Password is <%=recpaswd %> This is the Only One time to See this password So make Sure to Save it...

</body>
</html>