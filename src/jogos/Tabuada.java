package jogos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Tabuada extends JFrame {

	int resp;
	int cont = 0;
	int cont2 = 0;
	String n3;
	
	Random gerador = new Random();
	Font fonte = new Font("ARial", WIDTH, 60);
	Font fonte2 = new Font("ARial", WIDTH, 12);
	Font fonte3 = new Font("ARial", WIDTH, 40);

	JLabel num = new JLabel();
	JLabel num2 = new JLabel();
	JTextField valor = new JTextField();
	JButton b1 = new JButton("=");
	JLabel erros = new JLabel("Erros: "+cont2);
	JLabel acertos = new JLabel("Acertos: "+cont);
	
	public Tabuada() {
		Mensagem();
		Janela();	
		new contarTempo().start();
	}
	
	public void Mensagem() {
		resp = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Nível de Dificuldade Desejado: \n"
				+ "1- Fácil \n"
				+ "2- Médio \n"
				+ "3- Difícil")) ;

	}
	
	public void Janela() {
		setLayout(null);
		// titulo da janela
		setTitle("TABUADDA");
		// largura, altura em px
		setSize(400, 200);
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

		add(num2);
		add(num);
		add(valor);
		add(erros);
		add(acertos);

		valor.setSize(70,70);
		valor.setLocation(230,45);
		valor.setFont(fonte3);
		num.setFont(fonte);
		num.setSize(230, 170);
		num.setLocation(0, 0);
		num.setHorizontalAlignment(JLabel.CENTER);
		num2.setFont(fonte2);
		num2.setSize(100,30);
		num2.setLocation(30,10);
		erros.setFont(fonte2);
		erros.setSize(80,30);
		erros.setLocation(135,10);
		acertos.setFont(fonte2);
		acertos.setSize(90,30);
		acertos.setLocation(215,10);
		
		if(resp == 1) {
			int n1 = 1 + gerador.nextInt(6);
			int n2 = 1 + gerador.nextInt(6);
			n3 = String.valueOf((n1*n2));
			num.setText(n1+"x"+n2+" =");
						
			valor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if( n3.equals(valor.getText())) {
						cont++;
						acertos.setText("Acertos: "+cont);

					}else {
						cont2++;
						erros.setText("Erros: "+cont2);
					}
										
					valor.setText(null);
					int n1 = 1 + gerador.nextInt(6);
					int n2 = 1 + gerador.nextInt(6);
					n3 = String.valueOf((n1*n2));
					num.setText(n1+"x"+n2);

				}
			});
			
		}else if(resp == 2) {
			int n1 = 5 + gerador.nextInt(7);
			int n2 = 5 + gerador.nextInt(7);
			n3 = String.valueOf((n1*n2));
			num.setText(n1+"x"+n2+" =");
			num2.setText(String.valueOf(resp));

			valor.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if( n3.equals(valor.getText())) {
						cont++;
						acertos.setText("Acertos: "+cont);

					}else {
						cont2++;
						erros.setText("Erros: "+cont2);
					}
					
					valor.setText(null);
					int n1 = 5 + gerador.nextInt(6);
					int n2 = 5 + gerador.nextInt(6);
					n3 = String.valueOf((n1*n2));
					num.setText(n1+"x"+n2);
				}
			});
		}else {
			int n1 = 11 + gerador.nextInt(10);
			int n2 = 11 + gerador.nextInt(10);
			n3 = String.valueOf((n1*n2));
			num.setText(n1+"x"+n2+" =");
			num2.setText(String.valueOf(resp));
			System.out.println(n3);

			valor.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if( n3.equals(valor.getText())) {
						cont++;
						acertos.setText("Acertos: "+cont);

					}else {
						cont2++;
						erros.setText("Erros: "+cont2);
					}
					
					valor.setText(null);
					int n1 = 11 + gerador.nextInt(10);
					int n2 = 11 + gerador.nextInt(10);
					n3 = String.valueOf((n1*n2));
					num.setText(n1+"x"+n2);

				}
			});
		}
	}
	
	public static void main(String[] args) {
		new Tabuada();
	}
		
	public class contarTempo extends Thread{
		public void run() {
			int n = 0;
			while (true) {
				num2.setText("Segundos: "+ n);
				try {Thread.sleep(1000);}catch (Exception erro) {}
				n++;
			}
		}
	}
}
