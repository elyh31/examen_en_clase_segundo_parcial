import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluador {
	
	@Test
	public void obtenerValor() {
		int arr[]={1,2,3};
		int arr2[]={10,20,30,40};
		assertEquals("Error ejecutando obtenerValor({1,2,3})", 2, Ejercicios.obtenerValor(arr,1));
		assertEquals("Error ejecutando obtenerValor({1,2,3})", 3, Ejercicios.obtenerValor(arr,2));
		assertEquals("Error ejecutando obtenerValor({10,20,30,40})", 40, Ejercicios.obtenerValor(arr2,3));
	}
	
	@Test
	public void alumnoAprobo() {
		int arr1[]={10,20,30};
		int arr2[]={100,60,70};
		int arr3[]={60,50,65};
		int arr4[]={60,55,65};
		assertEquals("Error ejecutando alumnoAprobo({10,20,30})", false, Ejercicios.alumnoAprobo(arr1));
		assertEquals("Error ejecutando alumnoAprobo({100,60,70})", true, Ejercicios.alumnoAprobo(arr2));
		assertEquals("Error ejecutando alumnoAprobo({60,50,65})", false, Ejercicios.alumnoAprobo(arr3));
		assertEquals("Error ejecutando alumnoAprobo({60,55,65})", true, Ejercicios.alumnoAprobo(arr4));
	}
	
	@Test
	public void obtenerValorBidi() {
		int arr[][]={{1,2,3,4},{10,20,30,40},{100,200,300,400}};
		int arr2[][]={{11,12},{110,120},{1100,1200},{11000,12000}};
		assertEquals("Error ejecutando obtenerValorBidi({{1,2,3,4},{10,20,30,40},{100,200,300,400}},1,2)", 20, Ejercicios.obtenerValorBidi(arr,1,1));
		assertEquals("Error ejecutando obtenerValorBidi({{11,12},{110,120},{1100,1200},{11000,12000}},1,2)", 120, Ejercicios.obtenerValorBidi(arr2,1,1));
	}
	
	@Test
	public void cuantosExisten() {
		int arr[][]={{1,2,3,4},{10,2,1,40},{100,200,2,400}};
		assertEquals("Error ejecutando cuantosExisten({{1,2,3,4},{10,20,30,40},{100,200,300,400}},1)", 2, Ejercicios.cuantosExisten(arr,1));
		assertEquals("Error ejecutando cuantosExisten({{1,2,3,4},{10,20,30,40},{100,200,300,400}},2)", 3, Ejercicios.cuantosExisten(arr,2));
		assertEquals("Error ejecutando cuantosExisten({{1,2,3,4},{10,20,30,40},{100,200,300,400}},3)", 1, Ejercicios.cuantosExisten(arr,3));
	}
	
	@Test
	public void recursiva1() {
		assertEquals("Error ejecutando recursiva1(10)", -20, Ejercicios.recursiva1(10));
		assertEquals("Error ejecutando recursiva1(5)", -10, Ejercicios.recursiva1(5));
		assertEquals("Error ejecutando recursiva1(7)", 20, Ejercicios.recursiva1(7));
	}
	
	@Test
	public void recursiva2() {
		assertEquals("Error ejecutando recursiva2(10)", 939791, Ejercicios.recursiva2(10));
		assertEquals("Error ejecutando recursiva2(5)", 26, Ejercicios.recursiva2(5));
		assertEquals("Error ejecutando recursiva2(7)", 367, Ejercicios.recursiva2(7));
	}

}
