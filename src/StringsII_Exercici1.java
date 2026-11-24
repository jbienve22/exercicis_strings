import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escriu una cadena: ");
    String cadena = sc.nextLine();

    System.out.println("Longitud: " + cadena.length());

    sc.close();
}
