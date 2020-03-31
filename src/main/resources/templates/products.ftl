<!DOCTYPE>
<html>
<head>
    <title>Products</title>
</head>

<table border="1">
    <tr>
        <th>Title</th>
        <th>Manufacturer</th>
        <th>Price</th>
        <th>Date of manufacture</th>
        <th>Expiration date</th>
    </tr>
    <#list products as product>
        <tr>
            <td>${product.title}</td>
            <td>${product.manufacturer}</td>
            <td>${product.price}</td>
            <td>${product.dateOfManufacture}</td>
            <td>${product.expiration}</td>
        </tr>
    </#list>
</table>
</html>