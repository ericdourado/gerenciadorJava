/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.gerenciador.servelet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Eric
 */
class Banco {
    private static List<Empresa> lista = new ArrayList<>();
    private static int chaveSequencial = 1;
    
    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("CODENAPP");
        Empresa empresa3 = new Empresa();
        empresa3.setId(chaveSequencial++);
        empresa3.setNome("ADCOS");
        lista.add(empresa);
        lista.add(empresa2);
        lista.add(empresa3);
    }
    
    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.lista.add(empresa);
    }
    public List<Empresa> getEmpresas (){
        return Banco.lista;
    }
    
    public void removeEmpresa(int id){
        Iterator<Empresa> it = lista.iterator();
        
        while(it.hasNext()){
            Empresa empresa = it.next();
            
            if (empresa.getId() == id){
                it.remove();
            }
        }
        
    }

    public Empresa buscarEmpresa(int id) {
            
        for(Empresa empresa : lista){
            if(empresa.getId() == id){
                return empresa;
            }
        }
        return null;
            
    }

    
}
