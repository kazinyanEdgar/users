<!DOCTYPE html>
<html lang="en">
<head>
    <title>Обновление</title>
    <style>
        h1 {
            border: 4px outset grey;
            border-radius: 12px;
            width: 22%;
            text-align: center;
        }
    </style>
</head>
<body>

<h1>Обновление пользователя</h1>

<br>

<form action="/users/update" method="post">
    <h3 style="width: 20%">Номер обновляемого пользователя:</h3>
    <input type="number" name="id">
    <input type="submit" value="Обновить">
</form>

<br>
<br>
<br>

<a href="/main">Перейти в главное меню</a>

</body>
</html>