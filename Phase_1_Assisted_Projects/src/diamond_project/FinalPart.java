package diamond_project;

public class FinalPart implements FirstPart, SecondPart {
	public void display() {
		
		FirstPart.super.display();
		SecondPart.super.display();
		
	}


	public static void main(String[] args) {
		
		FinalPart test = new FinalPart();
			
			test.display();

}
}
