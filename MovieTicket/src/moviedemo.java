

import java.util.ArrayList;
import java.util.Scanner;

public class moviedemo {

    private static String user, password;
    private static double total;

    public static void main(String[] args) {
        System.out.println("=======Movie store=========");
        sucurity();//บรรทัด18
        System.out.println("Total Movie is "+total+" Bath\n");
        Transport();//บรรทัด52
        System.out.println("\nTotal is "+total+" Bath");
    }
    public static void sucurity() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("User\t: ");
            user = input.nextLine();
            System.out.print("password: ");
            password = input.nextLine();

//เข้าเมดตอดเพื่อตรวจสอบ user&&password
            String b = sucurity2(user, password);//บรรทัด34
            System.out.println(b);
//วนลูปเมื่อuser&&passwordไม่ตรงกัน
        } while ((!user.equals("kid") || !password.equals("1111"))
                && (!user.equals("every") || !password.equals("1212"))
                && (!user.equals("Uvip") || !password.equals("1818")));
    }
    public static String sucurity2(String user, String password) {
        String b = "";
        //เช็คuser&&password
        if (user.equals("kid") && password.equals("1111")) {
            kid k = new kid(3);
            k.print();//ไปคลาสkid
            total = k.total;
        } else if (user.equals("every") && password.equals("1212")) {
            every e = new every(5);
            e.print();//ไปคลาสevery
            total = e.total;
        } else if (user.equals("Uvip") && password.equals("1818")) {
            Uvip u = new Uvip();
            u.print();//ไปคลาสUvip
            total = u.total;
        } else {//ถ้าuser&&passwordไม่เข้าเมตตอดโปรแกรมจะแจ้งให้ลองใหม่
            b = "=========Please try again.========";
        }
        return b;
    }
   public static void Transport() { 
   ArrayList str = new ArrayList();    
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("==Transport==");
        System.out.print("What is your name? :");
        String name =input.nextLine();
        System.out.print("Zip cods(ส่งฟรีในภูเก็ต/นอกพื้นที่+30) :");
        int zip =input.nextInt();
        if(zip !=83000 &&zip !=83110 &&zip !=83120 &&zip !=83130 &&zip !=83150){
         total=total+30;   
        }
        System.out.print("Address :");
        String Address =input1.nextLine();
        System.out.print("How many phone numbers do you have : ");
        int num =input.nextInt();
        for(int i=0;i<num;i++){
        System.out.print("phone number : ");
        String num1 =input1.nextLine();
        str.add(num1);
        }
        System.out.println("====================");
        System.out.println("Your name is :"+name);
        System.out.println("Zip cods :"+zip);
        System.out.println("Address :"+Address);
        for(int j=0;j<str.size();j++){ 
        System.out.println("telephone number :"+str.get(j)); 
        }    
   }
}
