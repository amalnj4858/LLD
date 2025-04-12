package DecoratorPattern;

public class QualityVideoPlayerDecorator extends VideoPlayerDecorator{
    public QualityVideoPlayerDecorator(VideoPlayer videoPlayer) {
        super(videoPlayer);
    }

    @Override
    public void playVideo() {
        System.out.println("playing video at : " + (videoPlayer.getQuality() + 180) + "p resolution");
    }
}
