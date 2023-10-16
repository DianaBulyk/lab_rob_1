
public class Main {

    public static void main(String[] args) {
        One guitar = new One("гітара",6);
        Two drums = new Two("барабани", 5);
        Three saxophone = new Three("саксофон", "альт");

        guitar.playMusic();
        guitar.adjustVolume(7);

        drums.playRhythm();
        drums.changeTempo(120);
        drums.adjustPitch(440.0);

        saxophone.playSaxophone();
        saxophone.adjustTone("високий");
    }
}

