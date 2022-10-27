import java.util.Map;

public class PrintColor{

    public static void print() {
        System.out.println("Printing all Colors in Cache");
        for (Map.Entry<String, Color> set : ColorStore.colors.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
            }
    }
}
