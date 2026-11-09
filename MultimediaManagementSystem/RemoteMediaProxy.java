public class RemoteMediaProxy implements MediaItem {
    private RealMedia realMedia;
    private boolean isConnected = false;

    public RemoteMediaProxy(RealMedia realMedia) {
        this.realMedia = realMedia;
    }

    private void checkConnection() {
        if (!isConnected) {
            System.out.println("Establishing remote connection...");
            isConnected = true;
        }
    }

    @Override
    public String getTitle() {
        checkConnection();
        return realMedia.getTitle();
    }

    @Override
    public int getDuration() {
        checkConnection();
        return realMedia.getDuration();
    }

    @Override
    public void play() {
        checkConnection();
        realMedia.play();
    }
}
