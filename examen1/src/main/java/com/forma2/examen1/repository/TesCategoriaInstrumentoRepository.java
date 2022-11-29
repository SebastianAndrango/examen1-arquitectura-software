package com.forma2.examen1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forma2.examen1.model.TesCategoriaInstrumento;
import com.forma2.examen1.model.TesCategoriaInstrumentoPK;

@Repository
public interface TesCategoriaInstrumentoRepository
        extends JpaRepository<TesCategoriaInstrumento, TesCategoriaInstrumentoPK> {

}
