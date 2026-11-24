import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escriu una cadena: ");
    String cadena = sc.nextLine();

    if (cadena.length() < 2) {
        System.out.println("Cadena buida");
    } else {
        String resultat = cadena.substring(0, 2) + cadena.substring(cadena.length() - 2);
        System.out.println(resultat);
    }

    sc.close();
}
