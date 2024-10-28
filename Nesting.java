public class Nesting {
    public static void main(String[] args) {
        outerLoop : for (int i=1; i <= 5; i++) {
            innerLoop : for (int j=1; j <= 5; j++){
                if(i==3)
                    continue outerLoop;
                if(j==3)
                    break innerLoop;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
