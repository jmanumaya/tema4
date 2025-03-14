package crud.ejercicio4;

import java.util.HashSet;

public class Crud {

	private HashSet<Disco> lsDiscos = new HashSet<>();
	
	public HashSet<Disco> listado(){
		return lsDiscos;
	}
	
	public boolean nuevoDisco(Disco dsc) {
		return lsDiscos.add(dsc);
	}
	
	public boolean borrarDisco(Disco dsc) {
		return lsDiscos.remove(dsc);
	}
}
