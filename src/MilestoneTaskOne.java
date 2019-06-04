import java.util.Scanner;

public class MilestoneTaskOne {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your Basic Salary");
		
		double num = scan.nextDouble();
		//System.out.println(num );
		
		Scanner scan2 =new Scanner(System.in);
		System.out.println("Enter your Benefits");
		
		double num2 = scan.nextDouble();
		
		MilestoneTaskOne b= new MilestoneTaskOne();
		b.grossSalary(num, num2);
		b.nhifDeductions(num,num2);
		b.calcpayee(num, num2);
		b.netSalary(num, num2);
		

	}
	public static void inputs(double num, double num2) {
		
	System.out.println("Your basic salary =");
	System.out.println(num);
	System.out.println("Your benefits are =");
	System.out.println(num2);
		
		
	}
	public double grossSalary(double num,double num2) {
		double gross= (num+num2);
		System.out.println("your gross salary is:");
		System.out.println(gross);
		return gross;
	}
	public int calcpayee(double v,double w) {
		double p;
		double gross= v+w;
		if(gross<=12298) {
			p=0.1*gross;
			System.out.println("PAYE is: "+ p);
			
		}else if(gross>=12299 && gross<=23885) {
			p=0.15*gross;
			System.out.println("PAYE is: "+ p);
		}else if(gross>=23886 && gross<=35472) {
			p=0.2*gross;
			System.out.println("PAYE is: "+ p);
		}else if(gross>=35473 && gross<=47059) {
			p=0.25*gross;
			System.out.println("PAYE is: "+ p);
		}else if(gross>47059) {
			p=0.15*gross;
			System.out.println("PAYE is: "+ p);
		}
		
		
		return 0;
	}
	public int nhifDeductions(double x,double y) {
		double gross= x+y;
		
		if(gross<=5999) {
			System.out.println("NHIF deduction is 150");
			
		}else if(gross>=6000 && gross<=7999) {
			System.out.println("NHIF deduction is 300");
		}else if(gross>=8000 && gross<=11999) {
			System.out.println("NHIF deduction is 400");
		}else if(gross>=12000 && gross<=14999) {
			System.out.println("NHIF deduction is 500");
		}else if(gross>=15000 && gross<=19999) {
			System.out.println("NHIF deduction is 600");
		}else if(gross>=20000 && gross<=24999) {
			System.out.println("NHIF deduction is 750");
		}else if(gross>=25000 && gross<=29999) {
			System.out.println("NHIF deduction is 850");
		}else if(gross>=30000 && gross<=34999) {
			System.out.println("NHIF deduction is 900");
		}else if(gross>=35000 && gross<=39999) {
			System.out.println("NHIF deduction is 950");
		}else if(gross>=40000 && gross<=44999) {
			System.out.println("NHIF deduction is 1000");
		}else if(gross>=45000 && gross<=49999) {
			System.out.println("NHIF deduction is 1100");
		}else if(gross>=50000 && gross<=59999) {
			System.out.println("NHIF deduction is 1200");
		}else if(gross>=60000 && gross<=69999) {
			System.out.println("NHIF deduction is 1300");
		}else if(gross>=70000 && gross<=79999) {
			System.out.println("NHIF deduction is 1400");
		}else if(gross>=80000 && gross<=89999) {
			System.out.println("NHIF deduction is 1500");
		}else if(gross>=90000 && gross<=99999) {
			System.out.println("NHIF deduction is 1600");
		}else if(gross>=100000 ) {
			System.out.println("NHIF deduction is 1700");
		}
		return 0;
		
	}
	public int netSalary(double a,double b) {
		double paye;
		double net;
      double gross= a+b;
		
		if(gross<=5999) {
			paye=0.1*gross;
			net = gross-paye-150;
			System.out.println("Your NetSalary is: "+ net);
			
		}else if(gross>=6000 && gross<=7999) {
			paye=0.1*gross;
			net = gross-paye-300;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=8000 && gross<=11999) {
			paye=0.1*gross;
			net = gross-paye-400;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=12000 && gross<=12298) {
			paye=0.1*gross;
			net = gross-paye-500;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=12299 && gross<=14999) {
			paye=0.15*gross;
			net = gross-paye-500;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=15000 && gross<=19999) {
			paye=0.15*gross;
			net = gross-paye-600;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=20000 && gross<=23886) {
			paye=0.2*gross;
			net = gross-paye-750;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=23887 && gross<=24999) {
			paye=0.2*gross;
			net = gross-paye-750;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=25000 && gross<=29999) {
			paye=0.2*gross;
			net = gross-paye-850;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=30000 && gross<=34999) {
			paye=0.2*gross;
			net = gross-paye-900;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=35000 && gross<=35472) {
			paye=0.25*gross;
			net = gross-paye-950;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=35473 && gross<=39999) {
			paye=0.25*gross;
			net = gross-paye-950;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=40000 && gross<=44999) {
			paye=0.25*gross;
			net = gross-paye-1000;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=45000 && gross<=47059) {
			paye=0.25*gross;
			net = gross-paye-1100;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=47060 && gross<=49999) {
			paye=0.3*gross;
			net = gross-paye-1100;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=50000 && gross<=59999) {
			paye=0.3*gross;
			net = gross-paye-1200;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=60000 && gross<=69999) {
			paye=0.3*gross;
			net = gross-paye-1300;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=70000 && gross<=79999) {
			paye=0.3*gross;
			net = gross-paye-1400;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=80000 && gross<=89999) {
			paye=0.3*gross;
			net = gross-paye-1500;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=90000 && gross<=99999) {
			paye=0.3*gross;
			net = gross-paye-1600;
			System.out.println("Your NetSalary is: "+ net);
		}else if(gross>=100000) {
			paye=0.3*gross;
			net = gross-paye-1700;
			System.out.println("Your NetSalary is: "+ net);
		}
		
		
		return 0;
	}

}
