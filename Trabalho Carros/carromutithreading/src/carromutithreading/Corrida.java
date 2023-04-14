package carromutithreading;

public class Corrida {

	public int corredores;
	public static void main(String[] args) 
	{
	
		
		for (int i = 0; i< 4 ; i++)
		{
			Carros carros = new Carros(i);
			carros.start();
		
		}
			
	
	}

}
