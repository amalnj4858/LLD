package DecoratorPattern;

public abstract class VideoPlayerDecorator implements VideoPlayerInterface {
    protected VideoPlayer videoPlayer;

    public VideoPlayerDecorator(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void playVideo() {}

}
