import java.util.Map;
public class ColorDefaultCheck {
    static ColorStore colorStore = ColorStore.getInstance();
    public static String check(Color color) {
        for (Map.Entry<String, Color> set : colorStore.colors.entrySet()) {
            if (set.getValue().getRed()== color.getRed() && set.getValue().getGreen()== color.getGreen() && set.getValue().getBlue()== color.getBlue()) {
                for (DefaultColors dColor : DefaultColors.values()) {
                    if (set.getKey().equals(dColor.name())) {
                        return ("The Default color is :" + set.getKey());
                    }
                }
            }
        }
return ("The RGB color is : " + color.getRed()  + "," + color.getGreen() + "," + color.getBlue());
    }
}
