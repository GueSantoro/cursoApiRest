package com.inova.importapi.servicos;

import com.inova.importapi.entidades.Categoria;
import com.inova.importapi.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> ListarTodas(){
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> BuscarPorId(Long codigo){
        return categoriaRepository.findById(codigo);
    }
}
