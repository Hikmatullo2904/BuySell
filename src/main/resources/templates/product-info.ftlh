<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>buy and sell</title>
</head>
<body>
    <h1>Buy and Sell</h1>
    <h4>To'liq malumot</h4>
    <b>Maxsulot nomi: </b>${product.title} <br>
    <b>Maxsulot tavsifu: </b>${product.description} <br>
    <b>Maxsulot narxi: </b>${product.price} <br>
    <b>Maxsulot qayerdan: </b>${product.city} <br>
    <b>Maxsulot egasi: </b>${product.owner} <br>
    <hr>
    <form action="/product/delete/${product.id}">
        <input type="submit" value="delete">
    </form>
</body>
</html>