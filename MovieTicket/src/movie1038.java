
import java.util.ArrayList;

abstract class movie1038 extends moviebase {

    public double total = 0,hd4k =150,Saveprice =0 ;
    public int piece;
    public String Savename;

    public abstract void print();{
    ArrayList list1 = new ArrayList();
}

    public abstract void promotion();

    public void title() {
        System.out.println("\t\t\t Total amount payable " + total);
        System.out.println("\t\t\t You can buy " + piece + " pieces.");

    }
    public String order(String name,double price){
    Savename=name;
    Saveprice=price;
    return Savename;
    }

}
 
