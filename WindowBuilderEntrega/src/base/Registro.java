package base;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Registro() {
		setResizable(false);
		setBounds(new Rectangle(200, 200, 400, 200));
		setTitle("Registrate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 5));
		
		JButton botonRegistro = new JButton("Reg\u00EDstrate");
		botonRegistro.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(botonRegistro);
		
		
		botonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DatosRegistro frame = new DatosRegistro();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		JButton botonCancelar = new JButton("Cancela");
		botonCancelar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(botonCancelar);
		
		
		botonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
			}
		});
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(60);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Entra a formar parte de nuestro selecto grupo de clientes");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
	}

}
