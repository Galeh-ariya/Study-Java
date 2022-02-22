public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //tipe data bukan primitif
        //Byte, Short, Integer, Long, Float
        //Double, Character, Boolean

        int primitif = 30; //primitif
        Integer nonPrimitif = 30; // bukan Primitif


        //konversi dari primitif ke bukan primitif
        int umur = 19;
        Integer umurNonPrimitif = umur;

        //konversi dari bukan primitif ke primitif
        Integer old = 10;
        short primitifShort = old.shortValue();

    }
}
