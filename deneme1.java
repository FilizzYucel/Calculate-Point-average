
import java.util.Scanner;
public class deneme1 {
	public static void main(String[] args) {
		double number1, number2, number3, result=0;
		
		System.out.println("Write your laboratory point: ");
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		
		System.out.println("Write your midterm point: ");
		number2 = input.nextInt();
		
		System.out.println("Write your final point: ");
		number3 = input.nextInt();
		
		result = (number1*0.2)+(number2*0.2)+(number3*0.6);
		
		
		while(result>0 && result<100){
			
			if(result<=100 && result>=90) {
				System.out.println("Your grade letter: AA, your grade point: 4,00");
			}
			
			else if(result<=89 && result>=80) {
				System.out.println("Your grade letter: BA, your grade point: 3,50");
			}
			
			else if(result<=79 && result>=70) {
				System.out.println("Your grade letter: BB, your grade point: 3,00");
			}
			
			else if(result<=69 && result>=65) {
				System.out.println("Your grade letter: CB, your grade point: 2,50");
			}
			
			else if(result<=64 && result>=60) {
				System.out.println("Your grade letter: CC, your grade point: 2,00");
			}
			
			else if(result<=59 && result>=55) {
				System.out.println("Your grade letter: DC, your grade point: 1,50");
			}
			
			else if(result<=54 && result>=50) {
				System.out.println("Your grade letter: DD, your grade point: 1,00");
			}
			else if(result<=49 && result>=0) {
				System.out.println("Your grade letter : FF, your grade point: 0,00");
			}
			else {
				System.out.println("Your grade letter : NA, Your fail.");
			}
			
			System.out.println("Your visa point: "+number1+", Your laboratory point: "+number2+", Your final point: "+number3+", Your average:"+result);
			break;

			}
			
	}

}
