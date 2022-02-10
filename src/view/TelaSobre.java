package view;

//JAVAX
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//JAVA
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class TelaSobre {

	private JFrame frmTelaSobre;

	public TelaSobre() {
		initialize();
		frmTelaSobre.setLocationRelativeTo(null);
	}
	
	public JFrame getFrmTelaSobre(){
        return frmTelaSobre;
    }

	private void initialize() {
		frmTelaSobre = new JFrame();
		frmTelaSobre.getContentPane().setBackground(Color.WHITE);
		frmTelaSobre.getContentPane().setSize(new Dimension(400, 200));
		frmTelaSobre.getContentPane().setPreferredSize(new Dimension(400, 200));
		frmTelaSobre.getContentPane().setMinimumSize(new Dimension(400, 200));
		frmTelaSobre.getContentPane().setMaximumSize(new Dimension(400, 200));
		
		JPanel panPrincipal = new JPanel();
		panPrincipal.setSize(new Dimension(400, 200));
		panPrincipal.setPreferredSize(new Dimension(400, 200));
		panPrincipal.setMinimumSize(new Dimension(400, 200));
		panPrincipal.setMaximumSize(new Dimension(400, 200));
		panPrincipal.setBackground(Color.WHITE);
		frmTelaSobre.getContentPane().add(panPrincipal, BorderLayout.CENTER);
		panPrincipal.setLayout(null);
		
		JLabel lblAluno1 = new JLabel("Aluno: Julio Cesar Bueno de Oliveira Junior");
		lblAluno1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAluno1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAluno1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAluno1.setBounds(10, 11, 414, 56);
		panPrincipal.add(lblAluno1);
		
		JLabel lblContato1 = new JLabel("Contato: julio.junior1026@edu.udesc.br");
		lblContato1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContato1.setHorizontalAlignment(SwingConstants.CENTER);
		lblContato1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblContato1.setBounds(10, 72, 414, 56);
		panPrincipal.add(lblContato1);
		
		JLabel lblAluno2 = new JLabel("Aluno: Mateus Coelho Nosse");
		lblAluno2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAluno2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAluno2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAluno2.setBounds(10, 139, 414, 56);
		panPrincipal.add(lblAluno2);
		
		JLabel lblContato2 = new JLabel("Contato: mateus.nosse@edu.udesc.br");
		lblContato2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContato2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblContato2.setHorizontalAlignment(SwingConstants.CENTER);
		lblContato2.setBounds(10, 194, 414, 56);
		panPrincipal.add(lblContato2);
		frmTelaSobre.setSize(new Dimension(400, 200));
		frmTelaSobre.setPreferredSize(new Dimension(400, 200));
		frmTelaSobre.setMinimumSize(new Dimension(400, 200));
		frmTelaSobre.setMaximumSize(new Dimension(400, 200));
		frmTelaSobre.setTitle("Ball Sort Puzzle - Sobre");
		frmTelaSobre.setBackground(Color.WHITE);
		frmTelaSobre.setBounds(100, 100, 450, 300);
		frmTelaSobre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
