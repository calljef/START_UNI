package Aplicacao;

import java.util.ArrayList;
import java.util.List;

import Entidades.Livro;
import Entidades.Loja;
import Entidades.VideoGame;

public class Aplicacao {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Hary Poter",40.0,50,"J. K. Rowling","fantasia",300);
		Livro l2 = new Livro("Senhor dos Aneis",60.0,30,"J. R. R. Tolkien","fantasia",500);
		Livro l3 = new Livro("Java POO",20.0,50,"GFT","educativo",500);
		
		VideoGame ps4 = new VideoGame("ps4", 1800.0, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("ps4", 1000.0, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("xbox", 1500.0, 500, "Microsoft", "One", false);
		
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		List<VideoGame> videoGames = new ArrayList<VideoGame>();
		videoGames.add(ps4);
		videoGames.add(ps4Usado);
		videoGames.add(xbox);
		
		Loja americanas = new Loja("Americanas", "123456", livros, videoGames);
		
		System.out.println("-----------Testando calculo de impostos---------------");
		System.out.println(l2.calculaImposto());
		System.out.println(l3.calculaImposto());
		System.out.println(ps4Usado.calculaImposto());
		System.out.println(ps4.calculaImposto());
		System.out.println("-----------Fim do teste do calcula imposto------------");
		
		System.out.println();
		
		System.out.println("---Testando Métodos ListarLivros e ListarVideoGames---");		
		americanas.ListaLivros();
		americanas.ListaVideoGames();
		System.out.println("--Fim do Teste Métodos ListarLivros e ListarVideoGames--");
		
		System.out.println();
		
		System.out.println("----------Testando Método Calcular Patrimônio----------");
		System.out.println("O patrimonio da Loja " + americanas.getNome() + "é igual a : " + americanas.CalculaPatrimonio());
		System.out.println("----------------------Fim do Teste---------------------");

	}

}
