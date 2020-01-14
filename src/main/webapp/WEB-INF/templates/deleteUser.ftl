<!DOCTYPE html>
<html lang="en">
<head>
    <title>Удаление</title>
    <style>
        h1 {
            border: 4px outset grey;
            border-radius: 12px;
            width: 20%;
            text-align: center;
        }
    </style>
</head>
<body>

<h1>Удаление пользователя</h1>

<br>

<form action="/users/delete" method="post">
    <h3 style="width: 15%">Номер удаляемого пользователя:</h3>
    <input type="number" name="id">
    <input type="submit" value="Удалить">
</form>

<br>
<br>
<br>

<a href="/main">Перейти в главное меню</a>

</body>
</html>