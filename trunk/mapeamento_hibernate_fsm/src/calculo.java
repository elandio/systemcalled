
public class calculo {
	private static calculo instancia;
		
	private calculo(){
		
	}
	public static calculo obterinstancia(){
		if (instancia == null){
			instancia = new calculo ();
		}
		return instancia;
	}
}
