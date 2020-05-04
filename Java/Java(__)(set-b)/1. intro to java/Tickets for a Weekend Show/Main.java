import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total number of tickets:");
        int ticket=sc.nextInt();
        int count=0;
        while(ticket>0){
            System.out.println("Enter the number of tickets u need:");
            int user=sc.nextInt();
            if(user<=3 && user>0){
                if(ticket>=user){
                    ticket-=user;
                    if(ticket>0){
                        System.out.println("Tickets Available:"+ticket);
                    }
                    else{
                        System.out.println("No more Tickets.");
                    }
                count=count+1;
                }
                else{
                    System.out.println("Check the ticket availability.");
                }
            }
            else{
                System.out.println("Maximum of 3 tickets per person");
            }
            
        }
        System.out.println("Number of Employees who got the tickets:"+count);
    }
}
