import java.util.*;
public class Task2 {
    public static void main(String args[]){
        //let there are three subjects (physics,chemistry,math)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phy marks out of 100");
        int phy=sc.nextInt();
        System.out.println("Enter chem marks out of 100");
        int chem=sc.nextInt();
        System.out.println("Enter math marks out of 100");
        int math=sc.nextInt();
        int total = phy+chem+math;
        int avgPercent=total/3;
        System.out.println("total marks are"+ " "+total);
        System.out.println("Average percentage are"+" "+ avgPercent);

        if(avgPercent>=90)
            System.out.println("Grade - AA");
        else if(avgPercent>=80)
            System.out.println("Grade - AB");
        else if(avgPercent>=70)
            System.out.println("Grade - BB");
        else if(avgPercent>=60)
            System.out.println("Grade - BC");
        else if(avgPercent>=50)
            System.out.println("Grade - CC");
        else if(avgPercent>=40)
            System.out.println("Grade - CD");
        else if(avgPercent>=33)
            System.out.println("Grade - DD");
        else
            System.out.println("Grade - FF!! YOU ARE FAIL");


    }
}
