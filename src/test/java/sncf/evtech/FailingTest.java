package sncf.evtech;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FailingTest {

    @Test
    public void starts_with_failing_test() {
        // Given

        // When

        // Then
        Assertions.fail("Toujours démarrer par un test en erreur !");
    }
}
