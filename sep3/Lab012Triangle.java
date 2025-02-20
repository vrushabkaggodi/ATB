package sep3;

public class Lab012Triangle {
    public static void main(String[] args) {

        int side1 = 7;
        int side2 = 5;
        int side3 = 7;

        if ( side1 == side2 && side2 == side3 ) {
            System.out.println("EQ");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("ISO");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
