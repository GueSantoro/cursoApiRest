package com.inova.importapi.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="categoria") //Representa entidade categoria dentro do banco de dados
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar codigo automatico
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "nome")
    private String nome;


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNom() {
        return nome;
    }

    public void setNom(String nom) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return codigo == categoria.codigo && nome.equals(categoria.nome);
    }

}
