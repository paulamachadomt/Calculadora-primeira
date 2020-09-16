import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculadoraGUI extends JFrame {
	Boolean flagOperacao = false;

	public CalculadoraGUI() {

		JFrame frame = new JFrame();

		// janela principal da calculadora
		frame.setSize(450, 550);
		frame.setTitle("Minha primeira calculadora");
		frame.setLocationRelativeTo(null); // para aparecer no meio da tela
		frame.setLayout(null);

		// campo para exibição dos números
		JTextField jTextField = new JTextField();
		jTextField.setBounds(10, 10, 410, 40);
		jTextField.setText("");
		frame.add(jTextField);

		// botao clean
		JButton botaoClean = new JButton();
		botaoClean.setBounds(10, 60, 202, 80);
		botaoClean.setText("Clean");
		frame.add(botaoClean);
		botaoClean.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText("");
				flagOperacao = false;
			}
		});

		// botao zero
		JButton botaoZero = new JButton();
		botaoZero.setBounds(218, 60, 100, 80);
		botaoZero.setText("0");
		frame.add(botaoZero);
		botaoZero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "0");
			}
		});

		// botao apagar
		JButton botaoApagar = new JButton();
		botaoApagar.setBounds(323, 60, 100, 80);
		botaoApagar.setText("Apagar");
		frame.add(botaoApagar);
		botaoApagar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (jTextField.getText().length() >= 1) {
					jTextField.setText(jTextField.getText().substring(0, jTextField.getText().length() - 1));
				}
				if (flagOperacao) {
					jTextField.setText("");
					flagOperacao = false;
				}

			}
		});

		// botão sete
		JButton botaoNumSete = new JButton();
		botaoNumSete.setBounds(10, 145, 100, 80);
		botaoNumSete.setText("7");
		frame.add(botaoNumSete);
		botaoNumSete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "7");
			}
		});

		// botão oito
		JButton botaoNumOito = new JButton();
		botaoNumOito.setBounds(114, 145, 100, 80);
		botaoNumOito.setText("8");
		frame.add(botaoNumOito);
		botaoNumOito.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "8");
			}
		});

		// botão nove
		JButton botaoNove = new JButton();
		botaoNove.setBounds(218, 145, 100, 80);
		botaoNove.setText("9");
		frame.add(botaoNove);
		botaoNove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "9");
			}
		});

		// botão dividir
		JButton botaoDividir = new JButton();
		botaoDividir.setBounds(323, 145, 100, 80);
		botaoDividir.setText(Character.toString((char) 247));

		frame.add(botaoDividir);
		botaoDividir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String verificaOperador = jTextField.getText();

				if (verificaOperador.length() >= 1 && !Calculadora.verificaOperadores(verificaOperador)) {
					jTextField.setText(jTextField.getText() + "÷");
				}
			}
		});

		// botão quatro
		JButton botaoNumQuatro = new JButton();
		botaoNumQuatro.setBounds(10, 229, 100, 80);
		botaoNumQuatro.setText("4");
		frame.add(botaoNumQuatro);
		botaoNumQuatro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "4");
			}
		});

		// botão cinco
		JButton botaoNumCinco = new JButton();
		botaoNumCinco.setBounds(114, 229, 100, 80);
		botaoNumCinco.setText("5");
		frame.add(botaoNumCinco);
		botaoNumCinco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "5");
			}
		});

		// botão seis
		JButton botaoNumSeis = new JButton();
		botaoNumSeis.setBounds(218, 229, 100, 80);
		botaoNumSeis.setText("6");
		frame.add(botaoNumSeis);
		botaoNumSeis.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "6");
			}
		});

		// botão multiplicar
		JButton botaoMultiplicar = new JButton();
		botaoMultiplicar.setBounds(323, 229, 100, 80);
		botaoMultiplicar.setText("x");
		frame.add(botaoMultiplicar);
		botaoMultiplicar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String verificaOperador = jTextField.getText();

				if (verificaOperador.length() >= 1 && !Calculadora.verificaOperadores(verificaOperador)) {
					jTextField.setText(jTextField.getText() + "x");
				}
			}
		});

		// botão um
		JButton botaoNumUm = new JButton();
		botaoNumUm.setBounds(10, 313, 100, 80);
		botaoNumUm.setText("1");
		frame.add(botaoNumUm);
		botaoNumUm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "1");
			}
		});

		// botão dois
		JButton botaoNumDois = new JButton();
		botaoNumDois.setBounds(114, 313, 100, 80);
		botaoNumDois.setText("2");
		frame.add(botaoNumDois);
		botaoNumDois.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "2");
			}
		});

		// botão três
		JButton botaoNumTres = new JButton();
		botaoNumTres.setBounds(218, 313, 100, 80);
		botaoNumTres.setText("3");
		frame.add(botaoNumTres);
		botaoNumTres.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				jTextField.setText(jTextField.getText() + "3");
			}
		});

		// botão diminuir
		JButton botaoDiminuir = new JButton();
		botaoDiminuir.setBounds(323, 313, 100, 80);
		botaoDiminuir.setText("-");
		frame.add(botaoDiminuir);
		botaoDiminuir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String verificaOperador = jTextField.getText();

				if (verificaOperador.length() >= 1 && !Calculadora.verificaOperadores(verificaOperador)) {
					jTextField.setText(jTextField.getText() + "-");
				}
			}
		});

		// botão =
		JButton botaoIgual = new JButton();
		botaoIgual.setBounds(10, 398, 203, 80);
		botaoIgual.setText("=");
		frame.add(botaoIgual);
		botaoIgual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!flagOperacao) {
					String continha = jTextField.getText();
					String resultado = Calculadora.resultadoOperacao(continha);
					jTextField.setText(resultado);
					flagOperacao = true;				
				}
			}
		});

		// botão vírgula/ponto
		JButton botaoPonto = new JButton();
		botaoPonto.setBounds(218, 398, 100, 80);
		botaoPonto.setText(".");
		frame.add(botaoPonto);
		botaoPonto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String verificaPonto = jTextField.getText();
				String resultadoAcaoBotaoPonto = Calculadora.acaoBotaoPonto(verificaPonto);
				jTextField.setText(resultadoAcaoBotaoPonto);

			}
		});

		// botão somar
		JButton botaoSomar = new JButton();
		botaoSomar.setBounds(323, 398, 100, 80);
		botaoSomar.setText("+");
		frame.add(botaoSomar);
		botaoSomar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String verificaOperador = jTextField.getText();

				if (verificaOperador.length() >= 1 && !Calculadora.verificaOperadores(verificaOperador)) {
					jTextField.setText(jTextField.getText() + "+");
				}
			}
		});
		frame.setVisible(true);
	}

}
