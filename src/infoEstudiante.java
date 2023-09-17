import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class infoEstudiante extends JDialog {
    public JPanel contentPane;
    private JButton buttonOK;
    private JLabel outInscripcion;
    private JLabel outNombre;
    private JLabel outMatricula;
    NumberFormat pesos = NumberFormat.getCurrencyInstance();

    public infoEstudiante() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public void setInscipcion(int inscripcion){
        outInscripcion.setText(String.valueOf(inscripcion));
    }

    public void setNombre(String nombre){
        outNombre.setText(nombre);
    }
    public void setMatricula(int matricula){
        outMatricula.setText(pesos.format(matricula));
    }
}
