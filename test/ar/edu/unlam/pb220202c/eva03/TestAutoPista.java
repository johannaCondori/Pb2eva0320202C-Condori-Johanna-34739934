package ar.edu.unlam.pb220202c.eva03;

import org.junit.Assert;
import org.junit.Test;

public class TestAutoPista {
	
	@Test
	
	public void queSePuedaRegistrarTelepase () {
		Vehiculo miVehiculo= new Vehiculo("s12sd", 130);
		
		Autopista miAutopista= new Autopista("Cualquiera");
		
		Assert.assertTrue(miAutopista.registrarTelepase(123, miVehiculo));
			
	}

	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() {
		
	}
	
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
		
	}

	public void generetestAEleccion1() {
		
	}
	
	public void generetestAEleccion2() {
		
	}
	
}
