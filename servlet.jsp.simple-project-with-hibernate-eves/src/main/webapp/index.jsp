<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee</title>
</head>
<body  style="background-color: rgb(123,442,234); color: red">
    
      <form action="empDetails" style="border:2px solid red; padding:6px;">
      <label>EmployeeId</label>:
      <br>
      <input type="text" name="id" placeholder=" enter emp id">
      <br><br>
      <label>EmployeeName</label>:
      <br>
      <input type="text" name="name" placeholder=" enter emp Name">
      <br><br>
      <label>EmployeeEmail</label>:
      <br>
      <input type="email" name="email" placeholder=" enter emp email">
      <br><br>
      <label>Male</label>
      <input type="radio" name="gender" value="male" > 
      <label>FeMale</label>
      <input type="radio" name="gender" value="female" >
      <br><br>
      <input type="submit" value="register">
      </form>
 
</body>
</html>