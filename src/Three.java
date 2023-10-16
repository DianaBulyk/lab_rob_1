public class Three {
    private String instrumentName;// Ніяк не використовуєтьяс, однак може бути, оскікьки чисто гіпотетично у майбутньому може бути використаний і має хоч якусь логіку
    private String saxType;

    public Three(String name, String type) {
        instrumentName = name;
        saxType = type;
    }

    public void playSaxophone() {
        System.out.println("Граємо на саксофоні " + saxType);
    }

    public void adjustTone(String tone) {
        System.out.println("Змінено тембр на " + tone);
    }
}
