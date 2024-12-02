import java.util.Scanner;

public class MainTextHandler {

    public static void main(String[] args) {
        MainTextHandler handler = new MainTextHandler();
        handler.run();
    }

    private TextCounter counter = new TextCounter();

    public void run() {
        System.out.println("Skriv in text (skriv 'stop' för att avsluta):");
        readInput();

        System.out.println("Statistik:");
        System.out.println("Totalt antal tecken: " + counter.getTotalChars());
        System.out.println("Totalt antal rader: " + counter.getTotalLines());
        System.out.println("Totalt antal ord: " + counter.getTotalWords());
        System.out.println("Längsta ordet: " + counter.getLongestWord());
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (counter.shouldStop(line)) { // Kontrollera stoppvillkoret
                break;
            }
            counter.count(line);
        }
    }
}
