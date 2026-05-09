import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaFenetre extends JFrame implements ActionListener{
    private JTextField saisie,copie;
    private JButton bouton;

    public MaFenetre(){
        setSize(300,200);
        Container contenu=getContentPane();
        contenu.setLayout(new FlowLayout());

        saisie=new JTextField(20);
        contenu.add(saisie);

        bouton=new JButton("bouton");
        contenu.add(bouton);
        bouton.addActionListener(this);

        copie=new JTextField(20);
        contenu.add(copie);
        copie.setEditable(false);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bouton){
            String txt=saisie.getText();
            copie.setText(txt);}
    }
}