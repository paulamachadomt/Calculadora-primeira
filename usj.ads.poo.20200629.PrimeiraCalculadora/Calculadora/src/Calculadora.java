
public class Calculadora {

	public static boolean verificaOperadores(String verificaOperador) {
		boolean resultado = false;
		if (verificaOperador.contains("+")) {
			resultado = true;
		}
		if (verificaOperador.contains("-")) {
			resultado = true;
		}
		if (verificaOperador.contains("x")) {
			resultado = true;
		}
		if (verificaOperador.contains("�")) {
			resultado = true;
		}
		return resultado; 
	}

	public static String substringOperador(String verificaPonto) {
		String verificaPontoSubstring = verificaPonto;
		int indexOperador;

		if (verificaPonto.contains("+")) {
			indexOperador = verificaPonto.indexOf("+");
			verificaPontoSubstring = String.valueOf(verificaPonto.charAt(indexOperador));
		}
		if (verificaPonto.contains("-")) {
			indexOperador = verificaPonto.indexOf("-");
			verificaPontoSubstring = String.valueOf(verificaPonto.charAt(indexOperador));
		}
		if (verificaPonto.contains("x")) {
			indexOperador = verificaPonto.indexOf("x");
			verificaPontoSubstring = String.valueOf(verificaPonto.charAt(indexOperador));
		}
		if (verificaPonto.contains("�")) {
			indexOperador = verificaPonto.indexOf("�");
			verificaPontoSubstring = String.valueOf(verificaPonto.charAt(indexOperador));
		}

		return verificaPontoSubstring;
	}

	public static String substringOperadoresNum1(String verificaPonto) {
		String verificaPontoSubstring = verificaPonto;
		int indexOperador;

		if (verificaPonto.contains("+")) {
			indexOperador = verificaPonto.indexOf("+");
			verificaPontoSubstring = verificaPonto.substring(0, indexOperador);
		}
		if (verificaPonto.contains("-")) {
			indexOperador = verificaPonto.indexOf("-");
			verificaPontoSubstring = verificaPonto.substring(0, indexOperador);
		}
		if (verificaPonto.contains("x")) {
			indexOperador = verificaPonto.indexOf("x");
			verificaPontoSubstring = verificaPonto.substring(0, indexOperador);
		}
		if (verificaPonto.contains("�")) {
			indexOperador = verificaPonto.indexOf("�");
			verificaPontoSubstring = verificaPonto.substring(0, indexOperador);
		}

		return verificaPontoSubstring;
	}

	public static String substringOperadoresNum2(String verificaPonto) {
		String verificaPontoSubstring = verificaPonto;
		int indexOperador;

		if (verificaPonto.contains("+")) {
			indexOperador = verificaPonto.indexOf("+") + 1;
			verificaPontoSubstring = verificaPonto.substring(indexOperador);
		}
		if (verificaPonto.contains("-")) {
			indexOperador = verificaPonto.indexOf("-") + 1;
			verificaPontoSubstring = verificaPonto.substring(indexOperador);
		}
		if (verificaPonto.contains("x")) {
			indexOperador = verificaPonto.indexOf("x") + 1;
			verificaPontoSubstring = verificaPonto.substring(indexOperador);
		}
		if (verificaPonto.contains("�")) {
			indexOperador = verificaPonto.indexOf("�") + 1;
			verificaPontoSubstring = verificaPonto.substring(indexOperador);
		}

		return verificaPontoSubstring;
	}

	public static String acaoBotaoPonto(String verificaPonto) {
		if (verificaPonto.length() == 0) {
			verificaPonto = verificaPonto + "0.";
		}
		if (!(verificaPonto.length() == 0) && !verificaPonto.contains(".")
				&& (!Calculadora.verificaOperadores(verificaPonto))) {
			verificaPonto = verificaPonto + ".";
		}
		if (Calculadora.verificaOperadores(verificaPonto)) {
			String verificaPontoSubstring = Calculadora.substringOperadoresNum2(verificaPonto);
			if (verificaPontoSubstring.length() == 0) {
				verificaPonto = verificaPonto + "0.";
			}
			if (!(verificaPontoSubstring.length() == 0) && !verificaPontoSubstring.contains(".")) {
				verificaPonto = verificaPonto + ".";
			}
		}
		return verificaPonto;
	}

	public static String resultadoOperacao(String continha) {

		String num1 = Calculadora.substringOperadoresNum1(continha);
		String num2 = Calculadora.substringOperadoresNum2(continha);
		String operador = Calculadora.substringOperador(continha);

		Double valor1 = Double.parseDouble(num1);
		Double valor2 = Double.parseDouble(num2);
		Double resultadoContinha = 0.0;

		String resultadoContinhaString = String.valueOf(resultadoContinha);

		switch (operador) {
		case "+":
			resultadoContinha = valor1 + valor2;
			break;
		case "-":
			resultadoContinha = valor1 - valor2;
			break;
		case "x":
			resultadoContinha = valor1 * valor2;
			break;
		case "�":
			resultadoContinha = valor1 / valor2;
			break;
		default:
			break;
		}

		return continha += " = " + String.valueOf(resultadoContinha);

	};

}
