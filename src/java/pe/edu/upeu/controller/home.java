/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.upeu.dao.PersonaDao;
import pe.edu.upeu.model.Personadto;

/**
 *
 * @author Brandukosky
 */
@Controller
public class home {
    private PersonaDao pao = new PersonaDao();
    
    @RequestMapping("/login")
    public String home(){
        return "login";
    }
    
    
    
    
    @RequestMapping("/logueo")
    public String Principal(Model mo, HttpServletRequest resquest, HttpServletResponse response) {
//        int conta = 0;
//        int i =Integer.parseInt( resquest.getParameter("conta")) ;
        String url = "index";
        String user = resquest.getParameter("user");
        String Pass = resquest.getParameter("pass");
        HttpSession sesion = resquest.getSession();
        Personadto c = new Personadto();
        c = pao.validar(user, Pass);
        try {
//            while(conta <=3){
                    if (c != null) {
                        if (c.getIdRol() == 3) {
                            resquest.getSession().setAttribute("Persona", c);

                            //Listando con el Mapping 2 tablas
                            mo.addAttribute("persona", pao.listarM());

                            //Listado como lo haciamos normalmente

                            mo.addAttribute("ListaNormal" , pao.listar());

                            url ="Admin";

                        } else {
                            resquest.getSession().setAttribute("Persona", c);
                            url = "Entro";
                        }
                    } else {
                        url = "login";
                        System.out.println("<script> alert( 'ingrese su usuario  nuevamente' );</scrip>");
                     }
            
//            url = "Error";
//            conta = conta +i;
        } catch (Exception e) {
        }
        return url;
    }
    //Esta parte para cerrar sesion e invalidar el acceso
    @RequestMapping("/cerrar")
        private String Logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String url ="login";
            
            HttpSession session = request.getSession();
            session.invalidate();
            //response.sendRedirect("Catalogo.jsp");
            
            return url;
        }
        
}
