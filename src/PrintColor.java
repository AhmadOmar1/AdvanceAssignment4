import java.util.Map;

public class PrintColor{

    static ColorStore colorStore = ColorStore.getInstance();

    public static void print() {
        System.out.println("Printing all Colors in Cache");
        for (Map.Entry<String, Color> set : colorStore.colors.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
            }
    }
}
