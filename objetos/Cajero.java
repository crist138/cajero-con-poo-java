package objetos;
import java.util.*;

public class Cajero{
	//Atributos
	public String empresa;
	public String[] cards = {"1111222233334444","2222333344445555", "3333444455556666"};

	//Metodos
	public boolean verifyCard(String Card){
		if(Card == cards[0]){
			return true;
		} else {
			return false;
		}
	}
}