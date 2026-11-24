import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    String[] alumnes = {"Paula", "Santiago", "Pascual", "Jorge", "Saul", "Enrique"};

    for (int i = 0; i < alumnes.length; i++) {
        System.out.print(alumnes[i]);
        if (i < alumnes.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println();

    System.out.print("Quina posició vols canviar? ");
    int pos = sc.nextInt();
    sc.nextLine();

    if (pos >= 0 && pos < alumnes.length) {
        System.out.println("Nom actual: " + alumnes[pos]);
        System.out.print("Escriu el nou nom: ");
        alumnes[pos] = sc.nextLine();

        for (int i = 0; i < alumnes.length; i++) {
            System.out.print(alumnes[i]);
            if (i < alumnes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    } else {
        System.out.println("La posició no existeix");
    }

    sc.close();
}
