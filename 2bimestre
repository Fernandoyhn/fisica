import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiagnosticoAutomovelSwing extends JFrame {

    private JTextField txtCorrente, txtVoltagemBateria, txtVoltagemCabo;
    private JLabel lblResultado;

    public DiagnosticoAutomovelSwing() {
        setTitle("Diagnóstico de Automóvel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblCorrente = new JLabel("Corrente (A):");
        lblCorrente.setBounds(20, 20, 100, 30);
        add(lblCorrente);

        txtCorrente = new JTextField();
        txtCorrente.setBounds(150, 20, 200, 30);
        add(txtCorrente);

        JLabel lblVoltagemBateria = new JLabel("Voltagem Bateria (V):");
        lblVoltagemBateria.setBounds(20, 60, 150, 30);
        add(lblVoltagemBateria);

        txtVoltagemBateria = new JTextField();
        txtVoltagemBateria.setBounds(150, 60, 200, 30);
        add(txtVoltagemBateria);

        JLabel lblVoltagemCabo = new JLabel("Voltagem Cabo (V):");
        lblVoltagemCabo.setBounds(20, 100, 150, 30);
        add(lblVoltagemCabo);

        txtVoltagemCabo = new JTextField();
        txtVoltagemCabo.setBounds(150, 100, 200, 30);
        add(txtVoltagemCabo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 150, 100, 30);
        add(btnCalcular);

        lblResultado = new JLabel("");
        lblResultado.setBounds(20, 200, 350, 30);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularDefeito();
            }
        });
    }

    private void calcularDefeito() {
        try {
            double corrente = Double.parseDouble(txtCorrente.getText());
            double voltagemBateria = Double.parseDouble(txtVoltagemBateria.getText());
            double voltagemCabo = Double.parseDouble(txtVoltagemCabo.getText());

            double resistenciaBateriaMax = 0.020;
            double resistenciaMotorMax = 0.200;
            double resistenciaCaboMax = 0.040;

            double resistenciaTotal = voltagemBateria / corrente;
            double resistenciaCabo = voltagemCabo / corrente;
            double resistenciaMotorEBateria = resistenciaTotal - resistenciaCabo;

            if (resistenciaCabo > resistenciaCaboMax) {
                lblResultado.setText("O componente defeituoso é o cabo.");
            } else if (resistenciaMotorEBateria > (resistenciaBateriaMax + resistenciaMotorMax)) {
                lblResultado.setText("O componente defeituoso é o motor ou a bateria.");
            } else {
                lblResultado.setText("Nenhum componente parece estar defeituoso.");
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Por favor, insira valores numéricos válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DiagnosticoAutomovelSwing().setVisible(true);
            }
        });
    }
}
