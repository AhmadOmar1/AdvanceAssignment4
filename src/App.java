import java.util.Scanner;




public class App {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int red;
           int green;
           int blue;
           String colorName;
           boolean flag = true;
        int check;
        while(flag){
          PrintMenu.menu();
           check = sc.nextInt();

          switch(check){
              case 1:
              {
                  System.out.println("Enter Color name :");
                  colorName = sc.next();
                  System.out.println("Enter Color Values (Red,Green,Blue): ");
                  red = sc.nextInt();
                  green = sc.nextInt();
                  blue = sc.nextInt();
                  AddColor.addColor(colorName,red,green,blue);
                  break;
              }
              case 2:
              {
                  System.out.println("Enter Color Values (Red,Green,Blue): ");
                  red = sc.nextInt();
                  green = sc.nextInt();
                  blue = sc.nextInt();
                  System.out.println(ColorDefaultCheck.check(Color.createColor(red,green,blue)));
                  break;
              }
              case 3:
              {
               PrintColor.print();
               break;
              }
              case 4:
                  System.exit(1);
                  flag = false;
                  break;

          }
        Color color = Color.createColor(255,0,0);
        //Color green =  Color.createColor(0,255,0);





      //  System.out.println("not found");

    }
    }
}