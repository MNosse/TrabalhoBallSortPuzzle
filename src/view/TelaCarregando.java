package view;

//JAVAX
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

//JAVA
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class TelaCarregando {

	private JFrame frmTelaCarregando;
	
	public TelaCarregando() {
		initialize();
		frmTelaCarregando.setLocationRelativeTo(null);
		frmTelaCarregando.setVisible(true);
	}
	
	public JFrame getFrmTelaCarregando(){
        return frmTelaCarregando;
    }

	private void initialize() {
		frmTelaCarregando = new JFrame();
		frmTelaCarregando.getContentPane().setSize(new Dimension(400, 200));
		frmTelaCarregando.getContentPane().setPreferredSize(new Dimension(400, 200));
		frmTelaCarregando.getContentPane().setMinimumSize(new Dimension(400, 200));
		frmTelaCarregando.getContentPane().setMaximumSize(new Dimension(400, 200));
		frmTelaCarregando.getContentPane().setBackground(Color.WHITE);
		frmTelaCarregando.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panPrincipal = new JPanel();
		panPrincipal.setSize(new Dimension(400, 200));
		panPrincipal.setPreferredSize(new Dimension(400, 200));
		panPrincipal.setMinimumSize(new Dimension(400, 200));
		panPrincipal.setMaximumSize(new Dimension(400, 200));
		panPrincipal.setBackground(Color.WHITE);
		frmTelaCarregando.getContentPane().add(panPrincipal, BorderLayout.CENTER);
		panPrincipal.setLayout(null);
		
		JLabel lblMensagem = new JLabel("Sua busca esta sendo realizada");
		lblMensagem.setBounds(10, 95, 414, 25);
		lblMensagem.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panPrincipal.add(lblMensagem);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setBounds(10, 131, 414, 14);
		panPrincipal.add(progressBar);
		frmTelaCarregando.setSize(new Dimension(400, 200));
		frmTelaCarregando.setPreferredSize(new Dimension(400, 200));
		frmTelaCarregando.setMinimumSize(new Dimension(400, 200));
		frmTelaCarregando.setMaximumSize(new Dimension(400, 200));
		frmTelaCarregando.setBackground(Color.WHITE);
		frmTelaCarregando.setTitle("Ball Sort Puzzle - Carregando");
		frmTelaCarregando.setBounds(100, 100, 450, 300);
		frmTelaCarregando.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}
