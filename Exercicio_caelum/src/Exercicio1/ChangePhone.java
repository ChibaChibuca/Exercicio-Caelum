package Exercicio1;


public class ChangePhone {
	public static void main(String[] args) {
		Auxiliar aux = new Auxiliar();
		aux.Transformador(aux.CriarArquivo("./Telefones.txt"),aux.CriarArquivo("./Telefones_novos.txt"),"./Telefones.txt","./Telefones_novos.txt" );
	}
	
}
