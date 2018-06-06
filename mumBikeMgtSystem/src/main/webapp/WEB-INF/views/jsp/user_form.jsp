<!-- <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>User Form</title>
 <link href="css/bootstrap.min.css" rel="stylesheet" />
 <script src="js/bootstrap.min.js"></script>
 <script src="js/jquery.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head> -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="header.jsp"%>
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	</head>
	
	<body>
 <div class="container">
  <spring:url value="/user/saveUser" var="saveURL" />
  <h2>User</h2>
  <form:form modelAttribute="userForm" method="post" action="${saveURL }" cssClass="form" >
   <form:hidden path="userId"/>
   <div class="form-group">
    <label>User</label>
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  
 </div>
 
  <div class="container">
  <h2>User List</h2>
  <table class="table table-striped">
   <thead>
    <th scope="row">First Name</th>
    <th scope="row">Last Name</th>
    <th scope="row">Email</th>
    <th scope="row">Address</th>
    <th scope="row">Phone No</th>
    <th scope="row">Password</th>
   </thead>
   <tbody>
    <c:forEach items="${userList }" var="user" >
     <tr>
      <td>${user.fname }</td>
      <td>${user.lname }</td>
	  <td>${user.email }</td>
      <td>${user.address }</td>
      <td>${user.telephone }</td>
      <td>${user.password }</td>
      <td>
       <spring:url value="/user/updateUser/${user.userId }" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/user/deleteUser/${user.userId }" var="deleteURL" />
       <a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/user/addUser/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New User</a>
 </div>
</body>
</html>