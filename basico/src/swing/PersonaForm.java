package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonaForm extends JFrame {
	private JPanel panel;
	
	private JLabel nombreLabel;
	private JTextField nombreText;
	
	private JTextField edadText;
	private JLabel edadLabel;
	
	private JTextField alturaText;
	private JLabel alturaLabel;
	
	private JButton aceptarBtn;
	
	public PersonaForm() {
		panel = new JPanel();
		
		nombreLabel = new JLabel("Nombre: ");
		nombreText = new JTextField();

		edadLabel = new JLabel("Edad: ");
		edadText = new JTextField();
		
		alturaLabel = new JLabel("Altura: ");
		alturaText = new JTextField();
		
		aceptarBtn = new JButton("Aceptar");
	}
	
	public void iniciar() {
		panel.setLayout(new GridLayout(3, 2));
		
		panel.add(nombreLabel);
		panel.add(nombreText);
		panel.add(edadLabel);
		panel.add(edadText);
		panel.add(alturaLabel);
		panel.add(alturaText);
		
		this.add(panel, BorderLayout.CENTER);
		this.add(aceptarBtn, BorderLayout.SOUTH);

		this.setTitle("Persona form");
		this.setSize(200, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new PersonaForm().iniciar();
	}
}



