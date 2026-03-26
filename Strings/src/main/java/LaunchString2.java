public class LaunchString2 {
    public static void main(String[] args) {
        String str = "RajaRamMohanRoy";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.charAt(4));

        System.out.println(str.endsWith("Roy"));
        System.out.println(str.endsWith("Mohan"));

        System.out.println(str.startsWith("R"));
        System.out.println(str.length());

        char []c = str.toCharArray();

        for(char i:c)
        {
            System.out.println(i);
        }

        System.out.println(str.substring(0,4));
        System.out.println(str.substring(4));

        System.out.println(str.toLowerCase().substring(4).length());
    }
}
