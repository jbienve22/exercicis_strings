import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Escriu un text acabat en punt: ");
    String text = sc.nextLine();

    String[] paraules = text.split(" ");
    System.out.println("Paraules: " + paraules.length);

    int vocals = 0;
    String minus = text.toLowerCase();
    for (int i = 0; i < minus.length(); i++) {
        char c = minus.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vocals++;
        }
    }
    System.out.println("Vocals: " + vocals);

    sc.close();
}
