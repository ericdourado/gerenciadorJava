/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        /* TODO output your page here. You may use following sample code. */
        PrintWriter out = response.getWriter();
        String nomeEmpresa = request.getParameter("name");
        String data = request.getParameter("dtCadastro");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAbertura = null;
                
        try {
            dataAbertura =  sdf.parse(data);
        } catch (ParseException ex) {
            throw new ServletException(ex);
        }
        
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);        
        empresa.setData(dataAbertura);
        Banco banco = new Banco();
        banco.adiciona(empresa);    
        
        request.setAttribute("empresa", empresa);
        
        response.sendRedirect("listar-empresas");

    }
}
