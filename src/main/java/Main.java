public class Main {

    public static void main(String[] args) {
        String version = new EventLoop().version();
        System.out.printf(">>> loaded libuv version %s\n", version);
    }
}
