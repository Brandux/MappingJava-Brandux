/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.interfaces.Operaciones;
import pe.edu.upeu.model.Personadto;
import pe.edu.upeu.util.Conexion;

/**
 *
 * @author UPEU
 */
public class PersonaDao implements Operaciones<Personadto>{

    private static  ResultSet rs ;
    private static PreparedStatement ps;
    private static  Connection cx;
    
    private static String sql_crear="INSERT INTO persona (nombre, apllido, curso, codigo , user, pass, idRol) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static String sql_editar="";
    private static String sql_eliminar="DELETE FROM PERSONA WHERE idPersona =? ";
    private static String sql_listar="SELECT * FROM PERSONA";    
    private static String sql_buscar="";

        public Personadto validar(String user, String pass) {
        Personadto x = null;
        try {
            cx = Conexion.getCoxeion();
            String sql = "SELECT * FROM Persona WHERE user = '" + user + "' AND pass= '" + pass + "'";
            ps = cx.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                x = new Personadto();
                x.setIdPersona(rs.getInt("idPersona"));
                x.setNonbre(rs.getString("nombre"));
                x.setApllido(rs.getString("apllido"));
                x.setCurso(rs.getString("curso"));
                x.setCodigo(rs.getString("codigo"));
                x.setUsuario(rs.getString("user"));
                x.setClave(rs.getString("pass"));
                x.setIdRol(rs.getInt("idRol"));
            }
        } catch (Exception e) {
            System.out.println("Error en validar : " + e);
        }
        return x;
    }

    
    @Override
    public int crear(Personadto e){ 
        int op=0;
        try {
            cx = Conexion.getCoxeion();
            ps = cx.prepareStatement(sql_crear);
            ps.setString(1, e.getNonbre());
            ps.setString(2, e.getApllido());
            ps.setString(3, e.getCurso());
            ps.setString(4, e.getCurso());
            ps.setString(5, e.getUsuario());
            ps.setString(6, e.getClave());
            ps.setInt(7, e.getIdRol());
            op = ps.executeUpdate();

        } catch (Exception x) {
                    System.out.println("error en crear:" +e);

        }
        return op;
    }

    @Override
    public int eliminar(int id) {
       
        int op = 0;
        try {
            cx = Conexion.getCoxeion();
            ps = cx.prepareStatement(sql_eliminar);
            ps.setInt(1, id);
            op = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;

    }

    @Override
    public int editar(Personadto e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personadto> listar() {
        List<Personadto> lista = new ArrayList<>();
        try {
            cx = Conexion.getCoxeion();
            ps = cx.prepareStatement(sql_listar);
            rs = ps.executeQuery();
            while(rs.next()){
                Personadto x = new Personadto();
                x.setIdPersona(rs.getInt("idPersona"));
                x.setNonbre(rs.getString("nombre"));
                x.setApllido(rs.getString("apllido"));
                x.setCurso(rs.getString("curso"));
                x.setCodigo(rs.getString("codigo"));
                x.setUsuario(rs.getString("user"));
                x.setClave(rs.getString("pass"));
                x.setIdRol(rs.getInt("idRol"));
                lista.add(x);
            }
        } catch (Exception e) {
            System.out.println("Error en el listar:" +e);
        }
        return lista;
    }

    @Override
    public List<Personadto> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<Map<String, ?>> listarM() {
        String sql = "SELECT  P.NOMBRE , P.APLLIDO , P.CURSO, P.CODIGO, P.USER ,P.PASS , R.NOMBRE FROM PERSONA P , ROL R"
                + " WHERE P.IDROL = R.IDROL;";
        ArrayList<Map<String, ?>> lista = new ArrayList<Map<String, ?>>();
        try {
            ps = Conexion.getCoxeion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Map<String, Object> d = new HashMap<String, Object>();
                d.put("nombre", rs.getString("NOMBRE"));
                d.put("apllido", rs.getString("APLLIDO"));
                d.put("curso", rs.getString("CURSO"));
                d.put("codigo", rs.getString("CODIGO"));
                d.put("user", rs.getString("USER"));
                d.put("pass", rs.getString("PASS"));
                d.put("idrol", rs.getString("r.NOMBRE"));
                lista.add(d);
            }

        } catch (Exception e) {
            System.out.println("Error al Listar Usuarios " + e);
            return null;
        }
        return lista;
    }
}
