/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.interfaces;

import java.util.List;

/**
 *
 * @author UPEU
 */
public interface Operaciones <Entidades>{
    public int crear(Entidades e);
    public int eliminar(int id);
    
    public int editar (Entidades e);
    
    public List<Entidades> listar();
    public List<Entidades> buscar(int id);
    
}
