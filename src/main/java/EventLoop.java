import jnr.ffi.LibraryLoader;

/**
 * Created by sraguram on 28/07/2015.
 */
public class EventLoop {
    private final LibUV libuv;

    @Deprecated /* only for testing */
    EventLoop(String libraryPath) {
        libuv = LibraryLoader.create(LibUV.class).search(libraryPath).load("uv");
    }

    public EventLoop() {
        this("");
    }

    public String version() {
        return libuv.uv_version_string();
    }

    public interface LibUV {
        String uv_version_string();
    }
}
