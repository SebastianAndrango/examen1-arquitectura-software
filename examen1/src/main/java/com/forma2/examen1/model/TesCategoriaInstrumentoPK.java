package com.forma2.examen1.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TesCategoriaInstrumentoPK implements Serializable {

    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codEmpresa;

    @Column(name = "COD_CATEGORIA_INSTRUMENTO", length = 15, nullable = false)
    private String codCategoriaInstrumento;
}
