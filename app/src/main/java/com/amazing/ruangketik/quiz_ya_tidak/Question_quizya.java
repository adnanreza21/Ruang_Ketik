package com.amazing.ruangketik.quiz_ya_tidak;

public class Question_quizya { public String mQuestions[] = {

        "1. Gambar dibawah merupakan posisi yang benar saat mengetik 10 jari...",
        "2. Gambar dibawah merupakan posisi tangan yang benar pada mouse...",
        "3. Gambar dibawah merupakan posisi tangan pada keyboard yang benar saat mengetik 10 jari...",
        "4. Gambar dibawah merupakan posisi yang benar mengetik 10 jari pada bagian tangan kiri jari telunjuk menekan huruf E, D, C...",
        "5. Gambar dibawah merupakan posisi yang benar mengetik 10 jari pada bagian tangan kanan jari kelingking menekan tanda titik koma, dan slash...",
};

    private String mChoices[][] = {

            {"a. Ya","b. Tidak"},
            {"a. Ya","b. Tidak"},
            {"a. Ya","b. Tidak"},
            {"a. Ya","b. Tidak"},
            {"a. Ya","b. Tidak"},

    };
    private String mCorrectAnswer[] = {

            "b. Tidak",
            "b. Tidak",
            "a. Ya",
            "b. Tidak",
            "a. Ya",

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

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

