public class One {
    private String instrumentName;

    public One(String name, int string) {
        instrumentName = name;
    }

    public void playMusic() {
        System.out.println("Граємо на " + instrumentName);
    }

    public void adjustVolume(int volumeLevel) {
        System.out.println("Встановлено гучність на рівень " + volumeLevel);
    }
}