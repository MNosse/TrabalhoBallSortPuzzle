package view;

//JAVAX
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

//JAVA
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class TelaPuzzle {

	private JFrame frmTelaPuzzle;
	private JPanel panTubos;
	private JButton btnCarregar;
	private JButton btnLargura;
	private JButton btnProfundidade;
	private JButton btnSobre;

	public TelaPuzzle() {
		initialize();
		frmTelaPuzzle.setLocationRelativeTo(null);
	}
	
	public void addComponentListenerPanTubos(ComponentAdapter componentAdapter) {
        panTubos.addComponentListener(componentAdapter);
    }

    public void addActionListenerBtnCarregar(ActionListener acao){
        btnCarregar.addActionListener(acao);
    }

    public void addActionListenerBtnLargura(ActionListener acao){
        btnLargura.addActionListener(acao);
    }

    public void addActionListenerBtnProfundidade(ActionListener acao){
        btnProfundidade.addActionListener(acao);
    }

    public void addActionListenerBtnSobre(ActionListener acao){
        btnSobre.addActionListener(acao);
    }
    
    public JFrame getFrmTelaPuzzle(){
        return frmTelaPuzzle;
    }

    public JPanel getPanTubos(){
        return panTubos;
    }

	private void initialize() {
		frmTelaPuzzle = new JFrame();
		frmTelaPuzzle.getContentPane().setSize(new Dimension(800, 600));
		frmTelaPuzzle.getContentPane().setPreferredSize(new Dimension(800, 600));
		frmTelaPuzzle.getContentPane().setMinimumSize(new Dimension(800, 600));
		frmTelaPuzzle.getContentPane().setMaximumSize(new Dimension(800, 600));
		frmTelaPuzzle.getContentPane().setBackground(Color.WHITE);
		frmTelaPuzzle.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panPrincipal = new JPanel();
		panPrincipal.setSize(new Dimension(800, 600));
		panPrincipal.setPreferredSize(new Dimension(800, 600));
		panPrincipal.setMinimumSize(new Dimension(800, 600));
		panPrincipal.setMaximumSize(new Dimension(800, 600));
		panPrincipal.setBackground(Color.WHITE);
		frmTelaPuzzle.getContentPane().add(panPrincipal, BorderLayout.CENTER);
		panPrincipal.setLayout(null);
		
		JLabel lblPuzzle = new JLabel("Ball Sort Puzzle");
		lblPuzzle.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPuzzle.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuzzle.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblPuzzle.setBounds(10, 11, 764, 55);
		panPrincipal.add(lblPuzzle);
		
		panTubos = new JPanel();
		panTubos.setSize(new Dimension(764, 350));
		panTubos.setPreferredSize(new Dimension(764, 350));
		panTubos.setMinimumSize(new Dimension(764, 350));
		panTubos.setMaximumSize(new Dimension(764, 350));
		panTubos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panTubos.setBackground(Color.WHITE);
		panTubos.setBounds(10, 115, 764, 350);
		panPrincipal.add(panTubos);
		
		JPanel panBotoes = new JPanel();
		panBotoes.setBackground(Color.WHITE);
		panBotoes.setBounds(10, 517, 764, 33);
		panPrincipal.add(panBotoes);
		panBotoes.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 5));
		
		btnCarregar = new JButton("Carregar");
		btnCarregar.setSize(new Dimension(120, 24));
		btnCarregar.setPreferredSize(new Dimension(120, 24));
		btnCarregar.setMinimumSize(new Dimension(120, 24));
		btnCarregar.setMaximumSize(new Dimension(120, 24));
		panBotoes.add(btnCarregar);
		
		btnLargura = new JButton("Largura");
		btnLargura.setSize(new Dimension(120, 24));
		btnLargura.setPreferredSize(new Dimension(120, 24));
		btnLargura.setMinimumSize(new Dimension(120, 24));
		btnLargura.setMaximumSize(new Dimension(120, 24));
		panBotoes.add(btnLargura);
		
		btnProfundidade = new JButton("Profundidade");
		btnProfundidade.setPreferredSize(new Dimension(120, 24));
		btnProfundidade.setMinimumSize(new Dimension(120, 24));
		btnProfundidade.setMaximumSize(new Dimension(120, 24));
		btnProfundidade.setSize(new Dimension(120, 24));
		panBotoes.add(btnProfundidade);
		
		btnSobre = new JButton("Sobre");
		btnSobre.setSize(new Dimension(120, 24));
		btnSobre.setPreferredSize(new Dimension(120, 24));
		btnSobre.setMinimumSize(new Dimension(120, 24));
		btnSobre.setMaximumSize(new Dimension(120, 24));
		panBotoes.add(btnSobre);
		frmTelaPuzzle.setSize(new Dimension(800, 600));
		frmTelaPuzzle.setPreferredSize(new Dimension(800, 600));
		frmTelaPuzzle.setMinimumSize(new Dimension(800, 600));
		frmTelaPuzzle.setMaximumSize(new Dimension(800, 600));
		frmTelaPuzzle.setTitle("Ball Sort Puzzle");
		frmTelaPuzzle.setBackground(Color.WHITE);
		frmTelaPuzzle.setBounds(100, 100, 450, 300);
		frmTelaPuzzle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
