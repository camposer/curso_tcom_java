package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
		aceptarBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = nombreText.getText();
				float altura = Float.parseFloat(alturaText.getText());
				int edad = Integer.parseInt(edadText.getText());

				System.out.println(new Persona(nombre, altura, edad));
			}
		});
	}

	public void iniciar() {
		JMenuBar menu = new JMenuBar();
		JMenu ayuda = new JMenu("Ayuda");
		JMenuItem cerrar = new JMenuItem("Cerrar");
		cerrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		ayuda.add(cerrar);
		menu.add(ayuda);
		setJMenuBar(menu);

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
