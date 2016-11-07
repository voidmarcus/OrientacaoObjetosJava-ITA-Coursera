public class Paciente {
	double peso;
	double altura;
	
	Paciente(double peso, double altura){
		this.peso=peso;
		this.altura=altura;
	}
	
	public double calcularIMC(){
		double imc;

		imc=this.peso/(this.altura*this.altura);
		
		return imc;
	}
	
	public String diagnostico(){
		String diagnostico="Vazio - Houve um erro na leitura dos dados";
		
		double imc=this.calcularIMC();
		
		if (imc<16){
			diagnostico="Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}else
		
		if (imc>=16 && imc<=16.99){
			diagnostico="Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}else
		
		if (imc>=17 && imc<=18.49){
			diagnostico="Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}else
		
		if (imc>=18.50 && imc<=24.99){
			diagnostico="Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}else
		
		if (imc>= 25 && imc<=29.99){
			diagnostico="Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}else
		
		if (imc>=30 && imc <=34.99){
			diagnostico="Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}else
		
		if (imc>=35 && imc<=39.99){
			diagnostico="Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}else
		
		if (imc>=40){
			diagnostico="Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";;
		}
		
		return diagnostico;
	}
}