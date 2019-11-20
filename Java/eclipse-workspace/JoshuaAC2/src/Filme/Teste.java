package Filme;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;



public class Teste {
	private static Scanner leitor;

	public static void gravaOutroArquivo(ListaObj<Filme> lista, boolean isCSV) {
		FileWriter arq = null;		
		Formatter saida = null;		
		boolean deuRuim = false;	 
		String nomeArquivo;			
		
		if (isCSV) {
			nomeArquivo= "filme2.csv";	
		}
		else {
			nomeArquivo= "filme2.txt";	
		}
		
		
		try {
			arq = new FileWriter(nomeArquivo, true);  
			saida = new Formatter(arq);
		}
		catch (IOException erro) {
			System.err.println("Erro ao abrir arquivo.");
			System.exit(1); 
		}
		
		
		 
		try {
			
			for (int i=0; i < lista.getTamanho(); i++) {
				Filme f = lista.getElemento(i);			
	
				if (isCSV) {
					saida.format("%d;%s;%.2f%n",f.getIdFilme(),	
								f.getNome(),f.getNota(),f.getGenero(),f.getIdade());	
				}
				else {
					saida.format("%d;%s;%.2f%n",f.getIdFilme(),	
							f.getNome(),f.getNota(),f.getGenero(),f.getIdade());		
				}	
			}
		}
		catch (FormatterClosedException erro )
        {
           System.err.println("Erro ao gravar no arquivo.");
           deuRuim= true;
        }
		finally { 
				  
			saida.close();
			try {
				arq.close();
			}
			catch (IOException erro) {
				System.err.println("Erro ao fechar arquivo.");
				deuRuim = true;
			}
			if (deuRuim) {
				System.exit(1);
			}
		}
	}
	public static void gravaArquivo(ListaObj<Filme> lista, boolean isCSV) {
		FileWriter arq = null;		
		Formatter saida = null;		
		boolean deuRuim = false;	 
		String nomeArquivo;			
		
		if (isCSV) {
			nomeArquivo= "filme.csv";	
		}
		else {
			nomeArquivo= "filme.txt";	
		}
		
		
		try {
			arq = new FileWriter(nomeArquivo, true);  
			saida = new Formatter(arq);
		}
		catch (IOException erro) {
			System.err.println("Erro ao abrir arquivo.");
			System.exit(1); 
		}
		
		
		
		try {
			
			for (int i=0; i < lista.getTamanho(); i++) {
				Filme f = lista.getElemento(i);			
				
				if (isCSV) {
					saida.format("%d;%s;%.2f%n",f.getIdFilme(),	
							f.getNome(),f.getNota(),f.getGenero(),f.getIdade());	
				}
				else {
					saida.format("%d;%s;%.2f%n",f.getIdFilme(),	
							f.getNome(),f.getNota(),f.getGenero(),f.getIdade());		
				}	
			}
		}
		catch (FormatterClosedException erro )
		{
			System.err.println("Erro ao gravar no arquivo.");
			deuRuim= true;
		}
		finally { 
			
			saida.close();
			try {
				arq.close();
			}
			catch (IOException erro) {
				System.err.println("Erro ao fechar arquivo.");
				deuRuim = true;
			}
			if (deuRuim) {
				System.exit(1);
			}
		}
	}
	
