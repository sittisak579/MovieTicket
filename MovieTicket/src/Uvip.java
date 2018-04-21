import java.util.ArrayList;
import java.util.Scanner;
class Uvip extends movie1038 implements Movie01,Movie02,Movie03,Movie04,Movie05,Movie06,Movie07,Movie08,Movie09,Movie10,Movie11,Movie12,Movie13,Movie14,Movie15,Movie16,Movie17 {

        Uvip(){
    System.out.println("HOT!! Top Movie >>>>\t"+movieName10+"\t<<<<\n");    
    }
    
    Uvip(int piece3){
     this();
     super.piece=piece3;
     super.Savename=Savename;
     super.Saveprice=Saveprice;
    }
    
    public void print() {
        ArrayList Uvip = new ArrayList();
    Scanner inputUvip = new Scanner(System.in);
    Scanner inputUvip1 = new Scanner(System.in);
    int M4; String M5;
    do{    
    title();
        System.out.println("All piece get 20% off");
        System.out.println("Movie for vip");
        System.out.println("\t=Action=");
        System.out.println("press 1>"+movieName01);
        System.out.println("press 2>"+movieName02);
        System.out.println("press 3>"+movieName07);
        System.out.println("press 4>"+movieName08);
        System.out.println("\n\t=Fantacy=");
        System.out.println("press 5>"+movieName05);
        System.out.println("press 6>"+movieName06);
        System.out.println("press 7>"+movieName09);
        System.out.println("\n\t=Horror=");
        System.out.println("press 8>"+movieName10);
        System.out.println("press 9>"+movieName11);
        System.out.println("\n\t=Comedy=");
        System.out.println("press 10>"+movieName12);
        System.out.println("\n\t=Cartoon=");
        System.out.println("press 11>"+movieName03);
        System.out.println("press 12>"+movieName04);
        
        System.out.print("\n(Enter number) :");
    M4 = inputUvip.nextInt();
    total=SelectMovie(M4);//สืบทอดจากแม่ของแม่
    if(piece==0){
    M5 = "N";
    promotion();}
    
    else{
    System.out.print("Do you want to buy other movies?(Y=Yes) :");
    M5 = inputUvip.nextLine();}
    
    Uvip.add(Savename+"\tราคา :"+Saveprice+"\tBath");
    }while(M5.equals("Y")|| M5.equals("y"));
    
    for(int j=0;j<Uvip.size();j++){ 
    System.out.println("\n:::::::"
            + "Bill:::::::");System.out.println(Uvip.get(j));}    
    }

