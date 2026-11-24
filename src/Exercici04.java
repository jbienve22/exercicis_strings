import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escriu un text: ");
    String text = sc.nextLine();

    if (text.length() == 0) {
        System.out.println("El text està buit");
    } else {
        System.out.print("Escriu una paraula: ");
        String paraula = sc.nextLine();

        if (text.contains(paraula)) {
            System.out.println("La paraula s'ha trobat");
        } else {
            System.out.println("La paraula no s'ha trobat");
        }
    }

    sc.close();
}
