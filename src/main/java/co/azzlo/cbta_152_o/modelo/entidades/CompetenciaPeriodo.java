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
@Table(name = "COMPETENCIA_PERIODO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompetenciaPeriodo.findAll", query = "SELECT c FROM CompetenciaPeriodo c")
    , @NamedQuery(name = "CompetenciaPeriodo.findByIdCompetenciaPeriodo", query = "SELECT c FROM CompetenciaPeriodo c WHERE c.idCompetenciaPeriodo = :idCompetenciaPeriodo")
    , @NamedQuery(name = "CompetenciaPeriodo.findByCalificacionCompetencia", query = "SELECT c FROM CompetenciaPeriodo c WHERE c.calificacionCompetencia = :calificacionCompetencia")
    , @NamedQuery(name = "CompetenciaPeriodo.findByDescripcion", query = "SELECT c FROM CompetenciaPeriodo c WHERE c.descripcion = :descripcion")})
public class CompetenciaPeriodo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COMPETENCIA_PERIODO")
    private Long idCompetenciaPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "CALIFICACION_COMPETENCIA")
    private String calificacionCompetencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public CompetenciaPeriodo() {
    }

    public CompetenciaPeriodo(Long idCompetenciaPeriodo) {
        this.idCompetenciaPeriodo = idCompetenciaPeriodo;
    }

    public CompetenciaPeriodo(Long idCompetenciaPeriodo, String calificacionCompetencia, String descripcion) {
        this.idCompetenciaPeriodo = idCompetenciaPeriodo;
        this.calificacionCompetencia = calificacionCompetencia;
        this.descripcion = descripcion;
    }

    public Long getIdCompetenciaPeriodo() {
        return idCompetenciaPeriodo;
    }

    public void setIdCompetenciaPeriodo(Long idCompetenciaPeriodo) {
        this.idCompetenciaPeriodo = idCompetenciaPeriodo;
    }

    public String getCalificacionCompetencia() {
        return calificacionCompetencia;
    }

    public void setCalificacionCompetencia(String calificacionCompetencia) {
        this.calificacionCompetencia = calificacionCompetencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompetenciaPeriodo != null ? idCompetenciaPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompetenciaPeriodo)) {
            return false;
        }
        CompetenciaPeriodo other = (CompetenciaPeriodo) object;
        if ((this.idCompetenciaPeriodo == null && other.idCompetenciaPeriodo != null) || (this.idCompetenciaPeriodo != null && !this.idCompetenciaPeriodo.equals(other.idCompetenciaPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.CompetenciaPeriodo[ idCompetenciaPeriodo=" + idCompetenciaPeriodo + " ]";
    }
    
}
