public class LaunchLoop2 {
    public static void main(String[] args) {
//        for (int k=1; k<=5; k++) {
//            for (int i = 1; i <= 5; i++)
//                if ((k>1 && k<5) && (i>1 && i<5))
//                    System.out.print("  ");
//                else
//                    System.out.print("* ");
//            System.out.println();
//        }

//        for (int k=1; k<=5; k++) {
//            for (int i = 1; i <= 5; i++)
//                if ((k>1 && k<5) && i>1)
//                    System.out.print("  ");
//                else
//                    System.out.print("* ");
//            System.out.println();
//        }

        for (int k=1; k<=5; k++) {
            for (int i = 1; i <= 5; i++)
                if ((k==2 || k==4) && i>1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            System.out.println();
        }
    }

}
