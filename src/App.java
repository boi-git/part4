import java.util.Scanner;

public class App {

    private static Application configureApplication(){
        Application app;
        Display display;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Gender");
        String gender = input.nextLine();
        if(gender.contains("male")){
            display = new DisplayMale();
            app = new Application(display);
        }
        else{
            display = new DisplayFemale();
            app = new Application(display);
    
        }
        return app;
    }
    public static void main(String[] args){
        Application app = configureApplication();
        app.display();
    }
}
