package lab5BringingTogether;
import lab.*;
import lab2.*;
import lab3.*;
import lab3.*;
import lab4.*;
import java.util.List;
import java.util.Scanner;


public class CollaborativeEditorApp {
    public static void main(String[] args) {
    	//Lab 3
    	List<User> users;
    	users = new java.util.ArrayList<User>();
    	
 
        ChatRoomMediator chatRoom = new ChatRoom(users);

    
        User user1 = new User("Eren", chatRoom);
        User user2 = new User("Mehmet", chatRoom);

     
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

     
        user1.send("Hello, Mehmet!");
        user2.send("Hi, Eren!");
        System.out.println("---------------");
        System.out.println();
        
/*---------------------------------------------------------------------------------------------------------------------*/
        //Lab 1
        DocumentFactory documentFactory = new DocumentFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the document type (pdf/word): ");
        String type = scanner.nextLine();
        Document document = documentFactory.createDocument(type);
  
       document.open();
       
       System.out.println("---------------");
       System.out.println();
/*---------------------------------------------------------------------------------------------------------------------*/   
       //lab4 
       TextEditor editor = new TextEditor();
        History history = new History();
        
        System.out.println("The First set text and first save:");
        
        editor.setText("Initial text1.");
        history.addToStack(editor.save());
        System.out.println(editor.getText());
        System.out.println();
        

        System.out.println("The second set text and first save:");
        editor.write(" Hello, World!");
        history.addToStack(editor.save());
        System.out.println(editor.getText());
        System.out.println();
 
        System.out.println("The third set text and first save:");
        editor.write(" This is a test.");
      //  history.addToStack(editor.save());
        System.out.println(editor.getText());
        System.out.println();

        System.out.println("First Undo Op. ");
        editor.restore(history.undo());
       
        System.out.println(editor.getText());
        System.out.println();
        
        System.out.println("Second Undo Op. ");
        editor.restore(history.undo());
        System.out.println(editor.getText());
        System.out.println();
        
        System.out.println("First Redo Op. ");
        editor.restore(history.redo());
        editor.restore(history.redo());
        System.out.println(editor.getText());
        System.out.println();
       
        System.out.println("---------------");
        System.out.println();
        /*---------------------------------------------------------------------------------------------------------------------*/
        
        //lab2
        OldPrinter oldPrinter = new OldPrinter();
        OldPrinterAdapter adapter = new OldPrinterAdapter(oldPrinter);
        adapter.print("Hello, World!");
        System.out.println("---------------");
        System.out.println();
    }

    

}