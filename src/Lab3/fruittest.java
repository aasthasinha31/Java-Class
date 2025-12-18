package Lab3;
import java.util.*;
class apple{
    void show(){
    System.out.println("this is apple class");
    }
}
class banana extends apple{
    void show(){
        System.out.println("this is banana class");
    }
}
class cherry extends apple{
    void show(){
    System.out.println("this is cherry class");
    }
}
class fruittest {
    public static void main( String[] args){
        apple a = new apple();
        a.show();

        banana b = new banana();
        b.show();

        cherry c = new cherry();
        c.show();


    }

}


