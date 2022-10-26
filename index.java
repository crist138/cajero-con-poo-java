import objetos.*;
import java.util.*;

public class index{

public static void main(String[] args){
Scanner in = new Scanner(System.in);

	Cajero cajero = new Cajero();

	String tarjeta;
	int i;
	boolean flag = false;

	System.out.println("BIENVENIDO AL BANCO PRIVADO NOSE");

while(!flag){
	System.out.println("INGRESA TU TARJETA");
	tarjeta = in.next(); // guardanos la "tarjeta"


	int ArrLength = cajero.cards.length;
	
	tarjeta = tarjeta.replaceAll("[a-zA-Z]", ""); // Eliminamos las letras, si es que puso
	tarjeta = tarjeta.replaceAll("[\\W]|_", ""); // al igul los simbolos si es que puso


	for(i=0;i<ArrLength;i++){ // buscamos en cada espacio del array un valor que coincida con el ingreasdo
		if(tarjeta.equals(cajero.cards[i])){
			System.out.println("Bienvenido!");
			flag = true;
			
		}
	} 
	if(!flag)
	System.out.println("TU TARJETA NO COINCIDE CON NINGUNA REGISTRADA EN EL BANCO, INTENTALO DE NUEVO\n");
}



}
}