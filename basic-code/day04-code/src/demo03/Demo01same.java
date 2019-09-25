package demo03;

public class Demo01same {
    public static void main(String[] args) {
        System.out.println(isSame(2,3));
        System.out.println(isSame(20,20));
    }
    public static boolean isSame(int a,int b){
//        if (a == b){
//            same = True;
//        }else{
//            same = False;
//        }
        boolean same = a == b;
        return same;
    }
}
