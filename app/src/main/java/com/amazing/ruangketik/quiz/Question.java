package com.amazing.ruangketik.quiz;

public class Question {
    public String mQuestions[] = {
            "1. Sebuah proses dalam mengetik dalam teori jari dan keserempakan hentakan pada papan ketik yang menghasilkan teks atau angka atau simbol dengan rapi, cepat, dan tepat sesuai dengan mata tanpa melihat keyboard disebut...",
            "2. Terdapat...metode latihan mengetik 10 jari",
            "3. Program typing master pro, rypid typing, piano typing tutor merupakansalah satu metode latihan mengetik 10 jari menggunakan...",
            "4. Permainan dengan konsep para hiu yang harus dibunuh dengan cara mengetikan huruf yang tertera di badannya merupakan permainan yang bisa digunakan dalam mengetik cepat yang menyenangkan disebut dengan...",
            "5. Memperhatikan penggunaan jari pada tuts keyboard merupakan metode latihan...",
            "6. Dalam mengetik 10 jari, maka jari kelingking kiri berfungsi mengetik huruf...",
            "7. Dalam mengetik 10 jari, maka jari tengah kiri berfungsi mengetik huruf...",
            "8. Dalam mengetik 10 jari, maka jari telunjuk kanan berfungsi mengetik huruf...",
            "9. Dalam mengetik 10 jari, maka jari telunjuk kiri berfungsi mengetik huruf...",
            "10. Dalam mengetik 10 jari, maka jari manis kanan berfungsi mengetik huruf...",
            "11. Dalam mengetik 10 jari, maka jari manis kiri berfungsi mengetik huruf...",
            "12. Dalam mengetik 10 jari, maka jari tengah kanan berfungsi mengetik huruf...",
            "13. Dibawah ini yang termasuk kekurangan dari mengetik sepuluh jari, kecuali...",
            "14. Dibawah ini yang termasuk  kelebihan dari mengetik sepuluh jari, kecuali...",
            "15. Suatu sistem mengetik dengan sistem buta, artinya kita hanya melihat tulisan yang akan diketik dan tangan bekerja sendiri menggunakan insting kita tanpa mata melihat ke arah keyboard atau tuts, sekalipun kita melihat hanya sekali saja, tidak full kita harus melihat keyboaradnya, pengertian dari...",

    };

    private String mChoices[][] = {

            {"a. Penempatan jari pengetikan","b. Mengetik cepat","c. Dasar mengetik","d. Mengetik 10 jari blind system","e. Pengetikan"},
            {"a. 2","b. 3","c. 4","d. 5","e. 6"},
            {"a. Manual","b. Bantuan situs internet","c. Mengetik yang menyenangkan","d. Program atau aplikasi","e. Online"},
            {"a. Type shark","b. Typing infander game","c. TIPP 10","d. Typing tutor","e. Type fish"},
            {"a. Latihan menggunakan program","b. Latihan menggunakan aplikasi","c. Latihan dengan bantuan situs internet","d. Latihan mengetik cepat yang menyenangkan","e. Latihan manual"},

            {"a. Space dan Alt.","b. R, F, T, V, G, B, Y dan angka 4, 5, 6.","c. A, Q, Z dan angka 1 dan tombol Shift, Tab, CapsLock.","d. W, S, X dan angka 2.","e. E, D, C dan angka 3."},
            {"a. Space dan Alt.","b. R, F, T, V, G, B, Y dan angka 4, 5, 6.","c. A, Q, Z dan angka 1 dan tombol Shift, Tab, CapsLock.","d. W, S, X dan angka 2.","e. E, D, C dan angka 3."},
            {"a. Y, U, H, J, B, N, M dan angka 6, 7.","b. I, K, tanda koma dan angka 8","c. L, O, tanda titik dan angka 9.","d. P, tanda titik koma dan tanda slash.","e. Space dan Alt."},
            {"a. Space dan Alt.","b. R, F, T, V, G, B, Y dan angka 4, 5, 6.","c. A, Q, Z dan angka 1 dan tombol Shift, Tab, CapsLock.","d. W, S, X dan angka 2.","e. E, D, C dan angka 3."},
            {"a. Y, U, H, J, B, N, M dan angka 6, 7.","b. I, K, tanda koma dan angka 8","c. L, O, tanda titik dan angka 9.","d. P, tanda titik koma dan tanda slash.","e. Space dan Alt."},

            {"a. Space dan Alt.","b. R, F, T, V, G, B, Y dan angka 4, 5, 6.","c. A, Q, Z dan angka 1 dan tombol Shift, Tab, CapsLock.","d. W, S, X dan angka 2.","e. E, D, C dan angka 3."},
            {"a. Y, U, H, J, B, N, M dan angka 6, 7.","b. I, K, tanda koma dan angka 8","c. L, O, tanda titik dan angka 9.","d. P, tanda titik koma dan tanda slash.","e. Space dan Alt."},
            {"a. Mengetik dengan sistem sepuluh jari akan lebih cepat daripada menulis tangan","b. Tidak dapat melihat angka dengan teratur","c. Kesalahan pengetikan tidak dapat langsung diketahui oleh si pengetik karena si pengetik menggunakan instingnya/gerakan refleksinya","d. Tidak dapat langsung bisa secara instan (harus selalu latihan)","e. Tangan mudah kecapekan"},
            {"a. Jari-jari tangan kita tidak akan mudah lelah karena adanya adanya pembagian tugas.","b. Tidak dapat melihat angka dengan teratur","c. Makin lama kecepatan mengetik akan semakin cepat secara bertahap (jika terlatih secara tertaur).","d. Mata tidak akan mudah lelah karena terfokus pada monitor atau pada naskah yang akan diketik saja.","e. Mengetik dengan sistem sepuluh jari akan lebih cepat daripada menulis tangan."},
            {"a. Teknik mengetik","b. Mengetik sepuluh jari","c. Pengetikan","d. Mengetik","e. Mengetik buta"},

    };
    private String mCorrectAnswer[] = {

            "b. Mengetik cepat",
            "c. 4",
            "d. Program atau aplikasi",
            "a. Type shark",
            "e. Latihan manual",

            "c. A, Q, Z dan angka 1 dan tombol Shift, Tab, CapsLock.",
            "e. E, D, C dan angka 3.",
            "a. Y, U, H, J, B, N, M dan angka 6, 7.",
            "b. R, F, T, V, G, B, Y dan angka 4, 5, 6.",
            "c. L, O, tanda titik dan angka 9.",

            "d. W, S, X dan angka 2.",
            "b. I, K, tanda koma dan angka 8",
            "a. Mengetik dengan sistem sepuluh jari akan lebih cepat daripada menulis tangan",
            "b. Tidak dapat melihat angka dengan teratur",
            "b. Mengetik sepuluh jari",

    };

    public int getLength() {
        return mQuestions.length;
    }

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getChoice5(int a) {
        String choice = mChoices[a][4];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

