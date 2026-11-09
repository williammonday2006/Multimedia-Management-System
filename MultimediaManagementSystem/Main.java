public class Main {
    public static void main(String[] args) {
        MediaItem proxy = new VirtualMediaProxy("Undertale OST", 180);

        System.out.println("Virtual Proxy created.");

        System.out.println("Title: " + proxy.getTitle());
        System.out.println("Duration: " + proxy.getDuration() + " seconds");

        proxy.play();
        proxy.play();
    }
}
