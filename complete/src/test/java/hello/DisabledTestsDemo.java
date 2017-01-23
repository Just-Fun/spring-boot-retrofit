package hello;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
/**
 * Created by Serzh on 1/23/17.
 */

class DisabledTestsDemo {

    @Disabled
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}
