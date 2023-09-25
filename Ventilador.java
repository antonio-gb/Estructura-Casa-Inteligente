package Control;
public class Ventilador implements Observador{
    public Ventilador(){}
    public void actualizar(String mensaje) {
        // Implementa el código para reaccionar a las actualizaciones del sujeto observado (ControlRemoto)
        System.out.println("Ventilador: " + mensaje);
    }
    public void on(){
        System.out.println("El ventilador ha sido encendido");
    }

    public void off(){
        System.out.println("El ventilador ha sido apagado");
    }

}
