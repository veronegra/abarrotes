/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.CategoriaDto;
import com.abarrotes.entidad.Categoria;
import com.abarrotes.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jesus
 */
@Service

public class CategoriaService {
  @Autowired
  CategoriaRepository categoriaRepository;
  public List<Categoria> findAll(){
      List<Categoria> lstCategoriaDto=categoriaRepository.findAll();
  categoriaRepository.findAll();
  return lstCategoriaDto;
  }
  
  
  private CategoriaDto converterEntidadDto(Categoria c){
  CategoriaDto categoriaDto = new CategoriaDto();
  categoriaDto.setIdCategoriaPk(c.getIdCategoriaPk()); 
  categoriaDto.setEstatus(c.getEstatus());
  categoriaDto.setFechaAlta(c.getFechaAlta());
  categoriaDto.setIdCategoriaPk(c.getIdCategoriaPk());
  categoriaDto.setNombre(c.getNombre());
  return categoriaDto;
}
private Categoria converterDtoEntidad(CategoriaDto c){
     Categoria categoria = new Categoria();
     categoria.setIdCategoriaPk(c.getIdCategoriaPk());
     categoria.setNombre(c.getNombre());
     categoria.setFechaAlta(c.getFechaAlta());
     categoria.setEstatus(c.getEstatus());

     
     return categoria;
     }
   
}