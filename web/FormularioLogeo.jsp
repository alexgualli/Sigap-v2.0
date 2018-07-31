<%-- 
    Document   : FormularioLogeo
    Created on : 24/07/2018, 12:50:49
    Author     : jhona
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>JPB! |LOGIN </title>

    <!-- Bootstrap -->
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet" type="text/css"/>
    <!-- Animate.css -->
    <link href="vendors/animate.css/animate.min.css" rel="stylesheet" type="text/css"/>
   

    <!-- Custom Theme Style -->
    <link href="build/css/custom.min.css" rel="stylesheet" type="text/css"/>
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
               <img src="images/logo.png" alt="" height="100px"/>
               <form action="Logeo" method="POST">
               
              <h1>INICIAR SESION</h1>
              <div>
                  <input type="text" name="txtnombre" class="form-control" placeholder="Nombre de Usuario" required="" />
              </div>
              <div>
                  <input type="password" name="txtclave" class="form-control" placeholder="Password" required="" />
              </div>
              <div>
                  <input type="submit" class="btn btn-default submit" value="Iniciar Sesion" >
                <a class="reset_pass" href="#">Lost your password?</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">Nuevo en el sitio?
                  <a href="#signup" class="to_register"> Crear Cuenta </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><img src="images/logo.png" alt="" height="49px"/> JPB SIGAP!</h1>
                  <p>©2018 Todos los derechos reservados. JPB SIGAP! Universidad Nacional de Chimborazo. </p>
                </div>
              </div>
            </form>
          </section>
        </div>

        <div id="register" class="animate form registration_form">
          <section class="login_content">
               <img src="images/logo.png" alt="" height="100px"/>
            <form>
              <h1>Crear Cuenta</h1>
              <div>
                <input type="text" class="form-control" placeholder="Nombre de Usuario" required="" />
              </div>
              <div>
                <input type="email" class="form-control" placeholder="Email" required="" />
              </div>
              <div>
                <input type="password" class="form-control" placeholder="Password" required="" />
              </div>
              <div>
                <a class="btn btn-default submit" href="index.html">Crear</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">
                <p class="change_link">Ya posees una cuenta ?
                  <a href="#" class="to_register"> Iniciar Sesion </a>
                </p>

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><img src="images/logo.png" alt="" height="49px"/> JPB SIGAP!</h1>
                  <p>©2018 Todos los derechos reservados. JPB SIGAP! Universidad Nacional de Chimborazo.</p>
                </div>
              </div>
            </form>
          </section>
        </div>
      </div>
    </div>
  </body>
</html>