	public static void leExibeArquivo(boolean isCSV) {
		FileReader arq= null;		
		Scanner entrada = null;		
		String nomeArquivo;			
		boolean deuRuim= false;		
		
		if (isCSV) {
			nomeArquivo= "filme.csv";	
		}
		else {
			nomeArquivo= "filme.txt";	
		}

		
		try {
			arq = new FileReader(nomeArquivo);
			if (isCSV) {
				
				entrada = new Scanner(arq).useDelimiter(";|\\r\\n");
			}
			else {
				
				entrada = new Scanner(arq);
			}
		}
		catch (FileNotFoundException erro) {
			System.err.println("Arquivo não encontrado");
			System.exit(1); 
		}
		
				try {
			
			System.out.printf("%-10s%-10s-10s%-10s%7s\n","IdFilme","NOME","NOTA","GENERO","IDADE" );
		
			while (entrada.hasNext()) {
				int idFilme = entrada.nextInt();				
				String nome = entrada.next();			
				double nota = entrada.nextDouble();	
				String genero= entrada.next();
				int idade = entrada.nextInt();
				System.out.printf("%-10d%-10s%7.2f\n",idFilme,nome,nota,genero,idade);		
				}
		}
	    catch (NoSuchElementException erro)
	    {
	        System.err.println("Arquivo com problemas.");
	        deuRuim = true;
	    }
	    catch (IllegalStateException erro)
	    {
	        System.err.println("Erro na leitura do arquivo.");
	        deuRuim = true;
	    }
	 	finally {
	 		entrada.close();
	 		try {
	 			arq.close();
	 		}
	 		catch (IOException erro) {
				System.err.println("Erro ao fechar arquivo.");
				deuRuim = true;
			}
	 		if (deuRuim) {
	 			System.exit(1);
	 		}
	 	}
	}
	public static void leExibeOutroArquivo(boolean isCSV) {
		FileReader arq= null;		
		Scanner entrada = null;		
		String nomeArquivo;			
		boolean deuRuim= false;		
		
		if (isCSV) {
			nomeArquivo= "filme.csv";	
		}
		else {
			nomeArquivo= "filme.txt";	
		}
		
		
		try {
			arq = new FileReader(nomeArquivo);
			if (isCSV) {
				
				entrada = new Scanner(arq).useDelimiter(";|\\r\\n");
			}
			else {
				
				entrada = new Scanner(arq);
			}
		}
		catch (FileNotFoundException erro) {
			System.err.println("Arquivo não encontrado");
			System.exit(1); 
		}
		
		try {
			
			System.out.printf("%-10s%-10s-10s%-10s%7s\n","IdFilme","NOME","NOTA","GENERO","IDADE" );
			
			while (entrada.hasNext()) {
				int idFilme = entrada.nextInt();				
				String nome = entrada.next();			
				double nota = entrada.nextDouble();	
				String genero= entrada.next();
				int idade = entrada.nextInt();
				System.out.printf("%-10d%-10s%7.2f\n",idFilme,nome,nota,genero,idade);		
			}
		}
		catch (NoSuchElementException erro)
		{
			System.err.println("Arquivo com problemas.");
			deuRuim = true;
		}
		catch (IllegalStateException erro)
		{
			System.err.println("Erro na leitura do arquivo.");
			deuRuim = true;
		}
		finally {
			entrada.close();
			try {
				arq.close();
			}
			catch (IOException erro) {
				System.err.println("Erro ao fechar arquivo.");
				deuRuim = true;
			}
			if (deuRuim) {
				System.exit(1);
			}
		}
	}
	
	public static <T> void main(String[] args) {
		leitor = new Scanner(System.in);
		boolean fim = false;			
		ListaObj<Filme> lista = new ListaObj<Filme>(5);	
		ListaObj<Filme> lista2 = new ListaObj<Filme>(5);	
		int idFilme = 0;
		String nome = null;	
		double nota = 0;
		String genero = null;		
		int idade = 0;
		while (!fim) {	
		
			System.out.println("\nEscolha uma das op��es a seguir:");
			System.out.println("1- Adicionar um Filme");
			System.out.println("2- Exibir a lista");
			System.out.println("3- Gravar a lista em um arquivo");
			System.out.println("4- Ler e exibir o arquivo");
			System.out.println("5- Gravar apenas filmes de um genero");
			System.out.println("6- Ler o arquivo e armazenar lista");
			System.out.println("7- Sair");
			
			int opcao = leitor.nextInt();

			
			
			switch(opcao) {
			
			case 1:
				
				System.out.println("Digite o id do Filme");
				idFilme= leitor.nextInt();
				System.out.println("Digite o nome do Filme");
				nome= leitor.next();
				System.out.println("Digite a nota do Filme");
				nota= leitor.nextDouble();
				System.out.println("Digite o genero do Filme");
				genero= leitor.next();
				System.out.println("Digite a Idade do expectador");
				idade= leitor.nextInt();
				
				Filme filme = new Filme(idFilme, nome, nota, genero, idade); 
			
				lista.adiciona(filme);
				break;

			
			case 2:
				lista.exibe();
				break;

				
			case 3:
				if (lista.getTamanho() == 0) {
					System.out.println("Lista vazia. Não Há o Que Gravar.");
				}
				else {
					gravaArquivo(lista, false);	
					lista.limpa();				
				}	
				break;

			
			case 4:
			lista.exibe();
				break;

			
			case 5:
				if (lista.getTamanho() == 0) {
					System.out.println("Lista vazia. Não tem nada para gravar");
				}else {
				System.out.println("Digite o genero do Filme");
				genero= leitor.next();
				gravaOutroArquivo(lista, true);		
				lista.limpa();		
				leExibeArquivo(false);
				}
				break;

				
			case 6:	
				Filme filme2 = new Filme(idFilme, nome, nota, genero, idade);
				leExibeOutroArquivo(true);
				lista2.adiciona(filme2);
				lista2.exibe();
			
				break;

			case 7:
				fim = true;
				break;

			
			default:
				System.out.println("Opção Invalida");
				break;
			}
		}

	}
}
