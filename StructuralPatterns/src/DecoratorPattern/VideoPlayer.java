package DecoratorPattern;

public class VideoPlayer implements VideoPlayerInterface{
    private int speed;
    private int quality;

    public VideoPlayer(int speed, int quality) {
        this.speed = speed;
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video with speed: " + speed + " and quality: " + quality);
    }
}
