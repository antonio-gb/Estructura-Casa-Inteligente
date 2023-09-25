package Control;
public class TVOn implements Comando {
    TV tv;

    public TVOn(TV tv){
        this.tv=tv;
    }

    public void execute(){
        tv.on();
        tv.setChannel();
    }

    public void undo(){
        tv.off();
    }
}