package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.mesdto;

public class inicio {

	public static void main(String[] args) {
		List<mesdto> mes = new ArrayList<mesdto>();
		Scanner sc = new  Scanner (System.in);
		for (int i =1; i<=12;i++) 
		{
			System.out.println("escrib el nombre del mes para el mes "+ i );
			String nombreMes = sc.next();	
			mesdto  nuevoMes = new mesdto(nombreMes, i);
			mes.add(nuevoMes);
		}
		int numero;
		mesdto vermes = new mesdto();
		do {
            System.out.print("Introduce un número de mes (1-12) , 0 para salir");
            numero = sc.nextInt();
            if (numero >= 1 && numero <= 12) {
            	 for (mesdto m : mes) {
                     if (m.getNumero() == numero);
                     System.out.println("mes es :"+ m.getNombre());
            	 }
            }
        } while (numero != 0);
		
	}

}
