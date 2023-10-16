public class Two {
    private String instrumentName;

    public Two(String name, int drums) {
        instrumentName = name;
    }

    public void playRhythm() {
        System.out.println("Відтворюємо ритм на " + instrumentName);
    }

    public void changeTempo(int tempo) {
        System.out.println("Змінено темп на " + tempo);
    }

    public void adjustPitch(double pitch) {
        System.out.println("Встановлено висоту тона на " + pitch);
    }
}
