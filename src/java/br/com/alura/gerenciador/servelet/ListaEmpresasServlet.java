/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ListaEmpresasServlet", urlPatterns = {"/listar-empresas"})
public class ListaEmpresasServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        /* TODO output your page here. You may use following sample code. */
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        PrintWriter out = response.getWriter();
        
        
        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
        request.setAttribute("empresas", lista);
        rd.forward(request, response);
        
        
        

    }
}
