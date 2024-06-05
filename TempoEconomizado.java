import javax.swing.*;

public class TempoEconomizado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Tempo Economizado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel distanciaLabel = new JLabel("Distância (milhas):");
        JTextField distanciaField = new JTextField(10);
        panel.add(distanciaLabel);
        panel.add(distanciaField);

        JLabel velocidadeAntigaLabel = new JLabel("Velocidade antiga (milhas por hora):");
        JTextField velocidadeAntigaField = new JTextField("55", 10);
        panel.add(velocidadeAntigaLabel);
        panel.add(velocidadeAntigaField);

        JLabel velocidadeNovaLabel = new JLabel("Velocidade nova (milhas por hora):");
        JTextField velocidadeNovaField = new JTextField("65", 10);
        panel.add(velocidadeNovaLabel);
        panel.add(velocidadeNovaField);

        JButton calcularButton = new JButton("Calcular");
        JLabel resultadoLabel = new JLabel();
        panel.add(calcularButton);
        panel.add(resultadoLabel);

        calcularButton.addActionListener(e -> {
            try {
                double distancia = Double.parseDouble(distanciaField.getText());
                double velocidadeAntiga = Double.parseDouble(velocidadeAntigaField.getText());
                double velocidadeNova = Double.parseDouble(velocidadeNovaField.getText());
                
                double tempoAntigo = distancia / velocidadeAntiga;
                double tempoNovo = distancia / velocidadeNova;
                double tempoEconomizado = tempoAntigo - tempoNovo;
                
                resultadoLabel.setText("Tempo economizado: " + tempoEconomizado + " horas");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, insira valores válidos.");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
