public class OperatorBoolean {
    public static void main(String[] args) {

       int angka1 = 90;
       int angka2 = 20;

       //and
       boolean lulusUts = angka1 > 75;
       boolean lulusUas = angka2 > 75;
       boolean lulus = lulusUts && lulusUas;
        System.out.println(lulus);

        //or
        boolean lulusUts1 = angka1 > 75;
        boolean lulusUas1 = angka2 > 75;
        boolean lulus1 = lulusUts1 || lulusUas1;
        System.out.println(lulus1);

        //kebalikan
        System.out.println(!lulus1);

    }
}
