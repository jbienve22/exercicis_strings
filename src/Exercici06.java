import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escriu un text: ");
    String text = sc.nextLine();

    String revers = "";
    for (int i = text.length() - 1; i >= 0; i--) {
        revers = revers + text.charAt(i);
    }

    System.out.println(revers);

    sc.close();
}
