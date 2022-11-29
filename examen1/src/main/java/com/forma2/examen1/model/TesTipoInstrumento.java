package com.forma2.examen1.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TES_TIPO_INSTRUMENTO")
@NoArgsConstructor
public class TesTipoInstrumento {
    @EmbeddedId
    private TesTipoInstrumentoPK pk;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @Column(name = "TIPO_RENTA", length = 100, nullable = false)
    private String tipoRenta;

    @Column(name = "COD_CLASE_INSTRUMENTO", length = 100, nullable = false)
    private String codClaseInstrumento;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 100, nullable = false)
    private String codCategoriaInstrumento;

    @Column(name = "ESTADO", length = 100, nullable = false)
    private String estado;

    @Column(name = "FECHA_CREACION", length = 100, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaCreacion;

    public TesTipoInstrumento(TesTipoInstrumentoPK pk) {
        this.pk = pk;
    }
}
