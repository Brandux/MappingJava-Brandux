/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import java.sql.Blob;

/**
 *
 * @author UPEU
 */
public class Personadto {
    private int idPersona;
    private String nonbre;
    private String apllido;
    private String curso;
    private String codigo;
    private String usuario;
    private String clave;
    private int idRol;

    public Personadto() {
    }

    public Personadto(int idPersona, String nonbre, String apllido, String curso, String codigo, String usuario, String clave, int idRol) {
        this.idPersona = idPersona;
        this.nonbre = nonbre;
        this.apllido = apllido;
        this.curso = curso;
        this.codigo = codigo;
        this.usuario = usuario;
        this.clave = clave;
        this.idRol = idRol;
    }

    public Personadto(String nonbre, String apllido, String curso, String codigo, String usuario, String clave, int idRol) {
        this.nonbre = nonbre;
        this.apllido = apllido;
        this.curso = curso;
        this.codigo = codigo;
        this.usuario = usuario;
        this.clave = clave;
        this.idRol = idRol;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNonbre() {
        return nonbre;
    }

    public void setNonbre(String nonbre) {
        this.nonbre = nonbre;
    }

    public String getApllido() {
        return apllido;
    }

    public void setApllido(String apllido) {
        this.apllido = apllido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
    

   
    
}
