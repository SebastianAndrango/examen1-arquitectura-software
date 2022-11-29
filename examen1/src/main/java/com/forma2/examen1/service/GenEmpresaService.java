package com.forma2.examen1.service;

import java.util.List;

import com.forma2.examen1.model.GenEmpresa;

public interface GenEmpresaService {
    List<GenEmpresa> readByCodeEmpresa(Integer codEmpresa);

}
