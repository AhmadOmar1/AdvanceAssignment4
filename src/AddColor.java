import java.util.Map;
public class AddColor {
    static ColorStore colorStore = ColorStore.getInstance();
 public static void addColor(String colorName, int red, int green, int blue){
     try{
         int count = 0;
         if(Validation.isValidRGB(red) && Validation.isValidRGB(green) &&Validation.isValidRGB(blue)) {
             for (Map.Entry<String, Color> set : colorStore.colors.entrySet()) {
                 if (set.getValue().getRed()== red && set.getValue().getGreen()== green && set.getValue().getBlue()== blue) {
                          count ++;
                 }
             }
              if(count > 0) {
              throw new IllegalArgumentException("color already exist");
         }
              else{
                  colorStore.colors.put(colorName, Color.createRGB(red, green, blue));
              }
         }
         else throw new IllegalArgumentException("InValid Value for the Color out of Range");
     } catch(Exception e){
         System.out.println(e.getMessage());
     }
 }
}