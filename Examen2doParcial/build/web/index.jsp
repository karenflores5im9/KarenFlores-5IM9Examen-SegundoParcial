<%-- 
    Document   : index
    Created on : 18/10/2018, 07:38:14 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <body>

        <ul class="topnav">
            <li><a class="active" href="index.jsp">Inicio</a></li>
            <li><a href="Registro.jsp">Registro</a></li>
            <li><a href="ConsultaServlet">Consulta</a></li>
        </ul>
        
        <h1 align="center">BIENVENIDO</h1>
    </body>
</html>