<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to product App</h1>
				<table class="table table-bordered">
					<thead class="table-primary" >
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Prise</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products }" var="p">

							<tr>
								<th scope="row">${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td>&#8377; ${p.price }</td>
								<td class="fs-3" ><a href="update/${p.id }"><i class="fa-regular fa-pen-to-square" > </i></a> 
								<a	href="delete/${p.id }"> <i
										class="fa-regular fa-trash-can text-danger" > </i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="conatiner text-center">
					<a class="btn btn-outline-success" href="addproduct">Add
						Product</a>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
