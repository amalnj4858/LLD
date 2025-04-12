package DecoratorPattern;

public class SpeedVideoPlayerDecorator extends VideoPlayerDecorator {
    public SpeedVideoPlayerDecorator(VideoPlayer videoPlayer) {
        super(videoPlayer);
    }

    @Override
    public void playVideo() {
        System.out.println("playing video at : " + (videoPlayer.getSpeed() + 1) + "x speed");
    }
}
