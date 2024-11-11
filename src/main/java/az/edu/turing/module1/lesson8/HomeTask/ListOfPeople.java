package az.edu.turing.module1.lesson8.HomeTask;

import java.util.Random;

public class ListOfPeople {
    public static void main(String[] args) {
        String[][] people = {
                {"Ibrahim", "Alakbarov"},
                {"Serxan", "Babayev"},
                {"Ramil", "Musazade"},
                {"Huseyn", "Hasanzade"},
                {"Vusal", "Atashov"},
                {"Nihad", "Rasulov"},
                {"Nicat", "Mazanli"},
                {"Revan", "Agayev"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"},
                {"Ibrahim", "Alakbarov"}
        };

        int[] seatsNumber = new int[20];
        for (int i = 0; i < seatsNumber.length; i++) {
            //0dan basladigina gore 1 artiririq cunki 0ci yer yoxdu 1den baslamalidi
            seatsNumber[i] = i + 1;
        }

        getNumberOfSeat(seatsNumber);

        //output hisse
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i][0] + " " + people[i][1] + " --> Seat: " + seatsNumber[i]);
        }
    }

    //oturacaqlarin nomresi
    public static void getNumberOfSeat(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {

            //nomreler eyni olmasin deye

            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
