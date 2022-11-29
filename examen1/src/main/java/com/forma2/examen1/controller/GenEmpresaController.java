package com.forma2.examen1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forma2.examen1.model.GenEmpresa;
import com.forma2.examen1.service.GenEmpresaService;

@RestController
@RequestMapping("genempresa")
public class GenEmpresaController {
    @Autowired
    private GenEmpresaService genEmpresaService;

    @GetMapping("/codeempresa/{code}")
    public List<GenEmpresa> readGenEmpresaByCodeEmpresa(@PathVariable("code") Integer code) {
        return this.genEmpresaService.readByCodeEmpresa(code);
    }
}
