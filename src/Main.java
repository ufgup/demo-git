
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Ola, Git!");
		System.out.println("Resultado do sorteio:" + meuInteiro());
		meuLoop();
	}
	
	public static int meuInteiro() {
		return (int) Math.floor(Math.random()*100);
	}
	
	public static void meuLoop() {
		
		int i = 30;
		while (i > 0){
			System.out.print(" >> " + i + " << ");
			if (i%14 == 0) {
				System.out.println();
			}
			i--;
		}
		
	}
	
}
