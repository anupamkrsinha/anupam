// Write a program in java to compare three number and find the 
// largest among them.

class Largestnum{
    public static void main (String args[]){
        int a = 53, b = 97, c = 9;
        if (a > b && a > c)
            System.out.println( a + " is the greatest");
        if (b > c && b > a)
            System.out.println( b + " is the greatest");
        if (c > a && c > b)
            System.out.println( c + " is the greatest");



    }
}