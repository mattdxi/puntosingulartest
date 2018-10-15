
public class morse{
  //Declaramos un array de 2 dimensiones para hacer las comparaciones
  static String abc[] = {
      "A","B","C","D","E",
      "F","G","H","I","J",
      "K","L","M","N","O",
      "P","Q","R","S","T",
      "U","V","W","X","Y",
      "Z","1","2","3","4",
      "5","6","7","8","9",
      "0"
  };
  static String morse[] = {
      ".-","-...","-.-.","-..",".",
      "..-.","--.","....","..",".---",
      "-.-",".-..","--","-.","---",
      ".--.","--.-",".-.","...","-",
      "..-","...-",".--","-..-","-.--",
      "--..",".----","..---","...--","....-",
      ".....","-....","--...","---..","----.",
      "-----"
  };

  public static void main(String[] args) {
    try {
      if (args[0].equals("-m")) {
        System.out.println(parseText(args[1]));
      }else if (args[0].equals("-t")) {
        System.out.println(parseMorse(args[1]));
      }
    }catch (Exception e) {

    }
  }
  static String parseText(String txt){
    //Agregamos los espacios dobles para diferenciar palabras
    txt = txt.replace(" ", "*");
    //Volvemos el texto en Mayusculas
    txt = txt.toUpperCase();
    //Reemplazamos
    for (int i=0;i<36;i++ ) {
      txt = txt.replace(abc[i], morse[i] + " ");
    }
    txt = txt.replace(" *", "  ");
    return txt;
  }
  static String parseMorse(String txt){
    //Ponemos un placeholder a los espacios dobles de palabras
    txt = txt.replace("  ", " ? ");
    //Separamos por espacios
    String txtTemp[] = txt.split(" ");
    txt = "";
    //Hacemos el recorrido
    for (int i=0;i<txtTemp.length;i++ ) {
      //Agregamos los espacios de palabras con ayuda del placeholder
      if (txtTemp[i].equals("?")) {
        txt += " ";
      }
      //Hacemos el recorrido letra por letra
      for (int b=0;b<36;b++) {
        if (txtTemp[i].equals(morse[b])) {
          txt += abc[b];
        }
      }
    }
    return txt;
  }
}
