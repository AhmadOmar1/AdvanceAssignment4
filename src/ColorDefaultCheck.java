import java.util.Map;

public class ColorDefaultCheck {


    public static String check(Color color) {
        for (Map.Entry<String, Color> set : ColorStore.colors.entrySet()) {
            if (set.getValue().equals(color)) {
                for (DefaultColors dColor : DefaultColors.values()) {
                    if (set.getKey().equals(dColor)) {
                        return ("The Default color is :" + set.getKey());
                    }
                }
            }
        }
return ("The RGB color is : " + color.getRed()  + "," + color.getGreen() + "," + color.getBlue());
    }
}
