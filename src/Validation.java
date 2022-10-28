public class Validation {
    public static boolean isValidRGB(int value) {

            if (value < 0 || value > 255 )
            {
                return false;
            }
         return  true;

    }
}