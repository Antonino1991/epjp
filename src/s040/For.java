package s040;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Begin block loop " + i);

            if (i == 2) {
                continue;  //non viene eseguita l'istruzione successiva quando è verificato if
            }

            System.out.println("End block loop " + i);
        }
    }
}