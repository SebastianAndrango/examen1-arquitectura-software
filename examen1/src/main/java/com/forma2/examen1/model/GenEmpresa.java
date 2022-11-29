package com.forma2.examen1.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "GEN_EMPRESA")
@NoArgsConstructor
public class GenEmpresa {
    @Id
    @Column(name = "COD_EMPRESA", nullable = false)
    private Integer codEmpresa;

    @Column(name = "NOMBRE", length = 150, nullable = false)
    private String nombre;

    @Column(name = "COD_LOGOTIPO_EMPRESA", nullable = false)
    private BigDecimal codLogotipoEmpresa;

    @Column(name = "COD_LOGOTIPO_EMPRESA", nullable = false)
    private BigDecimal codLogotipoReporte;

    public GenEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }
}
