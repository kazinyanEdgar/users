<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

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

<@sf.form action="/users/updateUser" method="post" modelAttribute="user">

    <h3 style="width: 15%">Измените данные:</h3>

    <@sf.label path="surname">Фамилия:</@sf.label>
    <br>
    <@sf.input path="surname"/>
    <@sf.errors path="surname"/>

    <br>
    <br>

    <@sf.label path="name">Имя:</@sf.label>
    <br>
    <@sf.input path="name"/>
    <@sf.errors path="name"/>

    <br>
    <br>

    <@sf.label path="email">Email:</@sf.label>
    <br>
    <@sf.input path="email"/>
    <@sf.errors path="email"/>

    <br>
    <br>

    <@sf.label path="city">Город:</@sf.label>
    <br>
    <@sf.input path="city"/>
    <@sf.errors path="city"/>

    <br>
    <br>

    <@sf.input type="hidden" path="id" value="${user.id}"/>

    <input type="submit" value="Изменить">

</@sf.form>

<br>
<br>
<br>

<a href="/main">Перейти в главное меню</a>

</body>
</html>