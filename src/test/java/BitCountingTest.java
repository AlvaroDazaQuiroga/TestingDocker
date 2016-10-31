import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * {@inheritDoc BitCounting}.
 */
public class BitCountingTest {

    private static final int NUMBER_FIVE = 10;
    private static final int NUMBER_ONE = 1234;
    private static final int NUMBER_TWO = 4;
    private static final int NUMBER_THREE = 7;
    private static final int NUMBER_FOUR = 9;
    private static final int NUMBER_EXPECTED = 5;
    private static final int NUMBER_EXPECTED2 = 3;

    /**
     * Test the counting bits.
     */
    @Test
    public void testGame() {
        assertEquals(NUMBER_EXPECTED, BitCounting.countBits(NUMBER_ONE));
        assertEquals(1, BitCounting.countBits(NUMBER_TWO));
        assertEquals(NUMBER_EXPECTED2, BitCounting.countBits(NUMBER_THREE));
        assertEquals(2, BitCounting.countBits(NUMBER_FOUR));
        assertEquals(2, BitCounting.countBits(NUMBER_FIVE));
    }
}
