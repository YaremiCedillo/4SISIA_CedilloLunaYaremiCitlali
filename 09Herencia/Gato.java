import java.util.Scanner;

public class Gato extends Animal{
    int num_vidas;
    Scanner entrada = new Scanner(System.in);

    public Gato(){

    }

    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    //recibir
    public int getNum_vidas(){
      System.out.println("Ingrese el numero de vidas que le quedan:");
      num_vidas = entrada.nextInt();
        return num_vidas;
    }

    //enviar
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    //el metodo propio 
    public void mostrarGato(){
        System.out.println("\n -------- Datos del gatito ------\n\n   El nombre del michi es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " + getTipo_alimento() +  "\n" + "   Tiene la edad de: " + getEdad() + " años \n" + "   Su num de vidas es: " + getNum_vidas()+ "\n -------------------------------");
    }




    
}