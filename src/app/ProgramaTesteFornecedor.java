package app;
import exceptions.DadosInvalidosException;
import views.CadastroView;

public class ProgramaTesteFornecedor {
	public static void main(String[] args) {
		
		try {
			CadastroView cadastro = new CadastroView();
			System.out.println("ksksksksks");
		}catch(IllegalArgumentException e1) {
			System.out.println("erro");
			System.err.print(e1.getMessage());
		}catch(Exception e2) {
			System.out.println("erro");

		}
		
	
	}
}
