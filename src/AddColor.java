public class AddColor {
 public static void addColor(String colorName, int red, int green, int blue){

     try{
         ColorStore.colors.put(colorName ,Color.createColor(red,green,blue));

     } catch(Exception e){
         System.out.println(e.getMessage());
     }
 }
}