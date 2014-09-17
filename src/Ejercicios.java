
public class Ejercicios {
	//Devuelve el valor de "arreglo" en la posicion "i"
	//2.5pts
	static int obtenerValor(int arreglo[],int i)
	{
		return arreglo[i];
	}
	
	//Si el promedio de todos los valores de "notas" es mayor a 60, devuelve verdadero de lo contrario falso
	//2.5pts
	static boolean alumnoAprobo(int notas[])
	{
		int suma = 0;
		int promedio = 0;
		for (int n=0; n<notas.length; n++)
		{
			suma = suma +notas[n];
		}
		promedio = suma/notas.length;
		if (promedio >= 60)
			return true;
		{
		return false;
		}
	}
	
	//Devuelve el valor de mi_arreglo en la posicion [x][y]
	//2.5pts
	static int obtenerValorBidi(int mi_arreglo[][], int x, int y)
	{
		return mi_arreglo[x][y];
	}
	
	//Devuelve la cantidad de veces que "valor" existe en "arreglo"
	//2.5pts
	static int cuantosExisten(int arreglo[][], int valor)
	{
		int x=0;
		for(int c=0; c<arreglo.length; c++)
		{
			for(int f=0; f<arreglo[1].length; f++)
			{
			 if (arreglo[c][f]==valor)
			 {
				 x = x + 1;
			 }
			}
		}
		return x;
	}
	
	//Realizar la siguiente funcion recursiva
	//recursiva1(n) = recursiva1(n-1) - recursiva1(n-2)
	//Dados los siguientes caso base
	//recursiva1(0)=10
	//recursiva1(1)=20
	//2.5pts
	static int recursiva1(int n)
	{
		if (n==0)
			return 10;
		if (n==1)
			return 20;
		return recursiva1 (n-1) - recursiva1 (n-2);
	}
	
	//Realizar la siguiente funcion recursiva
	//recursiva2(n) = recursiva2(n-1) + recursiva2(n-2) * recursiva2(n-3)
	//Dados los siguientes caso base
	//recursiva2(0)=10
	//recursiva2(1)=20
	//recursiva2(2)=30
	//2.5pts
	static int recursiva2(int n)
	{
		if (n==0)
			return 1;
		if (n==1)
			return 2;
		if (n==2)
			return 3;
		return recursiva2 (n-1) + recursiva2 (n-2) * recursiva2 (n-3);
	}
	
	public static void main(String args[])
	{
		for (int n =0; n<20; n++)
		System.out.println(recursiva2(n));
	}
}
