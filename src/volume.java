import java.util.*;
public class volume {




    public static double volumebox(double l,double w,double h){
         double box = l * w * h;
         return box;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextInt();
        double w = sc.nextInt();
        double h = sc.nextInt();
        double vol = volumebox(l,w,h);
        System.out.println("THE VOLUME IS = "+ vol);
    }

}



