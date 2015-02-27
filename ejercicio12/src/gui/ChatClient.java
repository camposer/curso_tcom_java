package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {
	private JPanel botonesPanel;
	private JTextArea areaText;
	private JTextField mensajeText;
	private JButton enviarBtn;
	private JButton salirBtn;

	public ChatClient() {
		super("Chat Room");
		
		botonesPanel = new JPanel();
		areaText = new JTextArea();
		areaText.setEditable(false);
		
		mensajeText = new JTextField();
		enviarBtn = new JButton("Enviar");
		salirBtn = new JButton("Salir");
	}
	
	public void launchFrame() {
		enviarBtn.addActionListener(new SendHandler());
		salirBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		
		botonesPanel.setLayout(new GridLayout(2, 1));
		botonesPanel.add(enviarBtn);
		botonesPanel.add(salirBtn);
		
		add(areaText, BorderLayout.CENTER);
		add(mensajeText, BorderLayout.SOUTH);
		add(botonesPanel, BorderLayout.EAST);
		
		addWindowListener(new CloseHandler());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu archivoMenu = new JMenu("Archivo");
		JMenuItem acercaMenu = new JMenuItem("Acerca");
		acercaMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialogo = new JDialog();
				dialogo.setTitle("Acerca de...");
				dialogo.add(new JLabel("Bienvenido!!"));
				dialogo.setModal(true); // Bloquea la interfaz
				dialogo.setSize(100, 100);
				dialogo.setVisible(true);
			}
		});
		
		JMenuItem salirMenu = new JMenuItem("Salir");
		salirMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		
		archivoMenu.add(acercaMenu);
		menuBar.add(archivoMenu);
		menuBar.add(salirMenu);
		
		setJMenuBar(menuBar);
		
		setSize(1000, 500);
		setVisible(true);
	}

	public class SendHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String mensaje = mensajeText.getText();
			areaText.setText(mensaje);
			mensajeText.setText("");
		}
	}
	
	public class CloseHandler implements WindowListener {
		@Override
		public void windowOpened(WindowEvent e) { }
		@Override
		public void windowClosed(WindowEvent e) { }
		@Override
		public void windowIconified(WindowEvent e) { }
		@Override
		public void windowDeiconified(WindowEvent e) { }
		@Override
		public void windowActivated(WindowEvent e) { }
		@Override
		public void windowDeactivated(WindowEvent e) { }

		@Override
		public void windowClosing(WindowEvent e) {
			cerrar();
		}
	}
	
	public void cerrar() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new ChatClient().launchFrame();
	}
}

