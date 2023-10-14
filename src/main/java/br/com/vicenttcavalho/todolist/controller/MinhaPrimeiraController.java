package br.com.vicenttcavalho.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota") // http://localhost:8080/PrimeiraRota.....
public class MinhaPrimeiraController {

  // Método de acesso do HTTP
  // GET - Buscar uma informação
  // POST - Adicionar um dado/informação
  // PUT - Alterar dado/informação
  // DELETE - Remover um dado
  // PATCH - Alterar somente uma parte do dado/info

  // Método (Funcionalidade) de uma classe
  @GetMapping("/primeiroMetodo")
  public String primeiraMensagem() {
    return "Funcionou";
  }
}
