import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        while (scanner.hasNext()) {
            int liczba = scanner.nextInt();
            if (liczba == 0) {
                System.out.println(sum); 
                break;
            }
            sum += liczba;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}
