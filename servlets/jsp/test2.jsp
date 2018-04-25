<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Second page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
</head>

<body>
<div>
<form name="loginForm" method="post" action="TestServlet2">
    <div class="form-group" ">

         <label for="exampleInputLastName">First Name</label>
               <input type="text" name = "firstname" size="50" class="form-control" id="exampleInputLastName" placeholder="Enter First Name">

    </div>
    <div class="form-group">
        <label for="exampleInputLastName">Last Name</label>
        <input type="text" name = "lastname" size="50"class="form-control" id="exampleInputLastName" placeholder="Enter Last Name">
    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" name = "email" size="20" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" name = "password" size="50" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>

</div class="form-group">
 <input type="submit" value="Submit">
</div>


</form>


</body>
</html>