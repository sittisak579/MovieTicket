import java.util.ArrayList;
import java.util.Scanner;
class every extends movie1038 implements Movie01,Movie02,Movie07,Movie08,Movie09,Movie10,Movie11,Movie12  {   
    every(){
    System.out.println("HOT!! Top Movie >>>>\t"+movieName10+"\t<<<<\n");    
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
        int M2; String M3;
        do{
        title();//อยู่ในแม่
        System.out.println("promotion >>Buy 3 get 10% off ");
        System.out.println("promotion >>Buy 5 get 15% off \n");
        System.out.println("Movie for every");
        System.out.println("\t=Action=");
        System.out.println("press 1>"+movieName07);
        System.out.println("press 2>"+movieName08);
        System.out.println("press 3>"+movieName01);
        System.out.println("press 4>"+movieName02);
        System.out.println("\n\t=Fantacy=");
        System.out.println("press 5>"+movieName09);
        System.out.println("\n\t=Horror=");
        System.out.println("press 6>"+movieName10);
        System.out.println("press 7>"+movieName11);
        System.out.println("\n\t=Comedy=");
        System.out.println("press 8>"+movieName12);
    do{
    System.out.print("\n(Enter number) :");
    M2 = inputevery.nextInt();
    total=SelectMovie(M2);//สืบทอดจากแม่ของแม่ บรรทัด68
    }while(M2>8||M2<1);
    if(piece==0){
    M3 = "N";
    }   
    else{
    System.out.print("Do you want to buy other movies?(Y=Yes) :");
    M3 = inputevery1.nextLine();}
    every.add(Savename+"\tราคา :"+Saveprice+"\tBath");
    }while(M3.equals("Y")|| M3.equals("y"));
    promotion();//บรรทัดที่54
    System.out.println("\n:::::::Bill:::::::");
    for(int j=0;j<every.size();j++){ 
    System.out.println(every.get(j));}    
    }        
    
    public void promotion() {
if(piece<=2&&piece>=1){  //ซื้อ3-4รายการ
     System.out.println("--------------------");
     System.out.println("ยินดีด้วยคุณได้รับส่วนลด10%");
     System.out.println("--------------------");
     total=total-(total*0.1);
    }
else if(piece==0){//ซื้อ5รายการ
     System.out.println("--------------------");
     System.out.println("ยินดีด้วยคุณได้รับส่วนลด15%");
     System.out.println("--------------------");
     total=total-(total*0.15);
    }}

    public int SelectMovie(int a){
        switch(a){
        case 1:println7(); break;
        case 2:println8(); break;
        case 3:println1(); break;
        case 4:println2(); break;
        case 5:println9(); break;
        case 6:println10(); break;
        case 7:println11(); break;
        case 8:println12(); break;
        default:System.out.println("=========Please try again.========");break;
    }
    return (int)total;}
    
 public void println7() {
    System.out.println("\nMovie Name :"+movieName07);
    System.out.println("Movie Type :"+type07);
    System.out.println("IMDb Score :"+IMDb07);
    System.out.println("Review : เป็นภาพยนตร์แอคชั่นที่ดูเพลินดี มีฮาผสมมันส์ปนกันไป");
    System.out.println("1 = DVD (HD)ราคา :"+price07+"| 2 = DVD (4k)ราคา :"+(price07+hd4k));
    Scanner inputevery2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price07; piece=piece-1;order(movieName07,price07); break;
        case 2:super.total=total+price07+hd4k;piece=piece-1;order(movieName07,price07+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2 );}        
 
