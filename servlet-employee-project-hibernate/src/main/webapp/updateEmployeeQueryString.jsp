<%@page import="java.net.Authenticator.RequestorType"%>
<%@page import="com.jsp.servlect_project_with_hibernate.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <% Employee employee=(Employee) request.getAttribute("emp"); %>
    <form action="empUpdates" style="border:2px solid red; padding:6px;">
      <label>EmployeeId</label>:
      <br>
      <input type="text" name="id" placeholder=" enter emp id" value="<%= employee.getId()%>">
      <br><br>
      <label>EmployeeName</label>:
      <br>
      <input type="text" name="name" placeholder=" enter emp Name" value="<%=employee.getName()%>">
      <br><br>
      <label>EmployeeEmail</label>:
      <br>
      <input type="email" name="email" placeholder=" enter emp email" value="<%=employee.getEmail()%>">
      <br><br>
      <label>Male</label>
      <input type="radio" name="gender" value="male" > 
      <label>FeMale</label>
      <input type="radio" name="gender" value="female" >
      <br><br>
      <input type="submit" value="Update">
      </form>
       
</body>
</html>