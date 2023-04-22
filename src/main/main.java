package main;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entity.TabelaEmpresa;
import service.Service;

public class main {
	

	static List<TabelaEmpresa> tabelaEmpresas = new ArrayList<>();
	

	public static void main(String[] args) {
		Service rankingEmpresa = new Service();
		TabelaEmpresa empresaF = new TabelaEmpresa("F", Date.valueOf(LocalDate.of(2022, 5, 1)), 0);
		TabelaEmpresa empresaA = new TabelaEmpresa("A", Date.valueOf(LocalDate.of(2022, 5, 1)), 1);
		TabelaEmpresa empresaB = new TabelaEmpresa("B", Date.valueOf(LocalDate.of(2022, 5, 1)), 1);
		TabelaEmpresa empresaC = new TabelaEmpresa("C", Date.valueOf(LocalDate.of(2022, 5, 1)), 1);
		TabelaEmpresa empresaD = new TabelaEmpresa("D", Date.valueOf(LocalDate.of(2022, 5, 1)), 0);
		TabelaEmpresa empresaF2 = new TabelaEmpresa("F", Date.valueOf(LocalDate.of(2022, 6, 6)), 0);
		TabelaEmpresa empresaA2 = new TabelaEmpresa("A", Date.valueOf(LocalDate.of(2022, 6, 6)), 1);
		TabelaEmpresa empresaF3 = new TabelaEmpresa("F", Date.valueOf(LocalDate.of(2022, 6, 6)), 0);
		TabelaEmpresa empresaA3 = new TabelaEmpresa("A", Date.valueOf(LocalDate.of(2022, 5, 1)), 1);
		TabelaEmpresa empresaB2 = new TabelaEmpresa("B", Date.valueOf(LocalDate.of(2022, 5, 1)), 0);
		
		tabelaEmpresas.add(empresaF);
		tabelaEmpresas.add(empresaA);
		tabelaEmpresas.add(empresaB);
		tabelaEmpresas.add(empresaC);
		tabelaEmpresas.add(empresaD);
		tabelaEmpresas.add(empresaF2);
		tabelaEmpresas.add(empresaA2);
		tabelaEmpresas.add(empresaF3);
		tabelaEmpresas.add(empresaB2);
		tabelaEmpresas.add(empresaA3);
		
		Map<String, Integer> media = rankingEmpresa.media(tabelaEmpresas);
		Map<String, String> rankingFinal = rankingEmpresa.rankingEmpresas(media);
		
		System.out.println(media);
		System.out.println(rankingFinal);

	}

	
}
