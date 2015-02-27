package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

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
		botonesPanel.setLayout(new GridLayout(2, 1));
		botonesPanel.add(enviarBtn);
		botonesPanel.add(salirBtn);
		
		add(areaText, BorderLayout.CENTER);
		add(mensajeText, BorderLayout.SOUTH);
		add(botonesPanel, BorderLayout.EAST);
		
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChatClient().launchFrame();
	}
	
}

