<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="Header.jsp" %>
    
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="Style.css">
</head>

<body>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if(session.getAttribute("email")==null) {
	response.sendRedirect("Signin.jsp");
}
%>

<div class="container" style="padding-top:80px;">
<div class="container justify-content-center main-container" style="width:50%;padding-left:50px;">
<div class="row" style="font-size:18px;padding:50px;">
<div class="row" style="text-align:left;">
<h1 style="color:#5a189a">Profile</h1><br><br><br>
</div>
<div class="row" style="text-align:left;">
<div class="col"><label>Name</label></div>
<div class="col"><label><%= session.getAttribute("name") %></label></div>
</div>
<div class="row" style="text-align:left;">
<div class="col"><label>Age</label></div>
<div class="col"><label><%= session.getAttribute("age") %></label></div>
</div>
<div class="row" style="text-align:left;">
<div class="col"><label>Gender</label></div>
<div class="col"><label><%= session.getAttribute("gender") %></label></div>
</div>
<div class="row" style="text-align:left;">
<div class="col"><label>Email</label></div>
<div class="col"><label><%= session.getAttribute("email") %></label></div>
</div>
<div class="row" style="text-align:left;">
<div class="col"><label>Password</label></div>
<div class="col"><label><%= session.getAttribute("password") %></label></div>
</div>
</div>
</div>
</div>
</body>

</html>