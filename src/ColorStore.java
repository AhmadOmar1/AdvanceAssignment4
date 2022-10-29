
import java.util.HashMap;
import java.util.Map;
public final class ColorStore {
    public final static HashMap<String, Color> colors = new HashMap<>();
    private static ColorStore instance = null;

    public static ColorStore getInstance() {
        if(instance == null) {
            instance = new ColorStore();
        }
        return instance;
    }
    private ColorStore() {
    }

    static {
        System.out.println("I am being run at static block");
        Color red =  Color.createRGB(255,0,0);
        colors.put("Red", red);
        colors.put("Green",  Color.createRGB(0,255,0));
        colors.put("Blue",  Color.createRGB(0,0,255));
        colors.put("White",  Color.createRGB(255,255,255));
        colors.put("Black",  Color.createRGB(0,0,0));
    }
    public static Color getColor(int red, int green , int blue) {
        for (Map.Entry<String, Color> set : ColorStore.colors.entrySet())
        {
            if (set.getValue().getRed() == red && set.getValue().getGreen() == green && set.getValue().getBlue() == blue)
            {
              return  set.getValue().clone();
            }
        }
return null;
    }



}