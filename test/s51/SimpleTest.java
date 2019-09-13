package s51;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import s051.Simple;

class SimpleTest {
    private Simple simple;

    @BeforeEach
    public void init() {
        simple = new Simple();
    }

    @Test
    public void negatePositive() {
        int value = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(-42));
    }
}
