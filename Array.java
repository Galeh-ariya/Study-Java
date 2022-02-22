public class Array {
    public static void main(String[] args) {

        //Cara Membuat Array
        //cara 1
        String[] name;
        name = new String[10];
        name[0] = "Galeh";

//        cara 2
        int[] umur = new int[] {
                2, 4, 9, 10, 30
        };
//        System.out.println(umur[5]);

        //cara 3
        String[] mahasiswa = {
           "Galeh", "Ibad", "Yuliana"
        };

        System.out.println(mahasiswa[1]); //mengambil
         var result = mahasiswa[0] = "Ariya"; //mengubah
        System.out.println(mahasiswa.length); //mengambil panjang array


        String[][] data = {
                {
                    "Galeh", "Ariya", "Irwana"
                },

                {
                    "Ibaddurrohman", "Yuliana", "Budi"
                }
        };

        //cara mengambil data
//        cara pertama
        String[] hasil = data[0];
        System.out.println(hasil[1]);

        //cara ke2
        System.out.println(data[1][1]);







    }
}
