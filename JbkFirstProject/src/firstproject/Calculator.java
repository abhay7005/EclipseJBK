package firstproject;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Startig point of Test calculator");
		String Name = "Casio";
		int MRP = 1000;
		System.out.println("Made by :"+ Name);
		System.out.println("Max.Retail Prize :"+MRP);
		AdditionProg addi =new AdditionProg();
		addi.addition(500, 5000);
		
		Average av=new Average();
		av.average(500, 200);
		System.out.println("End point of Test calculator");
	}
}
