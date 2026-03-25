interface FI {



    int lengthOfWord(String word);
}


class FIimpl implements FI {

    public int lengthOfWord(String word) {
        return word.length();
    }
}


public class LaunchLambda2 {
    static void main(String[] args) {

//        FI f1 = new FIimpl();
//
//        System.out.println(f1.lengthOfWord("test"));


//        FI f1 = new FI() {
//            public int lengthOfWord(String word) {
//                return word.length();
//            }
//        };
//
//        System.out.println(f1.lengthOfWord("test"));


        FI f = word -> word.length();

        System.out.println(f.lengthOfWord("test"));
    }
}
