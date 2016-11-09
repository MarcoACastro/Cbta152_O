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
@Table(name = "DETALLE_CALIFICACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleCalificacion.findAll", query = "SELECT d FROM DetalleCalificacion d")
    , @NamedQuery(name = "DetalleCalificacion.findByIdDetalleCalificacion", query = "SELECT d FROM DetalleCalificacion d WHERE d.idDetalleCalificacion = :idDetalleCalificacion")
    , @NamedQuery(name = "DetalleCalificacion.findByCalificacionPeriodo", query = "SELECT d FROM DetalleCalificacion d WHERE d.calificacionPeriodo = :calificacionPeriodo")
    , @NamedQuery(name = "DetalleCalificacion.findByPeriodo", query = "SELECT d FROM DetalleCalificacion d WHERE d.periodo = :periodo")})
public class DetalleCalificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DETALLE_CALIFICACION")
    private Long idDetalleCalificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "CALIFICACION_PERIODO")
    private String calificacionPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "PERIODO")
    private String periodo;

    public DetalleCalificacion() {
    }

    public DetalleCalificacion(Long idDetalleCalificacion) {
        this.idDetalleCalificacion = idDetalleCalificacion;
    }

    public DetalleCalificacion(Long idDetalleCalificacion, String calificacionPeriodo, String periodo) {
        this.idDetalleCalificacion = idDetalleCalificacion;
        this.calificacionPeriodo = calificacionPeriodo;
        this.periodo = periodo;
    }

    public Long getIdDetalleCalificacion() {
        return idDetalleCalificacion;
    }

    public void setIdDetalleCalificacion(Long idDetalleCalificacion) {
        this.idDetalleCalificacion = idDetalleCalificacion;
    }

    public String getCalificacionPeriodo() {
        return calificacionPeriodo;
    }

    public void setCalificacionPeriodo(String calificacionPeriodo) {
        this.calificacionPeriodo = calificacionPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleCalificacion != null ? idDetalleCalificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCalificacion)) {
            return false;
        }
        DetalleCalificacion other = (DetalleCalificacion) object;
        if ((this.idDetalleCalificacion == null && other.idDetalleCalificacion != null) || (this.idDetalleCalificacion != null && !this.idDetalleCalificacion.equals(other.idDetalleCalificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.DetalleCalificacion[ idDetalleCalificacion=" + idDetalleCalificacion + " ]";
    }
    
}
