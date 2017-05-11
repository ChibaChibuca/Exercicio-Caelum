package Exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	
public class TransformaTelefone {
	public static void main (String[] args){
		File lista = new File("./Telefones.txt");
    	File listaNova = new File("./Telefones_novos.txt");
    	BufferedReader lendo = null;
    	BufferedWriter escrevendo = null;
		try {
			lendo = new BufferedReader(new FileReader(lista));
			escrevendo = new BufferedWriter(new FileWriter(listaNova));
			String linha;
			while((linha = lendo.readLine()) != null){
				String[] linhaNova = new String[30];
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
		        	}
				}

		        for(int j=0;j<linha.length();j++){
					System.out.print(linhaNova[j]);
					escrevendo.write(linhaNova[j]);
					int l =j+1;
					if(l==linha.length()){
						System.out.println();
						escrevendo.newLine();
					}
				} 
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o foi encontrado" + lista.toString());
		} catch (IOException e) {
			System.out.println("Arquivo n�o pode ser lido" + lista.toString());
		}
		finally{
			if(escrevendo != null){
				try {
					escrevendo.close();
				} catch (IOException e) {
					System.out.println("Arquivo n�o pode ser lido" + listaNova.toString());
				}
			}
			if(lendo != null){
				try {
					lendo.close();
				} catch (IOException e) {
					System.out.println("Arquivo n�o pode ser lido" + lista.toString());
				}
			}
		}
	}	
}

/*
*/
