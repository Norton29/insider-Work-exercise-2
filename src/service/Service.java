package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import entity.TabelaEmpresa;

public class Service {
	
	public Map<String, Integer> media(List<TabelaEmpresa> tabelaEmpresaList) {
		Map<String, Integer> mediaEmpresas = new HashMap<>();

		for (TabelaEmpresa ranking : tabelaEmpresaList) {
			if (ranking.getPago() == 0) {
				if (mediaEmpresas.containsKey(ranking.getNomeEmpresa())) {
					mediaEmpresas.put(ranking.getNomeEmpresa(), mediaEmpresas.get(ranking.getNomeEmpresa()) - 1);

				} else {
					mediaEmpresas.put(ranking.getNomeEmpresa(), ranking.getPago() - 1);
				}
			}
			if (ranking.getPago() == 1) {
				if (mediaEmpresas.containsKey(ranking.getNomeEmpresa())) {
					mediaEmpresas.put(ranking.getNomeEmpresa(), mediaEmpresas.get(ranking.getNomeEmpresa()) + 1);

				} else {
					mediaEmpresas.put(ranking.getNomeEmpresa(), ranking.getPago() + 1);
				}
			}
		}
		return mediaEmpresas;
	}
	
	
	public Map<String, String> rankingEmpresas(Map<String, Integer> media) {
		Map<String, String> rankingFinal = new HashMap<>();
		
		for(Entry<String, Integer> empresa: media.entrySet()) {
			String nomeEmpresa = empresa.getKey();
			Integer posicaoRanking = empresa.getValue();
			if(posicaoRanking >= 4) {
				rankingFinal.put(nomeEmpresa, "Excelente");
			}else if(posicaoRanking >= 1) {
				rankingFinal.put(nomeEmpresa, "Boa");
			}else if(posicaoRanking >= -2) {
				rankingFinal.put(nomeEmpresa, "Ruim");
			}else if(posicaoRanking <= -3){
				rankingFinal.put(nomeEmpresa, "Pessíma");
			}
		
			
		}
		
		return rankingFinal;
		
	}

}
