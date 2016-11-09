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
@Table(name = "COMPETENCIA_GENERICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompetenciaGenerica.findAll", query = "SELECT c FROM CompetenciaGenerica c")
    , @NamedQuery(name = "CompetenciaGenerica.findByIdCompetenciaGenerica", query = "SELECT c FROM CompetenciaGenerica c WHERE c.idCompetenciaGenerica = :idCompetenciaGenerica")
    , @NamedQuery(name = "CompetenciaGenerica.findByNombreCompetencia", query = "SELECT c FROM CompetenciaGenerica c WHERE c.nombreCompetencia = :nombreCompetencia")
    , @NamedQuery(name = "CompetenciaGenerica.findByDescripcionCompetencia", query = "SELECT c FROM CompetenciaGenerica c WHERE c.descripcionCompetencia = :descripcionCompetencia")})
public class CompetenciaGenerica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COMPETENCIA_GENERICA")
    private Long idCompetenciaGenerica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "NOMBRE_COMPETENCIA")
    private String nombreCompetencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "DESCRIPCION_COMPETENCIA")
    private String descripcionCompetencia;

    public CompetenciaGenerica() {
    }

    public CompetenciaGenerica(Long idCompetenciaGenerica) {
        this.idCompetenciaGenerica = idCompetenciaGenerica;
    }

    public CompetenciaGenerica(Long idCompetenciaGenerica, String nombreCompetencia, String descripcionCompetencia) {
        this.idCompetenciaGenerica = idCompetenciaGenerica;
        this.nombreCompetencia = nombreCompetencia;
        this.descripcionCompetencia = descripcionCompetencia;
    }

    public Long getIdCompetenciaGenerica() {
        return idCompetenciaGenerica;
    }

    public void setIdCompetenciaGenerica(Long idCompetenciaGenerica) {
        this.idCompetenciaGenerica = idCompetenciaGenerica;
    }

    public String getNombreCompetencia() {
        return nombreCompetencia;
    }

    public void setNombreCompetencia(String nombreCompetencia) {
        this.nombreCompetencia = nombreCompetencia;
    }

    public String getDescripcionCompetencia() {
        return descripcionCompetencia;
    }

    public void setDescripcionCompetencia(String descripcionCompetencia) {
        this.descripcionCompetencia = descripcionCompetencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompetenciaGenerica != null ? idCompetenciaGenerica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompetenciaGenerica)) {
            return false;
        }
        CompetenciaGenerica other = (CompetenciaGenerica) object;
        if ((this.idCompetenciaGenerica == null && other.idCompetenciaGenerica != null) || (this.idCompetenciaGenerica != null && !this.idCompetenciaGenerica.equals(other.idCompetenciaGenerica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.CompetenciaGenerica[ idCompetenciaGenerica=" + idCompetenciaGenerica + " ]";
    }
    
}