 public void println8() {
    System.out.println("\nMovie Name :"+movieName08);
    System.out.println("Movie Type :"+type08);
    System.out.println("IMDb Score :"+IMDb08);
    System.out.println("Review : ใครจะคิดว่าลิงจะฉลาดขนาดนี้ น่าจะลองไปทดลองกับเจ้าตูบที่บ้านบ้าง");
    System.out.println("1 = DVD (HD)ราคา :"+price08+"| 2 = DVD (4k)ราคา :"+(price08+hd4k));
    Scanner inputevery2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price08; piece=piece-1;order(movieName08,price08); break;
        case 2:super.total=total+price08+hd4k;piece=piece-1;order(movieName08,price08+hd4k); break;      
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2);}
 
 public void println9() {
    System.out.println("\nMovie Name :"+movieName09);
    System.out.println("Movie Type :"+type09);
    System.out.println("IMDb Score :"+IMDb09);
    System.out.println("Review : สัตว์น่ารักๆทั้งนั้นเลย");
    System.out.println("1 = DVD (HD)ราคา :"+price09+"| 2 = DVD (4k)ราคา :"+(price09+hd4k));
    Scanner inputevery2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price09; piece=piece-1;order(movieName09,price09); break;
        case 2:super.total=total+price09+hd4k;piece=piece-1;order(movieName09,price09+hd4k); break;      
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2 );}
 
 public void println10() {
    System.out.println("\nMovie Name :"+movieName10);
    System.out.println("Movie Type :"+type10);
    System.out.println("IMDb Score :"+IMDb10);
    System.out.println("Review : น่ากลัวกว่าลัดทางแลนด์อีก");
    System.out.println("1 = DVD (HD)ราคา :"+price10+"| 2 = DVD (4k)ราคา :"+(price10+hd4k));
    Scanner inputevery2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price10; piece=piece-1;order(movieName10,price10); break;
        case 2:super.total=total+price10+hd4k;piece=piece-1;order(movieName10,price10+hd4k); break;       
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2 );}

 public void println11() {
    System.out.println("\nMovie Name :"+movieName11);
    System.out.println("Movie Type :"+type11);
    System.out.println("IMDb Score :"+IMDb11);
    System.out.println("Review : ยังจะมีภาคต่ออีกหรอ!!");
    System.out.println("1 = DVD (HD)ราคา :"+price11+"| 2 = DVD (4k)ราคา :"+(price11+hd4k));
    Scanner inputevery2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price11; piece=piece-1;order(movieName11,price11); break;
        case 2:super.total=total+price11+hd4k;piece=piece-1;order(movieName11,price11+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2 );}

public void println12() {
    System.out.println("\nMovie Name :"+movieName12);
    System.out.println("Movie Type :"+type12);
    System.out.println("IMDb Score :"+IMDb12);
    System.out.println("Review : ดูเหมือนเป็นวันหยุดที่ไม่ได้หยุดเลย 5555");
    System.out.println("1 = DVD (HD)ราคา :"+price12+"| 2 = DVD (4k)ราคา :"+(price12+hd4k));
    Scanner inputevery2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price12; piece=piece-1;order(movieName12,price12); break;
        case 2:super.total=total+price12+hd4k;piece=piece-1;order(movieName12,price12+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2 );}

public void println1() {
    System.out.println("\nMovie Name :"+movieName01);
    System.out.println("Movie Type :"+type01);
    System.out.println("IMDb Score :"+IMDb01);
    System.out.println("Review : เป็นภาพยนตร์ฮีโร่เปิดจักรวาลของ MCU กราฟฟิก สวยงาม นำแสดงโดย โทนี่ จาร์");
    System.out.println("1 = DVD (HD)ราคา :"+price01+"| 2 = DVD (4k)ราคา :"+(price01+hd4k));
    Scanner inputkid2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price01; piece=piece-1;order(movieName01,price01); break;
        case 2:super.total=total+price01+hd4k;piece=piece-1;order(movieName01,price01+hd4k); break;      
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2 );}
    
public void println2() {
    System.out.println("\nMovie Name :"+movieName02);
    System.out.println("Movie Type :"+type02);
    System.out.println("IMDb Score :"+IMDb02);
    System.out.println("Review : โกล โรเจอร์ เป็นชายที่โดนฉีดยาแล้วก้ามโตไล่กะทืบเหล่านาซีเพื่อปกป้องอเมริกา");
    System.out.println("1 = DVD (HD)ราคา :"+price02+"| 2 = DVD (4k)ราคา :"+(price02+hd4k));
    Scanner inputkid2 = new Scanner(System.in);
    int a;
    do{
    System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price02; piece=piece-1; order(movieName02,price02);break;
        case 2:super.total=total+price02+hd4k; piece=piece-1;order(movieName02,price02+hd4k); break;        
        default:System.out.println("=========Please try again.========");break;}
    }while(a!=1 && a!=2 );}
}
