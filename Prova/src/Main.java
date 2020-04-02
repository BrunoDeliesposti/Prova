import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		String x;
		String y;
		
		try {
		    Scanner scanner = new Scanner(new File("DadosMercado.csv"));
		    Scanner scanner2 = new Scanner(new File("Operacoes.csv"));
		   
		    scanner.useDelimiter(",");
		    scanner2.useDelimiter(",");
		  
		    
		    while(scanner.hasNext() && scanner2.hasNext()){
		    	
		    	x = scanner.next();
				y = scanner2.next();
				
		    	String [] values = x.split(";");
		    	String [] values2 = y.split(";");

		    	System.out.println(values[2]);
		    	System.out.println(values2[13]);
		    	System.out.println("---------------");
			  			
			}
	     }catch (FileNotFoundException e) { System.out.println(e);
           
		}
	}
}