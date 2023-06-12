package jogos;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class JogoDaVelha extends JFrame{

    // Declaracao de variáveis, constantes e objetos
    ImageIcon iconCirculo = new ImageIcon("circulo.png");
    ImageIcon iconXis = new ImageIcon("xis.png");

    JPanel pTela = new JPanel(new GridLayout(3,3, 10,10));

    Bloco[] blocos = new Bloco[9];

    final int JOGADOR_1 = 1;
    final int JOGADOR_2 = 2;
    int rodadas = 1;
    int jogadorVez = JOGADOR_1;
    JLabel lInformacao = new JLabel("Jogador "+JOGADOR_1);

	public JogoDaVelha() {
        configurarTela();
        configurarJanela();
	}

    public void configurarTela(){
        add(BorderLayout.CENTER,pTela);
        add(BorderLayout.NORTH,lInformacao);
        pTela.setBackground(Color.darkGray);
        lInformacao.setFont(new Font("Arial", Font.BOLD, 27));
        lInformacao.setForeground(new Color(64,0,211));
        lInformacao.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 9; i++){
            Bloco bloco = new Bloco();
            blocos[i] = bloco;
            pTela.add(blocos[i]);
        }

    }

	public void configurarJanela(){
		setTitle("JOGO DA VELHA");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

    public void mudarVez(){
        if (jogadorVez == JOGADOR_1){
            jogadorVez = JOGADOR_2;
            lInformacao.setText("Jogador 2");
            lInformacao.setForeground(new Color(245,110,20));
        }else{
            jogadorVez = JOGADOR_1;
            lInformacao.setText("Jogador 1");
            lInformacao.setForeground(new Color(64,0,211));
        }
    }
    public boolean testeVitoria(int jog){
        if (blocos[0].quem==jog && blocos[1].quem==jog && blocos[2].quem==jog){
            return true;
        }
        if (blocos[3].quem==jog && blocos[4].quem==jog && blocos[5].quem==jog){
            return true;
        }
        if (blocos[6].quem==jog && blocos[7].quem==jog && blocos[8].quem==jog){
            return true;
        }
        if (blocos[0].quem==jog && blocos[3].quem==jog && blocos[6].quem==jog){
            return true;
        }
        if (blocos[1].quem==jog && blocos[4].quem==jog && blocos[7].quem==jog){
            return true;
        }
        if (blocos[2].quem==jog && blocos[5].quem==jog && blocos[8].quem==jog){
            return true;
        }
        if (blocos[0].quem==jog && blocos[4].quem==jog && blocos[8].quem==jog){
            return true;
        }
        if (blocos[2].quem==jog && blocos[4].quem==jog && blocos[6].quem==jog){
            return true;
        }
        return false;
    }

	public static void main(String[] args) {
		new JogoDaVelha();
	}

    // Classe Botao
    public class Bloco extends JButton{
        int quem = 0;
        public Bloco(){
            setBackground(Color.white);
            addActionListener(e->{
                if (quem==0){
                    if (jogadorVez == JOGADOR_1){
                        setIcon(iconXis);
                        quem = JOGADOR_1;
                    }else{
                        setIcon(iconCirculo);
                        quem = JOGADOR_2;
                    }
                    // Verificando se Há um vencedor
                    if(rodadas >= 5){
                        if (testeVitoria(quem)) {
                            JOptionPane.showMessageDialog(null, "Jogador " + quem + " VENCEU!!");
                            System.exit(0);
                        }
                    }
                    //Verificando se empatou
                    if (rodadas == 9){
                        JOptionPane.showMessageDialog(null, "DEU VELHA!!");
                        System.exit(0);
                    }
                    rodadas++;
                    mudarVez();
                }
            });
        }
    }

}
