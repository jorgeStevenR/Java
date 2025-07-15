import javax.swing.JOptionPane;

public class VentanaEmerjente{
    public static void main(String[] args) {

        //Entrada de datos por ventana emergente
        String nombre = JOptionPane.showInputDialog(null, "Digite el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite su estatura"));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Digite el sueldo"));
        char letra = JOptionPane.showInputDialog("Digite su letra").charAt(0);
        
        //salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null,"el nombre es " + nombre 
                                        + "\nla edad es " + edad 
                                        + "\nla estatura es" + estatura 
                                        + "\nel sueldo es " + sueldo
                                        + "\nla letra es " + letra);


        


        
    }
    
}
