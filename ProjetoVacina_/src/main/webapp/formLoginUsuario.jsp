<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<style type="text/css">
.gradient-custom {
	/* fallback for old browsers */
	background: #6a11cb;
	/* Chrome 10-25, Safari 5.1-6 */
	background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1),
		rgba(37, 117, 252, 1));
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
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
<form class="vh-100 gradient-custom" action="controllerValidUser" method="post">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
              <p class="text-white-50 mb-5">Entre com o seu Usuário e Senha</p>

              <div class="form-outline form-white mb-4">
              	<label class="form-label" for="typeEmailX">Usuario</label>
                <input type="text" class="form-control form-control-lg" name="nome"/>
              </div>

              <div class="form-outline form-white mb-4">
              	<label class="form-label" for="typePasswordX">Senha</label>
                <input type="password" class="form-control form-control-lg" name="senha"/>
              </div>
              

              <input class="btn btn-outline-light btn-lg px-5" type="submit" value="Logar"/>

            </div>

            <div>
              <p class="mb-0">Não possui uma conta? <a href="formCadastroUsuario.jsp" class="text-white-50 fw-bold">Clique Aqui</a>
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