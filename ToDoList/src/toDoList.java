
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class toDoList {
    
    private ArrayList<String> todolist =new ArrayList<String>();
    
    
    public void viewMenu(){
        System.out.println("1-View Menu");
        System.out.println("2-View To Do List");
        System.out.println("3-Add Task");
        System.out.println("4-Remove Task");
        System.out.println("5-Update Task");
        System.out.println("6-Create a .txt file of your TO DO List");
        System.out.println("7-Exit");
    }
    public void viewList(){
        System.out.println("There are "+todolist.size()+" tasks to be done on the list.");
        
        for(int i=0;i<todolist.size();i++){
            
            System.out.println((i+1)+"."+todolist.get(i));
            
            
        }
    }
    
    public void addTask(String task){
        
        todolist.add(task);
        System.out.println("Task has been added to the list.");
        
    }
    public void removeTask(int taskNo){
        
        todolist.remove(taskNo);
        System.out.println(taskNo+1+". task has been removed from the list.");
    }
    
    public void updateTask(int taskNo,String task){
        
        todolist.set(taskNo, task);
        System.out.println(taskNo+1+". task has been updated.");
        
    }
    
    public void createTxtFile (){
        Path file = Paths.get("myToDoList.txt");
        try {
            Files.write(file, todolist, StandardCharsets.UTF_8);
            System.out.println("The .txt file of your list has been created.");
        } catch (IOException ex) {
            Logger.getLogger(toDoList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
