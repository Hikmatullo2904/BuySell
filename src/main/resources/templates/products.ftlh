<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>buy and sell</title>
</head>
<body>
    <h1>Buy and Sell</h1>
    <h4>Uzbekiston bo'ylab mahsulotlar</h4>
    <form action="/" method="get">
        qidirish <input type="text" name="title" ><br>
        <input type="submit" name="Search">
    </form>
    <#list products as product>
      <div>
          <p><b>${product.title}</b> | $<b>${product.price}</b>  |  <a href="/product/${product.id}">batafsil</a></p>
      </div>
      <#else>
      <h3> Maxsulot yo'q </h3>
    </#list>
    <hr>
    <h3>Add new Product</h3>
    <form action="/product/create" method="post">
        Maxsulot nomi <input type="text" name="title"><br><br>
        Maxsulot tavsifi <input type="text" name="description"><br><br>
        Maxsulot narxi <input type="text" name="price"><br><br>
        Shaxar <input type="text" name="city"><br><br>
        Maxsulot egasi <input type="text" name="owner"><br><br>
        <input type="submit" value="add product">
    </form>
</body>
</html>