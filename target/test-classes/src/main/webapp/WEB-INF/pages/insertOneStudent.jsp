<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>insertOneStudent</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>

<div class="container-fluid" style="margin-top: 50px;">
    <div class="row-fluid">

        <form action="/studentController/insertOneStudent" method="post">

            <div class="form-group">
                <label for="inputName">姓名</label>
                <input type="text" name="name" class="form-control" id="inputName">
            </div>
            <div class="form-group">
                <label for="inputAge">年龄</label>
                <input type="text" name="age" class="form-control" id="inputAge">
            </div>
            <div class="form-group">
                <label for="inputSex">性别</label>
                <input type="text" name="sex" class="form-control" id="inputSex">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</div>

</body>
</html>
