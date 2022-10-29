package be.intecbrussel.pracStuff.oefening1;

public class Oefening1 {
    public static void main(String[] args) {

        int [] studentPoint = {1,5,6, -9, 77 ,110, -4, 3, 10, 2};

        for (int x = 0; x < studentPoint.length; x++){
            if (studentPoint[x] > 0 && studentPoint[x] <= 3) {
                System.out.print(studentPoint[x] * 3 + " ");
            } else if (studentPoint[x] >3 && studentPoint[x] <=10) {
                System.out.print(studentPoint[x] + " ");
            } else if (studentPoint[x] >= 10) {
                System.out.print(studentPoint[x] / 11 + " ");
            } else if (studentPoint[x] < 0) {
                System.out.print(studentPoint[x] * -1 + " ");
            }
        }
    }
}
