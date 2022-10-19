import java.util.Scanner;
public class Principal {

    public static void main(String[] args){
      int opcion;
      char letra;
      Scanner entrada = new Scanner(System.in);
      
      Perro dog = new Perro();
      Gato cat = new Gato();
      Hamster ham= new Hamster();
      Conejo con= new Conejo();
      Cuyo cuy= new Cuyo();
      Huron hur= new Huron();
      Pez fish = new Pez();
       do {
      System.out.println("\n--- Veternaria ---\n");
      System.out.println("Elija una opcion deseada: ");
      System.out.println("1.- Perro");
      System.out.println("2.- Gato");
      System.out.println("3.- Hamster");
      System.out.println("4.- Conejo");
      System.out.println("5.- Cuyo");
      System.out.println("6.- Huron");
      System.out.println("7.- Pez");
      opcion = entrada.nextInt();

      switch (opcion) {
        case 1:
         do {
          System.out.println("\n***** Perro *****");
           dog.mostrarPerro();
            System.out.println("\n¿Desea registrar a otro perro?, escriba S para repetir ");
      letra = entrada.next().charAt(0);
    } while (letra == 's' || letra == 'S');
          break;
          
        case 2:
           do{
             System.out.println("\n***** Gato ******");
          cat.mostrarGato();
          System.out.println("\n¿Desea registrar a otro gato?, escriba S para repetir ");
          letra = entrada.next().charAt(0);
    } while (letra == 's' || letra == 'S');
          break;
          
        case 3:
          do{
             System.out.println("\n***** Hamster *****");
          ham.mostrarHamster();
          System.out.println("\n¿Desea registrar a otro hamster?, escriba S para repetir ");
          letra = entrada.next().charAt(0);
    } while (letra == 's' || letra == 'S');
          break;
          
        case 4:
          do{
             System.out.println("\n***** Conejo *****");
          con.mostrarConejo();
          System.out.println("\n¿Desea registrar a otro conejo?, escriba S para repetir ");
          letra = entrada.next().charAt(0);
    } while (letra == 's' || letra == 'S');
          break;
         
          case 5:
          do{
             System.out.println("\n***** Cuyo *****");
          cuy.mostrarCuyo();
          System.out.println("\n¿Desea registrar a otro cuyo?, escriba S para repetir ");
          letra = entrada.next().charAt(0);
    } while (letra == 's' || letra == 'S');
          break;
          
          case 6:
          do{
             System.out.println("\n***** Huron *****");
          hur.mostrarHuron();
          System.out.println("\n¿Desea registrar a otro huron?, escriba S para repetir ");
          letra = entrada.next().charAt(0);
    } while (letra == 's' || letra == 'S');
          break;
          
          case 7:
          do{
             System.out.println("\n***** Pez *****");
          fish.mostrarPez();
          System.out.println("\n¿Desea registrar a otro pez?, escriba S para repetir ");
          letra = entrada.next().charAt(0);
    } while (letra == 's' || letra == 'S');
          break;
        default:
          System.out.println("\nFuera de rango");
          break;
      }
      System.out.println("\n¿Desea repetir el programa?, escriba S para repetir ");
      letra = entrada.next().charAt(0);

    } while (letra == 's' || letra == 'S');
       System.out.println("Gracias por ocupar este programa ?");
       

    }
    
}