package com.forma2.examen1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.forma2.examen1.model.GenEmpresa;
import com.forma2.examen1.repository.GenEmpresaRepository;

public class GenEmpresaServiceImpl implements GenEmpresaService {
    @Autowired
    GenEmpresaRepository genEmpresaRepository;

    @Override
    public List<GenEmpresa> readByCodeEmpresa(Integer codEmpresa) {
        return this.genEmpresaRepository.findByPKCodEmpresa(codEmpresa);
    }
}
