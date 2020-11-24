package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable {
	private Integer cantidadDeEjes;
	private final Integer limiteDeVelocidad=80;
	
	public Camion(Integer cantidadDeEjes,String patente, Integer limiteVelocidad) {
		super(patente, limiteVelocidad);
		this.cantidadDeEjes=cantidadDeEjes;
	}

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}

	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	public Integer getLimiteDeVelocidad() {
		return limiteDeVelocidad;
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	@Override
	public Boolean enInfraccion() {
		Boolean enInfraccion=false;
		if(this.getVelocidadActual()>limiteDeVelocidad) {
			enInfraccion=true;
		}
		return enInfraccion;
	}		


	
}
