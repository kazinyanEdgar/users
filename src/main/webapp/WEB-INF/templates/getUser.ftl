<!DOCTYPE html>
<html lang="en">
<head>
    <title>Получение</title>
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

<h1>Получение пользователя</h1>

<br>

<form action="/users/getUser" method="get">
    <h3 style="width: 20%">Номер получаемого пользователя:</h3>
    <input type="number" name="id">
    <input type="submit" value="Получить">
</form>

<br>
<br>
<br>

<a href="/main">Перейти в главное меню</a>

</body>
</html>