package parte3.ejercicio4;

public class Ejercicio4 {
	
	public boolean parseToBoolean(int numero) {
		
		boolean estado = numero == 1 ? true : false;
		
		return estado;
		
	}
	
	public boolean parseToBoolean(String argumento) {
		
		boolean estado = argumento.equals("true");
		
		return estado;
	}

}
