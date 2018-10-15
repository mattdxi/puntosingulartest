public class romanos {
  static int MAX_LIMITE = 1000;
  static int MIN_LIMITE = 1;
  public static void main(String[] args) {
    try {
      if (args[0].equals("-n")) {
        int num = Integer.parseInt(args[1]);
        if (num >= MIN_LIMITE && num < MAX_LIMITE) {
          //Hacemos la conversión
          int centenas, decenas, unidades;
          String result = "";
         //obtenemos cada cifra del número
          centenas = num / 100 % 10;
          decenas = num / 10 % 10;
          unidades = num % 10;

          //Centenas
          if (centenas == 9) {
            result +="CM";
          }else if (centenas >= 5) {
            result +="D";
            for (int i = 6; i <= centenas; i++) {
               result +="C";
            }
          }else if (centenas ==4) {
            result +="CD";
          }else {
            for (int i = 1; i<=centenas ;i++ ) {
              result +="C";
            }
          }
          //Decenas
          if (decenas == 9) {
            result +="XC";
          }else if (decenas >= 5) {
            result +="L";
            for (int i = 6; i <= decenas; i++) {
               result +="X";
            }
          }else if (decenas ==4) {
            result +="XL";
          }else {
            for (int i = 1; i<=decenas ;i++ ) {
              result +="X";
            }
          }
          //unidades
          if (unidades == 9) {
            result +="IX";
          }else if (unidades >= 5) {
            result +="V";
            for (int i = 6; i <= unidades; i++) {
               result +="I";
            }
          }else if (unidades ==4) {
            result +="IV";
          }else {
            for (int i = 1; i<=unidades ;i++ ) {
              result +="I";
            }
          }

          System.out.println(result);

        }else if (num == MAX_LIMITE) {
          System.out.println("M");
        }else {
          System.out.println("Número fuera de rango permitido");
        }
      }
    }catch (Exception e) {

    }
  }
}
