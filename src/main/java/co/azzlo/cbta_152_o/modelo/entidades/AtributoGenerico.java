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
@Table(name = "ATRIBUTO_GENERICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AtributoGenerico.findAll", query = "SELECT a FROM AtributoGenerico a")
    , @NamedQuery(name = "AtributoGenerico.findByIdAtributoGenerico", query = "SELECT a FROM AtributoGenerico a WHERE a.idAtributoGenerico = :idAtributoGenerico")
    , @NamedQuery(name = "AtributoGenerico.findByNombreAtributo", query = "SELECT a FROM AtributoGenerico a WHERE a.nombreAtributo = :nombreAtributo")
    , @NamedQuery(name = "AtributoGenerico.findByDescripcionAtributo", query = "SELECT a FROM AtributoGenerico a WHERE a.descripcionAtributo = :descripcionAtributo")})
public class AtributoGenerico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ATRIBUTO_GENERICO")
    private Long idAtributoGenerico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "NOMBRE_ATRIBUTO")
    private String nombreAtributo;
    @Size(max = 1000)
    @Column(name = "DESCRIPCION_ATRIBUTO")
    private String descripcionAtributo;

    public AtributoGenerico() {
    }

    public AtributoGenerico(Long idAtributoGenerico) {
        this.idAtributoGenerico = idAtributoGenerico;
    }

    public AtributoGenerico(Long idAtributoGenerico, String nombreAtributo) {
        this.idAtributoGenerico = idAtributoGenerico;
        this.nombreAtributo = nombreAtributo;
    }

    public Long getIdAtributoGenerico() {
        return idAtributoGenerico;
    }

    public void setIdAtributoGenerico(Long idAtributoGenerico) {
        this.idAtributoGenerico = idAtributoGenerico;
    }

    public String getNombreAtributo() {
        return nombreAtributo;
    }

    public void setNombreAtributo(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }

    public String getDescripcionAtributo() {
        return descripcionAtributo;
    }

    public void setDescripcionAtributo(String descripcionAtributo) {
        this.descripcionAtributo = descripcionAtributo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtributoGenerico != null ? idAtributoGenerico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtributoGenerico)) {
            return false;
        }
        AtributoGenerico other = (AtributoGenerico) object;
        if ((this.idAtributoGenerico == null && other.idAtributoGenerico != null) || (this.idAtributoGenerico != null && !this.idAtributoGenerico.equals(other.idAtributoGenerico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.AtributoGenerico[ idAtributoGenerico=" + idAtributoGenerico + " ]";
    }
    
}
