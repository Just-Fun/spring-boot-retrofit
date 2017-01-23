package hello;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
/**
 * Created by Serzh on 1/23/17.
 */

@Tag("fast")
@Tag("model")
class TaggingDemo {

    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }

}
