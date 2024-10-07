/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import com.abarrotes.service.UsuarioService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author jesus
 */
@Component
@Scope(value = "view", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UsuarioController {

    private static final long serialVersionUID = 1L;
    @Autowired
    private UsuarioService usuarioService;

    @PostConstruct
    public void init() {
        usuarioService.loadUserByUsername("juan");
        
    }
}
