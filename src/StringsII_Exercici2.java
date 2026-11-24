void main() {
    String cadena = "google.com";

    for (int i = 0; i < cadena.length(); i++) {
        char c = cadena.charAt(i);

        if (cadena.indexOf(c) == i) {
            int comptador = 0;
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(j) == c) {
                    comptador++;
                }
            }
            System.out.println(c + ": " + comptador);
        }
    }
}
