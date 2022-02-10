package view;

//JAVAX
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

//JAVA
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class TelaBusca {

	private JFrame frmTelaBusca;
	private JPanel panTubos;
	private JButton btnVoltarTudo;
	private JButton btnVoltarUm;
	private JButton btnAvancarUm;
	private JButton btnAvancarTudo;
	private JButton btnVoltar;
	private JLabel lblVariavelProfundidade;
	private JLabel lblVariavelTempo;
	
	public TelaBusca() {
		initialize();
		frmTelaBusca.setLocationRelativeTo(null);
	}
	
	public void addComponentListenerPanTubos(ComponentAdapter componentAdapter) {
        panTubos.addComponentListener(componentAdapter);
    }

    public void addActionListenerBtnVoltarTudo(ActionListener acao){
        btnVoltarTudo.addActionListener(acao);
    }

    public void addActionListenerBtnVoltarUm(ActionListener acao){
        btnVoltarUm.addActionListener(acao);
    }

    public void addActionListenerBtnAvancarUm(ActionListener acao){
        btnAvancarUm.addActionListener(acao);
    }

    public void addActionListenerBtnAvancarTudo(ActionListener acao){
        btnAvancarTudo.addActionListener(acao);
    }

    public void addActionListenerBtnVoltar(ActionListener acao){
        btnVoltar.addActionListener(acao);
    }
    
    public JFrame getFrmTelaBusca(){
        return frmTelaBusca;
    }

    public JPanel getPanTubos(){
        return panTubos;
    }

    public JLabel getLblVariavelProfundidade(){
        return lblVariavelProfundidade;
    }

    public JLabel getLblVariavelTempo(){
        return lblVariavelTempo;
    }

    public JButton getBtnVoltarTudo(){
        return btnVoltarTudo;
    }

    public JButton getBtnVoltarUm(){
        return btnVoltarUm;
    }

    public JButton getBtnAvancarUm(){
        return btnAvancarUm;
    }
    public JButton getBtnAvancarTudo(){
        return btnAvancarTudo;
    }

	private void initialize() {
		frmTelaBusca = new JFrame();
		frmTelaBusca.setTitle("Ball Sort Puzzle");
		frmTelaBusca.setSize(new Dimension(800, 600));
		frmTelaBusca.setPreferredSize(new Dimension(800, 600));
		frmTelaBusca.setMinimumSize(new Dimension(800, 600));
		frmTelaBusca.setMaximumSize(new Dimension(800, 600));
		frmTelaBusca.getContentPane().setMinimumSize(new Dimension(800, 600));
		frmTelaBusca.getContentPane().setMaximumSize(new Dimension(800, 600));
		frmTelaBusca.getContentPane().setBackground(Color.WHITE);
		frmTelaBusca.setBounds(100, 100, 450, 300);
		frmTelaBusca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panPrincipal = new JPanel();
		panPrincipal.setMinimumSize(new Dimension(800, 600));
		panPrincipal.setMaximumSize(new Dimension(800, 600));
		panPrincipal.setBackground(Color.WHITE);
		frmTelaBusca.getContentPane().add(panPrincipal, BorderLayout.CENTER);
		panPrincipal.setLayout(null);
		
		btnVoltar = new JButton("< Voltar");
		btnVoltar.setSize(new Dimension(120, 24));
		btnVoltar.setPreferredSize(new Dimension(120, 24));
		btnVoltar.setMinimumSize(new Dimension(120, 24));
		btnVoltar.setMaximumSize(new Dimension(120, 24));
		btnVoltar.setBounds(10, 11, 89, 23);
		panPrincipal.add(btnVoltar);
		
		JLabel lblProfundidade = new JLabel("Profundidade:");
		lblProfundidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProfundidade.setBounds(10, 45, 110, 23);
		panPrincipal.add(lblProfundidade);
		
		lblVariavelProfundidade = new JLabel("999");
		lblVariavelProfundidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVariavelProfundidade.setBounds(130, 45, 30, 23);
		panPrincipal.add(lblVariavelProfundidade);
		
		JLabel lblTempo = new JLabel("Tempo:");
		lblTempo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTempo.setBounds(170, 45, 61, 23);
		panPrincipal.add(lblTempo);
		
		lblVariavelTempo = new JLabel("100000ms");
		lblVariavelTempo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVariavelTempo.setBounds(241, 45, 89, 23);
		panPrincipal.add(lblVariavelTempo);
		
		panTubos = new JPanel();
		panTubos.setBackground(Color.WHITE);
		panTubos.setPreferredSize(new Dimension(764, 350));
		panTubos.setMinimumSize(new Dimension(764, 350));
		panTubos.setMaximumSize(new Dimension(764, 350));
		panTubos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panTubos.setBounds(10, 115, 764, 350);
		panPrincipal.add(panTubos);
		panTubos.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 517, 764, 33);
		panPrincipal.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnVoltarTudo = new JButton("<<");
		btnVoltarTudo.setSize(new Dimension(120, 24));
		btnVoltarTudo.setPreferredSize(new Dimension(120, 24));
		btnVoltarTudo.setMinimumSize(new Dimension(120, 24));
		btnVoltarTudo.setMaximumSize(new Dimension(120, 24));
		panel.add(btnVoltarTudo);
		
		btnVoltarUm = new JButton("<");
		btnVoltarUm.setSize(new Dimension(120, 24));
		btnVoltarUm.setPreferredSize(new Dimension(120, 24));
		btnVoltarUm.setMinimumSize(new Dimension(120, 24));
		btnVoltarUm.setMaximumSize(new Dimension(120, 24));
		panel.add(btnVoltarUm);
		
		btnAvancarUm = new JButton(">");
		btnAvancarUm.setSize(new Dimension(120, 24));
		btnAvancarUm.setPreferredSize(new Dimension(120, 24));
		btnAvancarUm.setMinimumSize(new Dimension(120, 24));
		btnAvancarUm.setMaximumSize(new Dimension(120, 24));
		panel.add(btnAvancarUm);
		
		btnAvancarTudo = new JButton(">>");
		btnAvancarTudo.setSize(new Dimension(120, 24));
		btnAvancarTudo.setPreferredSize(new Dimension(120, 24));
		btnAvancarTudo.setMinimumSize(new Dimension(120, 24));
		btnAvancarTudo.setMaximumSize(new Dimension(120, 24));
		panel.add(btnAvancarTudo);
	}
}
