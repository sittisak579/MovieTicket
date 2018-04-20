

import java.util.ArrayList;
import java.util.Scanner;
class every extends movie1038 {
    
    every(){
    System.out.println("HOT!! Top Movie >>>>\t"+"\t<<<<\n");    
    }
    
    every(int piece2){
     this();
     super.piece=piece2;
     super.Savename=Savename;
     super.Saveprice=Saveprice;
    }

    public void print() {
    ArrayList every = new ArrayList();
    Scanner inputevery = new Scanner(System.in);
    Scanner inputevery1 = new Scanner(System.in);
    int M; String M1;
        title();
        promotion();
        System.out.println("Movie for every");
    }

    public void promotion() {
System.out.println("promotion >>Buy 3 get 10% off ");
System.out.println("promotion >>Buy 5 get 15% off \n");
if(piece<3&&piece>0){
     System.out.println("ยินดีด้วยคุณได้รับส่วนลด10%"); 
     total=total-(total*0.1);
    }
else if(piece==0){
     System.out.println("ยินดีด้วยคุณได้รับส่วนลด15%"); 
     total=total-(total*0.15);
    }
    }
public int SelectMovie(int a){
    switch(a){
        
    }
    return (int)total;
    }
}
