import objetos.*;
import java.util.*;

public class index{

public static void main(String[] args){

	Cajero cajero = new Cajero();

	int price =124997;

	System.out.println(cajero.verifyCard("111122233334444"));

	System.out.println(price+(price*.15));


}
}