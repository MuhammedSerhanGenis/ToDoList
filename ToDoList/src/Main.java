/**
  * Program that you can create your To do list
  * 
  *Muhammed Serhan Genis
  *12.08.2022
  *
*/

import java.util.Scanner;


public class Main {
    
    private static toDoList tdl =new toDoList();
    private static Scanner scanner =new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        
        tdl.viewMenu();
        
        int t;
        boolean exit =false;
        
        while(!exit){
        t=scanner.nextInt();
        scanner.nextLine();
        
        switch(t){
            
            case 1:
                tdl.viewMenu();
                break;
            case 2:
                tdl.viewList();
                break;
            case 3:
                System.out.println("Enter the task you want to add.");
                String task1=scanner.nextLine();
                
                tdl.addTask(task1);
                
                break;
                
            case 4:
                System.out.println("Enter the task number you want to remove.");
                int number1=scanner.nextInt();
                scanner.nextLine();
                tdl.removeTask(number1-1);
                break;
                 
            case 5:
                System.out.println("Enter the task number you want to update.");
                int number2=scanner.nextInt();
                scanner.nextLine();
                 System.out.println("Enter the task you want to replace.");
                String task2=scanner.nextLine();
                tdl.updateTask(number2-1,task2);
                
                break;
                
            case 6:
                tdl.createTxtFile();
                        
                        
                break;
            
            case 7:
                exit=true;
                System.out.println("Exiting the program...");
                break;
                
            default:
                System.out.println("Invalid number.");
            break;
            
            
        }
        
        
        
        
    }
    
}

}