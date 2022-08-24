<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h2>Add Product</h2>
<form action="updateProduct" method="post">
	<label>PId</label>
	<input type="number" name="pid"><br/>
	
	<label>Price</label>
	<input type="number" name="price"><br/>
	<label>URL</label>
	<input type="url" name="url"><br/>
	<input type="submit" value="Update Product"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>