<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container col-6 mt-4 ">
		<div class="form-container  center">
			<h3 class="text-center mb-4">Fill the product detail</h3>

			<form action="handleproduct" method="post" >
				<!-- Product Name -->
				<div class="mb-3">
					<label class="form-label">Product Name</label> <input type="text"
						name="name" class="form-control"
						placeholder="Enter the product name here" >
				</div>

				<!-- Product Description -->
				<div class="mb-3">
					<label class="form-label">Product Description</label>
					<textarea class="form-control" rows="4" name="description"
						placeholder="Enter the product description"></textarea>
				</div>

				<!-- Product Price -->
				<div class="mb-4">
					<label class="form-label">Product Price</label> <input type="text"
						name="price" class="form-control"
						placeholder="Enter Product Price">
				</div>

				<!-- Buttons -->
				<div class="text-center">
					<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger" >Back</a>
					<button type="submit" class="btn btn-success">Add</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>