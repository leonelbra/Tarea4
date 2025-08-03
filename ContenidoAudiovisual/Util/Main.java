import vista.VistaConsola;
import controlador.ControladorContenido;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        ControladorContenido controlador = new ControladorContenido(vista);
        controlador.iniciar();
    }
}
