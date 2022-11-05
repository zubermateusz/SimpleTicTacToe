import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int hBus = scanner.nextInt();
        int countBus = scanner.nextInt();
        boolean crash = false;
        int bridge = 1;
        for (; bridge <= countBus; bridge++){
            if(hBus >= scanner.nextInt()) {crash = true; break;}
        }
        if (crash) {
            System.out.println("Will crash on bridge " + bridge);
        } else {
            System.out.println("Will not crash");
        }

    }
}