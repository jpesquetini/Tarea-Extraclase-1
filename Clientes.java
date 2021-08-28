import javax.swing.*; 
public class Clientes{
    public static void main(String[] args){
        JFrame window;
        window = new JFrame("Tarea Extraclase 1");
        window.setResizable(false);

        JTextField answersSection;
        answersSection = new JTextField("Respective Amounts:");
        answersSection.setBounds(0, 0, 385, 25);
        answersSection.setEditable(false);

        JTextArea answers;
        answers = new JTextArea();
        answers.setBounds(0, 25, 385, 300);

        JTextField instructions;
        instructions = new JTextField("Enter below the value, weight and tax percentage of the product");
        instructions.setBounds(0, 313, 385, 25);
        instructions.setEditable(false);

        JTextField entry;
        entry = new JTextField();
        entry.setBounds(0, 337, 285, 75);

        JButton send;
        send = new JButton("Send");
        send.setBounds(284, 337, 100, 75);

        window.add(send); 
        window.add(entry);
        window.add(instructions);
        window.add(answersSection);
        window.add(answers);
        window.setSize(400, 450);
        window.setLayout(null);
        window.setVisible(true);
    }
}
