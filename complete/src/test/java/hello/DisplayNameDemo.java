package hello;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Created by Serzh on 1/22/17.
 */

@DisplayName("A special test case")
class DisplayNameDemo {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
//    @DisplayName("😱")
    @DisplayName("ʕ•ᴥ•ʔ")
//    @DisplayName("(ᵔᴥᵔ)")
    void testWithDisplayNameContainingEmoji() throws IOException {
    }

}