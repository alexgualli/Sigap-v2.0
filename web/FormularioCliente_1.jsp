
FORMULARIOCLIENTE COMPLETO 

<%-- 
    Document   : asd
    Created on : 24/07/2018, 10:46:13
    Author     : jhona
--%>

<%@page import="ec.gob.sigap.entidades.Cliente"%>
<%@page import="ec.gob.sigap.entidades.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>JPB SIGAP! |Cliente </title>

        <!-- Bootstrap -->
        <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Font Awesome -->
        <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <!-- NProgress -->
        <link href="vendors/nprogress/nprogress.css" rel="stylesheet" type="text/css"/>
        <!-- bootstrap-daterangepicker -->
        <link href="vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet" type="text/css"/>
        <!-- bootstrap-datetimepicker -->
        <link href="vendors/bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css"/>
        <!-- Ion.RangeSlider -->
        <link href="vendors/normalize-css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="vendors/ion.rangeSlider/css/ion.rangeSlider.css" rel="stylesheet" type="text/css"/>
        <link href="vendors/ion.rangeSlider/css/ion.rangeSlider.skinFlat.css" rel="stylesheet" type="text/css"/>
        <!-- Bootstrap Colorpicker -->
        <link href="vendors/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet" type="text/css"/>


        <!-- Custom Theme Style -->
        <link href="build/css/custom.min.css" rel="stylesheet" type="text/css"/>

    <body class="nav-md">
        <%
            String cedulaBuscar = request.getParameter("txtcedula");
        %>
        <div class="container body">
            <div class="main_container">
                <div class="col-md-3 left_col">
                    <div class="left_col scroll-view">
                        <div class="navbar nav_title" style="border: 0;">
                            <a href="FormularioPrincipal.jsp" class="site_title"><i class="fa fa-paw"></i> <span>SIGAP</span></a>
                        </div>

                        <div class="clearfix"></div>

                        <!-- menu profile quick info -->
                        <div class="profile clearfix">
                            <div class="profile_pic">
                                <img src="images/prod-2.jpg" alt="..." class="img-circle profile_img">

                            </div>
                            <div class="profile_info">
                                <span>Bienvenido</span>
                                <h2>User</h2>
                            </div>
                        </div>
                        <!-- /menu profile quick info -->

                        <!-- sidebar menu -->
                        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                            <div class="menu_section">
                                <h3>General</h3>
                                <ul class="nav side-menu">
                                    <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="FormularioPrincipal.jsp">Informacion</a></li>
                                            <li><a href="#">Ayuda</a></li>
                                            <li><a href="#">Sobre Nosotros</a></li>
                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-edit"></i> Aministracion <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="FormularioCliente.jsp">Nuevo Cliente</a></li>
                                            <li><a href="FormularioAdministrador.jsp">Nuevo Usuario</a></li>
                                            <li><a href="FormularioDeuda.jsp">Deudas</a></li>
                                            <li><a href="FormularioMedidor.jsp">Medidores</a></li>

                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-pencil"></i> Lecturas de Medidor<span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="FormularioConsumo.jsp">Nueva Medicion</a></li>

                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-ticket"></i> Facturacion<span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="FormularioFactura.jsp">Generar Factura</a></li>

                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-table"></i> Reportes <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="#">Reporte de Usuarios</a></li>
                                            <li><a href="FormularioReporteCliente.jsp">Reporte de Clientes</a></li>
                                            <li><a href="#">Reporte de Pagos</a></li>
                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-bar-chart-o"></i> Estadistica<span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="#">Estadistica de Clientes</a></li>

                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-clone"></i>Manual <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="#">Manual de Usuario</a></li>
                                            <li><a href="#">Documentacion</a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                            <div class="menu_section">
                                <h3>Enlaces Externos</h3>
                                <ul class="nav side-menu">
                                    <li><a><i class="fa fa-google"></i> Ley de Recursos Hídricos<span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="#">Ley de Recursos Hídricos II suplemento RO 305 6-08-204</a></li>
                                            <li><a href="#">Normativa Secundaria</a></li>
                                            <li><a href="#">Reglamento ley Recursos Hidricos usos y aprovechamiento del agua</a></li>
                                            <li><a href="#">Secretaria Nacional del Agua</a></li>

                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-facebook-square"></i> Redes Sociales <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="#">Equipo de Desarrollo</a></li>
                                            <li><a href="#">Universidad Nacional de Chimborazo</a></li>

                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-whatsapp"></i> Soporte Tecnico   <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">

                                            <li><a>Contacto<span class="fa fa-chevron-down"></span></a>
                                                <ul class="nav child_menu">
                                                    <li class="sub_menu"><a href="#">Jhonatan Montenegro 0995645711</a>
                                                    </li>
                                                    <li><a href="#"> Alex Francisco Gualli 0123456789</a>
                                                    </li>
                                                    <li><a href="#">Luis Felipe Borja 1234567893</a>
                                                    </li>
                                                </ul>
                                            </li>

                                        </ul>
                                    </li>                  
                                    <li><a href="javascript:void(0)"><i class="fa fa-laptop"></i> Landing Page <span class="label label-success pull-right">Coming Soon</span></a></li>
                                </ul>
                            </div>

                        </div>
                        <!-- /sidebar menu -->

                        <!-- /menu footer buttons -->
                        <div class="sidebar-footer hidden-small">
                            <a data-toggle="tooltip" data-placement="top" title="Settings">
                                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                            </a>
                            <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                            </a>
                            <a data-toggle="tooltip" data-placement="top" title="Lock">
                                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                            </a>
                            <a data-toggle="tooltip" data-placement="top" title="Logout" href="#">
                                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                            </a>
                        </div>
                        <!-- /menu footer buttons -->
                    </div>
                </div>

                <!-- top navigation -->
                <div class="top_nav">
                    <div class="nav_menu">
                        <nav>
                            <div class="nav toggle">
                                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                            </div>

                            <ul class="nav navbar-nav navbar-right">
                                <li class="">
                                    <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                        <img src="images/img.jpg" alt="">John Doe
                                        <span class=" fa fa-angle-down"></span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-usermenu pull-right">
                                        <li><a href="javascript:;"> Profile</a></li>
                                        <li>
                                            <a href="javascript:;">
                                                <span class="badge bg-red pull-right">50%</span>
                                                <span>Settings</span>
                                            </a>
                                        </li>
                                        <li><a href="javascript:;">Help</a></li>
                                        <li><a href="#"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                                    </ul>
                                </li>

                                <li role="presentation" class="dropdown">
                                    <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                                        <i class="fa fa-envelope-o"></i>
                                        <span class="badge bg-green">6</span>
                                    </a>
                                    <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                                        <li>
                                            <a>
                                                <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                                                <span>
                                                    <span>John Smith</span>
                                                    <span class="time">3 mins ago</span>
                                                </span>
                                                <span class="message">
                                                    Film festivals used to be do-or-die moments for movie makers. They were where...
                                                </span>
                                            </a>
                                        </li>
                                        <li>
                                            <a>
                                                <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                                                <span>
                                                    <span>John Smith</span>
                                                    <span class="time">3 mins ago</span>
                                                </span>
                                                <span class="message">
                                                    Film festivals used to be do-or-die moments for movie makers. They were where...
                                                </span>
                                            </a>
                                        </li>
                                        <li>
                                            <a>
                                                <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                                                <span>
                                                    <span>John Smith</span>
                                                    <span class="time">3 mins ago</span>
                                                </span>
                                                <span class="message">
                                                    Film festivals used to be do-or-die moments for movie makers. They were where...
                                                </span>
                                            </a>
                                        </li>
                                        <li>
                                            <a>
                                                <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                                                <span>
                                                    <span>John Smith</span>
                                                    <span class="time">3 mins ago</span>
                                                </span>
                                                <span class="message">
                                                    Film festivals used to be do-or-die moments for movie makers. They were where...
                                                </span>
                                            </a>
                                        </li>
                                        <li>
                                            <div class="text-center">
                                                <a>
                                                    <strong>See All Alerts</strong>
                                                    <i class="fa fa-angle-right"></i>
                                                </a>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <!-- /top navigation -->

                <!-- page content -->
                <div class="right_col" role="main">
                    <div class="">
                        <div class="page-title">
                            <div class="title_left">

                                .<h3>SIGAP <small>Registro de Clientes y Asignacion de Medidor </small></h3>
                            </div>

                            <div class="title_right">
                                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="Search for...">
                                        <span class="input-group-btn">
                                            <button class="btn btn-default" type="button">Go!</button>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="clearfix"></div>

                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>CLIENTES <small></small></h2>
                                        <ul class="nav navbar-right panel_toolbox">
                                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                            </li>
                                            <li class="dropdown">
                                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                                <ul class="dropdown-menu" role="menu">
                                                    <li><a href="#">Settings 1</a>
                                                    </li>
                                                    <li><a href="#">Settings 2</a>
                                                    </li>
                                                </ul>
                                            </li>
                                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                                            </li>
                                        </ul>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">

                                        <form class="form-horizontal form-label-left" novalidate action="IngresoCliente">


                                            <span class="section">Informacion de Cliente</span>
                                            
                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="telephone">Cedula <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input type="tel" id="telephone" name="txtcedula" required="required" data-validate-length-range="8,10" class="form-control col-md-7 col-xs-12" placeholder="1234567890">
                                                </div>
                                            </div>

                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Nombres <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input id="name" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" name="txtnombre" placeholder="Jhonatan Israel" required="required" type="text">
                                                </div>
                                            </div>
                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Apellidos <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input id="name" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="txtapellido" placeholder="Montenegro Garrido" required="required" type="text">
                                                </div>
                                            </div>
                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="occupation">Direccion <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input id="occupation" type="text" name="txtdireccion" data-validate-length-range="5,20" class="optional form-control col-md-7 col-xs-12">
                                                </div>
                                            </div>


                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="telephone">Telefono <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input type="tel" id="telephone" name="txttelefono" data-validate-length-range="8,10" class="form-control col-md-7 col-xs-12" placeholder="1234567890">
                                                </div>
                                            </div>

                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Email <span class="required">(opcional)</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input type="email" id="email" name="txtcorreo" class="form-control col-md-7 col-xs-12" placeholder="Ejem:... example@gmail.com">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" >Fecha de Nacimiento <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <div class='input-group date' id='myDatepicker2'>
                                                        <input type='text' class="form-control" name="txtfechanac"/>
                                                        <span class="input-group-addon">
                                                            <span class="glyphicon glyphicon-calendar"></span>
                                                        </span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="telephone">Codigo de Discapacidad <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input type="tel" id="telephone" name="txtcodis" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12">
                                                </div>
                                            </div>
                                            <div class="item form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="telephone"> Edad <span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input type="tel" id="telephone" name="txtedad" required="required" data-validate-length-range="1,100" class="form-control col-md-7 col-xs-12">
                                                </div>
                                            </div>
                                            <div class="ln_solid"></div>
                                            <div class="form-group">
                                                <div class="col-md-6 col-md-offset-3">
                                                    <button type="submit" class="btn btn-primary">Cancelar</button>
                                                    <!-- Small modal -->
                                                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-sm">Aceptar</button>

                                                    <div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-hidden="true">
                                                        <div class="modal-dialog modal-sm">
                                                            <div class="modal-content">

                                                                <div class="modal-header">
                                                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
                                                                    </button>
                                                                    <h4 class="modal-title" id="myModalLabel2">IMPORTANTE</h4>
                                                                </div>
                                                                <div class="modal-body">

                                                                    <h4><p> Recuerde que al registrar un nuevo usuario,debe asignarle un nuevo medidor en el apartado de asignacion de medidores en la parte de abajo</p>
                                                                        <p>En caso de no autogenerarse los datos en la asignacion, utilice la barra de busqueda para ubicar el usuario ingresado,recuerde seguir los parametros especificados en el recuadro</p>
                                                                    </h4>
                                                                </div>
                                                                <div class="modal-footer">

                                                                    <button type="submit" class="btn btn-primary">Guardar</button>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </form>

                                    </div>
                                </div>                       


                                <div class="row">
                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                        <div class="x_panel">
                                            <div class="x_title">
                                                <h2> MEDIDOR-USUARIO <small></small></h2>
                                                <ul class="nav navbar-right panel_toolbox">
                                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                    </li>
                                                    <li class="dropdown">
                                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" title="Ocultar Barra"><i class="fa fa-wrench"></i></a>
                                                        <ul class="dropdown-menu" role="menu">
                                                            <li><a href="#">Settings 1</a>
                                                            </li>
                                                            <li><a href="#">Settings 2</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                    </li>
                                                </ul>
                                                <div class="clearfix"></div>
                                            </div>
                                            <div class="x_content">


                                                <div class="col-md-12 col-sm-12 col-xs-12">


                                                    <div class="col-md-12 col-sm-12 col-xs-12" style="border:0px solid #e5e5e5;">
                                                        <div class="col-md-3 col-sm-3 col-xs-12 profile_left">
                                                            <div class="profile_img">
                                                                <div id="crop-avatar">
                                                                    <!-- Current avatar -->
                                                                    <img class="img-responsive avatar-view" src="images/prod-2.jpg" alt="Avatar" >
                                                                </div>
                                                            </div>

                                                        </div>
                                                        <h3 class="prod_title">Asignacion de Suministro de medidores de Agua</h3>

                                                        <p>Asigne un nuevo modedidor al cliente que previamente fue registrado, recuerde seguir los parametros especificados en el recuadro.</p>
                                                        <hr >

                                                        <div class="col-md-12 col-sm-12 col-xs-12" >

                                                            <div class="x_panel">
                                                                <div class="x_title">
                                                                    <h2>Medidor-Cliente <small></small></h2>
                                                                    <ul class="nav navbar-right panel_toolbox">
                                                                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                                                        </li>
                                                                        <li class="dropdown">
                                                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                                                            <ul class="dropdown-menu" role="menu">
                                                                                <li><a href="#">Settings 1</a>
                                                                                </li>
                                                                                <li><a href="#">Settings 2</a>
                                                                                </li>
                                                                            </ul>
                                                                        </li>
                                                                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                                                                        </li>
                                                                    </ul>
                                                                    <div class="clearfix"></div>
                                                                </div>
                                                                <div class="x_content">
                                                                    <br />
                                                                    <form class="form-horizontal form-label-left input_mask" action="BuscarCliente">
                                                                        <div class="input-group">
                                                                            <span class="input-group-btn">
                                                                                <button type="submit" class="btn btn-primary" >Buscar</button>
                                                                            </span>
                                                                            <input name="txtbuscar" value="<%=cedulaBuscar%>" type="text" class="form-control" placeholder="...Buscar Cliente" title="Buscar Cliente">
                                                                        </div>
                                                                    </form>

                                                                    <%
                                                                        Cliente cli = new Cliente();
                                                                        cli.setApellido("Ninguno");
                                                                        cli.setNombre("Ninguno");
                                                                        cli.setCorreo("Ninguno");
                                                                        cli.setTelefono("Ninguno");

                                                                        if (request.getSession().getAttribute("clientebus") != null) {
                                                                            cli = (Cliente) request.getSession().getAttribute("clientebus");
                                                                        } else {
                                                                            out.print("sin parametro");
                                                                        }

                                                                    %>

                                                                    <form class="form-horizontal form-label-left input_mask" action="AsignarMedidor">


                                                                        <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
                                                                            <input value="<%=cli.getNombre()%>" type="text" class="form-control has-feedback-left" id="inputSuccess2" placeholder="Nombre" readonly="readonly">
                                                                            <span class="fa fa-user form-control-feedback left" aria-hidden="true"></span>
                                                                        </div>

                                                                        <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
                                                                            <input value="<%=cli.getApellido()%>" type="text" class="form-control" id="inputSuccess3" placeholder="Apellido" readonly="readonly">
                                                                            <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>
                                                                        </div>

                                                                        <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
                                                                            <input value="<%=cli.getCorreo()%>" type="text" class="form-control has-feedback-left" id="inputSuccess4" placeholder="Email"readonly="readonly">
                                                                            <span class="fa fa-envelope form-control-feedback left" aria-hidden="true"></span>
                                                                        </div>

                                                                        <div class="col-md-6 col-sm-6 col-xs-12 form-group has-feedback">
                                                                            <input value="<%=cli.getTelefono()%>" type="text" class="form-control" id="inputSuccess5" placeholder="Telefono" readonly="readonly">
                                                                            <span class="fa fa-phone form-control-feedback right" aria-hidden="true"></span>
                                                                        </div>

                                                                            
                                                                        <%%>

                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12"> Codigo de Medidor</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input name="txtcodigomed" type="text" class="form-control" placeholder="Ingrese el codigo del medidor" required="required">
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Cédula del Cliente </label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <input value="<%=cli.getCedula()%>" name="txtcedulacli" type="text" class="form-control" readonly="...">
                                                                            </div>
                                                                        </div>


                                                                        <div class="form-group">
                                                                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo de Medidor</label>
                                                                            <div class="col-md-9 col-sm-9 col-xs-12">
                                                                                <select class="form-control" required="required" name="txttipomed" >
                                                                                    <option disabled="">Tipo de Medidor</option>
                                                                                    <option value="residencial">Medidor Residencial</option>
                                                                                    <option value="comercial">Medidor Comercial</option>

                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <div class="ln_solid"></div>
                                                                        <div class="form-group">
                                                                            <div class="col-md-9 col-sm-9 col-xs-12 col-md-offset-3">
                                                                                <button type="button" class="btn btn-primary">Cancelar</button>
                                                                                <button class="btn btn-primary" type="reset">Borrar</button>
                                                                                <button type="submit" class="btn btn-success">Aceptar</button>
                                                                            </div>
                                                                        </div>

                                                                    </form>
                                                                </div>
                                                            </div>

                                                        </div>



                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- /page content -->

                    <!-- footer content -->
                    <footer>
                        <div class="pull-right">
                            Universidad Nacional de Chimborazo - Copyrigth <a href="https://.com">Unach</a>
                        </div>
                        <div class="clearfix"></div>
                    </footer>
                    <!-- /footer content -->
                </div>
            </div>

            <!-- jQuery -->
            <script src="vendors/jquery/dist/jquery.min.js"></script>
            <!-- Bootstrap -->
            <script src="vendors/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
            <!-- FastClick -->
            <script src="vendors/fastclick/lib/fastclick.js" type="text/javascript"></script>
            <!-- NProgress -->
            <script src="vendors/nprogress/nprogress.js" type="text/javascript"></script>
            <!-- validator -->
            <script src="vendors/validator/validator.js" type="text/javascript"></script>
            <!-- bootstrap-daterangepicker -->
            <script src="vendors/moment/min/moment.min.js" type="text/javascript"></script>
            <script src="vendors/bootstrap-daterangepicker/daterangepicker.js" type="text/javascript"></script>
            <!-- bootstrap-datetimepicker -->    
            <script src="vendors/bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
            <!-- Ion.RangeSlider -->
            <script src="vendors/ion.rangeSlider/js/ion.rangeSlider.min.js" type="text/javascript"></script>
            <!-- Bootstrap Colorpicker -->
            <script src="vendors/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js" type="text/javascript"></script>
            <!-- jquery.inputmask -->
            <script src="vendors/jquery.inputmask/dist/min/jquery.inputmask.bundle.min.js" type="text/javascript"></script>
            <!-- jQuery Knob -->
            <script src="vendors/jquery-knob/dist/jquery.knob.min.js" type="text/javascript"></script>

            <!-- Custom Theme Scripts -->
            <script src="build/js/custom.min.js" type="text/javascript"></script>



            <script>
                $('#myDatepicker').datetimepicker();

                $('#myDatepicker2').datetimepicker({
                    format: 'DD-MM-YYYY'
                });

                $('#myDatepicker3').datetimepicker({
                    format: 'hh:mm A'
                });

                $('#myDatepicker4').datetimepicker({
                    ignoreReadonly: true,
                    allowInputToggle: true
                });

                $('#datetimepicker6').datetimepicker();

                $('#datetimepicker7').datetimepicker({
                    useCurrent: false
                });

                $("#datetimepicker6").on("dp.change", function (e) {
                    $('#datetimepicker7').data("DateTimePicker").minDate(e.date);
                });

                $("#datetimepicker7").on("dp.change", function (e) {
                    $('#datetimepicker6').data("DateTimePicker").maxDate(e.date);
                });
            </script>
    </body>
</html>
