package Control;
public class StereoOffComando implements Comando {
    Stereo stereo;

    public StereoOffComando(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.off();
    }
    public void undo(){
        stereo.on();
        stereo.setVolume(11);
        stereo.setCD();
    }
}
