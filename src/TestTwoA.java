
public class TestTwoA {

    @Test
    void test_isMultiple(void) {
	assertEquals("Simple", true, TwoA.isMultiple(4,2));
	//4 is a multiple of 2, it returns true
	for (int num; num < 1000; num++) {
	    assertEquals("One", true, TwoA.isMultiple(num, 1));
	    //Every number should be a multiple of 1 (a==1*a)
	    assertEquals("Same Number", true, TwoA.isMultiple(num, num));
	    //Every number should be a multiple of itself (a==b*1)
	    assertEquals("Negative", false, TwoA.isMultiple(num, -1));
	    //Test isMultiple against a negative number
	    assertEquals("Number zero", false, TwoA.isMultiple(num, 0));
	    //No positive integers should be a multiple of 0
	    assertEquals("Multiple zero", false, TwoA.isMultiple(0,num));
	    //Zero should not be a multiple of any positive integer
	}
    } //test_isMultiple
    void
    void test_isOdd(void) {
	
    } //test_isOdd
    void
    void test_oddSumTo(void) {
	
    } //test_oddSumTo
    void
    void test_isOddProd (void) {
	
    } //test_isOddProd
    void
    void test_allDistinct(void) {
	
    } //test_allDistinct
    void
    void test_reverseInts(void) {
	
    } //test_reverseInts
    void
} //TestTwoA
