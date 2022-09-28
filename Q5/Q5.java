
import java.util.ArrayList;

class Q5 {

	public static void entradaValidator(char[] text) {
		ArrayList<Character> pilha = new ArrayList<Character>();
		ArrayList<Object> saida = new ArrayList<Object>();
		for (int i = 0; i < text.length; i++) {
			if (text[i] == '(') {
				pilha.add(text[i]);
				switch (text[i - 1]) {
					case 'r':
						pilha.add('|');
						break;
					case 'd':
						pilha.add('&');
						break;
					case 't':
						pilha.add('!');
						break;
				}
				pilha.add('1');
			} else if (text[i] == 'A' || text[i] == 'B' || text[i] == 'C') {
				saida.add(boleanConverter(text[i], text));
			} else if (text[i] == ',') {
				char count = pilha.get(pilha.size() - 1);
				count++;
				pilha.set(pilha.size() - 1, count);
			} else if (text[i] == ')') {
				while (pilha.get(pilha.size() - 1) != '(') {
					if (pilha.get(pilha.size() - 1) != '1')
						saida.add(pilha.get(pilha.size() - 1));
					pilha.remove(pilha.size() - 1);
				}
				pilha.remove(pilha.size() - 1);
			}
		}

		int n;

		for (int i = 0; i < saida.size(); i++) {
			if (saida.get(i) instanceof Character) {
				switch ((char) saida.get(i)) {

					case '&':
						n = ((char) (saida.get(i - 1)) - '0') + 1;
						for (int j = n - 1; j > 1; j--) {
							saida.set(i - n, ((boolean) saida.get(i - n) && (boolean) saida.get(i - j)));
						}
						for (int k = 0; k < n; k++) {
							saida.remove(i - k);
						}
						i -= n;
						break;
					case '|':
						n = ((char) saida.get(i - 1)) - '0' + 1;
						for (int j = n - 1; j > 1; j--) {
							saida.set(i - n, ((boolean) saida.get(i - n) || (boolean) saida.get(i - j)));
						}
						for (int k = 0; k < n; k++) {
							saida.remove(i - k);
						}
						i -= n;
						break;
					case '!':
						saida.set(i - 1, !(boolean) saida.get(i - 1));
						saida.remove(i);
						i--;
						break;
				}
			}
		}
		System.out.println(((boolean) saida.get(0)) ? '1' : '0');
	}

	public static boolean boleanConverter(char letra, char[] t) {
		return (t[2 * (letra - 'A') + 2] == '1');
	}

	public static boolean isFim(String entrada) {
		return (entrada.length() == 1 && entrada.charAt(0) == '0');
	}

	public static void main(String[] args) {
		String[] entrada = new String[1000];
		int n = 0;
		do {
			entrada[n] = MyIO.readLine();
		} while (!isFim(entrada[n++]));
		for (int i = 0; i < n - 1; i++)
			entradaValidator(entrada[i].toCharArray());
	}

}