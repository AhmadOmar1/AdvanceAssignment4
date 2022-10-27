public class Validation {
    public static int isValidRGB(int value) {

            if (value < 0 || value > 255 )
            {
                throw new IllegalArgumentException("InValid Value for the Color out of Range");
            }
         return  value;

    }
}