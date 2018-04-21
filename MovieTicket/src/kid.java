import java.util.ArrayList;
import java.util.Scanner;
class kid extends movie1038 implements Movie01,Movie02,Movie03,Movie04,Movie05,Movie06 {
    kid(){
    System.out.println("HOT!! Top Movie >>>>\t"+movieName02+"\t<<<<\n");    
    }
    kid(int piece){
     this();
     super.piece=piece;
     super.Savename=Savename;
     super.Saveprice=Saveprice;  
    }
    public  void print(){//สืบทอดจากแม่
        ArrayList kid = new ArrayList();
        Scanner inputkid = new Scanner(System.in);
        Scanner inputkid1 = new Scanner(System.in);
        int M; String M1;
    do{
    title();//อยู่ในแม่
    promotion();//สืบทอดจากแม่ บรรทัด60
    System.out.println("::::::Movie for Kid::::::");
    System.out.println("\t=Action=");
    System.out.println("press 1>"+movieName01);
    System.out.println("press 2>"+movieName02);
    System.out.println("\n\t=Cartoon=");
    System.out.println("press 3>"+movieName03);
    System.out.println("press 4>"+movieName04);
    System.out.println("\n\t=Fantasy=");
    System.out.println("press 5>"+movieName05);
    System.out.println("press 6>"+movieName06);
    do{
    System.out.print("\n(Enter number) :");
    M = inputkid.nextInt();
    total=SelectMovie(M);//สืบทอดจากแม่ของแม่ บรรทัดที่48   
    }while(M>6||M<1);
    if(piece==0){
    M1 = "N";
    promotion();}//บรรทัด60    
    else{
    System.out.print("Do you want to buy other movies?(Y=Yes) :");
    M1 = inputkid1.nextLine();}
    kid.add(Savename+"\tราคา :"+Saveprice+"\tBath");    
    }while(M1.equals("Y")|| M1.equals("y"));
    System.out.println("\n:::::::Bill:::::::");
    for(int j=0;j<kid.size();j++){ 
    System.out.println(kid.get(j));}
    }    
    public int SelectMovie(int M){    
        switch(M){
        case 1:println1(); break;
        case 2:println2(); break;
        case 3:println3(); break;
        case 4:println4(); break;
        case 5:println5(); break;
        case 6:println6(); break;
        default:System.out.println("=========Please try again.========");break;
        }    
    return (int)total;
    }
    public void promotion(){
System.out.println("promotion >>Buy 3 get 10% off \n"); 
    if(piece==0){
     System.out.println("--------------------");
     System.out.println("ยินดีด้วยคุณได้รับส่วนลด10%");
     System.out.println("--------------------");
     total=total-(total*0.1);
    }}
public void println1(){
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
 }while(a!=1 && a!=2 );
}
public void println2(){
    System.out.println("\nMovie Name :"+movieName02);
    System.out.println("Movie Type :"+type02);
    System.out.println("IMDb Score :"+IMDb02);
    System.out.println("Review : โกล โรเจอร์ เป็นชายที่โดนฉีดยาแล้วก้ามโตไล่กะทืบเหล่านาซีเพื่อปกป้องอเมริกา");
    System.out.println("1 = DVD (HD)ราคา :"+price02+"| 2 = DVD (4k)ราคา :"+(price02+hd4k));
    System.out.println("3 = back");
    Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price02; piece=piece-1; order(movieName02,price02);break;
        case 2:super.total=total+price02+hd4k; piece=piece-1;order(movieName02,price02+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
}
public void println3(){
    System.out.println("\nMovie Name :"+movieName03);
    System.out.println("Movie Type :"+type03);
    System.out.println("IMDb Score :"+IMDb03);
    System.out.println("Review : แมวมาจากอนาคตกับเด็กขี้เกียจ");
    System.out.println("1 = DVD (HD)ราคา :"+price03+"| 2 = DVD (4k)ราคา :"+(price03+hd4k));
    Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price03; piece=piece-1; order(movieName03,price03);break;
        case 2:super.total=total+price03+hd4k; piece=piece-1;order(movieName03,price03+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
}
public void println4(){
    System.out.println("\nMovie Name :"+movieName04);
    System.out.println("Movie Type :"+type04);
    System.out.println("IMDb Score :"+IMDb04);
    System.out.println("Review : ราชีนีแสนสวยมีพลังน้ำแข็งเย็นเจี้ยบเมื่อเธอสัมผัส");
    System.out.println("1 = DVD (HD)ราคา :"+price04+"| 2 = DVD (4k)ราคา :"+(price04+hd4k));
    Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price04; piece=piece-1; order(movieName04,price04);break;
        case 2:super.total=total+price04+hd4k; piece=piece-1;order(movieName04,price04+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
}
public void println5(){
    System.out.println("\nMovie Name :"+movieName05);
    System.out.println("Movie Type :"+type05);
    System.out.println("IMDb Score :"+IMDb05);
    System.out.println("Review : กระต่ายจอมป่วน สุดฮา ");
    System.out.println("1 = DVD (HD)ราคา :"+price05+"| 2 = DVD (4k)ราคา :"+(price05+hd4k));
    Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price05; piece=piece-1; order(movieName05,price05);break;
        case 2:super.total=total+price05+hd4k; piece=piece-1;order(movieName05,price05+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
}
public void println6(){
    System.out.println("\nMovie Name :"+movieName06);
    System.out.println("Movie Type :"+type06);
    System.out.println("IMDb Score :"+IMDb06);
    System.out.println("Review : ข้าคือพ่อของเจ้า โนววววววววว");
    System.out.println("1 = DVD (HD)ราคา :"+price06+"| 2 = DVD (4k)ราคา :"+(price06+hd4k));
     Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price06; piece=piece-1; order(movieName06,price06);break;
        case 2:super.total=total+price06+hd4k; piece=piece-1;order(movieName06,price06+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
}}
