package jogos;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JogoDaVelha extends JFrame{
	
	public JogoDaVelha() {
        configurarJanela();
	}
	
	public void configurarJanela(){
		// titulo da janela
		setTitle("JOGO DA VELHA");
		// largura, altura em px
		setSize(600, 600);
		// para encerrar a janela qnd aperta para fechar 'x'
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// coloca a janela para aparecer no centro da tela
		setLocationRelativeTo(null);
		// cancela o redimencionamento da janela
		setResizable(false);
		// alterando a cor de fundo da janela
		getContentPane().setBackground(Color.gray);
		// visibilidade da janela true-visivel false-nãovisivel
		setVisible(true);
	}

	public static void main(String[] args) {
        new JogoDaVelha();
	}

}
