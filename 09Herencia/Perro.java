import java.util.Scanner;

public class Perro extends Animal{
    String ladrido;
    Scanner entrada = new Scanner(System.in);

    public Perro(){

    }

    public Perro(String nombre, String raza, String tipo_alimento, int edad, String ladrido){
        super(nombre, raza, tipo_alimento, edad);
        this.ladrido = ladrido;
    }

    //recibir
    public String getLadrido(){
      System.out.println("Ingrese su ladrido:");
      ladrido = entrada.nextLine();
        return ladrido;
    }

    //enviar
    public void setLadrido(String ladrido){
        this.ladrido = ladrido;
    }

    //el metodo propio 
    public void mostrarPerro(){
        System.out.println("\n ------ Datos del perrito ------\n\n   El nombre del perro es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "   Tiene la edad de: " + getEdad() + " años \n" + "   Su ladrido es: " + getLadrido()+"\n -------------------------------");
        
    }




    
}