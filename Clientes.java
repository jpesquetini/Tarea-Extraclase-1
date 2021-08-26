import javax.swing.*;
public class Clientes{
    public static void main(String[] args){
        JFrame window;

        window = new JFrame("Tarea Extraclase 1");
        window.setSize(450 , 500);
        window.setVisible(true);

        JButton send;

        send = new JButton("Send");
        send.setBounds(170, 355 , 100 , 50);
        window.add(send);
    }
}
