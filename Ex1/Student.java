
class Student {

    public int idNumber[];

    public Student() {
        idNumber = new int[5];
        idNumber[0] = 2;
        idNumber[1] = 130;
        idNumber[2] = 14;
        idNumber[3] = 55;
        idNumber[4] = 80;
    }

    public void Sort() {
        for (int i = 0; i < idNumber.length; i++) {
            int min = idNumber[i];
            int I = i;
            for (int j = i + 1; j < idNumber.length; j++)
                if (idNumber[j] < min) {
                    min = idNumber[j];
                    I = j;
                }
            if (i != I) {
                int swap = idNumber[i];
                idNumber[i] = idNumber[I];
                idNumber[I] = swap;
            }
        }
    }

    public void Print() {
        for (int i = 0; i < idNumber.length; i++) {
            System.out.println(idNumber[i]);
        }
    }
}
