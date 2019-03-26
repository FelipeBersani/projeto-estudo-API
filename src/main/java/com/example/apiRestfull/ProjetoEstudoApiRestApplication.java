package com.example.apiRestfull;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class ProjetoEstudoApiRestApplication {

	private int qtdPorPagina;

	@Value("${paginacao.qtd_por_pagina}")
	public static void main(String[] args) {
		SpringApplication.run(ProjetoEstudoApiRestApplication.class, args);
		System.out.println("Teste");
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args ->{
			System.out.println("Paginas "+ this.qtdPorPagina);
		};
	}

}
