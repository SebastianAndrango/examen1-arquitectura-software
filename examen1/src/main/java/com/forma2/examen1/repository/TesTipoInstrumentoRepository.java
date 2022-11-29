package com.forma2.examen1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forma2.examen1.model.TesTipoInstrumento;
import com.forma2.examen1.model.TesTipoInstrumentoPK;

@Repository
public interface TesTipoInstrumentoRepository extends JpaRepository<TesTipoInstrumento, TesTipoInstrumentoPK> {

}
