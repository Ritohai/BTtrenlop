package ra;

public class VideoPlayer implements IPlayable{
    @Override
    public void play(String s) {
        System.out.println("Video run + "+s);
    }


}
