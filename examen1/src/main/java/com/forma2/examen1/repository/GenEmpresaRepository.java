package com.forma2.examen1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.forma2.examen1.model.GenEmpresa;

@Repository
public interface GenEmpresaRepository extends JpaRepository<GenEmpresa, Integer> {
    List<GenEmpresa> findByPKCodEmpresa(Integer codeEmpresa);
}
