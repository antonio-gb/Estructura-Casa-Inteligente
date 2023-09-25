package Control;
public class ComandoGarageCerrar implements Comando{
        PuertaGarage puerta;
    
        public ComandoGarageCerrar(PuertaGarage puerta){
            this.puerta = puerta;
        }

        public void execute(){
            puerta.down();
        }
        public void undo(){
            puerta.up();
        }
    }

