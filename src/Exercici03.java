import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escriu un text: ");
    String text = sc.nextLine();

    System.out.println("Majúscules: " + text.toUpperCase());
    System.out.println("Minúscules: " + text.toLowerCase());

    sc.close();
}