    public void promotion() {
     System.out.println("สมาชิกพิเศษได้รับส่วนลด 20%"); 
     total=total-(total*0.20);
    }
    public int SelectMovie(int a){
    switch(a){
        case 1:println1(); break;
        case 2:println2(); break;
        case 3:println3(); break;
        case 4:println4(); break;
        case 5:println5(); break;
        case 6:println6(); break;
        case 7:println7(); break;
        case 8:println8(); break;
        case 9:println9(); break;
        case 10:println10(); break;
        case 11:println11(); break;
        case 12:println12(); break;    
    }
    return (int)total;
    }

    
    public void println1() {
        System.out.println("\nMovie Name :"+movieName01);
 System.out.println("Movie Type :"+type01);
 System.out.println("IMDb Score :"+IMDb01);
 System.out.println("Review : เป็นภาพยนตร์ฮีโร่เปิดจักรวาลของ MCU กราฟฟิก สวยงาม นำแสดงโดย โทนี่ จาร์");
 System.out.println("1 = DVD (HD)ราคา :"+price01+"| 2 = DVD (4k)ราคา :"+(price01+hd4k));
 System.out.println("3 = back");
 Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price01; piece=piece-1;order(movieName01,price01); break;
        case 2:super.total=total+price01+hd4k;piece=piece-1;order(movieName01,price01+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println2() {
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
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

   
    public void println3() {
        System.out.println("\nMovie Name :"+movieName03);
 System.out.println("Movie Type :"+type03);
 System.out.println("IMDb Score :"+IMDb03);
 System.out.println("Review : แมวมาจากอนาคตกับเด็กขี้เกียจ");
 System.out.println("1 = DVD (HD)ราคา :"+price03+"| 2 = DVD (4k)ราคา :"+(price03+hd4k));
 System.out.println("3 = back");
 Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price03; piece=piece-1; order(movieName03,price03);break;
        case 2:super.total=total+price03+hd4k; piece=piece-1;order(movieName03,price03+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println4() {
        System.out.println("\nMovie Name :"+movieName04);
 System.out.println("Movie Type :"+type04);
 System.out.println("IMDb Score :"+IMDb04);
 System.out.println("Review : ราชีนีแสนสวยมีพลังน้ำแข็งเย็นเจี้ยบเมื่อเธอสัมผัส");
 System.out.println("1 = DVD (HD)ราคา :"+price04+"| 2 = DVD (4k)ราคา :"+(price04+hd4k));
 System.out.println("3 = back");
 Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price04; piece=piece-1; order(movieName04,price04);break;
        case 2:super.total=total+price04+hd4k; piece=piece-1;order(movieName04,price04+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println5() {
        System.out.println("\nMovie Name :"+movieName05);
 System.out.println("Movie Type :"+type05);
 System.out.println("IMDb Score :"+IMDb05);
 System.out.println("Review : กระต่ายจอมป่วน สุดฮา ");
 System.out.println("1 = DVD (HD)ราคา :"+price05+"| 2 = DVD (4k)ราคา :"+(price05+hd4k));
 System.out.println("3 = back");
 Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price05; piece=piece-1; order(movieName05,price05);break;
        case 2:super.total=total+price05+hd4k; piece=piece-1;order(movieName05,price05+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println6() {
        System.out.println("\nMovie Name :"+movieName06);
 System.out.println("Movie Type :"+type06);
 System.out.println("IMDb Score :"+IMDb06);
 System.out.println("Review : ข้าคือพ่อของเจ้า โนววววววววว");
 System.out.println("1 = DVD (HD)ราคา :"+price06+"| 2 = DVD (4k)ราคา :"+(price06+hd4k));
 System.out.println("3 = back");
 Scanner inputkid2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputkid2.nextInt();
        switch(a){
        case 1:super.total=total+price06; piece=piece-1; order(movieName06,price06);break;
        case 2:super.total=total+price06+hd4k; piece=piece-1;order(movieName06,price06+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println7() {
        System.out.println("\nMovie Name :"+movieName07);
 System.out.println("Movie Type :"+type07);
 System.out.println("IMDb Score :"+IMDb07);
 System.out.println("Review : เป็นภาพยนตร์แอคชั่นที่ดูเพลินดี มีฮาผสมมันส์ปนกันไป");
 System.out.println("1 = DVD (HD)ราคา :"+price07+"| 2 = DVD (4k)ราคา :"+(price07+hd4k));
 System.out.println("3 = back");
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price07; piece=piece-1;order(movieName07,price07); break;
        case 2:super.total=total+price07+hd4k;piece=piece-1;order(movieName07,price07+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println8() {
        System.out.println("\nMovie Name :"+movieName08);
 System.out.println("Movie Type :"+type08);
 System.out.println("IMDb Score :"+IMDb08);
 System.out.println("Review : ใครจะคิดว่าลิงจะฉลาดขนาดนี้ น่าจะลองไปทดลองกับเจ้าตูบที่บ้านบ้าง");
 System.out.println("1 = DVD (HD)ราคา :"+price08+"| 2 = DVD (4k)ราคา :"+(price08+hd4k));
 System.out.println("3 = back");
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price08; piece=piece-1;order(movieName08,price08); break;
        case 2:super.total=total+price08+hd4k;piece=piece-1;order(movieName08,price08+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println9() {
        System.out.println("\nMovie Name :"+movieName09);
 System.out.println("Movie Type :"+type09);
 System.out.println("IMDb Score :"+IMDb09);
 System.out.println("Review : สัตว์น่ารักๆทั้งนั้นเลย");
 System.out.println("1 = DVD (HD)ราคา :"+price09+"| 2 = DVD (4k)ราคา :"+(price09+hd4k));
 System.out.println("3 = back");
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price09; piece=piece-1;order(movieName09,price09); break;
        case 2:super.total=total+price09+hd4k;piece=piece-1;order(movieName09,price09+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println10() {
        System.out.println("\nMovie Name :"+movieName10);
 System.out.println("Movie Type :"+type10);
 System.out.println("IMDb Score :"+IMDb10);
 System.out.println("Review : น่ากลัวกว่าลัดทางแลนด์อีก");
 System.out.println("1 = DVD (HD)ราคา :"+price10+"| 2 = DVD (4k)ราคา :"+(price10+hd4k));
 System.out.println("3 = back");
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price10; piece=piece-1;order(movieName10,price10); break;
        case 2:super.total=total+price10+hd4k;piece=piece-1;order(movieName10,price10+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println11() {
        System.out.println("\nMovie Name :"+movieName11);
 System.out.println("Movie Type :"+type11);
 System.out.println("IMDb Score :"+IMDb11);
 System.out.println("Review : ยังจะมีภาคต่ออีกหรอ!!");
 System.out.println("1 = DVD (HD)ราคา :"+price11+"| 2 = DVD (4k)ราคา :"+(price11+hd4k));
 System.out.println("3 = back");
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price11; piece=piece-1;order(movieName11,price11); break;
        case 2:super.total=total+price11+hd4k;piece=piece-1;order(movieName11,price11+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println12() {
        System.out.println("\nMovie Name :"+movieName12);
 System.out.println("Movie Type :"+type12);
 System.out.println("IMDb Score :"+IMDb12);
 System.out.println("Review : ดูเหมือนเป็นวันหยุดที่ไม่ได้หยุดเลย 5555");
 System.out.println("1 = DVD (HD)ราคา :"+price12+"| 2 = DVD (4k)ราคา :"+(price12+hd4k));
 System.out.println("3 = back");
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price12; piece=piece-1;order(movieName12,price12); break;
        case 2:super.total=total+price12+hd4k;piece=piece-1;order(movieName12,price12+hd4k); break;
        case 3:System.out.println("Now Loading");print(); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 && a!=3);
        }

    
    public void println13() {
        }

    
    public void println14() {
        }

    
    public void println15() {
        }

    
    public void println16() {
        }

    
    public void println17() {
        }
}
