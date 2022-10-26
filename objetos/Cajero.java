package objetos;
import java.util.*;

public class Cajero{

	Scanner in = new Scanner(System.in);

	//Atributos
	public String empresa;
	public String[] cards = {"1111222233334444","2222333344445555", "3333444455556666"};
	public saldo = 0;

	//Metodos
	public boolean verifyCard(String Card){

		if(Card == cards[0]&& Card == cards[1]&& Card == cards[2]){
			return true;
		} else {
			return false;
		}

	}


	public void menuPrincipal(){
		int opt;
		System.out.println("\n\n======\tMenu Principal\t======");
		System.out.println("1.- DEPOSITAR\t\t2.- VER SALDO\n3.- RETIRAR\t\t4.- PAGAR SERVICIOS\n");
		System.out.println("SELECCIONA UNA OPCION: ");
		opt = in.nextInt();

		switch(opt){
			case 1:
				int cuentaBancaria;
				System.out.println("INGRESA LA CUENTA A DEPOSITAR: ");

			break; // fin case 1
		}
	}
}