import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Clase scanner que nos permite que el usuario escriba
          Scanner scanner = new Scanner(System.in);
        // Declaraciones y asiganciones
          String palabra_secreta    = "inteligencia";
          int intentos_maximos      = 10;
          int intentos              = 0;
          boolean palabra_adivinada = false;
        // Arreglos
          char[] letras_adivinadas = new char[palabra_secreta.length()];
        // Bucles
          for (int i = 0; i < letras_adivinadas.length; i++) {
            letras_adivinadas[i] = '_';
          }
          while (!palabra_adivinada && intentos < intentos_maximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letras_adivinadas) + " (" + palabra_secreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor");
            char letra             = Character.toLowerCase(scanner.next().charAt(0));
            boolean letra_correcta = false;
            for (int i = 0; i < palabra_secreta.length(); i++) {
              // Condicional
                if (palabra_secreta.charAt(i) == letra) {
                  letras_adivinadas[i] = letra;
                  letra_correcta       = true;
                }
            }
            if (!letra_correcta) {
              intentos++;
              System.out.println("Incorrecto! Te quedan " + (intentos_maximos - intentos) + " intentos.");
            }
            if (String.valueOf(letras_adivinadas).equals(palabra_secreta)) {
              palabra_adivinada = true;
              System.out.println("Felicidades! Has adiviando la palabra secreta: " + palabra_secreta);
            }
          }
        if (!palabra_adivinada)
          System.out.println("Que pene te has quedado sin intentos! GAME OVER");
        scanner.close();
    }
}
