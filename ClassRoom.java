public class ClassRoom {
    public static void main(String... args){
        Wilder sandra = new Wilder("Sandra", true);
        Wilder eric = new Wilder("Eric", false);

        System.out.println(sandra.whoAmI());
        System.out.println(eric.whoAmI());
    }
}
