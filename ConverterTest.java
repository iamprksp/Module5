package homework;

public class ConverterTest {

    private final DollarConverter converter = new DollarConv();

    @Test
    @DisplayName("Convert $100 to €92")
    public void testDollarsToEurosHundred() {
        double result = converter.dollarsToEuros(100.0);
        assertEquals(92.0, result, 0.01, "$100 should convert to €92 with rate 0.92");
    }

    @Test
    @DisplayName("Convert $0 to €0")
    public void testDollarsToEurosZero() {
        double result = converter.dollarsToEuros(0.0);
        assertEquals(0.0, result, 0.01, "$0 should convert to €0");
    }

    @Test
    @DisplayName("Throw exception for negative dollar amount")
    public void testNegativeDollars() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.dollarsToEuros(-50.0);
        });
        assertEquals("Amount in dollars cannot be negative", exception.getMessage());
    }
}

/*
The first test, testDollarsToEurosHundred, verifies the core functionality: converting $100 to euros. With a rate of 0.92, the expected result is €92
The assertEquals method checks this, using a delta of 0.01 to account for potential floating-point rounding errors
The third test, testNegativeDollars, validates error handling. 
It passes -50.0 to the method, expecting an IllegalArgumentException. 
The assertThrows method captures the exception, and assertEquals checks that the message matches "Amount in dollars cannot be negative.
The tests isolate the CurrencyConverter’s behavior, focusing solely on its logic without external dependencies

*/