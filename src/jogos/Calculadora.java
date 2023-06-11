package jogos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	
	Font fontel = new Font("Arial", DO_NOTHING_ON_CLOSE, 25);
	Font fonteb = new Font("Arial", DO_NOTHING_ON_CLOSE, 19);
	
	JLabel label = new JLabel();
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton resu = new JButton("=");
	JButton menos = new JButton("-");
	JButton mais = new JButton("+");
	JButton vezes = new JButton("x");
	JButton div = new JButton("/");
	JButton apagar = new JButton("c");

	String aux;
	int contaux = 0;
	
	public Calculadora() {
		Estrutura();
		Eventos();
	}
	
	public void Estrutura() {
		setLayout(null);
		// titulo da janela
		setTitle("CALCULADORA");
		// largura, altura em px
		setSize(230, 300);
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
		
		label.setFont(fontel);
		label.setText("0");
		b1.setFont(fonteb);
		b2.setFont(fonteb);
		b3.setFont(fonteb);
		b4.setFont(fonteb);
		b5.setFont(fonteb);
		b6.setFont(fonteb);
		b7.setFont(fonteb);
		b8.setFont(fonteb);
		b9.setFont(fonteb);
		b0.setFont(fonteb);
		resu.setFont(fonteb);
		mais.setFont(fonteb);
		menos.setFont(fonteb);
		vezes.setFont(fonteb);
		div.setFont(fonteb);

		// Localização e Tamanho
		label.setLocation(7, 15);
		label.setSize(200,40);
		label.setForeground(Color.black);
		label.setBackground(Color.white);
		
		b1.setLocation(10, 60);
		b1.setSize(45,45);
		b2.setLocation(60, 60);
		b2.setSize(45,45);
		b3.setLocation(110, 60);
		b3.setSize(45,45);
		apagar.setLocation(160, 60);
		apagar.setSize(45,45);
		b4.setLocation(10, 110);
		b4.setSize(45,45);
		b5.setLocation(60, 110);
		b5.setSize(45,45);
		b6.setLocation(110, 110);
		b6.setSize(45,45);
		mais.setLocation(160, 110);
		mais.setSize(45,45);
		b7.setLocation(10, 160);
		b7.setSize(45,45);
		b8.setLocation(60, 160);
		b8.setSize(45,45);
		b9.setLocation(110, 160);
		b9.setSize(45,45);
		menos.setLocation(160, 160);
		menos.setSize(45,45);
		b0.setLocation(60, 210);
		b0.setSize(45,45);
		vezes.setLocation(10, 210);
		vezes.setSize(45, 45);
		div.setLocation(110, 210);
		div.setSize(45, 45);
		resu.setLocation(160, 210);
		resu.setSize(45, 45);
		
		add(label);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(resu);
		add(mais);
		add(menos);
		add(vezes);
		add(div);
		add(apagar);
		
	}
	
	public void Eventos() {
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("1");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "1");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("2");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "2");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("3");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "3");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("4");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "4");
				}
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("5");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "5");
				}
			}
		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("6");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "6");
				}
			}
		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("7");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "7");
				}
			}
		});
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("8");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "8");
				}
			}
		});
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("9");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "9");
				}
			}
		});
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					label.setText("0");
					contaux++;
				}else {
					aux = label.getText();
					label.setText(aux + "0");
				}
			}
		});
		menos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {

				}else {
					aux = label.getText();
					label.setText(aux + "-");
				}
			}
		});
		mais.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {
					
				}else {
					aux = label.getText();
					label.setText(aux + "+");
				}
			}
		});
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {

				}else {
					aux = label.getText();
					
					label.setText(aux + "/");
				}
			}
		});
		vezes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(contaux == 0) {

				}else {
					aux = label.getText();
					label.setText(aux + "x");
				}
			}
		});
		
	}

	public static void main(String[] args) {
		new Calculadora();
	}

}
