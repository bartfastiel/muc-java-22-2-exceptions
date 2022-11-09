package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class AntonTest {

    @Test
    void expectAnException() {

        assertThrows(IOException.class, () -> {
            Anton.work();
        });
    }

    @Test
    void expectAnException2() {

        try {
            Anton.work();

            // schlecht: Exception ist nicht aufgetreten
            fail();

        } catch (IOException e) {
            // gut: Exception ist aufgetreten

        }
    }
}