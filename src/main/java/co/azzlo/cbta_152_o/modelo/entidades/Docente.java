/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.azzlo.cbta_152_o.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marco Antonio Castro Ramirez
 */
@Entity
@Table(name = "DOCENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Docente.findAll", query = "SELECT d FROM Docente d")
    , @NamedQuery(name = "Docente.findByIdDocente", query = "SELECT d FROM Docente d WHERE d.idDocente = :idDocente")
    , @NamedQuery(name = "Docente.findByNombre1", query = "SELECT d FROM Docente d WHERE d.nombre1 = :nombre1")
    , @NamedQuery(name = "Docente.findByNombre2", query = "SELECT d FROM Docente d WHERE d.nombre2 = :nombre2")
    , @NamedQuery(name = "Docente.findByApePat", query = "SELECT d FROM Docente d WHERE d.apePat = :apePat")
    , @NamedQuery(name = "Docente.findByApeMat", query = "SELECT d FROM Docente d WHERE d.apeMat = :apeMat")
    , @NamedQuery(name = "Docente.findByPerfil", query = "SELECT d FROM Docente d WHERE d.perfil = :perfil")})
public class Docente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DOCENTE")
    private Long idDocente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "NOMBRE1")
    private String nombre1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "NOMBRE2")
    private String nombre2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "APE_PAT")
    private String apePat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "APE_MAT")
    private String apeMat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "PERFIL")
    private String perfil;

    public Docente() {
    }

    public Docente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public Docente(Long idDocente, String nombre1, String nombre2, String apePat, String apeMat, String perfil) {
        this.idDocente = idDocente;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.perfil = perfil;
    }

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocente != null ? idDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docente)) {
            return false;
        }
        Docente other = (Docente) object;
        if ((this.idDocente == null && other.idDocente != null) || (this.idDocente != null && !this.idDocente.equals(other.idDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.Docente[ idDocente=" + idDocente + " ]";
    }
    
}
