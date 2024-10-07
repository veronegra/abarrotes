/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.EmpresaDto;
import com.abarrotes.entidad.Empresa;
import com.abarrotes.repository.EmpresaRepository;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service

public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;
    public List<EmpresaDto> findAll(){
       List<EmpresaDto> lstEmpresaDto = empresaRepository.findAll();
       return lstEmpresaDto;
    }
    private EmpresaDto converterEntidadDto (EmpresaDto e){
    EmpresaDto empresaDto = new EmpresaDto();
    empresaDto.setCorreo(e.getCorreo());
    empresaDto.setDireccion(e.getDireccion());
    empresaDto.setEnvioDeMensajes(e.getEnvioDeMensajes());
    empresaDto.setEstatus(e.getEstatus());
    empresaDto.setHost(e.getHost());
    empresaDto.setIdEmpresaPk(e.getIdEmpresaPk());
    empresaDto.setInstancia(e.getInstancia());
    empresaDto.setLogo(e.getLogo());
    empresaDto.setNombre(e.getNombre());
    empresaDto.setNombreComercial(e.getNombreComercial());
    empresaDto.setNumeroDeUsuarios(e.getNumeroDeUsuarios());
    empresaDto.setPasswordCorreo(e.getPasswordCorreo());
    empresaDto.setPuerto(e.getPuerto());
    empresaDto.setRepresentanteLegal(e.getRepresentanteLegal());
    empresaDto.setSucursalList(e.getSucursalList());
    empresaDto.setTelefono(e.getTelefono());
    empresaDto.setToken(e.getToken());
    empresaDto.setUsuarioCorreo(e.getUsuarioCorreo());
    
    return empresaDto;
    }
    
    private Empresa converterEntidadDto (Empresa e){
    Empresa empresa = new Empresa ();
    empresa.setCorreo(e.getCorreo());
    empresa.setDireccion(e.getDireccion());
    empresa.setEnvioDeMensajes(e.getEnvioDeMensajes());
    empresa.setEstatus(e.getEstatus());
    empresa.setHost(e.getHost());
    empresa.setIdEmpresaPk(e.getIdEmpresaPk());
    empresa.setInstancia(e.getInstancia());
    empresa.setLogo(e.getLogo());
    empresa.setNombre(e.getNombre());
    empresa.setNombreComercial(e.getNombreComercial());
    empresa.setNumeroDeUsuarios(e.getNumeroDeUsuarios());
    empresa.setPasswordCorreo(e.getPasswordCorreo());
    empresa.setPuerto(e.getPuerto());
    empresa.setRepresentanteLegal(e.getRepresentanteLegal());
    empresa.setSucursalList(e.getSucursalList());
    empresa.setTelefono(e.getTelefono());
    empresa.setToken(e.getToken());
    empresa.setUsuarioCorreo(e.getUsuarioCorreo());
    
    return empresa;
    }
    
}