import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EventLoopTest {

    @Test public void shouldGetLibraryVersion() {
        EventLoop lib = new EventLoop("./lib");

        assertThat(lib.version(), is("1.6.1"));
    }
}
