package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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

