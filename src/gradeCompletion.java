import java.util.Scanner;
import java.util.Date;
public class gradeCompletion {

	public static void main(String[] args) {

		//	value();	

		/*	int score;

		// String[] name = new String[100];
		// name[0]= 
		String e;
		 */
		String[][] entry = new String[100][5];
		
		
		Date date = new Date();
		

		int no=1;
		int maleScore= 0;
		int femaleScore= 0;
		int n=0;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Start while loop");

		int male=0;
		int female=0;
		int student=0;
		
		int ee=0;
		int cs=0;
		int is=0;
		int dc = 0;
		int md = 0;
		int va = 0;
		
		
		int eeScore = 0;
		int csScore = 0;
		int isScore = 0;
		
		
		int vaScore = 0;
		int mdScore = 0;
		int dcScore = 0;
		
	int scoreM;
		
		int percentMale, percentFemale;


		//  here:		


		/*	for (int n=0 ; n<100 ; n ++)

			{
				 System.out.println("Before while loop");

					System.out.println("Next user: y(1) or y(2)" );
					no = keyboard.nextInt();
					if (no != 1)
					break here;
		 */



		//	here:

		while (no == 1 && n<100)

		{
			
			System.out.println(date.toString());

			//	for (int n ; n<100 ; n ++)

			//	{


			System.out.println("Inside for loop");



			System.out.println("Enter your name: ");

			entry[n][0] = keyboard.next();





			System.out.println("Enter your grade: ");
			entry[n][1] = keyboard.next();

			



			System.out.println("Enter your gender as M or F: ");
			entry[n][2] = keyboard.next();
			
			System.out.println("Enter score :" );
			scoreM = keyboard.nextInt();
			
			if (entry[n][2].equals("M"))
			{
				
				maleScore += scoreM;
				
				male++;
			student++;
			
			}
			else if (entry[n][2].equals("F"))
			{
			//	System.out.println("Enter score :" );
			//	scoreM = keyboard.nextInt();
				femaleScore += scoreM;
				
				
				
				female++;
			student++;
			}
			
			else
				System.out.println("Invalid");



			System.out.println("Enter your major as EE, CS or IS: ");
			entry[n][3] = keyboard.next();
			if (entry[n][3].equals("EE"))
			{ee++;
			
			System.out.println("Student score: "+ scoreM);
			eeScore += scoreM;
			
						}
			else if (entry[n][3].equals("CS"))
			{cs++;
			csScore += scoreM;
			
			
						}
			else if (entry[n][3].equals("IS"))
			{is++;
			
			isScore += scoreM;
						}
			
			else
				System.out.println("Invalid entry");
			

			System.out.println("Enter your state Of Origin as VA, MD or DC: ");
			entry[n][4] = keyboard.next();
			if (entry[n][4].equals("VA"))
			{
				va++;
			
			vaScore += scoreM;
			
						}
			else if (entry[n][4].equals("MD"))
			{
				md++;
			mdScore += scoreM;
			
			
						}
			else if (entry[n][4].equals("DC"))
			{
				dc++;
			
			dcScore += scoreM;
						}
			else
			System.out.println("Invalid entry");

			


			
			System.out.println("Next user: y(1) or y(2)" );
			no = keyboard.nextInt();

			n++;
			
			
			//   break here;

		}

		System.out.println("Outside while loop");
		System.out.println("Male count : " + male);



		for (int i = 0; i < 3 ; i++ )

		{
			for (int j = 0; j < 4 ; j++)
			{

				System.out.println(entry[i][j]);

			}
		}



		 System.out.println("Total no of students = "+ student);
		
		percentMale= (male/male+female);

		percentFemale= (female/male+female);

		System.out.println("Ratio of male to female: " + percentMale + ":" + percentFemale);

       
		if (male > 0)
		System.out.println("Average score for male = "+ maleScore/male);
		
		if (female >0)
       System.out.println("Average score for female = "+ femaleScore/female);
		 
		
		if (ee > 0)
        System.out.println("Avg score for EE students: "+ eeScore/ee);

		if (cs > 0)
        System.out.println("Avg score for CS students: "+ csScore/cs);

		if (is > 0)
        System.out.println("Avg score for IS students: "+ isScore/is);
        
        
        if (va > 0)
        System.out.println("Avg score for VA state students: "+ vaScore/va);

        if(md > 0)
        System.out.println("Avg score for MD state students: "+ mdScore/md);

        if (dc > 0)
        System.out.println("Avg score for DC state students: "+ dcScore/dc);

	}

}





