/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.toshi;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.dao.PersonaDao;
import pe.edu.upeu.model.Personadto;
import pe.edu.upeu.util.Conexion;

/**
 *
 * @author UPEU
 */
public class Toshi {
    private static PersonaDao dao = new PersonaDao();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        conex();
//        crear();
        listar();
//        listarPersonas();
    }
    public static  void conex(){
        Connection cx  = Conexion.getCoxeion();
        if (cx !=null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    
    public static void crear (){
        Personadto p = new Personadto("Admim", "juarez","admin" ,"1" ,"admin", "admin", 3);
        if(dao.crear(p)==1){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void listar(){
        List<Personadto> lista= new ArrayList<>();
        lista = dao.listar();
        for (Personadto p : lista) {
            System.out.println( p.getNonbre());
        }
    
            
        }
    public static void listarPersonas() {
        ArrayList<Map<String, ?>> lista = dao.listarM();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
}
