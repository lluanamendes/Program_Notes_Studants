package entities;

public class Studants {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double notes() {
		double sumNotes= n1+n2+n3;
		return sumNotes;
	}
	
	public void result() {
		if(notes()>60) {
			System.out.print("Situação: APROVADO");
		}
		else {
			System.out.println("Situação: REPROVADO");
			System.out.println("FALTA "+(notes()-60)+" PONTOS.");
		}
	}
}
