package servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.mesdto;

public class mesImplementacion implements mesInterfaz 
{
	Scanner sc = new  Scanner (System.in);
	@Override
	public void crearMes(List<mesdto> mes) 
	{
		for (int i =1; i<=12;i++) 
		{
			System.out.println("escrib el nombre del mes para el mes "+ i );
			String nombreMes = sc.next();	
			mesdto  nuevoMes = new mesdto(nombreMes, i);
			mes.add(nuevoMes);
		}
	}
		
	

	@Override
	public String verMes(List<mesdto> mes, int i) 
	{
		for (mesdto m : mes) 
		{
            if (m.getNumero() == i) 
            {
                return m.getNombre();
            }
		}
		 return "Mes incorrecto";
	}
	 
}
