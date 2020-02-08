//Eduardo Martinez Becerra
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 
public class Ventana extends JFrame implements ActionListener
{
    private JLabel texto;                  
    private JButton boton;
    
    public Ventana()
    {
    	super();                    
        configurarVentana();        
        inicializarComponentes();
    }
    
    private void configurarVentana()
   	{
   		this.setTitle("Practica1");                   
        this.setSize(310, 210);                                
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void inicializarComponentes()
    {
        texto = new JLabel();
        boton = new JButton(); 
        texto.setText("Eduardo M. B.\n Ing. ISC \n 181160154");    
        texto.setBounds(40, 40, 200, 25);  
        boton.setText("Mensaje");   
        boton.setBounds(50, 100, 200, 30);  
        boton.addActionListener(this);       
        this.add(texto);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, "No. Control\n 181160154 \nDireccion: Barrio del Sol \nTelefono: 9581420728. \nGenero: Masculino");
    }
    
    public static void main(String[] args) {
    	
    	Ventana V=new Ventana();
    	V.setVisible(true);
    }
}
