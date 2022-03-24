package day16.Re;

public class GPT {


	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new 	GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());	//Powder 가 material, T가 Powder
		
		System.out.println(powderPrinter.getMaterial());
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		
		plasticPrinter.setMaterial(new Plastic());
		
		System.out.println(plasticPrinter.getMaterial());
	}

}
