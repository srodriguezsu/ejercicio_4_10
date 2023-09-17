import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class infoEstudiante extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

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

    public static void main(String[] args) {
        infoEstudiante dialog = new infoEstudiante();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
