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
 * @author Azz
 */
@Entity
@Table(name = "MATERIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materia.findAll", query = "SELECT m FROM Materia m")
    , @NamedQuery(name = "Materia.findByIdMateria", query = "SELECT m FROM Materia m WHERE m.idMateria = :idMateria")
    , @NamedQuery(name = "Materia.findByNombreMateria", query = "SELECT m FROM Materia m WHERE m.nombreMateria = :nombreMateria")
    , @NamedQuery(name = "Materia.findByDescripcionMateria", query = "SELECT m FROM Materia m WHERE m.descripcionMateria = :descripcionMateria")
    , @NamedQuery(name = "Materia.findByNoHrsTeoricas", query = "SELECT m FROM Materia m WHERE m.noHrsTeoricas = :noHrsTeoricas")
    , @NamedQuery(name = "Materia.findByNoHrsPracticas", query = "SELECT m FROM Materia m WHERE m.noHrsPracticas = :noHrsPracticas")})
public class Materia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MATERIA")
    private Long idMateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "NOMBRE_MATERIA")
    private String nombreMateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "DESCRIPCION_MATERIA")
    private String descripcionMateria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NO_HRS_TEORICAS")
    private long noHrsTeoricas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NO_HRS_PRACTICAS")
    private long noHrsPracticas;

    public Materia() {
    }

    public Materia(Long idMateria) {
        this.idMateria = idMateria;
    }

    public Materia(Long idMateria, String nombreMateria, String descripcionMateria, long noHrsTeoricas, long noHrsPracticas) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.descripcionMateria = descripcionMateria;
        this.noHrsTeoricas = noHrsTeoricas;
        this.noHrsPracticas = noHrsPracticas;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getDescripcionMateria() {
        return descripcionMateria;
    }

    public void setDescripcionMateria(String descripcionMateria) {
        this.descripcionMateria = descripcionMateria;
    }

    public long getNoHrsTeoricas() {
        return noHrsTeoricas;
    }

    public void setNoHrsTeoricas(long noHrsTeoricas) {
        this.noHrsTeoricas = noHrsTeoricas;
    }

    public long getNoHrsPracticas() {
        return noHrsPracticas;
    }

    public void setNoHrsPracticas(long noHrsPracticas) {
        this.noHrsPracticas = noHrsPracticas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materia)) {
            return false;
        }
        Materia other = (Materia) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.Materia[ idMateria=" + idMateria + " ]";
    }
    
}
