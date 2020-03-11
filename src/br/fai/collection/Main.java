package br.fai.collection;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}

	private Map<String, String> mapa = new HashMap<String, String>();
	//private Map<String, String> mapa = null;
	
	private void start() {
		adicionarItensNoMapa();
		exibirValorDoMapaPorChave("SRS");
		iterarMapa();
	}

	private void adicionarItensNoMapa() {
		
		try {
			mapa.put("SRS", "Santa Rita do Sapuca�");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajub�");
			mapa.put("ZORO", "Concei��o dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
			System.out.println("Cheguei no fim do try");
		} catch (Exception e) {
			System.out.println("Ocorreu uma exce��o");
		}finally {
			System.out.println("Cheguei no finally");
		}
		
	}

	private void exibirValorDoMapaPorChave(String chave) {
		String valorDoItemBoMapa = mapa.get(chave);
		if (valorDoItemBoMapa == null || valorDoItemBoMapa.isEmpty()) {
			System.out.println("Esta chave n�o esta presente no mapa");
		} else {
			System.out.println("O valor dessa chapa �: " + mapa.get(chave));
		}
	}
	
	private void iterarMapa() {
		System.out.println("---------------------------");;
		for (String Chave : mapa.keySet()) {
			System.out.println("Cahve: " + Chave + " | valor: " + mapa.get(Chave));
		}
	}

}
