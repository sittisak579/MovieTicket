import java.util.ArrayList;
import java.util.Scanner;
class Uvip extends movie1038 implements Movie01,Movie02,Movie03,Movie04,Movie05,Movie06,Movie07,Movie08,Movie09,Movie10,Movie11,Movie12,Movie13,Movie14,Movie15,Movie16,Movie17 {

        Uvip(){
    System.out.println("HOT!!>>>>New vip movie<<<<\n");    
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
        System.out.println("\tMovie for vip");
        System.out.println("\n\t=Pre-Order=");
        System.out.println("press 1>"+movieName13);
        System.out.println("press 2>"+movieName14);
        System.out.println("press 3>"+movieName15);
        System.out.println("press 4>"+movieName16);
        System.out.println("press 5>"+movieName17);
        System.out.println("\n\t=Action=");
        System.out.println("press 6>"+movieName01);
        System.out.println("press 7>"+movieName02);
        System.out.println("press 8>"+movieName07);
        System.out.println("press 9>"+movieName08);
        System.out.println("\n\t=Fantacy=");
        System.out.println("press 10>"+movieName05);
        System.out.println("press 11>"+movieName06);
        System.out.println("press 12>"+movieName09);
        System.out.println("\n\t=Horror=");
        System.out.println("press 13>"+movieName10);
        System.out.println("press 14>"+movieName11);
        System.out.println("\n\t=Comedy=");
        System.out.println("press 15>"+movieName12);
        System.out.println("\n\t=Cartoon=");
        System.out.println("press 16>"+movieName03);
        System.out.println("press 17>"+movieName04);
        do{
        System.out.print("\n(Enter number) :");
    M4 = inputUvip.nextInt();
    total=SelectMovie(M4);//สืบทอดจากแม่ของแม่
        }while(M4>18||M4<1);
   
    
    System.out.print("Do you want to buy other movies?(Y=Yes) :");
    M5 = inputUvip1.nextLine();
    
    Uvip.add(Savename+"\tราคา :"+Saveprice+"\tBath");
    }while(M5.equals("Y")|| M5.equals("y"));
    promotion();
    System.out.println("\n:::::::Bill:::::::");
    for(int j=0;j<Uvip.size();j++){ 
    System.out.println(Uvip.get(j));}    
    }

    public void promotion() {
     System.out.println("สมาชิกพิเศษได้รับส่วนลด 20%"); 
     total=total-(total*0.20);
    }
    public int SelectMovie(int a){
    switch(a){
        case 1:println13(); break;
        case 2:println14(); break;
        case 3:println15(); break;
        case 4:println16(); break;
        case 5:println17(); break;
        case 6:println1(); break;
        case 7:println2(); break;
        case 8:println7(); break;
        case 9:println8(); break;
        case 10:println5(); break;
        case 11:println6(); break;
        case 12 :println9(); break;
        case 13:println10(); break;
        case 14:println11(); break;
        case 15:println12(); break;
        case 16:println3(); break;
        case 17:println4(); break;  
        default:System.out.println("=========Please try again.========");break;
    }
    return (int)total;
    }

    
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
        case 1:super.total=total+price01; order(movieName01,price01); break;
        case 2:super.total=total+price01+hd4k;order(movieName01,price01+hd4k); break;
        
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
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
        case 1:super.total=total+price02;  order(movieName02,price02);break;
        case 2:super.total=total+price02+hd4k; order(movieName02,price02+hd4k); break;
        
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
        }

   
    public void println3() {
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
        case 1:super.total=total+price03;  order(movieName03,price03);break;
        case 2:super.total=total+price03+hd4k; order(movieName03,price03+hd4k); break;
       
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
    public void println4() {
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
        case 1:super.total=total+price04; order(movieName04,price04);break;
        case 2:super.total=total+price04+hd4k; order(movieName04,price04+hd4k); break;
     
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
    public void println5() {
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
        case 1:super.total=total+price05;  order(movieName05,price05);break;
        case 2:super.total=total+price05+hd4k; order(movieName05,price05+hd4k); break;
        
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
    public void println6() {
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
        case 1:super.total=total+price06;  order(movieName06,price06);break;
        case 2:super.total=total+price06+hd4k; order(movieName06,price06+hd4k); break;
        
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
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
        case 1:super.total=total+price07; order(movieName07,price07); break;
        case 2:super.total=total+price07+hd4k;order(movieName07,price07+hd4k); break;
        
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
        }

    
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
        case 1:super.total=total+price08; order(movieName08,price08); break;
        case 2:super.total=total+price08+hd4k;order(movieName08,price08+hd4k); break;
       
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
        }

    
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
        case 1:super.total=total+price09; order(movieName09,price09); break;
        case 2:super.total=total+price09+hd4k;order(movieName09,price09+hd4k); break;
      
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
        }

    
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
        case 1:super.total=total+price10; order(movieName10,price10); break;
        case 2:super.total=total+price10+hd4k;order(movieName10,price10+hd4k); break;
        
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
        }

    
    public void println11() {
        System.out.println("\nMovie Name :"+movieName11);
 System.out.println("Movie Type :"+type11);
 System.out.println("IMDb Score :"+IMDb11);
 System.out.println("Review : กลัวตัวตลกไปอีกนาน");
 System.out.println("1 = DVD (HD)ราคา :"+price11+"| 2 = DVD (4k)ราคา :"+(price11+hd4k));
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price11;order(movieName11,price11); break;
        case 2:super.total=total+price11+hd4k;order(movieName11,price11+hd4k); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
        }

    
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
        case 1:super.total=total+price12; order(movieName12,price12); break;
        case 2:super.total=total+price12+hd4k;order(movieName12,price12+hd4k); break;

        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2);
        }

    
    public void println13() {
        System.out.println("\nMovie Name :"+movieName13);
 System.out.println("Movie Type :"+type13);
 System.out.println("IMDb Score :"+IMDb13);
 System.out.println("Review : ดูก่อนโรงอีก สุดยอดครับ");
 System.out.println("1 = DVD (Pre-Order)ราคา :"+price13);
 System.out.println("2 = DVD (Pre-Order+Exclusive Pack)ราคา :"+(price13+ex));
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price13;order(movieName13,price13); break;
        
        case 2:super.total=total+(price13+ex);order(movieName13,(price13+ex)); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
    public void println14() {
        System.out.println("\nMovie Name :"+movieName14);
 System.out.println("Movie Type :"+type14);
 System.out.println("IMDb Score :"+IMDb14);
 System.out.println("Review : สวัสดีซานตาครอส");
 System.out.println("1 = DVD (Pre-Order)ราคา :"+price14);
 System.out.println("2 = DVD (Pre-Order+Exclusive Pack)ราคา :"+(price14+ex));
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price14;order(movieName14,price14); break;
        
        case 2:super.total=total+(price14+ex);order(movieName14,(price14+ex)); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
    public void println15() {
        System.out.println("\nMovie Name :"+movieName15);
 System.out.println("Movie Type :"+type15);
 System.out.println("IMDb Score :"+IMDb15);
 System.out.println("Review : ตัวอะไรเนี่ย!!");
 System.out.println("1 = DVD (Pre-Order)ราคา :"+price15);
 System.out.println("2 = DVD (Pre-Order+Exclusive Pack)ราคา :"+(price15+ex));
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price15;order(movieName15,price15); break;
       
        case 2:super.total=total+(price15+ex);order(movieName15,(price15+ex)); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
    public void println16() {
        System.out.println("\nMovie Name :"+movieName16);
 System.out.println("Movie Type :"+type16);
 System.out.println("IMDb Score :"+IMDb16);
 System.out.println("Review : รอมาหลายปี ลืมเนื้อเนื่องหมดละ");
 System.out.println("1 = DVD (Pre-Order)ราคา :"+price16);
 System.out.println("2 = DVD (Pre-Order+Exclusive Pack)ราคา :"+(price16+ex));
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price16;order(movieName16,price16); break;
        
        case 2:super.total=total+(price16+ex);order(movieName16,(price16+ex)); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }

    
    public void println17() {
        System.out.println("\nMovie Name :"+movieName17);
 System.out.println("Movie Type :"+type17);
 System.out.println("IMDb Score :"+IMDb17);
 System.out.println("Review : เขากลับมาแล้ว!!");
  System.out.println("1 = DVD (Pre-Order)ราคา :"+price17);
System.out.println("2 = DVD (Pre-Order+Exclusive Pack)ราคา :"+(price17+ex));
 Scanner inputevery2 = new Scanner(System.in);
 int a;
 do{
 System.out.print("\n(Enter number) :");a = inputevery2.nextInt();
        switch(a){
        case 1:super.total=total+price17;order(movieName17,price17); break;
        
        case 2:super.total=total+(price17+ex);order(movieName17,(price17+ex)); break;
        default:System.out.println("=========Please try again.========");break;}
 }while(a!=1 && a!=2 );
        }
}
