/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.controller;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author jesus
 */
@Component
@Scope(value = "view", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CategoriaController {
    @PostConstruct
    public void init(){
    System.out.print("this");
    if(1==1);
    }
    
}
