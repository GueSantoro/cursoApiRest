package com.inova.importapi.controller;

// Responsavel por receber os EnPonts


import com.inova.importapi.entidades.Categoria;
import com.inova.importapi.servicos.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/categoria")
public class CategotiaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> ListarTodas(){
        return categoriaService.ListarTodas();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Optional<Categoria>> BuscarPorId(@PathVariable Long codigo){
        Optional<Categoria> categoria = categoriaService.BuscarPorId(codigo);
        return categoria.isPresent() ? ResponseEntity.ok(categoria): ResponseEntity.notFound().build();
    }
}
