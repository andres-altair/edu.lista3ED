package servicios;

import java.util.List;

import Dtos.mesdto;

public interface mesInterfaz {

	 public void crearMes (List<mesdto> mes);
	 public String verMes(List<mesdto>mes, int i);
}
