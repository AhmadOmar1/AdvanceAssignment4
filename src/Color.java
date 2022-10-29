
public final class Color implements Cloneable,IColor{
    private final int red;
    private final int green;
    private final int blue;
    private Color(int red, int green, int blue) {
        this.red =red;
        this.green = green;
        this.blue = blue;
    }
    static ColorStore colorStore = ColorStore.getInstance();
    public static Color createRGB(int red, int green, int blue) {
        String col = String.valueOf(RGBtoString(red, blue, green));
        if (colorStore.colors.containsValue(col)) {
            colorStore.getColor(red,green,blue);
        }
       return new Color(red,  green,  blue);
    }
        static {
        System.out.println("I am scanning Color class");
    }
    public static Color RGBtoString(int red, int blue , int green) {

  return new Color(red,green,blue);
    }
    public int getRed() {return red;}
    public int getGreen() {
        return green;
    }
    public int getBlue() {
        return blue;
    }
    @Override
    public String toString(){
        return this.red + ", " + this.green + " ," + this.blue;
    }
    @Override
    public Color clone(){
        Color object = null;
        try {
             object = (Color) super.clone();
        } catch (CloneNotSupportedException e){
            System.err.println(e.getMessage());
        }
        return object;
    }
}