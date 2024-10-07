/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuarioPk", query = "SELECT u FROM Usuario u WHERE u.idUsuarioPk = :idUsuarioPk"),
    @NamedQuery(name = "Usuario.findByContrase\u00f1a", query = "SELECT u FROM Usuario u WHERE u.contrase\u00f1a = :contrase\u00f1a"),
    @NamedQuery(name = "Usuario.findByUsername", query = "SELECT u FROM Usuario u WHERE u.username = :username"),
    @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuario.findByApellidoPaterno", query = "SELECT u FROM Usuario u WHERE u.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Usuario.findByApellidoMaterno", query = "SELECT u FROM Usuario u WHERE u.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Usuario.findByFechaDeNasimiento", query = "SELECT u FROM Usuario u WHERE u.fechaDeNasimiento = :fechaDeNasimiento"),
    @NamedQuery(name = "Usuario.findByTelefono", query = "SELECT u FROM Usuario u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuario.findByCorre", query = "SELECT u FROM Usuario u WHERE u.corre = :corre"),
    @NamedQuery(name = "Usuario.findByDirecion", query = "SELECT u FROM Usuario u WHERE u.direcion = :direcion"),
    @NamedQuery(name = "Usuario.findByCp", query = "SELECT u FROM Usuario u WHERE u.cp = :cp"),
    @NamedQuery(name = "Usuario.findByGenero", query = "SELECT u FROM Usuario u WHERE u.genero = :genero"),
    @NamedQuery(name = "Usuario.findByEstadoCibil", query = "SELECT u FROM Usuario u WHERE u.estadoCibil = :estadoCibil"),
    @NamedQuery(name = "Usuario.findByFechaDeAlta", query = "SELECT u FROM Usuario u WHERE u.fechaDeAlta = :fechaDeAlta"),
    @NamedQuery(name = "Usuario.findByEstatus", query = "SELECT u FROM Usuario u WHERE u.estatus = :estatus"),
    @NamedQuery(name = "Usuario.findBySueldo", query = "SELECT u FROM Usuario u WHERE u.sueldo = :sueldo"),
    @NamedQuery(name = "Usuario.findByUrlFoto", query = "SELECT u FROM Usuario u WHERE u.urlFoto = :urlFoto")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_pk")
    private Integer idUsuarioPk;
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Column(name = "username")
    private String username;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Column(name = "fecha_de_nasimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeNasimiento;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "corre")
    private String corre;
    @Column(name = "direcion")
    private String direcion;
    @Column(name = "cp")
    private String cp;
    @Column(name = "genero")
    private Character genero;
    @Column(name = "estado_cibil")
    private String estadoCibil;
    @Column(name = "fecha_de_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeAlta;
    @Column(name = "estatus")
    private Character estatus;
    @Column(name = "sueldo")
    private Long sueldo;
    @Column(name = "url_foto")
    private String urlFoto;
    @JoinColumn(name = "id_sucursal_fk", referencedColumnName = "id_sucursal_pk")
    @ManyToOne
    private Sucursal idSucursalFk;
    @OneToMany(mappedBy = "idUsuarioFk")
    private List<Bodega> bodegaList;

    public Usuario() {
    }

    public Usuario(Integer idUsuarioPk) {
        this.idUsuarioPk = idUsuarioPk;
    }

    public Integer getIdUsuarioPk() {
        return idUsuarioPk;
    }

    public void setIdUsuarioPk(Integer idUsuarioPk) {
        this.idUsuarioPk = idUsuarioPk;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaDeNasimiento() {
        return fechaDeNasimiento;
    }

    public void setFechaDeNasimiento(Date fechaDeNasimiento) {
        this.fechaDeNasimiento = fechaDeNasimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorre() {
        return corre;
    }

    public void setCorre(String corre) {
        this.corre = corre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getEstadoCibil() {
        return estadoCibil;
    }

    public void setEstadoCibil(String estadoCibil) {
        this.estadoCibil = estadoCibil;
    }

    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Long getSueldo() {
        return sueldo;
    }

    public void setSueldo(Long sueldo) {
        this.sueldo = sueldo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public Sucursal getIdSucursalFk() {
        return idSucursalFk;
    }

    public void setIdSucursalFk(Sucursal idSucursalFk) {
        this.idSucursalFk = idSucursalFk;
    }

    @XmlTransient
    public List<Bodega> getBodegaList() {
        return bodegaList;
    }

    public void setBodegaList(List<Bodega> bodegaList) {
        this.bodegaList = bodegaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioPk != null ? idUsuarioPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuarioPk == null && other.idUsuarioPk != null) || (this.idUsuarioPk != null && !this.idUsuarioPk.equals(other.idUsuarioPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidad.Usuario[ idUsuarioPk=" + idUsuarioPk + " ]";
    }
    
}
