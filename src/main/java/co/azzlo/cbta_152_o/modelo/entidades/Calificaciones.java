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
@Table(name = "CALIFICACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calificaciones.findAll", query = "SELECT c FROM Calificaciones c")
    , @NamedQuery(name = "Calificaciones.findByIdCalificaciones", query = "SELECT c FROM Calificaciones c WHERE c.idCalificaciones = :idCalificaciones")
    , @NamedQuery(name = "Calificaciones.findByCalificacionFinal", query = "SELECT c FROM Calificaciones c WHERE c.calificacionFinal = :calificacionFinal")})
public class Calificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CALIFICACIONES")
    private Long idCalificaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "CALIFICACION_FINAL")
    private String calificacionFinal;

    public Calificaciones() {
    }

    public Calificaciones(Long idCalificaciones) {
        this.idCalificaciones = idCalificaciones;
    }

    public Calificaciones(Long idCalificaciones, String calificacionFinal) {
        this.idCalificaciones = idCalificaciones;
        this.calificacionFinal = calificacionFinal;
    }

    public Long getIdCalificaciones() {
        return idCalificaciones;
    }

    public void setIdCalificaciones(Long idCalificaciones) {
        this.idCalificaciones = idCalificaciones;
    }

    public String getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(String calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalificaciones != null ? idCalificaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calificaciones)) {
            return false;
        }
        Calificaciones other = (Calificaciones) object;
        if ((this.idCalificaciones == null && other.idCalificaciones != null) || (this.idCalificaciones != null && !this.idCalificaciones.equals(other.idCalificaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.Calificaciones[ idCalificaciones=" + idCalificaciones + " ]";
    }
    
}
