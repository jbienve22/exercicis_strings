import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo", "Mi universo", "Patria", "De mayor quiero ser feliz", "Empieza por los zapatos"};

    System.out.print("Escriu el títol del llibre: ");
    String titol = sc.nextLine();

    boolean trobat = false;
    for (int i = 0; i < catalogo.length; i++) {
        if (catalogo[i].equalsIgnoreCase(titol)) {
            trobat = true;
        }
    }

    if (trobat) {
        System.out.println("El llibre està al catàleg");
    } else {
        System.out.println("El llibre no està al catàleg");
    }

    sc.close();
}
