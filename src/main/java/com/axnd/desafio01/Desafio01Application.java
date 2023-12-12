package com.axnd.desafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axnd.desafio01.entities.Order;
import com.axnd.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("::: Código do Pedido :");
		Integer code = sc.nextInt();

		System.out.println("::: Valor básico :");
		double valorBasico = sc.nextDouble();

		System.out.println("::: Desconto % ");
		double desconto = sc.nextDouble();

		Order order = new Order(code, valorBasico, desconto);

		System.out.println("::: Resumo do Pedido ::::::");
		System.out.println("::: Código ........... " + code);
		System.out.println("::: Valor Total  ..... R$ " + orderService.total(order));

		sc.close();

	}

}
