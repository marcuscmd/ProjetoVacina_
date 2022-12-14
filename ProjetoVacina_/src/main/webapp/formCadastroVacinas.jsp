<%@page import="projetovacina.dao.FornecedorDao"%>
<%@page import="projetovacina.models.Fornecedor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registro Vacina</title>
<style type="text/css">
.gradient-custom {
	background: #6a11cb;
	background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1),
		rgba(37, 117, 252, 1));
	background: linear-gradient(to right, rgba(106, 17, 203, 1),
		rgba(37, 117, 252, 1))
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
<%
	FornecedorDao dao = new FornecedorDao();
	List<Fornecedor> fornecedores = dao.findAll(Fornecedor.class);
%>
	<form class="vh-100 gradient-custom" action="controllerVacina"
		method="post">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card bg-dark text-white" style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">

							<div class="mb-md-5 mt-md-4 pb-5">

								<h2 class="fw-bold mb-2 text-uppercase">Registrar Vacina</h2>

								<div class="form-outline form-white mb-4">
									<input type="text" class="form-control form-control-lg"
										placeholder="Nome da Vacina" name="nome" />
								</div>

								<div class="form-outline form-white mb-4">
									<input type="number" class="form-control form-control-lg"
										placeholder="Numero de Doses. Ex.; 1, 2, 3" name="qtd_doses" />
								</div>

								<div class="form-outline form-white mb-4">
									<select class="form-control form-control-lg" type="text" placeholder="Tipo Vacina" name="tipo">
										<option value="">Selecione um tipo</option>
										<option value="Atenuadas">Atenuadas</option>
										<option value="Inativas">Inativas</option>
									</select>
								</div>
								
								<div class="form-outline form-white mb-4">
									<input type="text" class="form-control form-control-lg"
										placeholder="Periodo Vencimento. Ex; um ano." name="vencimento" />
								</div>
								
								
								<div class="form-outline form-white mb-4">
									<input type="text" class="form-control form-control-lg" 
										placeholder="Descri????o" rows="3" name="descricao" />
								</div>
								
								<div class="form-outline form-white mb-4">
									<select class="form-control form-control-lg" type="text" name="idFornecedor">
									<option value="">Selecione um fornecedor</option>
									<%
									 	for(Fornecedor f:fornecedores){
									 %>
										<option value=<%=f.getId() %>><%=f.getNome()%></option>
										<%
									 	}
									 %>
									</select>
								</div>

								<input class="btn btn-outline-light btn-lg px-5" type="submit"
									value="Registrar" />

							</div>
							<div>
								<p class="mb-0">
									<a href="formMenuPrincipal.jsp" class="text-white-50 fw-bold">Voltar
										para Menu</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>