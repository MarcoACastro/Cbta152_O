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
@Table(name = "CATEGORIAS_GENERICAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriasGenericas.findAll", query = "SELECT c FROM CategoriasGenericas c")
    , @NamedQuery(name = "CategoriasGenericas.findByIdCategoriasGenericas", query = "SELECT c FROM CategoriasGenericas c WHERE c.idCategoriasGenericas = :idCategoriasGenericas")
    , @NamedQuery(name = "CategoriasGenericas.findByNombreCategoria", query = "SELECT c FROM CategoriasGenericas c WHERE c.nombreCategoria = :nombreCategoria")
    , @NamedQuery(name = "CategoriasGenericas.findByDescripcionCategoria", query = "SELECT c FROM CategoriasGenericas c WHERE c.descripcionCategoria = :descripcionCategoria")})
public class CategoriasGenericas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CATEGORIAS_GENERICAS")
    private Long idCategoriasGenericas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "NOMBRE_CATEGORIA")
    private String nombreCategoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "DESCRIPCION_CATEGORIA")
    private String descripcionCategoria;

    public CategoriasGenericas() {
    }

    public CategoriasGenericas(Long idCategoriasGenericas) {
        this.idCategoriasGenericas = idCategoriasGenericas;
    }

    public CategoriasGenericas(Long idCategoriasGenericas, String nombreCategoria, String descripcionCategoria) {
        this.idCategoriasGenericas = idCategoriasGenericas;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    public Long getIdCategoriasGenericas() {
        return idCategoriasGenericas;
    }

    public void setIdCategoriasGenericas(Long idCategoriasGenericas) {
        this.idCategoriasGenericas = idCategoriasGenericas;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriasGenericas != null ? idCategoriasGenericas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriasGenericas)) {
            return false;
        }
        CategoriasGenericas other = (CategoriasGenericas) object;
        if ((this.idCategoriasGenericas == null && other.idCategoriasGenericas != null) || (this.idCategoriasGenericas != null && !this.idCategoriasGenericas.equals(other.idCategoriasGenericas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.azzlo.cbta_152_o.modelo.entidades.CategoriasGenericas[ idCategoriasGenericas=" + idCategoriasGenericas + " ]";
    }
    
}
