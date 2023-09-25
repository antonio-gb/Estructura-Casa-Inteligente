package Control;
public class Yacuzzi implements Observador {
    boolean on;
    int temperature;
    public Yacuzzi(){ }
    public void actualizar(String mensaje) {
        // Implementa el código para reaccionar a las actualizaciones del sujeto observado (ControlRemoto)
        System.out.println("Yacuzzi: " + mensaje);
    }
    public void on(){
         on = true;
         System.out.println("Se ha encendido el yacuzzi");
    }
    public void calentar(){
        temperature = 105;
        System.out.println("Se ha encendido la temperatura a 105°");
    }
    public void enfriar(){
        temperature =980;
        System.out.println("Se ha disminuido la temperatura a unos 98°");
    }

    public void burbujasOn(){
        if(on){
            System.out.println("El yacuzzi está lleno de burbujas!");
        }
    }
    public void off(){
       on = false;
       System.out.println("Se ha apagado el yacuzzi");
    }
    public void burbujasOff(){
        if(on){
        System.out.println("No hay burbujas en el yacuzzi");
        }
    }
    public void jetsOn(){
        if(on){
        System.out.println("Los jets del yacuzzi están encendidos");
        }
    }
    public void jetsOff(){
        if(on){
        System.out.println("Los jets del yacuzzi están apagados");
        }
    }
    public void SetTemperature(int temperature){
        this.temperature=temperature;
    }
}
