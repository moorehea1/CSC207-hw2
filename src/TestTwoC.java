
public class TestTwoC {

    @Test
    void test_numerator(void) {
	assertEquals("Zero", 0, TwoC.numerator(0));
	//The numerator of zero is zero
	for (i=1; i<1000; i++)
	    assertEquals("Positive", i, TwoC.numerator(i));
	for (i=-1; i>-1000; i--)
	    assertEquals("Negative", i, TwoC.numerator(i));
	//The numerator of any whole number is itself.
	assertEquals("Sample positive numerator", 2, TwoC.numerator(2/3));
	assertEquals("Sample negative numerator", -2, TwoC.numerator(-2/3)); //depending on how this is implemented, it may not work correctly
    } //test_numerator
    
    @Test
    void test_denominator(void) {
	assertEquals("Zero", NULL, TwoC.denominator(0));
	//Nothing can be divided by zero, not even zero
	for (i=1; i<1000; i++)
	    assertEquals("Positive", 1, TwoC.numerator(i));
	for (i=-1; i>-1000; i--)
	    assertEquals("Negative", 1, TwoC.numerator(i));
	//The denominator of any whole number is 1.
	assertEquals("Sample positive denominator", 3, TwoC.denominator(2/3));
	assertEquals("Sample negative denominator", -3, TwoC.denominator(2/-3)); //depending on how this is implemented, it may not work correctly
    } //test_denominator
    
    @Test
    void test_inverse(void) {
	assertEquals("Sample positive inverse", 3/2, TwoC.inverse(2/3));
	assertEquals("Sample negative inverse", 3/-2, TwoC.inverse(-2/3));
	for (i=1; i<1000; i++)
	    assertEquals("Positive whole number", 1/i, TwoC.inverse(i));
	for (i=-1;i>-1000;i--)
	    assertEquals("Negative whole number", 1/-i, TwoC.inverse(-i));
    } //test_inverse
    
    @Test
    void test_absolute(void) {
	for (i=1; i<1000; i++)
	    assertEquals("Positive absolute", i, TwoC.absolute(i));
	for (i=-1;i>-1000;i--)
	    assertEquals("Negative absolute", -i, TwoC.absolute(i));
	//The negative of a negative is a positive
    } //test_absolute
    
    @Test
    void test_multiply(void) {
	
    } //test_multiply
    
    @Test
    void test_divide(void) {
	
    } //test_divide
    
    @Test
    void test_roundUp(void) {
	
    } //test_roundUp
    
    @Test
    void test_roundDown(void) {
	
    } //test_roundDown
    
    @Test
    void test_simplify(void) {
	
    } //test_simplify
    
} //TestTwoC
