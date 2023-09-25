package Control;
public class YacuzziOff implements Comando{
    
    Yacuzzi yacuzzi;

    public YacuzziOff(Yacuzzi yacuzzi){
        this.yacuzzi  = yacuzzi;
    }


    public void execute(){
        yacuzzi.off();
        yacuzzi.burbujasOff();
        yacuzzi.enfriar();
    }
    public void undo(){
        yacuzzi.on();
    }
}
