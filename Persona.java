public class Persona {
	String name;
	String sexo;
	int edad;
	
	public void caminar(){
		System.out.println(name + " Esta caminando");		
	}
	public void estudiar(){
		System.out.println(name + " Esta estudiando");		
	}
	public void comer(String comida){
		System.out.println(name + " Esta comiento " + comida);		
	}
	
	public void pedirCerveza(){
		if(edad>=18){
			System.out.println("Dar cerveza");
		}else{
			System.out.println("No tienes edad");
		}
	}
}
class Curso{
	public static void main(String args0[]){
		try{
			
			Persona juan = new Persona();
			juan.name = "Juan";
			juan.sexo = "M";
			juan.edad = 15;
			
			juan.caminar();
			juan.estudiar();
			juan.comer("Torta cubana");
			juan.pedirCerveza();
			
			
			Persona bety = new Persona();
			bety.name = "Juan";
			bety.sexo = "M";
			bety.edad = 22;
			
			bety.caminar();
			bety.estudiar();
			bety.comer("Taquitos");
			bety.pedirCerveza();

		}catch(Exception e){
			System.out.println("La ejecucion correcta es: ");
		}
	}
}