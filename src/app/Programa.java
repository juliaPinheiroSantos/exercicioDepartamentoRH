package app;
import javax.swing.*;
import model.entitis.*;

public class Programa {
	public static void main(String[] args) {
		Administrador administrador = new Administrador();
		
		administrador.setAjudaDeCusto(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor de crédito: ", "Setar valor de crédito")));
		JOptionPane.showMessageDialog(null, administrador.getAjudaDeCusto());
		
		
	}
}
