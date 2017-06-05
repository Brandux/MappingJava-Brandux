/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import pe.edu.upeu.interfaces.Operaciones;
import pe.edu.upeu.util.Conexion;

/**
 *
 * @author UPEU
 */
public class Rol implements Operaciones<Rol>{
    private static ResultSet rs;
    private static PreparedStatement ps;
    private static Connection cx;

    private static String sql_crear = "INSERT INTO Rol (nombre) VALUES (?)";
    private static String sql_editar = "";
    private static String sql_eliminar = "DELETE FROM Rol WHERE idRol =? ";
    private static String sql_listar = "SELECT * FROM Rol";
    private static String sql_buscar = "";

    @Override
    public int crear(Rol e) {
        int op = 0;
        try {
            cx = Conexion.getCoxeion();
            ps = cx.prepareStatement(sql_crear);
           
            op = ps.executeUpdate();

        } catch (Exception x) {
            System.out.println("error en crear:" + e);

        }
        return op;
    }

    @Override
    public int eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int editar(Rol e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
