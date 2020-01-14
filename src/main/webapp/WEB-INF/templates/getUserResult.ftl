<!DOCTYPE html>
<html lang="en">
<head>
    <title>Получение</title>

    <style>
        table, th {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 5px;
        }

        h1 {
            border: 4px outset grey;
            border-radius: 12px;
            width: 20%;
            text-align: center;
        }
    </style>

</head>
<body>

<h1>Пользователь с id=${user.id}</h1>

<br>

<table style="width:20%">
    <tr>
        <th>ID</th>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Email</th>
        <th>Город</th>
    </tr>

    <th>${user.id}</th>
    <th>${user.surname}</th>
    <th>${user.name}</th>
    <th>${user.email}</th>
    <th>${user.city}</th>

</table>

<br>
<br>
<br>

<a href="/main">Перейти в главное меню</a>

</body>
</html>