


import java.util.HashMap;

public class ColorStore {

    public final static HashMap<String, Color> colors = new HashMap<>();

    static {
        System.out.println("I am being run at static block");
        Color red =  Color.createColor(255,0,0);
        colors.put("Red", red);
        colors.put("Green",  Color.createColor(0,255,0));
        colors.put("Blue",  Color.createColor(0,0,255));
        colors.put("White",  Color.createColor(0,0,0));
        colors.put("Black",  Color.createColor(255,255,255));
    }

    public static Color getCopy(String color){
        Color original = colors.get(color);// prototype
        Color copy =  (Color)original.clone();// copy from prototype
        return copy;
    }


}