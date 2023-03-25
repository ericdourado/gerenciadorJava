/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.gerenciador.servelet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eric
 */
class Banco {
    private static List<Empresa> lista = new ArrayList<>();
    
    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setNome("CODENAPP");
        Empresa empresa3 = new Empresa();
        empresa3.setNome("ADCOS");
        lista.add(empresa);
        lista.add(empresa2);
        lista.add(empresa3);
    }
    
    public void adiciona(Empresa empresa) {
        Banco.lista.add(empresa);
    }
    public List<Empresa> getEmpresas (){
        return Banco.lista;
    }
}
