
public class Principal {

	public static void main(String[] args) {
		Paciente turing = new Paciente(30, 1.80);
		Paciente ada = new Paciente(50, 1.65);
		Paciente bill = new Paciente(85, 1.70);
	
		System.out.printf("Paciente Turing - IMC = %.2f - Diagnóstico = %s\n", turing.calcularIMC(), turing.diagnostico());
		System.out.printf("Paciente ada - IMC = %.2f - Diagnóstico = %s\n", ada.calcularIMC(), ada.diagnostico());
		System.out.printf("Paciente bill - IMC = %.2f - Diagnóstico = %s\n", bill.calcularIMC(), bill.diagnostico());

	}

}
