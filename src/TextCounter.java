public class TextCounter {
    private int totalChars = 0;
    private int totalLines = 0;
    private int totalWords = 0;
    private String longestWord = "";

    public void count(String line) {
        totalLines++;
        totalChars += line.length();

        String[] words = line.split("\\s+"); // Dela upp texten i ord
        totalWords += words.length;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    public boolean shouldStop(String line) {
        return line.equalsIgnoreCase("stop"); // Kontrollera om raden är "stop"
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

    public String getLongestWord() {
        return longestWord;
    }
}
