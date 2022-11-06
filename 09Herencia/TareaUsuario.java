import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Usuario extends JFrame {
    private JPanel Panel;
    private JTextField userBox;
    private JPasswordField passBox;
    public Usuario() {
        this.setTitle("Pricipal");
        this.setSize(370, 170);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        iniciarComponentes();
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();
    }
    private void colocarPaneles() {
        Panel = new JPanel();
        Panel.setLayout(null);
        this.getContentPane().add(Panel); 
    }
    private void colocarBotones() {
        userBox = new JTextField();
        passBox = new JPasswordField();
        //Boton de Registrate
        JButton RegistroBt = new JButton("Registrarse");
        RegistroBt.setBounds(200, 90, 120, 30);
        RegistroBt.setFont(new java.awt.Font("Gabriola", 0, 20 ));
        RegistroBt.setBackground(Color.PINK);
        RegistroBt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistroBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "No pude hacerlo, lo intente");
                System.exit(5);
            }
        });
        Panel.add(RegistroBt);

     
         //Boton de Inicio
        JButton InicioBt = new JButton("Iniciar");
        InicioBt.setBounds(20, 90, 120, 30);
        InicioBt.setFont(new java.awt.Font("Gabriola", 0, 20 ));
        InicioBt.setBackground(Color.PINK);
        InicioBt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.add(InicioBt);
        ActionListener userLoginButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioUser = "Yaremi";
                String usuarioPass = "26515406";
                if (usuarioUser.equals(userBox.getText())) {
                    String contrasena = "";
                    for (int i = 0; i < passBox.getPassword().length; i++) {
                        contrasena += passBox.getPassword()[i];
                    }
                    if (usuarioPass.equals(contrasena)) {
                        JOptionPane.showMessageDialog(null, "Bienvenido");
                         System.exit(5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, contraseña incorrecta");
                        System.exit(5);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario inexistente");
                    System.exit(5);
}
            }
        };

        InicioBt.addActionListener(userLoginButton);
    }
    private void colocarEtiquetas() {
         //Label de Nombre
        JLabel NombreLb = new JLabel("Usuario");
        NombreLb.setFont(new java.awt.Font("Britannic Bold", 0, 18 ));
        NombreLb.setBounds(10, 3, 120, 50);
        Panel.add(NombreLb);
        //caja de texto de Nombre
        userBox.setBounds(160, 15, 160, 25);
        Panel.add(userBox);
        //label contraseña
        JLabel ContraseñaLb = new JLabel("Contraseña");
        ContraseñaLb.setBounds(10, 40, 120, 50);
        ContraseñaLb.setFont(new java.awt.Font("Britannic Bold", 0, 18 ));
        Panel.add(ContraseñaLb);
        //caja de texto de Contraseña
        passBox.setBounds(160, 50, 160, 25);
        Panel.add(passBox);

    }

   
    public static void main(String[] args) {
        Usuario mainPanel = new Usuario();
        mainPanel.setVisible(true);


    }

}
