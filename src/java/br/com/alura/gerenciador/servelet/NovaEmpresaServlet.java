/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eric
 */
@WebServlet(name = "NovaEmpresaServlet", urlPatterns = {"/nova-empresa"})
public class NovaEmpresaServlet extends HttpServlet {
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        /* TODO output your page here. You may use following sample code. */
        PrintWriter out = response.getWriter();
        String nomeEmpresa = request.getParameter("name");
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);        
        Banco banco = new Banco();
        banco.adiciona(empresa);    
        
        // manda request para jsp
        RequestDispatcher rd = request.getRequestDispatcher("/NovaEmpresaCriada.jsp");
        request.setAttribute("empresa", empresa.getNome());
        rd.forward(request, response);
    }
}
