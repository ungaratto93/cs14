package br.com.caelum.ed.mapas.testes;

import java.util.Date;
import java.util.HashMap;

import br.com.caelum.ed.mapas.Carro;
import br.com.caelum.ed.mapas.MapaEspalhamento;

public class TesteHashMap {

	public static void main(String[] args) {
		
		// Demonstrando o uso de generalizacao e parametrizacao
		MapaEspalhamento<String, Carro> mapaDeCarro = new MapaEspalhamento<String, Carro>();
		MapaEspalhamento<String, Date> mapaDeData = new MapaEspalhamento<String, Date>();

		// HashMap e HashTable são parecidos com que foi feito nesse capitulo
		HashMap<String, Carro> mapa = new HashMap<String, Carro>();
		mapa.put("abc1234", new Carro("a"));
		System.out.println(mapa);
		mapa.put("abc1234", new Carro("b"));
		System.out.println(mapa);
		mapa.put("abc1234", new Carro("c"));
		System.out.println(mapa);

		
		System.out.println(mapa.containsKey("abc1234"));
		System.out.println(mapa.get("abc1234"));
		mapa.remove("abc1234");
		System.out.println(mapa);
	}
	
}
