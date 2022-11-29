package com.forma2.examen1.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "TES_CATEGORIA_INSTRUMENTO")
@NoArgsConstructor
public class TesCategoriaInstrumento {
    @EmbeddedId
    private TesCategoriaInstrumentoPK pk;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @Column(name = "TIPO_RENTA", length = 2, nullable = false)
    private String tipoRenta;

    public TesCategoriaInstrumento(TesCategoriaInstrumentoPK pk) {
        this.pk = pk;
    }
}
