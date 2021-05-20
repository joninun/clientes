package com.company.api.controller;

import com.company.api.model.Cliente;
import com.company.api.model.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/clientes/{nome}")
    public Cliente clientes(@PathVariable String nome){

        Cliente cliente = new Cliente();
        cliente.setNome(nome);



        return cliente;
    }

    @GetMapping("/funcionarios")
    public Funcionario funcionarios(){

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Andre");
        return funcionario;
    }
}
