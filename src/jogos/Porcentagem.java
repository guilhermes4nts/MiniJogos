package jogos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Porcentagem extends JFrame{
	
	JTextField texto = new JTextField();
	JButton botao = new JButton("=");
	JLabel resultado = new JLabel();
	
	Font fonte = new Font("Arial", PROPERTIES, 50);
	
	public Porcentagem() {
		//JFrame jf = new JFrame();
		// Adicionando gridlayout - tabela
		setLayout( new GridLayout(3,0));
		// titulo da janela
		setTitle("Porcentagem");
		// largura, altura em px
		setSize(300, 300);
		// para encerrar a janela qnd aperta para fechar 'x' 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// coloca a janela para aparecer no centro da tela
		setLocationRelativeTo(null);
		// cancela o redimencionamento da janela
		setResizable(false);
		// alterando a cor de fundo da janela
		getContentPane().setBackground(Color.white);
		// visibilidade da janela true-visivel false-nãovisivel
		setVisible(true);
		
		add(texto);
		texto.setFont(fonte);
		texto.setBackground(Color.white);
		texto.setForeground(Color.black);
		texto.setHorizontalAlignment(JTextField.CENTER);
		add(botao);
		botao.setFont(fonte);
		botao.setBackground(Color.BLACK);
		botao.setForeground(Color.white);
		botao.setFont(new Font("Arial", Font.PLAIN, 70));
		//Ação do Botão
		botao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// separando os números
					String[] numero =texto.getText().split("/");
					double n1 = Integer.parseInt(numero[0]);
					double n2 = Integer.parseInt(numero[1]);
					double valor = (n1 / n2) * 100;
					//Transformando o valor em double em inteiro
					int valorInt = (int)valor;
					//adicionando o novo 'texto' no JLabel
					resultado.setText(valorInt+"%");
				}
		});
		
		add(resultado);
		resultado.setFont(fonte);
		resultado.setForeground(Color.black);
		resultado.setHorizontalAlignment(JLabel.CENTER);
	}
	public static void instrucoes() {
		JOptionPane.showMessageDialog(null, "INSTRUÇÕES \n"
				+ "O programa funciona da seguinte forma: \n"
				+ "- A pessoa entra com dois valores, dessa forma: X/Y \n"
				+ "- E o programa vai dizer quantos porcento X representa de Y \n");
		
	}

	public static void main(String[] args) {
		instrucoes();
		new Porcentagem();
	}

}
