import java.util.Scanner;

public class Datos {

	public static void datos(){
	Scanner altura = new Scanner(System.in);
	System.out.print("Ingresa tu altura en metros: ");
	double medida = altura.nextDouble();
	
	System.out.println();
		
	Scanner peso = new Scanner(System.in);
	System.out.print("Ingresa tu peso en libras: ");
	double masa = peso.nextDouble();
		
	double resultado1 = medida * 39.370;
	
	double resultado2 = resultado1 * resultado1;
	
	double resultado3 = masa * 703;
	
	double resultado = resultado3 / resultado2;
	
	System.out.println();
		
	System.out.println("Tu indice de masa corporal es: " + resultado);
	
	System.out.println();
	
	if(resultado <18.5) {
		System.out.println("Estas por debajo de un peso saludable");
		System.out.println();
		System.out.println("Debes aumentar tu peso para estar saludable,");
		System.out.println("en Guatemala existe una gran variedad de granos");
		System.out.println("y legumbres los cuales te pueden ayudar a comer");
		System.out.println("sano, rico y a aumentar tu masa corporal,");
		System.out.println("como por ejemplo los frijoles.");
	}else if(resultado <= 24.9){
		System.out.println("Tienes un peso saludable");
		System.out.println();
		System.out.println("Tienes un estilo de vida activo y saludable,");
		System.out.println( "¡Felicidades sigue así!");
	}else if(resultado <= 29.9){
		System.out.println("Tienes sobrepeso");
		System.out.println();
		System.out.println("Debes de bejar un poco de peso para estar en un");
		System.out.println("peso saludable, te recomiendo que mantengas un");
		System.out.println("estilo de vida más activo y comer de forma más");
		System.out.println("saludable. Haz ejercicio e intenta comer menos");
		System.out.println("alimentos procesados, con esto conseguiras tu");
		System.out.println("peso ideal, ¡tu puedes!");
	}else if(resultado <= 39.9){
		System.out.println("Tienes obesidad");
		System.out.println();
		System.out.println("Estas muy por encima de un peso saludable, debes");
		System.out.println("de acudir con un nutricionista para que te de una");
		System.out.println("dieta que sea efectiva y también empiza a hacer");
		System.out.println("ejercicio ya que esto te ayudara a conseguir un");
		System.out.println("peso más saludable y te sentiras mucho mejor ");
		System.out.println("tanto fisica como mentalmente.");
	
	}}}

	


