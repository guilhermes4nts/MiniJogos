package jogos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Soma extends JFrame{
	
	Font fonte = new Font("Arial", DO_NOTHING_ON_CLOSE, 50);
	Font fonte2 = new Font("Arial", DO_NOTHING_ON_CLOSE, 30);

	JButton b1 = new JButton("="); 
	JLabel sinal = new JLabel("+");
	JTextField n1 = new JTextField();
	JTextField n2 = new JTextField();
	JLabel resultado = new JLabel();

	
	public Soma() {
		// Adicionando gridlayout - tabela
		setLayout( new GridLayout(0,5));
		// titulo da janela
		setTitle("SOMA");
		// largura, altura em px
		setSize(400, 100);
		// para encerrar a janela qnd aperta para fechar 'x' 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// coloca a janela para aparecer no centro da tela
		setLocationRelativeTo(null);
		// cancela o redimencionamento da janela
		setResizable(false);
		// alterando a cor de fundo da janela
		//getContentPane().setBackground(Color.white);
		// visibilidade da janela true-visivel false-nãovisivel
		setVisible(true);
		
		//PARTE VISUAL
		
		add(n1);
		n1.setFont(fonte2);
		add(sinal);
		sinal.setFont(fonte);
		sinal.setBackground(Color.gray);
		sinal.setForeground(Color.BLACK);
		sinal.setHorizontalAlignment(JLabel.CENTER);
		add(n2);
		n2.setFont(fonte2);
		add(b1);
		b1.setFont(fonte);
		b1.setBackground(Color.gray);
		b1.setForeground(Color.black);
		add(resultado);
		resultado.setFont(fonte2);
		resultado.setHorizontalAlignment(JLabel.CENTER);
		
		// PARTE O CALCULO
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				
				int aux = num1 + num2;
				
				resultado.setText(aux+"");
			}
		});
		
	}

	public static void main(String[] args) {
		new Soma();
	}

}
