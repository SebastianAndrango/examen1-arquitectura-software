package com.forma2.examen1.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TesTipoInstrumentoPK implements Serializable {
    @Column(name = "COD_EMPRESA", length = 8, nullable = false)
    private String codEmpresa;

    @Column(name = "COD_TIPO_INSTRUMENTO", length = 15, nullable = false)
    private String codTipoInstrumento;

}
