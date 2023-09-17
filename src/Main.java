import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        nuevoEstudiante v = new nuevoEstudiante();
        v.setContentPane(v.datosEstudiante);
        v.setSize(1000,500);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setVisible(true);
    }
}