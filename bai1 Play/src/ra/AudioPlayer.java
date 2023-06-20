package ra;

public class AudioPlayer implements IPlayable{
    @Override
    public void play(String s) {
        System.out.println("Audio run + "+s);
    }
}
