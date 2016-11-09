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
@Table(name = "MATERIA_OFERTADA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MateriaOfertada.findAll", query = "SELECT m FROM MateriaOfertada m")
    , @NamedQuery(name = "MateriaOfertada.findByIdMateriaOfertada", query = "SELECT m FROM MateriaOfertada m WHERE m.idMateriaOfertada = :idMateriaOfertada")
    , @NamedQuery(name = "MateriaOfertada.findByPeriodoFecha", query = "SELECT m FROM MateriaOfertada m WHERE m.periodoFecha = :periodoFecha")})
public class MateriaOfertada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MATERIA_OFERTADA")
    private Long idMateriaOfertada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "PERIODO_FECHA")
    private String periodoFecha;

    public MateriaOfertada() {
    }

    public MateriaOfertada(Long idMateriaOfertada) {
        this.idMateriaOfertada = idMateriaOfertada;
    }

    public MateriaOfertada(Long idMateriaOfertada, String periodoFecha) {
        this.idMateriaOfertada = idMateriaOfertada;
        this.periodoFecha = periodoFecha;
    }

    public Long getIdMateriaOfertada() {
        return idMateriaOfertada;
    }

    public void setIdMateriaOfertada(Long idMateriaOfertada) {
        this.idMateriaOfertada = idMateriaOfertada;
    }

    public String getPeriodoFecha() {
        return periodoFecha;
    }

    public void setPeriodoFecha(String periodoFecha) {
        this.periodoFecha = periodoFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriaOfertada != null ? idMateriaOfertada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaOfertada)) {
            return false;
        }
        MateriaOfertada other = (MateriaOfertada) object;
        if ((this.idMateriaOfertada == null && other.idMateriaOfertada != null) || (this.idMateriaOfertada != null && !this.idMateriaOfertada.equals(other.idMateriaOfertada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.MateriaOfertada[ idMateriaOfertada=" + idMateriaOfertada + " ]";
    }
    
}
