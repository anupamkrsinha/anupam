import java.io.*;


class Square_Cube {
    public static void main(String args[]) throws IOException
    {   
        System.out.println("Enter a Number : ");
        int sq, cube;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        sq = num * num ;
        cube = num * num * num;
        System.out.println("Square of " + num + " is = "+ sq );
        System.out.println("Cube of " + num + " is = "+ cube );


    }
}