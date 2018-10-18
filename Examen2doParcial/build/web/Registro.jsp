<%-- 
    Document   : index
    Created on : 18/10/2018, 07:38:14 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <head>
        <title>Registro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
        <style>
            body {margin: 0;}

            ul.topnav {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333;
            }

            ul.topnav li {float: left;}

            ul.topnav li a {
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-family: Arial;
            }

            ul.topnav li a:hover:not(.active) {background-color: #111;}

            ul.topnav li a.active {background-color: #003399;}

            ul.topnav li.right {float: right;}

            @media screen and (max-width: 600px){
                ul.topnav li.right, 
                ul.topnav li {float: none;}
            }

            h1{
                font-family: Arial;
                color: #003399;
            }
        </style>
    </head>
    <body style="background-color: #003399;">

        <ul class="topnav">
            <li><a class="active" href="index.jsp">Inicio</a></li>
            <li><a href="Registro.jsp">Registro</a></li>
            <li><a href="ConsultaServlet">Consulta</a></li>
        </ul>
        <div class="limiter">
            <div class="container-login100">
                <div class="login100-more" style="background-image: url('images/bg-01.jpg');"></div>

                <div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
                    <form class="login100-form validate-form"  name="registro" action="RegistroServlet" method="get">
                        <span class="login100-form-title p-b-59">
                            REGISTRO
                        </span>

                        <div class="wrap-input100 validate-input" data-validate="Es necesario el nombre">
                            <span class="label-input100">Nombre: </span>
                            <input class="input100" type="text" name="nombre">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate="Es necesario el apellido paterno" >
                            <span class="label-input100">Apellido Paterno: </span>
                            <input class="input100" type="text" name="paterno">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate="Es necesario el apellido materno">
                            <span class="label-input100">Apellido Materno: </span>
                            <input class="input100" type="text" name="materno">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate="Es necesario la escuela">
                            <span class="label-input100">Escuela: </span>
                            <input class="input100" type="text" name="escuela">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate="Es necesario la materia">
                            <span class="label-input100">Materia Favorita: </span>
                            <input class="input100" type="text" name="materia">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate="Es necesario el deporte">
                            <span class="label-input100">Deporte Favorito: </span>
                            <input class="input100" type="text" name="deporte">
                            <span class="focus-input100"></span>
                        </div>


                        <div class="container-login100-form-btn">
                            <div class="wrap-login100-form-btn">
                                <div class="login100-form-bgbtn"></div>
                                <button  class="login100-form-btn">
                                    Registrarse
                                </button>
                            </div>

                            <a href="index.jsp" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30">
                                Inicio
                                <i class="fa fa-long-arrow-right m-l-5"></i>
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <script src="js/main.js"></script>

    </body>
</html>
