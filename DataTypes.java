public class DataTypes {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNUmber = 20000; // -32768 to 32767
        int anInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -922337203685477580 to 9223372036854775807

        // decimal types
        double aDouble = 1.79769313;
        float aFloat = 3.4028F;

        // booleans
        boolean isWeekend = true;
        boolean isWorkday = false;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println("This is the copy right symbol: " + copyrightSymbol);
    }
}