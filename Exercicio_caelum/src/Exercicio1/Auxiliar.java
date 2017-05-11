package Exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Auxiliar {

	BufferedReader lendo;
	BufferedWriter escrevendo;
	
	public File CriarArquivo(String path){
		File saida = new File(path);
		return saida;
	}
	public void Transformador(File entrada, File Saida, String pathEntrada, String pathSaida ){
		BufferedReader lendo = null;
		BufferedWriter escrevendo = null;
		try {
			lendo = new BufferedReader(new FileReader(CriarArquivo(pathEntrada)));
			escrevendo = new BufferedWriter(new FileWriter(CriarArquivo(pathSaida)));
			String linha;
			while((linha =lendo.readLine()) !=null){
				String[] linhaNova = new String[30];
				Escrevendo(linha,Verificador(linha,linhaNova),escrevendo, pathSaida);
			}	
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não foi encontrado" + CriarArquivo(pathEntrada).toString());
		} catch (IOException e) {
			System.out.println("Arquivo não pode ser lido" + CriarArquivo(pathEntrada).toString());
			}
		finally {
			try {
				escrevendo.close();
			} catch (IOException e) {
				System.out.println("Arquivo não pode ser lido" + CriarArquivo(pathSaida).toString());
			}
			try {
				lendo.close();
			} catch (IOException e) {
				System.out.println("Arquivo não pode ser lido" + CriarArquivo(pathEntrada).toString());
			}
		}
		}
	public String[] Verificador(String linha, String[] linhaNova){
		for(int i=0;i<linha.length();i++){
			Character digito = linha.charAt(i);
	        switch (digito) {
	            case '1':
	            case '0':
	            case '-':
	            	linhaNova[i]= digito.toString();
	                break;
	            case 'A':
	            case 'B':
	            case 'C':
	            	linhaNova[i]= "2";
	                break;
	            case 'D':
	            case 'F':
	            case 'E':
	            	linhaNova[i]= "3";
	                break;
	            case 'G':
	            case 'H':
	            case 'I':
	            	linhaNova[i]= "4";
	                break;
	            case 'J':
	            case 'K':
	            case 'L':
	            	linhaNova[i]= "5";
	                break;
	            case 'M':
	            case 'N':
	            case 'O':
	            	linhaNova[i]= "6";
	                break;
	            case 'P':
	            case 'Q':
	            case 'R':
	            case 'S':
	            	linhaNova[i]= "7";
	                break;
	            case 'T':
	            case 'U':
	            case 'V':
	            	linhaNova[i]= "8";
	                break;
	            case 'W':
	            case 'X':
	            case 'Y':
	            case 'Z':
	            	linhaNova[i]= "9";
	                break;
                default : 
                	linhaNova[i]= digito.toString();
        	}
		}
	 return linhaNova;
	}
	
	public void Escrevendo(String linha, String[] linhaNova, BufferedWriter escrevendo, String path){
		for(int i=0;i<linha.length();i++){
			System.out.print(linhaNova[i]);
			try {
				escrevendo.write(linhaNova[i]);
			} catch (IOException e) {
				System.out.println("Arquivo não pode ser lido" + CriarArquivo(path).toString());
			}
			int l =i+1;
			if(l==linha.length()){
				System.out.println();
				try {
					escrevendo.newLine();
				} catch (IOException e) {
					System.out.println("Arquivo não pode ser lido" + CriarArquivo(path).toString());
				}
			}
		}	
	}
	
}
	
	
	
	
	