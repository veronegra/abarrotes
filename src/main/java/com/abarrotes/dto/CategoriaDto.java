/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jesus
 */
public class CategoriaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Integer idCategoriaPk;
    
    private String nombre;
   
    private Character estatus;
   
    private Date fechaAlta;

    public CategoriaDto() {
    }

    public CategoriaDto(Integer idCategoriaPk) {
        this.idCategoriaPk = idCategoriaPk;
    }

    public Integer getIdCategoriaPk() {
        return idCategoriaPk;
    }

    public void setIdCategoriaPk(Integer idCategoriaPk) {
        this.idCategoriaPk = idCategoriaPk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriaPk != null ? idCategoriaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaDto)) {
            return false;
        }
        CategoriaDto other = (CategoriaDto) object;
        return !((this.idCategoriaPk == null && other.idCategoriaPk != null) || (this.idCategoriaPk != null && !this.idCategoriaPk.equals(other.idCategoriaPk)));
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Categoria[ idCategoriaPk=" + idCategoriaPk + " ]";
    }
    
}
