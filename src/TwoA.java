
public class TwoA {
    
    public static boolean isMultiple(int a, int b) {
	if ((b/a) == (int)(b/a)) //test taken from http://stackoverflow.com/a/5502595
	    return true;
	else return false;
    }//isMultiple
    
    public static boolean isOdd(int i) {
	if (i&1==0) //example from http://stackoverflow.com/a/7342273
	    return true;
	else return false;
    }//isOdd
    
    public static int oddSumTo(int n) {
	int total=0;
	for (int i = 1; i < n; i+=2) {
	    total+=i;
	    return total;
	}//for
    }//oddSumTo
    
    public static boolean isOddProd(int[] ints) {
	int counter = 0;
	for (int i=0; i<(ints.length); i++) { //check to see how many of the numbers are odd
	    if (ints[i]%2!=0)
		counter++;
	}//for
	if (counter%2==0) //if an even number of them are odd, return true; if an odd number of them are odd, return false.
	    return false;
	else return true;
    }//isOddProd
    
    public static boolean allDistinct(int[] ints) {
	for (int current=0; current<(ints.length); current++) {
	    for (int i=current+1; i<ints.length; i++) {
		if (ints[current]==ints[i])
		    return false;
	    }//i for
	}//current for
	return true;
    }//allDistinct
    
    public static int[] reverseInts(int[] ints) {
	for (int i=0; i<(ints.length/2); i++) { //based off http://stackoverflow.com/a/2137791
	    int temp=ints[i];
	    ints[i]=ints[ints.length-i-1];
	    ints[ints.length-i-1]=temp;
	}//for
	return ints;
    }//reverseInts
}//TwoA