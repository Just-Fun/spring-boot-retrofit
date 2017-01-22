package hello;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by Serzh on 1/22/17.
 */
public class MyTest {

    @Test(expected = IOException.class)
    public void testCreateTempFile() throws IOException {
        Path tmpDir = Files.createTempDirectory("tmp");
        tmpDir.toFile().delete();
        Path tmpFile = Files.createTempFile(tmpDir, "test", ".txt");
    }

    @Test
    public void testCreateTempFile2() throws IOException {
        Path tmpDir = Files.createTempDirectory("tmp");
        tmpDir.toFile().delete();
        try {
            Path tmpFile = Files.createTempFile(tmpDir, "test", ".txt");
            Assert.fail("Expected IOException");
        } catch (IOException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCreateTempFile3() throws IOException {
        Path tmpDir = Files.createTempDirectory("tmp");
        tmpDir.toFile().delete();
        thrown.expect(IOException.class);
        thrown.expectMessage(not(equalTo("")));
        Path tmpFile = Files.createTempFile(tmpDir, "test", ".txt");
        thrown = ExpectedException.none();
    }

    @Test
    public void testCreateTempFile4() throws IOException {
        Path tmpDir = Files.createTempDirectory("tmp");
        tmpDir.toFile().delete();
        Throwable thrown = catchThrowable(() -> {
            Files.createTempFile(tmpDir, "test", ".txt");
        });
        assertThat(thrown).isInstanceOf(IOException.class);
//        assertThat(thrown.getMessage()).isNotBlank();
        assertThat(thrown.getMessage()).isNotEmpty();
    }

    @Test
    public void testCreateTempFile5() throws IOException {
        Path tmpDir = Files.createTempDirectory("tmp");
        tmpDir.toFile().delete();
        Throwable thrown = assertThrows(IOException.class, () -> {
            Files.createTempFile(tmpDir, "test", ".txt");
        });
        assertNotNull(thrown.getMessage());
    }
}
