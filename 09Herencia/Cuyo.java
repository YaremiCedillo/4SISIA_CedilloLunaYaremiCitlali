import java.util.Scanner;

public class Cuyo extends Animal{
    String peso;
    Scanner entrada = new Scanner(System.in);

    public Cuyo(){

    }

    public Cuyo(String nombre, String raza, String tipo_alimento, int edad, String peso){
        super(nombre, raza, tipo_alimento, edad);
        this.peso = peso;
    }

    //recibir
    public String getPeso(){
      System.out.println("Ingrese cuanto pesa:");
      peso = entrada.nextLine();
        return peso;
    }

    //enviar
    public void setPeso(String peso){
        this.peso = peso;
    }

    //el metodo propio 
    public void mostrarCuyo(){
        System.out.println("\n --------- Datos del cuyito ---------\n\n   El nombre del cuyo es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "   Tiene la edad de: " + getEdad() + " años \n" + "   Pesa: " + getPeso()+"\n --------------------------------------");
        
    }




    
}