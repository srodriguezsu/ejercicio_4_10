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



        btnLiquidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                byte estrato = Byte.parseByte(String.valueOf(inEstrato.getSelectedItem()));
                int inscripcion = (int) inInscripcion.getValue();
                int patrimonio = (int) inPatrimonio.getValue();
                Estudiante estudiante = new Estudiante(inscripcion, inNombre.getText(), patrimonio, estrato);
                infoEstudiante info = new infoEstudiante();
                info.setInscipcion(estudiante.getNumeroInscripcion());
                info.setNombre(estudiante.getNombre());
                info.setMatricula(estudiante.getMatricula());
                info.setContentPane(info.contentPane);
                info.setSize(500,250);
                info.setVisible(true);



            }
        });
    }
}
