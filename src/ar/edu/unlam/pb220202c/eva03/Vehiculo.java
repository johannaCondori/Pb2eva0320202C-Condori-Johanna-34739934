package ar.edu.unlam.pb220202c.eva03;

public class Vehiculo {

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String Patente;
	private Integer VelocidadActual;
	private Integer limiteVelocidad;
	
	
	
		
	public Vehiculo(String patente, Integer limiteVelocidad) {
		this.Patente = patente;
		this.limiteVelocidad = limiteVelocidad;
		this.VelocidadActual=0;
	}


	public String getPatente() {
		return Patente;
	}


	public void setPatente(String patente) {
		Patente = patente;
	}



	public Integer getVelocidadActual() {
		return VelocidadActual;
	}


	public void setVelocidadActual(Integer velocidadActual) {
		VelocidadActual = velocidadActual;
	}




	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}


	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}




	public void incrmentarVelocidad(Integer Velocidad) {
		this.VelocidadActual+=Velocidad;
	}
}
