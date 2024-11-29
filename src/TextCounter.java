public class TextCounter {
    private int totalChars = 0;
    private int totalLines = 0;
    private int totalWords = 0;

    public void count(String line) {
        totalChars += line.length(); // Lägg till antal tecken i raden
        totalLines++; // Räkna alla rader, även tomma
        if (!line.isBlank()) { // Om raden inte är tom
            totalWords += line.trim().split("\\s+").length; // Räkna antal ord
        }
    }

    public int getTotalChars() {
        return totalChars;
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalWords() {
        return totalWords;
    }
}
