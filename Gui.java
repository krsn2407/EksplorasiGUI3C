import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Top level cotainer
public class Gui extends JFrame {

    public Gui() {
        setTitle("Eksplorasi GUI");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // border layout
        setLayout(new BorderLayout());

        // Intermediate container
        JPanel panelAtas = new JPanel(new GridLayout(2, 2, 5, 5)); // 4. Layout 2: GridLayout
        JPanel panelBawah = new JPanel(new FlowLayout());          // 4. Layout 3: FlowLayout

        // Atomic component
        JTextField tfNama = new JTextField();
        JLabel lblHasil = new JLabel("Pilih sapa atau reset");
        JButton btnSapa = new JButton("Sapa");
        JButton btnReset = new JButton("Reset");

        panelAtas.add(new JLabel("Nama:"));
        panelAtas.add(tfNama);
        panelAtas.add(new JLabel("Hasil:"));
        panelAtas.add(lblHasil);

        panelBawah.add(btnSapa);
        panelBawah.add(btnReset);

        add(panelAtas, BorderLayout.CENTER);
        add(panelBawah, BorderLayout.SOUTH);

        // Action listener
        btnSapa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblHasil.setText("Halo, " + tfNama.getText() + "!");
            }
        });

        // Mouse Adapter
        btnReset.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                tfNama.setText("");
                lblHasil.setText("Pilih sapa atau reset");
            }
        });
    }

    public static void main(String[] args) {
        new Gui().setVisible(true);
    }
}