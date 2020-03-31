<!DOCTYPE>
<html>
<head>
    <title>People</title>
</head>

<table>
    <tr>
        <th>Name</th>
        <th>BirthDay</th>
        <th>Image</th>
    </tr>
    <#list people as person>
        <tr>
            <td>${person.name}</td>
            <td>${person.birthday}</td>
            <td><img src="${person.imgLink}" height="100"></td>
        </tr>
    </#list>
</table>
</html>