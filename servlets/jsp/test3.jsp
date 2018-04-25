<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Second page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
</head>

<body>

<form name="LastForm" method="get" action="TestServlet3">
  <div class="form-group" ">
           <label for="exampleInputLastName">First Name</label>
                 <input type="text" name = "firstname" size="50" class="form-control" id="exampleInputLastName" placeholder="First Name">

      </div>

       <div class="form-group" ">
                 <label for="exampleInputLastName">Email</label>
                       <input type="text" name = "email" size="50" class="form-control" id="exampleInputEmail" placeholder="Email">

            </div>
</form>
</body>
</html>