/**
 * @(#)Healthy.java
 *
 *
 * @author Nur Adlina Huda
 * @version 1.00 2020/5/31
 */
import java.util.*;
public class MyHealthyCalculator {
        
    /**
     * Creates a new instance of <code>Healthy</code>.
     */
    public MyHealthyCalculator() {
    }
    
    static Scanner sc = new Scanner(System.in);
    double weight = 0;
    double height = 0;
    
    static void WelcomePage()
    {
    	System.out.print("Welcome to MyHealthy Calculator");
    	System.out.print("\nThis calculator will calculate BMI and BAI");
    	System.out.print("\nStay Healthy!");
    }
    
    static void ClosingPage()
    {
    	System.out.print("\nThank you for using this calculator");
    	System.out.print("\nStay Safe!");
    }
    
    static char SelectOptionMenu()
    {
    	char menu;
    	System.out.print("\nPlease select the option menu :");
    	System.out.print("\n'1' - to calculate body mess index(BMI)");
    	System.out.print("\n'2' - to calculate body adiposity index(BAI)");
    	System.out.print("\nYour selection is ['1' or '2'] :");
    	menu = sc.next().charAt(0);	
    	return menu;
    }
   
    static void BMIMenu()
    {
    	double weight = 0;
    	double height = 0;
    	double bmi = 0;
    	System.out.print("\n\nYou have choosen BMI");
        System.out.print("\n Enter weight(kg) :");//prompt
    	weight = sc.nextDouble();//get
    	System.out.print("\n Enter height(m) :");//prompt
    	height = sc.nextDouble();//get
    	bmi = weight / (height * height);//process
    	System.out.printf("\nYour bmi is :" +bmi);
    	
    	char Underweight = 0;
        int Healthy_weight = 0;
        int Overweight = 0;
        int Obese = 0;
        
 
    	if (bmi <18.5)
    	{
    		System.out.print("\nUnderweight");//display message
    	}
    	
    	else if (bmi == 18.5 && bmi <= 24.9) 
        {
        	System.out.print ("\nHealthy_Weight");//display message
        }
        
        else if (bmi == 25 && bmi <= 29.9) 
        {
        	System.out.print ("\nOverweight");//display message
        }
        
        else if (bmi == 30 && bmi <= 34.9)
        {
        	System.out.print ("\nObese");//display message
        }
        
        else if (bmi >=35)
        {
        	System.out.print("\nExtremely_Obese");//display message
        }
        
    }
    
