import javax.swing.JOptionPane;

public class InputBelajar {
    public static void main(String[] args) {
        // Input dari user
        String belajar = JOptionPane.showInputDialog("Anda sedang belajar apa?");
        
        // Menampilkan pesan
        JOptionPane.showMessageDialog(null, "Belajar " + belajar + " sangat mudah");
    }
}
