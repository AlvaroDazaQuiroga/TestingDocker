/**
 * It counts the bits of a binary number.
 */
final class BitCounting {
    /**
     * Constructor.
     */
    private BitCounting() {
    }

    /**
     * Convert a int to binary and count the bits.
     *
     * @param n Int the number to convert.
     * @return Int  whit tne number of bits.
     */
    static int countBits(final int n) {
        return Integer.bitCount(n);
    }

}
