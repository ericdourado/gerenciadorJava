/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eric
 */
@WebServlet(name = "AlteraEmpresaServlet", urlPatterns = {"/alterar-empresa"})
public class AlteraEmpresaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nomeEmpresa = request.getParameter("name");
        String data = request.getParameter("dtCadastro");
        int id = Integer.parseInt(request.getParameter("id"));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAbertura = null;
                
        try {
            dataAbertura =  sdf.parse(data);
        } catch (ParseException ex) {
            throw new ServletException(ex);
        }
        
        Banco banco = new Banco();
        Empresa empresa = banco.buscarEmpresa(id);
        empresa.setNome(nomeEmpresa);
        empresa.setData(dataAbertura);
        
        response.sendRedirect("listar-empresas");
        
    }
}