    static void BAIMenu()
    {
    	double weight = 0;
    	double height = 0;
    	double bai = 0;
    	double HipCircumference = 0;
    	char gender = 0;
    	int age = 0;
    	System.out.print("\n\nYou have choosen BAI");
    	System.out.print("\nA.Woman");
    	System.out.print("\nB.Male");
    	System.out.print("\nA or B? :");
    	gender = sc.next().charAt(0);	
    	System.out.print("\nEnter age, weight,height and hip circumference to calculate BAI");
    	System.out.print("\nEnter age :");//prompt
    	age = sc.nextInt();//get
    	System.out.print("\n Enter weight(kg) :");//prompt
    	weight = sc.nextDouble();//get
    	System.out.print("\n Enter height(m) :");//prompt
    	height = sc.nextDouble();//get
    	System.out.print("\nEnter hip circumference(cm) :");//prompt
    	HipCircumference = sc.nextDouble();//get
    	bai = (HipCircumference/Math.pow(height,1.5)) - (18); //process
    	System.out.printf("\nYour bai is :" +bai);
    	
    	char woman = 'W';
    	char male = 'M';
    	int Underweight = 0;
        int Healthy = 0;
        int Overweight = 0;
        int Obese = 0;
    	
    	switch(gender){
    		case 'W' :
    			if((age == 20) && (age < 39))
    			{
    				if (bai <21)
    			{
    			    System.out.print("\nUnderweight");//display message
    			}
    			}
    			else if((age == 20) && (age < 39))
    			{
    					if (bai == 21 && bai < 33)
    			{
    				System.out.print ("\nHealthy");//display message
    			}
    			}
    			
    			else if((age == 20) && (age < 39))
    			{
    				if (bai >33)
    			{
    				System.out.print ("\nOverweight");//display message
    			}
    			}
    			
    			else if((age == 20) && (age < 39))
    			{
    				if (bai >39)
    			{
    				System.out.print ("\nObese");//display message
    			}
    			}
    			if((age >= 40) && (age < 59))
    			{
    				if (bai <23)
    			{
    			    System.out.print("\nUnderweight");//display message
    			}
    			}
    			else if((age >= 40) && (age < 59))
    			{
    					if (bai == 23 && bai <= 35)
    			{
    				System.out.print ("\nHealthy");//display message
    			}
    			}
    			
    			else if((age >= 40) && (age < 59))
    			{
    				if (bai >35)
    			{
    				System.out.print ("\nOverweight");//display message
    			}
    			}
    			
    			else if((age >= 40) && (age < 59))
    			{
    				if (bai >41)
    			{
    				System.out.print ("\nObese");//display message
    			}
    			}if((age >= 60) && (age < 79))
    			{
    				if (bai <25)
    			{
    			    System.out.print("\nUnderweight");//display message
    			}
    			}
    			else if((age >= 60) && (age < 79))
    			{
    					if (bai == 25 && bai <= 38)
    			{
    				System.out.print ("\nHealthy");//display message
    			}
    			}
    			
    			else if((age >= 60) && (age < 79))
    			{
    				if (bai >38)
    			{
    				System.out.print ("\nOverweight");//display message
    			}
    			}
    			
    			else if((age >= 60) && (age < 79))
    			{
    				if (bai >43)
    			{
    				System.out.print ("\nObese");//display message
    			}
    			}
    			break;
    		case 'M':
    			if((age == 20) && (age < 39))
    			{
    				if (bai <8)
    			{
    			    System.out.print("\nUnderweight");//display message
    			}
    			}
    			else if((age == 20) && (age < 39))
    			{
    					if (bai == 8 && bai <21)
    			{
    				System.out.print ("\nHealthy");//display message
    			}
    			}
    			
    			else if((age == 20) && (age < 39))
    			{
    				if (bai >21)
    			{
    				System.out.print ("\nOverweight");//display message
    			}
    			}
    			
    			else if((age == 20) && (age < 39))
    			{
    				if (bai >26)
    			{
    				System.out.print ("\nObese");//display message
    			}
    			}
    			if((age >= 40) && (age < 59))
    			{
    				if (bai <11)
    			{
    			    System.out.print("\nUnderweight");//display message
    			}
    			}
    			else if((age >= 40) && (age < 59))
    			{
    					if (bai == 11 && bai <= 23)
    			{
    				System.out.print ("\nHealthy");//display message
    			}
    			}
    			
    			else if((age >= 40) && (age < 59))
    			{
    				if (bai >23)
    			{
    				System.out.print ("\nOverweight");//display message
    			}
    			}
    			
    			else if((age >= 40) && (age < 59))
    			{
    				if (bai >29)
    			{
    				System.out.print ("\nObese");//display message
    			}
    			}if((age >= 60) && (age < 79))
    			{
    				if (bai <13)
    			{
    			    System.out.print("\nUnderweight");//display message
    			}
    			}
    			else if((age >= 60) && (age < 79))
    			{
    					if (bai == 13 && bai <= 25)
    			{
    				System.out.print ("\nHealthy");//display message
    			}
    			}
    			
    			else if((age >= 60) && (age < 79))
    			{
    				if (bai >25)
    			{
    				System.out.print ("\nOverweight");//display message
    			}
    			}
    			
    			else if((age >= 60) && (age < 79))
    			{
    				if (bai >31)
    			{
    				System.out.print ("\nObese");//display message
    			}
    			}
    			break;
    
    	}
    	
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char optMenu;
        char answer = 'Y';
        
        
        WelcomePage();
        do{
        	optMenu = SelectOptionMenu();
        	if (optMenu == '1')
        	{
        		BMIMenu();
        	}
        	else if (optMenu == '2')
        	{
        		BAIMenu();
        	}
        	System.out.print("\n Do you want to calculate again?");
        	answer = sc.next().charAt(0);
        }while(answer != 'N');
          ClosingPage();
    }
}
