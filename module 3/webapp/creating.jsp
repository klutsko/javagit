<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
    <title>My creating page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Web app for creating tables in BD</h2>
  <form name="creatingForm" method="post" action="/createTable">
<input type="submit" value="Add" name="add"/>

 </form>

  <h2>Web app for removing tables in BD</h2>
   <form name="deletingForm" method="post" action="/deleteTable">
 <input type="submit" value="Delete" name="delete"/>

  </form>



    <h2>Web app for adding new row in table</h2>
     <form name="insertForm" method="post" action="/insertRowInTable">
   <input type="submit" value="Insert" name="insert"/>

    </form>


    <h2>Web app for adding new row in table</h2>
     <form name="deleteForm" method="post" action="/deleteRowFromTable">
   <input type="submit" value="Delete Row" name="delete"/>

    </form>
  </body>









  </html>
