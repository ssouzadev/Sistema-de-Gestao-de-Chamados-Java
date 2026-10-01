package model;

import java.time.LocalDateTime;

public class Eventomain {

	public static void main(String[] args) {

		LocalDateTime dataHora = LocalDateTime.of(2026, 10, 10, 20, 0);

		Evento evento = new Evento("Festival de verão",150,"VIP",500,dataHora);

		evento.exibirDados();
		System.out.println();
		evento.venderIngressos(100);
		evento.venderIngressos(500);
		
	}

}