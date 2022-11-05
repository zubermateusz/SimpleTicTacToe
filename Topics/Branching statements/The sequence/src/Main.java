import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int liczba = scanner.nextInt();
        int licznik = 1;
        int licznik2 = 0;
        for (licznik = 1; licznik2 < liczba; licznik++) {
            for (int j = 1; j <= licznik; j++, licznik2++) {
                if (licznik2 == liczba) {
                    break;
                }
                System.out.print(licznik + " ");
                //(licznik2 == liczba) break;
                //System.out.print(licznik2);
            }
        }
        //System.out.println(licznik);
    }
}
