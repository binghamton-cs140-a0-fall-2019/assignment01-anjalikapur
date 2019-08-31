package assignment01;
// Write a class SimpleDate, which has 3 int fields, year, month, day
//
// Provide a method
//
// public static SimpleDate of(int yr, int m, int d)
// which first creates a SimpleDate object: var returnValue = new SimpleDate();
// and then sets returnValue.year = yr; and similarly for month and day. After that return returnValue;
//
// Now write a method
//
// public boolean before(SimpleDate other)
// which returns true if this SimpleDate is temporally before other and false otherwise.
//
// Write a class SimpleDateTester.java that checks that the method before works.

public class SimpleDate{
    public static SimpleDate of(int yr, int m, int d){
        private String returnValue;
        var returnValue = new SimpleDate();

        returnValue.year = yr;
        returnValue.month = m;
        returnValue.day = d;

        return returnValue;
    }

    public boolean before(SimpleDate other){
        if (returnValue < other.returnValue){
            return true;
        }
        return false;
    }
}
