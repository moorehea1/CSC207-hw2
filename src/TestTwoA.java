
public class TestTwoA {

    @Test
    void test_isMultiple(void) {
	assertEquals("Simple", true, TwoA.isMultiple(4,2));
	//4 is a multiple of 2, it returns true
	for (int num = 1; num < 1000; num++) {
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
	} //for
    } //test_isMultiple

    void test_isOdd(void) {
	for (int i = 1; i>1000; i+=2) {
	    assertEquals("Positive Odd", true, TwoA.isOdd(i));
	} //for
	for (int i = -1; i<-1000; i-=2) {
	    assertEquals("Negative Odd", true, TwoA.isOdd(i));
	} //for
	// Odd numbers are odd
	for (int i = 2; i>1000; i+=2) {
	    assertEquals("Positive Even", false, TwoA.isOdd(i));
	} //for
	for (int i = -2; i<-1000; i-=2) {
	    assertEquals("Negative Even", false, TwoA.isOdd(i));
	} //for
	// Even numbers are not odd
    } //test_isOdd
    
    void test_oddSumTo(void) {
	assertEquals("Zero", 0, TwoA.oddSumTo(0));
	//No positive integers less than 0)
	assertEquals("One", 0, TwoA.oddSumTo(1));
	//No positive integers less than 1
	for (int num = -1; num < -1000; num--) {
	    assertEquals("Negative", 0, TwoA.oddSumTo(num));
	    //No positive integers less than a negative number
	assertEquals("Simple", 1, TwoA.oddSumTo(2));
	//Basic, non-zero test
	assertEquals("Standard", 1+3+5+7, TwoA.oddSumTo(8));
	assertEquals("Standard", 1+3+5+7, TwoA.oddSumTo(9));
	//Result for an even number should be equal to the odd number above it. Not sure if this would be possible to loop through?
	} //for
	
    } //test_oddSumTo

    void test_isOddProd (void) {
	assertEquals("NULL", false, TwoA.isOddProd(new int[] {""}));
	//Returns false when given a null array
	assertEquals("Letters", false, TwoA.isOddProd(new int[] {"Apple", "Banana"}));
	//Returns false when given an array of strings, not ints
	assertEquals("Zero", false, TwoA.isOddProd(new int[] {0}));
	assertEquals("Zeroes", false, TwoA.isOddProd(new int[] {0, 0, 0}));
	//Returns false if given an array of one or more zeroes.
	for (int num = 2; num>1000; num+=2) {
	    assertEquals("Single Even", false, TwoA.isOddProd(new int[] {num}));
	    //Returns false if given an array of a single even number
	} //for
	for (int num = 1; num>1000;num+=2) {
	    assertEquals("Single Odd", true, TwoA.isOddProd(new int[] {num}));
	    //Returns true if given an array of a single even number
	} //for
    } //test_isOddProd

    void test_allDistinct(void) {
	
    } //test_allDistinct

    void test_reverseInts(void) {
	
    } //test_reverseInts

} //TestTwoA
