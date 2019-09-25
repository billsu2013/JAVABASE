package demo04;

public class method1 {
    public static void main(String[] args) {


        int[] arrayD = {2,9,4,5,-7,8};
        int len = arrayD.length;
        for (int i = 0; i < (len/2); i++) {
            int a = arrayD[i];
            arrayD[i] = arrayD[len-1-i];
            arrayD[len-1-i] = a;

        }
        for (int i = 0; i < arrayD.length; i++) {
            System.out.println(arrayD[i]);
        }



    }

}
