<%@page import="com.jsp.servlect_project_with_hibernate.dto.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.servlect_project_with_hibernate.dao.EmployeeDao"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
                
        <%EmployeeDao dao=new EmployeeDao(); %>
        <%List<Employee> list=dao.displayEmployee(); %>
 <table border="2">
        <tr>
         <th>EmployeeID</th>
         <th>EmployeeName</th>
         <th>EmployeedEmail</th>
         <th>EmployeeGender</th>
         <th>Delete</th>
         <th>Update</th>
        </tr>
        <% for(Employee emp:list)  {%>
        <tr>
             <td><%=emp.getId() %></td>
             <td><%=emp.getName() %></td>
             <td><%=emp.getEmail() %></td>
             <td><%=emp.getGender() %></td>
             <td><a href="empsDelete1?id=<%=emp.getId()%>">delete</a> </td>
             <td><a href="empUpdates1?id=<%=emp.getId()%>">Update</a> </td>
         
        </tr>
        
        <%} %>
 </table>

   
 
 
</body>
</html>