package carromutithreading;
import java.util.Random;


public class Carros extends Thread{
public int threadNumber;
public Carros(int threadNumber) {
	this.threadNumber = threadNumber;
}
 public float velocidadeAtual, VelocidadeInicial;
 public float aceleracao =0.5f;

public float DistanciaPercorrida = 0;
public float DistanciaAtual = 0;
public int DistanciaLinhaChegada = 500;
public int NumerodeVoltas =3;
public float Temporizador=0.0f;
public int VoltasDadas = 0;
 
 
 public void run()
 { 


	while(NumerodeVoltas >0)
	{
		Temporizador += 0.01f/ 1000;
		velocidadeAtual = 0+ aceleracao *Temporizador;
		//System.out.println(velocidadeAtual + "carro da thread" + threadNumber);
		//Velocimetro dos carros
		//System.out.printf("velocidade do carro nº"+ threadNumber + "  %.1f %n  ",velocidadeAtual);
		
		DistanciaAtual = 0+ velocidadeAtual*Temporizador;
		//System.out.printf("distancia percorrida do carro nº"+ threadNumber + "  %.1f %n  ",DistanciaAtual);
		if(DistanciaAtual >= DistanciaLinhaChegada)
		{
			CruzouLinhaChegada();
			
		}
		
	}
	
	
	
	 
}
 
 public void CruzouLinhaChegada() {
	System.out.println("O carro " + threadNumber + " Completou a volta " + VoltasDadas);
	System.out.println();
	//System.out.printf("%n Distancia percorrida pelo carro nº  "+ threadNumber + "  %.1f " , DistanciaPercorrida);
	 VoltasDadas++;
	 DistanciaAtual = 0;
	NumerodeVoltas--;
	DistanciaPercorrida = DistanciaLinhaChegada * VoltasDadas;
	System.out.printf(" E percorreu %.1f %n ", DistanciaPercorrida);
	
	
}

public void MudarMarcha()
 {
	 
	 
	 System.out.println("Olha só eu troquei de marcha");
	 
	 Random geradordeVelocidade = new Random();
	 aceleracao = geradordeVelocidade.nextFloat(2.0f);
	 
 }
 
 
}
