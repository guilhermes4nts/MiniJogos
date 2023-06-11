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
public class Somar_Tempo extends JFrame {
	
	JButton b = new JButton("=");
	JTextField hr1 = new JTextField();
	JTextField hr2 = new JTextField();
	JLabel resultado = new JLabel();
	
	Font fonte = new Font("Arial", FRAMEBITS, 40);
	
	public Somar_Tempo() {
		// Adicionando gridlayout - tabela
		setLayout( new GridLayout(4,1));
		// titulo da janela
		setTitle("Somar Tempo");
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
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] numero = hr1.getText().split(":");
				int n1 = (Integer.parseInt(numero[0])) * 3600;
				int n2 = (Integer.parseInt(numero[1])) * 60;
				int n3 = n1 + n2 + Integer.parseInt(numero[2]);
				String[] numeros = hr2.getText().split(":");
				int n4 = (Integer.parseInt(numeros[0])) * 3600;
				int n5 = (Integer.parseInt(numeros[1])) * 60;
				int n6 = n4 + n5 +Integer.parseInt(numeros[2]);
				
				int total = n6+n3;
				int[] v = new int[3];
				v[0] = (int)(total/3600);
				v[1] = (int)(total%3600) / 60;
				v[2] = (int)(total%3600) % 60;
				//adicionando o novo 'texto' no JLabel
				resultado.setText(v[0]+":"+v[1]+":"+v[2]);
			}
		  });
		
		hr1.setFont(fonte);
		hr1.setHorizontalAlignment(JTextField.CENTER);
		hr2.setFont(fonte);
		hr2.setHorizontalAlignment(JTextField.CENTER);
		b.setFont(fonte);
		resultado.setFont(fonte);
		resultado.setHorizontalAlignment(JTextField.CENTER);

		
		add(hr1);
		add(hr2);
		add(b);
		add(resultado);
		
	}

	public static void main(String[] args) {
		new Somar_Tempo();
	}

}
