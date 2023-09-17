import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nuevoEstudiante extends JFrame {
    public JPanel datosEstudiante;
    private JTextField inNombre;
    private JSpinner inInscripcion;
    private JSpinner inPatrimonio;
    private JComboBox inEstrato;
    private JButton btnLiquidar;

    public nuevoEstudiante(){

        byte estrato = Byte.parseByte(String.valueOf(inEstrato.getSelectedItem()));
        int inscripcion = (int) inInscripcion.getValue();
        int patrimonio = (int) inPatrimonio.getValue();

        btnLiquidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estudiante estudiante = new Estudiante(inscripcion, inNombre.getText(), patrimonio, estrato);


            }
        });
    }
}
