<!DOCTYPE html>
<html lang="en">
<head>
    <title>Пользователи</title>

    <style>
        table, th {
            border: 1px solid black;
            border-collapse: collapse;
            padding: 5px;
        }

        h1 {
            border: 4px outset grey;
            border-radius: 12px;
            width: 12%;
            text-align: center;
        }
    </style>

</head>
<body>

<#if users?has_content>

    <h1>Пользователи</h1>

    <table style="width: 30%">
        <tr>
            <th>ID</th>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>Email</th>
            <th>Город</th>
        </tr>

        <#list users as user>
            <tr>
                <th>${user.id}</th>
                <th>${user.surname}</th>
                <th>${user.name}</th>
                <th>${user.email}</th>
                <th>${user.city}</th>
            </tr>
        </#list>
    </table>

<#else>

    <h1 style="border: 6px double grey;width: 15%; text-align: center;">Пользователей нет</h1>

</#if>

<br>
<br>
<br>

<a href="/main">Перейти в главное меню</a>

</body>
</html>