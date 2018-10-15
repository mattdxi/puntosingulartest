import java.util.InputMismatchException;
import java.util.Scanner;

public class objetos  {
  public static void main(String[] args) {
    double num = 0;
    Scanner sn = new Scanner(System.in);
    boolean Submenu = true;
    boolean Submenu2 = false;
    boolean menu = false;
    int opcion, opcion2;
    cuadrado c = new cuadrado(0);
    cubo cb = new cubo(0);

    //Menu
    while (!menu) {
      try {
        System.out.println("Introduce el valor de un lado:");
        num = sn.nextDouble();
        c.setLado(num);
        cb.setLado(num);
        Submenu = false;
      }catch(InputMismatchException e) {
        System.out.println("Debes insertar un número");
        sn.next();
      }
      //Submenu
      while (!Submenu) {
          Submenu2 = false;
          System.out.println("---------Menú Cálculo-------");
          System.out.println("Dato actual: " + num);
          System.out.println("----------------------------|");
          System.out.println("1. Area de un cuadrado      |");
          System.out.println("2. Perimetro de un cuadrado |");
          System.out.println("----------------------------|");
          System.out.println("3. Volumen de un cubo       |");
          System.out.println("4. Perimetro de un cubo     |");
          System.out.println("----------------------------|");
          System.out.println("5. Cancelar                 |");
          System.out.println("6. Salir                    |");
          System.out.println("----------------------------|");

          try {
              System.out.println("Escribe una de las opciones");
              opcion = sn.nextInt();
              switch (opcion) {
                case 1:
                  System.out.println("****************************|");
                  System.out.println("Resultado:                  |");
                  System.out.println(c.calcularArea());
                  System.out.println("****************************|");
                  break;
                case 2:
                  System.out.println("****************************|");
                  System.out.println("Resultado:                  |");
                  System.out.println(c.calcularPerimetro());
                  System.out.println("****************************|");
                  break;
                case 3:
                  System.out.println("****************************|");
                  System.out.println("Resultado:                  |");
                  System.out.println(cb.calcularVolumen());
                  System.out.println("****************************|");
                  break;
                case 4:
                  System.out.println("****************************|");
                  System.out.println("Resultado:                  |");
                  System.out.println(cb.calcularPerimetro());
                  System.out.println("****************************|");
                  break;
                case 5:
                  Submenu = true;
                  Submenu2 = true;
                  break;
                case 6:
                  Submenu = true;
                  menu = true;
                  Submenu2 = true;
                  break;
                default:
                  System.out.println("Solo números entre 1 y 5");
              }
              //Submenu
              while(!Submenu2){
                System.out.println("----------------------------|");
                System.out.println("1. Ménu de cálculo          |");
                System.out.println("2. Inicio                   |");
                System.out.println("----------------------------|");
                try {
                  System.out.println("Escribe una de las opciones");
                  opcion2 = sn.nextInt();
                  switch (opcion2) {
                    case 1:
                      Submenu2 =true;
                      break;
                    case 2:
                      Submenu2 = true;
                      Submenu = true;
                      break;
                  }
                } catch(InputMismatchException e) {
                  System.out.println("Debes insertar un número");
                  sn.next();
                }
              }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
  }
}
