import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        while (scanner.hasNext()) {
            int liczba = scanner.nextInt();
            if (liczba == 0) {
                break;
            }
            if (liczba % 2 == 0) {
                System.out.println("even");
            }
            if (liczba % 2 != 0) {
                System.out.println("odd");
            }
        }
    }
}
