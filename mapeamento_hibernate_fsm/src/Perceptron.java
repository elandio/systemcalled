	import java.util.*;

	public class Perceptron {
		private double[] w = new double[3];
		private double y = 0;
		private double N = 0.1;
		private final int BIAS = -1;
		private final int MAX_EPOCAS = 1000;
		private int operacao = 0;
		private Random rand = new Random();
		Scanner entrada;
		private int[][] e = {
				{ 0, 0, 0, 0, 1, 1, 0 },
				{ 0, 1, 1, 0, 0, 1, 1 },
				{ 1, 0, 1, 0, 0, 1, 1 },
				{ 1, 1, 1, 1, 0, 0, 0 }
				};

		Perceptron(int op) {
			if ((op >= 0) && (op < 5)) {
				operacao = op + 2;
			}
			for (int i = 0; i < 3; i++) {
				w[i] = ((rand.nextInt(20) + 1) / 10) - 1;
			}
			entrada = new Scanner(System.in);
		}

		int executar(int x1, int x2) {
			// Somatorio NET
			y = ((BIAS) * w[0]) + (x1 * w[1]) + (x2 * w[2]);
			// Funcao de Transferencia
			if (y > 0) {
				return 1;
			}
			return 0;
		}

		boolean treinar() {
			boolean treinou;
			int epoca = 0;
			do {
				treinou = true;
				for (int i = 0; i < 4; i++) {
					int s = executar(e[i][0], e[i][1]);
					if (s != e[i][operacao]) {
						corrigirPeso(i, s);
						treinou = false;
					}
				}
				epoca++;
			} while ((treinou == false) && (epoca < MAX_EPOCAS));
			System.out.println("O algoritmo treinou " + epoca + " epocas...");
			if (treinou == false) {
				System.out.println("O algoritmo nao conseguiu convergir...");
			}
			return treinou;
		}

		void corrigirPeso(int exemplo, int saida) {
			w[0] = w[0] + (N * (e[exemplo][operacao] - saida) * (BIAS));
			w[1] = w[1] + (N * (e[exemplo][operacao] - saida) * e[exemplo][0]);
			w[2] = w[2] + (N * (e[exemplo][operacao] - saida) * e[exemplo][1]);
		}

		void testar() {
			boolean sair = false;
			while (!sair) {
				System.out.println("-- Digite 9 para sair --");
				System.out.print("x1 : ");
				int x1 = entrada.nextInt();
				if (x1 == 9) {
					sair = true;
				} else {
					System.out.print("x2 : ");
					int x2 = entrada.nextInt();
					int y = executar(x1, x2);
					System.out.println(" y : " + y);
				}
			}
		}

		public static void main(String[] arguments) {
			boolean erro = false;
			if (arguments.length == 1) {
				int op = Integer.valueOf(arguments[0]);
				erro = ((op < 0) || (op > 4));
				if (!erro) {
					Perceptron p = new Perceptron(op);
					if (p.treinar()) {
						p.testar();
					}
				} 
			} else {
				erro = true;
			}
			if (erro) {
				System.out.println("Use: Perceptron <operacao>");
				System.out.println("operacao:");
				System.out.println("\t0 - ou");
				System.out.println("\t1 - e");
				System.out.println("\t2 - nao ou");
				System.out.println("\t3 - nao e");
				System.out.println("\t4 - ou exclusivo");
			}
		}
	}

