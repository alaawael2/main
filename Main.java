import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
    
    JButton btn;
    Container con;
    
    Main(){
       con = getContentPane();
       con.setLayout(new FlowLayout());
       
       btn = new JButton("Colors");
       btn.addActionListener(this);
       con.add(btn);
    }
     public static void main(String[] args){

         Main m = new Main();
         m.setSize(500,500);
         m.setVisible(true);
         m.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Color initalColor = Color.BLACK;
        Color colorC = JColorChooser.showDialog(this, "choose a color", initalColor);
        con.setBackground(colorC);
    }
}
