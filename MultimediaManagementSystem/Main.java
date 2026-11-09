public class Main {
    public static void main(String[] args) {
        System.out.println("=== Remote Proxy ===");

        RealMedia remoteMedia = new RealMedia("Undertale OST", 180);
        MediaItem remoteProxy = new RemoteMediaProxy(remoteMedia);

        remoteProxy.getTitle();
        remoteProxy.getDuration();
        remoteProxy.play();
        remoteProxy.play();

        System.out.println("\n=== Virtual Proxy ===");

        MediaItem virtualProxy = new VirtualMediaProxy("Deltarune OST", 240);

        virtualProxy.getTitle();
        virtualProxy.getDuration();
        virtualProxy.play();
        virtualProxy.play();
    }
}
