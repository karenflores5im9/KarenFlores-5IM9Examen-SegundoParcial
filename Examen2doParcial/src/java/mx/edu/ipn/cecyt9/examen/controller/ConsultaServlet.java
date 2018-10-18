/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.examen.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ipn.cecyt9.examen.utils.Conexion;

/**
 *
 * @author Alumno
 */
public class ConsultaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Conexion.obtener();
            ResultSet resultado = null;
            Statement stmnt = Conexion.cnx.createStatement();
                try {
                    resultado = stmnt.executeQuery("select * from examen_registro");
                    out.println("<table border = 1 align='center''>");
                    out.println("<tr><th>ID</th>");
                    out.println("<th>Nombre</th>");
                    out.println("<th>Apellido Paterno</th>");
                    out.println("<th>Apellido Materno</th>");
                    out.println("<th>Escuela</th>");
                    out.println("<th>Materia Favorita</th>");
                    out.println("<th>Deporte Favorito</th>");
                    while (resultado.next()) {
                        int id = resultado.getInt("idusuario");
                        String nombre = resultado.getString("nombre");
                        String paterno = resultado.getString("paterno");
                        String materno = resultado.getString("materno");
                        String escuela = resultado.getString("escuela");
                        String materia = resultado.getString("materia");
                        String deporte = resultado.getString("deporte");
                        out.println("<tr><th>" + id + "</th>");
                        out.println("<th>" + nombre + "</th>");
                        out.println("<th>" + paterno + "</th>");
                        out.println("<th>" + materno + "</th>");
                        out.println("<th>" + escuela + "</th>");
                        out.println("<th>" + materia + "</th>");
                        out.println("<th>" + deporte + "</th>");
                        out.println("</tr>");
                        out.println("</table>");
                    }
                } catch (SQLException error) {

                }
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
