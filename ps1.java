package projecteuler;

public class ps1 {

    public static void main(String[] args) {
        int jum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                jum += i;
            }
        }
        System.out.println(jum);
    }

}
