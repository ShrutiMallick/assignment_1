package display;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;
import javax.swing.*;
public class PlayerGUI {

	private JFrame frame;
	private JTextField path;
	
	private File songFile;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			       javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
					
					PlayerGUI window = new PlayerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlayerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setTitle("CheesyGo MP3 Player");
		frame.setBounds(100, 100, 333, 174);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JButton startbtn = new JButton(">");
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//play audio
				try {
					Player p=new Player(new FileInputStream(songFile));
					p.play();
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"No file selected!","ERROR",JOptionPane.ERROR_MESSAGE);
					}
				}
			
		});
		startbtn.setFont(new Font("Papyrus", Font.BOLD, 25));
		startbtn.setBounds(158, 55, 59, 59);
		frame.getContentPane().add(startbtn);
		
		path = new JTextField();
		path.setForeground(Color.DARK_GRAY);
		path.setFont(new Font("Cambria", Font.PLAIN, 14));
		path.setEditable(false);
		path.setText("Song Name");
		path.setBounds(0, 13, 214, 22);
		frame.getContentPane().add(path);
		path.setColumns(10);
		
		JButton browsebtn = new JButton("Browse");
		browsebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				open();
			}
		});
		browsebtn.setBounds(226, 12, 77, 25);
		frame.getContentPane().add(browsebtn);
		
		JButton pausebtn = new JButton("||");
		pausebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		pausebtn.setBounds(90, 55, 59, 59);
		frame.getContentPane().add(pausebtn);
	}
	private void open(){
		try {
			javax.swing.JFileChooser chooser=new javax.swing.JFileChooser();
			chooser.setDialogTitle("Choose song to play...");
			chooser.showOpenDialog(null);
			songFile=chooser.getSelectedFile();
			path.setText(songFile.getAbsolutePath());
		
			if(!songFile.getName().endsWith("mp3")) {
				JOptionPane.showMessageDialog(null," Error","Invalid file type selected!",JOptionPane.ERROR_MESSAGE);
				open();
			}
	}catch(Exception e1) {
		e1.printStackTrace();
	}
	}
}
