package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase= new HashMap<Integer, Vehiculo>();
	private HashSet <Vehiculo> vehiculosEnCirculacion= new HashSet<Vehiculo>();
	private Set <Vehiculo> vehiculosConInfraccion;
	private String nombre;
	
	public Autopista(String nombre) {
		
		this.nombre = nombre;
	}
	
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		Boolean sePudoRegistrar=false;
		if(this.telepase.put(numeroTelpase, vehiculo) != null) {
			sePudoRegistrar=true;
		}
		return sePudoRegistrar;
		
	}
	public Boolean ingresarAutopista (Integer numeroTelepase) throws Exception{
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
	   // y no permite ingresar al autopista
		//Vehiculo vehiculo=new Vehiculo(patente, limiteVelocidad);
		//if(this.registrarTelepase(numeroTelepase, vehiculo)==true) {
			//this.vehiculosEnCirculacion.add(vehiculo);
	
		return null;
	}
	
	public HashMap<Integer, Vehiculo> getTelepase() {
		return telepase;
	}

	public void setTelepase(HashMap<Integer, Vehiculo> telepase) {
		this.telepase = telepase;
	}

	public HashSet<Vehiculo> getVehiculosEnCirculacion() {
		return vehiculosEnCirculacion;
	}

	public void setVehiculosEnCirculacion(HashSet<Vehiculo> vehiculosEnCirculacion) {
		this.vehiculosEnCirculacion = vehiculosEnCirculacion;
	}

	public Set<Vehiculo> getVehiculosConInfraccion() {
		return vehiculosConInfraccion;
	}

	public void setVehiculosConInfraccion(Set<Vehiculo> vehiculosConInfraccion) {
		this.vehiculosConInfraccion = vehiculosConInfraccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void salirAutpista (Vehiculo vehiculo) {
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
		
	return null;
    }
	
	public void agregarVehiculoEnCirculacion(Vehiculo vehiculo) {
		this.vehiculosEnCirculacion.add(vehiculo);
	}
	public Integer cantidadDeVehiculosENCirculacion() {
	
		return this.vehiculosEnCirculacion.size();
}
	}
