public class Application {
    private Jordan jordan;
    private Basketball basketball;
    private Football football;

    public Application(Display display){
        jordan = display.createJordan();
        basketball = display.creatBasketball();
        football = display.creatFootball();
    }

    public void display(){
        jordan.display();
        basketball.display();
        football.display();
    }
    
}
