<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="Style.css">
</head>

<body style="padding:60px;">
<div class="container justify-content-center main-container">
<div class="row">
<div class="col">
<div class="container justify-content-center">
<form action="signup" method="post">

<div class="form-group row justify-content-md-center">
<div class="col-sm-6"><br><br>
<h1 style="color:#5a189a">Sign up</h1><br>
</div>
</div>


<div class="form-group row justify-content-md-center">
<div class="col-sm-6">
<input type="text" placeholder="Name" name="name" >
</div>
</div>

<div class="form-group row justify-content-md-center">
<div class="col-sm-6">
<input type="number" placeholder="Age" name="age">
</div>
</div>

<div class="form-group row justify-content-md-center">
<div class="col-sm-6">
<div class="row" style="text-align:left;font-size:18px;padding-left:2px;">
<div class="col-5">
<label>Gender</label>
</div>
<div class="col">
<input type="radio" id="male" name="gender" value="male">
<label for="male">Male</label><br>
<input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label>
</div>

</div>
</div>
</div>

<div class="form-group row justify-content-md-center">
<div class="col-sm-6">
<input type="email" placeholder="Email" name="email">
</div>
</div>

<div class="form-group row justify-content-md-center">
<div class="col-sm-6">
<input type="password" placeholder="Password" name="password">
</div>
</div>
<div class="form-group row justify-content-md-center">
<div class="col-sm-6">
<br>
<button type="submit">Sign up</button>
</div>
</div>

<div class="form-group row justify-content-md-center">
<div class="col-sm-7">
<br>
Already have an account?<br>
<a href="Signin.jsp">Sign in Here!!!</a><br><br><br>
</div>
</div>

</form>
</div>
</div>

<div class="col">
<img  src="Images/signup_page_img.jpg" />
</div>
</div>
</div>
</body>

</html>
