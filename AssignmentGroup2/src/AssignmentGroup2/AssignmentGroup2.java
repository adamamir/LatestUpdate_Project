package AssignmentGroup2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class AssignmentGroup2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int service=0;
		
		System.out.print("Choose service: "
				+ "\n1. Make up"
				+ "\n2. Jewellery"
				+ "\n3. Perfumes"
				+ "\n4. Skin care"
				+ "\n5. Hair"
				+ "\n= ");
		service = sc.nextInt();
		
		//aqilah
		if (service == 3) {
			print4();
			print1();
			print2();
			print3();
			
		}
		
		//adam
		else if (service == 2){
			printArray();
			printProcess();
			sc.close();
		}
		
		//izannuddin
		else if (service == 1){
			String[]arr= new String [] {"welcome", "to", "izans", "beauty", "shop"};     
			 printArray(arr);
			 System.out.println();
				printInfo();
				printitems();
				printtotal();
		}
		
		//saifuddin
		else if (service == 4){
			printInformations();
			printShop();
			printQuestionandReceipt();
		}
		
		//afiza
		else if (service == 5){
			printInformation();
			printItems();
			printcalculate();
		}
				
		else {
			System.out.print("Number entered are invalid.");
		}
	}
	
	//aqilah
	public static void print1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lets me know you more!");
		System.out.println("What is your name? ");
		String name = sc.next();
		System.out.println("How old are you? ");
		int age = sc.nextInt();
		System.out.println("What is your ic number? ");
		int ic = sc.nextInt();
		System.out.println("What is your gender? ");
		char gender = sc.next().charAt(0);
		System.out.println("What is your phone number? ");
		String phone = sc.next();
		System.out.println(" ");
		
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Ic number: " + ic);
		System.out.println("Gender: " + gender);
		System.out.println("HP: " + phone);
	}
	
	public static void print2() {
		
		System.out.println("\nWELCOME TO CUTIE SHOP!!");
		System.out.println("Do you interested in our shop?");
		System.out.println("What product provided in our shop you may ask?");
		String product = "PURFUME";
		System.out.println("\nOur shop sells " + product + " products");
		
		String sell[] = {"CITRUS","GOURMAND","FLORAL","FRUITY","SPICY","AQUATIC"};
		
		System.out.println("What "+ product +"?");
		System.out.println("\nWe sell "+ sell[0] +" for   $170");
		System.out.println("We sell "  + sell[1] +" for   $122");
		System.out.println("We sell "  + sell[2] +" for   $385");
		System.out.println("We sell "  + sell[3] +" for   $136");
		System.out.println("We sell "  + sell[4] +" for   $148");
		System.out.println("We sell "  + sell[5] +" for   $126");
		
	}
	
	public static void print3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nThere would be some discounts that you will get if you buy our product.");
		System.out.println("\nWould you like to buy our products? (Y for yes / N for no)");
		char ans = sc.next().charAt(0);
		
		int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0;
		double total = 0, price1=0, price2=0, price3=0, price4=0, price5=0, price6=0;
		String sell[] = {"CITRUS","GOURMAND","FLORAL","FRUITY","SPICY","AQUATIC"};
		
		if(ans == 'Y' || ans == 'y') {
			System.out.println("How much would you buy "+ sell[0] +"?");
			q1 = sc.nextInt();
			price1 = q1 * 170;
			System.out.println("How much would you buy "+ sell[1] +"?");
			q2 = sc.nextInt();
			price2 = q2 * 122;
			System.out.println("How much would you buy "+ sell[2] +"?");
			q3 = sc.nextInt();
			price3 = q3 * 385;
			System.out.println("How much would you buy "+ sell[3] +"?");
			q4 = sc.nextInt();
			price4 = q4 * 136;
			System.out.println("How much would you buy "+ sell[4] +"?");
			q5 = sc.nextInt();
			price5 = q5 * 148;
			System.out.println("How much would you buy "+ sell[5] +"?");
			q6 = sc.nextInt();
			price6 = q6 * 126;
			total = price1 + price2 + price3 + price4 + price5 + price6;
		}
		
		else if(ans == 'N' || ans == 'n') {
			System.out.println("\nThank you for visiting our shop ;)");
		}
				
		double discount = 0, dprice = 0;
		
		
		if ( total >= 200 ) {
			discount = total*25/100;
			dprice = total - discount;
		}	
		else if ( total > 100 || total < 200 ) {
			discount = total*15/100;
			dprice = total - discount;
		}
		else {
			discount = total*10/100;
			dprice = total - discount;
		}
		
		System.out.println(" ");
		
		int t=1;
		do {
			if (t>0)
				System.out.print("!");
			t++;
		} while(t<50);
		
		System.out.println("\nCUTIE SHOP!");
		System.out.println("\t\t\t\s\s\s\sQuantity\tprice");
		System.out.println("1.\t"+ sell[0] +  ":\t\t"+q1+"\t" + price1);
		System.out.println("2.\t"+ sell[1] +  ":\t"+q2+"\t" + price2);
		System.out.println("3.\t"+ sell[2] +  ":\t\t"+q3+"\t" + price3);
		System.out.println("4.\t"+ sell[3] +  ":\t\t"+q4+"\t" + price4);
		System.out.println("5.\t"+ sell[4] +  ":\t\t"+q5+"\t" + price5);
		System.out.println("6.\t"+ sell[5] +  ":\t"+q6+"\t" + price6);
		
	
		
		System.out.println(" ");
		int i=1, line=0;
		while (i <50) {
			i = line++;
			System.out.print("=");
		}
		System.out.println(" ");
		
		System.out.println("\nThe total price is:\t"+ total);
		System.out.println("Your discount will be:\t"+ discount);		
		System.out.println("Your price to be paid:\t"+ dprice);		
		
		System.out.println(" ");

		for(int e=1; e <50; e++) {
			System.out.print("=");
		}
		System.out.println(" ");
	}
	
	public static void print4() {
		Scanner sc1 =new Scanner(System.in);
		int customers=0;
		String name;
			
		System.out.println("How many customer?");
		customers = sc1.nextInt();
		System.out.print("WELCOME TO CUTIE SHOP!!");
		if (customers>5) {
			System.out.print(" We hope you enjoy ");
			String[] names = new String[customers];
			for (int i1=0; i1<names.length; i1++) {
				System.out.print("HELLO!! " +names[i1]);
			}
		}
	}//aqilah
	
	
	//adam
	public static void printArray() {
		Scanner sc = new Scanner(System.in);
		
		int customers=0;
		String name;
		
		System.out.print("For customer receptionist. How many customer? ");
		customers = sc.nextInt();
		System.out.print("Welcome to Jewellery Shop. ");
		if (customers>1) {
			System.out.print("What is your name? ");
			String[] names = new String[customers];
			for (int i=0; i<=names.length; i++) {
				names[i] = sc.next();
				System.out.println("Hello, " +names[i]);
			}
			
		}
		else if (customers == 1) {
			System.out.print("What is your name? ");
			name = sc.next();
			System.out.println("Hello, " +name);
		}
		
	}
	
	public static void printProcess() {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		double pricetotal=0, discount=0, totalprice=0, totalpricelucky=0, discountpricelucky=0;
		int size1=0, id=1;
		
		do {
			
			System.out.println("\n");
			System.out.print("Would you like to look at some recomendations from our shop? (Choose Y or N) ");
			char choose = sc.next().charAt(0);
			if (choose == 'Y') {
				System.out.println("Here we have 3 recommendations which are:");
				System.out.println("1. COLOVIS 			| Price before: RM627.00 | Price after: RM259.00 | [TOP SALE!!]");
				System.out.println("2. Her Jewellery 		| Price before: RM109.90 | Price after: RM87.92");
				System.out.println("3. ALDO 			| Price before: RM129.00 | Price after: RM87.90");
				System.out.println("\n");
				System.out.print("Which one do you want to buy? (Enter number) ");
				int item = sc.nextInt();
				
				
				if (item == 1) {
					System.out.print("Would you want to look on details for this item? (Choose Y or N) ");
					char ask = sc.next().charAt(0);
					if (ask == 'Y') {
						System.out.println("Material : Imported Titanium, 18K Rose Gold Plated, Zirconia");
						System.out.println("\n");
						System.out.print("Would you want to buy this item? (Choose Y or N) ");
						char ask2 = sc.next().charAt(0);
						if (ask2 == 'Y') {
							System.out.print("The price is RM259.00. How many quantity of this item you want? ");
							int quantity = sc.nextInt();
							pricetotal = 259*quantity;
							while (size1 <10 && size1 >30) {
								System.out.print("What size are you used? ");
								size1 = sc.nextInt();
							}
							System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
						}
						else if (ask == 'N') {
							System.out.println("Alright. Thank you.");
						}
					}
					else if (ask == 'N') {
						System.out.print("The price is RM259.00. How many quantity of this item you want? ");
						int quantity = sc.nextInt();
						pricetotal = 259*quantity;
						System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
					}
				}
				
				
				else if (item == 2) {
					System.out.print("Would you want to look on details for this item? (Choose Y or N) ");
					char ask = sc.next().charAt(0);
					if (ask == 'Y') {
						System.out.println("Material of Ring: High Quality Brass with 18K Rose / White Gold Plated (Extra coating plating 0.05mil thickness for long lasting shine)");
						System.out.println("\n");
						System.out.print("Would you want to buy this item? (Choose Y or N) ");
						char ask2 = sc.next().charAt(0);
						if (ask2 == 'Y') {
							System.out.print("The price is RM87.92. How many quantity of this item you want? ");
							int quantity = sc.nextInt();
							pricetotal = 87.92*quantity;
							System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
						}
						else if (ask == 'N') {
							System.out.println("Alright. Thank you.");
						}
					}
					else if (ask == 'N') {
						System.out.print("The price is RM87.92. How many quantity of this item you want? ");
						int quantity = sc.nextInt();
						pricetotal = 87.92*quantity;
						System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
					}
				}
				
				
				else if (item == 3) {
					System.out.println("Would you want to look on details for this item? (Choose Y or N) ");
					char ask = sc.next().charAt(0);
					if (ask == 'Y') {
						System.out.println("Assorted cuff bracelets of different designs. Metal blend");
						System.out.println("\n");
						System.out.print("Would you want to buy this item? (Choose Y or N) ");
						char ask2 = sc.next().charAt(0);
						if (ask2 == 'Y') {
							System.out.print("The price is RM87.90. How many quantity of this item you want? ");
							int quantity = sc.nextInt();
							pricetotal = 87.90*quantity;
							System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
						}
						else if (ask == 'N') {
							System.out.println("Alright. Thank you.");
						}
					}
					else if (ask == 'N') {
						System.out.print("The price is RM87.90. How many quantity of this item you want? ");
						int quantity = sc.nextInt();
						pricetotal = 87.90*quantity;
						System.out.println("Alright. I will come to you later after wrap this item. Thank you.");
					}
				}
			}
			
			else if (choose == 'N') {
				System.out.println("Thank you. Please come again.");
			}
			
			System.out.println("\n");
			System.out.println("Can you give me your nickname and phone number?");
			System.out.print("Nickname: ");
			String nickname = sc.next();
			System.out.print("Phone Number: ");
			String phone = sc.next();
			
			System.out.println("\n");
			System.out.println("\t\t************************************************************");
			System.out.println("\t\t\t\t\tYOUR RECEIPT");
			System.out.println("\t\tID Receipt Today				: #" +id);
			System.out.println("\t\tName						: " +nickname);
			System.out.println("\t\tPhone number					: " +phone);
			System.out.println("\t\tTotal price					: " + df.format(pricetotal));
			if (id == 1) {
				System.out.println("\t\tYou are lucky customer. You'll receive 20% discount.");
				discountpricelucky = pricetotal*0.2;
				totalpricelucky = pricetotal-discountpricelucky;
				if (totalpricelucky>=450) {
					discount = totalpricelucky*0.15;
					totalprice = totalpricelucky-discount;
					System.out.println("\t\tTotal price after discount			: " + df.format(totalprice));
				}
				else {
					System.out.println("\t\tTotal price after discount			: " + df.format(totalpricelucky));
				}
			}
			else {
				if (pricetotal>=450) {
				discount = pricetotal*0.15;
				totalprice = pricetotal-discount;
				System.out.println("\t\tTotal price after discount			: " + df.format(totalprice));
				}
				else {
					System.out.println("\t\tTotal price after discount			: " + df.format(pricetotal));
				}
			}
			System.out.println("\t\t\t\tTHANK YOU. PLEASE COME AGAIN");
			System.out.println("\t\t************************************************************");
			System.out.println("\n");
				id++;
		}while (id<=500);
			
			sc.close();	
	}//adam

	
	//izannuddin
	public static void printArray(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}

			public static void printInfo() {
			Scanner sc = new Scanner(System.in);	
		
			
			System.out.println("Please tell me about yourself.");
			System.out.print("What is your name?");
			String name = sc.next();
			System.out.print("How old are you? ");
			int age = sc.nextInt();
			System.out.print("What is your id number?");
			int id = sc.nextInt();
			System.out.print("What is your gender?");
			char gender = sc.next().charAt(0);
			System.out.print("What is your phone number?");
			int phone = sc.nextInt();
			
			System.out.println("\nName: " + name);
			System.out.println("Age: " + age);
			System.out.println("Id number: " + id);
			System.out.println("Gender: " + gender);
			System.out.println("HP: " + phone);
			System.out.println();
			}
			
			public static void printitems() {	
			
			System.out.println("TODAY IS A SPECIAL DAY!!!!!!!");
			System.out.println();
			
			System.out.println("product makeup");
			System.out.println();
			String[] makeup = {"lipstick","mascara","eyeliner","foundation","blusher"};
			
			System.out.println(makeup[0] + " RM20");
			System.out.println(makeup[1] + " RM25");
			System.out.println(makeup[2] + " RM15");
			System.out.println(makeup[3] + " RM30");
			System.out.println(makeup[4] + " RM10");
			System.out.println();
			}
			
			
			
			public static void printtotal() { 
				
				
				Scanner in = new Scanner(System.in);
				System.out.println("****************************************************");
				int q1= 0, q2=0, q3=0, q4=0, q5=0;
				int item1=0,item2=0,item3=0,item4=0,item5=0;
				
				String[] makeup = {"lipstick","mascara","eyeliner","foundation","blusher"};
			
				
				int lipstick=20;
				int mascara=25;
				int eyeliner=15;
				int foundation=30;
				int blusher=10;
				
				
				
				System.out.println("HOW MANY YOU WANT?");
				System.out.println();
				
				System.out.println("quantity product you want: ");
				System.out.print("->"+makeup[0]);
				q1=in.nextInt();
				item1 = (lipstick*q1);
				System.out.println("\tlipstick :"+ "RM "+item1);
				System.out.println();
				
				System.out.println("quantity product you want: ");
				System.out.print("->"+makeup[1]);
				q2=in.nextInt();
				item2 = (mascara*q2);
				System.out.println("\tmascara :"+ "RM "+item2);
				System.out.println();
				
				System.out.println("quantity product you want: ");
				System.out.print("->"+makeup[2]);
				q3=in.nextInt();
				item3 = (eyeliner*q3);
				System.out.println("\teyeliner :"+ "RM "+item3);
				System.out.println();
				
				System.out.println("quantity product you want: ");
				System.out.print("->"+makeup[3]);
				q4=in.nextInt();
				item4 = (foundation*q4);
				System.out.println("\tfoundation :"+ "RM "+item4);
				System.out.println();
				
				
				System.out.println("quantity product you want: ");
				System.out.print("->"+ makeup[4]);
				q5=in.nextInt();
				item5 = (blusher*q5);
				System.out.println("\tblusher :"+ "RM "+item5);
				System.out.println();
				
			       int i=1;
					do {
						if (i>0)
							System.out.print("*");
						i++;
					} 
					while(i<60);

				System.out.println();
				double total = (item1+item2+item3+item4+item5);
				
				
				if (total >= 100) {
					double discount = total*0.3;
					double newtotal = total-discount;
					System.out.println("Total price after discount 30% : RM"+ newtotal);
				}
				else {
					System.out.println("Total price : RM"+ total);
				}
				
				
				System.out.println("\nThank you. Please come again");
			     
	}//izannuddin
	
	
	//saifuddin
	public static void printInformations() {
		Scanner sc = new Scanner(System.in);
					
		int customers = 0;
		String name;
				
		System.out.println("For customer receptionist. How many customer?");
		customers = sc.nextInt();
		System.out.println("WELCOME TO SAI BEAUTY AND CARE SHOP.");
		if(customers>1) {
			String[] names = new String[customers];
			for(int i=0;i<names.length;i++) {
				System.out.println("\nWhat is your name?");
				names[i] = sc.next();
				System.out.println("Hello, " + names[i]);
			}
		}
		else if(customers == 1) {
			System.out.println("Please tell me about yourself.");
			System.out.println("What is your name? (nickname)");
			name = sc.next();
			System.out.println("How old are you? (in number)");
			int age = sc.nextInt();
			System.out.println("What is your ic number? (without - )");
			int ic = sc.nextInt();
			System.out.println("What is your gender? (M/F)");
			char gender = sc.next().charAt(0);
			System.out.println("What is your phone number? (without - )");
			int phone = sc.nextInt();
			System.out.println("When is your birthday year? (in number)");
			int year = sc.nextInt();
			System.out.println("When is your birthday day? (in number)");
			int day = sc.nextInt();
			System.out.println("What is your birthday month? (in word)");
			String month = sc.next();
			System.out.println(" ");
					
			System.out.println("\nName: " + name);
			System.out.println("Age: " + age);
			System.out.println("Ic number: " + ic);
			System.out.println("Gender: " + gender);
			System.out.println("HP: " + phone);
			System.out.println("Birthday: " + day +" "+ month +" "+ year);	
		}
								
	}

	public static void printShop() {
		
		System.out.println("\nWELCOME TO SAI BEAUTY AND CARE SHOP.");
		System.out.println("Do you interested in our shop?");
		System.out.println("What product or services provided in our shop you may ask?");
		String product = "skin care";
		System.out.println("\nOur shop sells " + product + " products");
		
		String sell[] = {"face serum","day lotion","night cream","sun screen","under-eye cream","cleanser","spot treatment","exfoliating scrub"};
		
		System.out.println("What "+ product +"?");
		System.out.println("\nWe sell "+ sell[0] +" for RM 23.00");
		System.out.println("We sell " + sell[1] +" for RM 32.00");
		System.out.println("We sell "+ sell[2] +" for RM 29.00");
		System.out.println("We sell "+ sell[3] +" for RM 16.00");
		System.out.println("We sell "+ sell[4] +" for RM 19.00");
		System.out.println("We sell "+ sell[5] +" for RM 15.00");
		System.out.println("We sell "+ sell[6] +" for RM 26.00");
		System.out.println("We sell "+ sell[7] +" for RM 10.00");
	}
	
	public static void printQuestionandReceipt() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nThere would be some discounts that you will get if you buy our product.");
		System.out.println("\nWould you like to buy our products? (Y for yes / N for no)");
		char ans = sc.next().charAt(0);
		
		int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0, q7=0, q8=0;
		double total = 0, price1=0, price2=0, price3=0, price4=0, price5=0, price6=0, price7=0, price8=0;
		String sell[] = {"face serum","day lotion","night cream","sun screen","under-eye cream","cleanser","spot treatment","exfoliating scrub"};
		
		if(ans == 'Y' || ans == 'y') {
			System.out.println("How much would you buy "+ sell[0] +"?");
			q1 = sc.nextInt();
			price1 = q1 * 23;
			System.out.println("How much would you buy "+ sell[1] +"?");
			q2 = sc.nextInt();
			price2 = q2 * 32;
			System.out.println("How much would you buy "+ sell[2] +"?");
			q3 = sc.nextInt();
			price3 = q3 * 29;
			System.out.println("How much would you buy "+ sell[3] +"?");
			q4 = sc.nextInt();
			price4 = q4 * 16;
			System.out.println("How much would you buy "+ sell[4] +"?");
			q5 = sc.nextInt();
			price5 = q5 * 19;
			System.out.println("How much would you buy "+ sell[5] +"?");
			q6 = sc.nextInt();
			price6 = q6 * 15;
			System.out.println("How much would you buy "+ sell[6] +"?");
			q7 = sc.nextInt();
			price7 = q7 * 26;
			System.out.println("How much would you buy "+ sell[7] +"?");
			q8 = sc.nextInt();
			price8 = q8 * 10;
			total = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8;
		}
		
		else if(ans == 'N' || ans == 'n') {
			System.out.println("\nThank you for visiting our shop ;)");
		}
				
		double discount = 0, dprice = 0;
		
		
		if ( total >= 200 ) {
			discount = total*30/100;
			dprice = total - discount;
		}	
		else if ( total > 100 || total < 200 ) {
			discount = total*20/100;
			dprice = total - discount;
		}
		else {
			discount = total*10/100;
			dprice = total - discount;
		}
		
		System.out.println(" ");
		
		int t=1;
		do {
			if (t>0)
				System.out.print("*");
			t++;
		} while(t<50);
		
		System.out.println("\nSAI BEAUTY AND CARE SHOP.");
		System.out.println("\t\t\t\s\s\s\sQuantity\tprice");
		System.out.println("1.\t"+ sell[0] +":\t\t"+q1+"\t" + price1);
		System.out.println("2.\t"+ sell[1] +":\t\t"+q2+"\t" + price2);
		System.out.println("3.\t"+ sell[2] +":\t\t"+q3+"\t" + price3);
		System.out.println("4.\t"+ sell[3] +":\t\t"+q4+"\t" + price4);
		System.out.println("5.\t"+ sell[4] +":\t"+q5+"\t" + price5);
		System.out.println("6.\t"+ sell[5] +":\t\t"+q6+"\t" + price6);
		System.out.println("7.\t"+ sell[6] +":\t\t"+q7+"\t" + price7);
		System.out.println("8.\t"+ sell[7] +":\t"+q8+"\t" + price8);
		
		System.out.println(" ");
		int i=1, line=0;
		while (i <50) {
			i = line++;
			System.out.print("-");
		}
		System.out.println(" ");
		
		System.out.println("\nThe total price is:\t"+ total);
		System.out.println("Your discount will be:\t"+ discount);		
		System.out.println("Your price to be paid:\t"+ dprice);		
		
		System.out.println(" ");
	
		for(int e=1; e <50; e++) {
			System.out.print(".");
		}
		System.out.println(" ");					
	}//saifuddin

	
	//afiza
	public static void printInformation() {
		Scanner in = new Scanner(System.in);	
		int customers=0;	
		String name;
		
		System.out.print("How many customer?");
		customers = in.nextInt();
		if(customers>1) {
			String[] name1 = new String[customers];
			for(int i=0;i<name1.length;i++) {
				System.out.print("What is your name?");
				name1[i] = in.next();
				System.out.println("Hi and welcome to our shop  " + name1[i]);
			}
		}
		else if(customers == 1) {
			System.out.println("What is your name?");	
			name = in.next();
			System.out.println("Hi and welcome to our shop  " + name);
			System.out.print("NRIC: ");
			int nric = in.nextInt();
			System.out.print("Gender: ");
			String gender = in.next();
			System.out.print("Age: ");
			int age = in.nextInt();
			System.out.print("Birthday: ");
			String birthday = in.next();
			System.out.print("Home Address: ");
			String homeaddress = in.next();
		}
	}
		
		public static void printItems() {	
		System.out.println(" ");
		int i=1, line4=0;
		while (i <50) {
			i = line4++;
			System.out.print("_");}
			
		System.out.println();
		System.out.println("We Provide Hair treatment product for Man and Women");
		System.out.println();
		
		System.out.println("Discount 50% for more than RM100.00 per purchase!!!!!!");
		System.out.println();
		
		String[] treatment = {"Keratin","Scalp","Hot Oil","Moisture","Toning"};
		
		System.out.println(treatment[0] + " RM50.00 per bottle");
		System.out.println(treatment[1] + " RM60.00 per bottle");
		System.out.println(treatment[2] + " RM80.00 per bottle");
		System.out.println(treatment[3] + " RM60.00 per bottle");
		System.out.println(treatment[4] + " RM50.00 per bottle");
		
		
		for(int f=1; f <50; f++) {
			System.out.print("_");
		}
		System.out.println();
		}
		
		public static void printcalculate() { 
			Scanner in = new Scanner(System.in);
				 
			int first=0, sec=0, third=0, fourth=0, fifth=0;
			int quantity1= 0, quantity2=0, quantity3=0, quantity4=0, quantity5=0;
			int item1=0,item2=0,item3=0,item4=0,item5=0;
			
			String treatment[] = {"Keratin","Scalp","Hot Oil","Moisture","Toning"};
			int price [] = {50,60,80,60,50};
			
			System.out.println(treatment[0]);
			System.out.println();
			System.out.print("Enter quantity product:");
			quantity1=in.nextInt();
			
			item1 = (price[0] *quantity1);
			System.out.println(treatment[0] + " RM " + item1);	
			
			//////////////////////////////////////////////////////////////////////////////////////
			System.out.println();
			System.out.println(treatment[1]);
			System.out.println();
			
			System.out.print("Enter quantity product:");
			quantity2=in.nextInt();
			item2 = (price[1]*quantity2);
			System.out.println(treatment[1] + " RM " + item2);
			
			/////////////////////////////////////////////////////////////////////////////////////
			System.out.println();
			System.out.println(treatment[2]);
			System.out.println();
			
			System.out.print("Enter quantity product:");
			 quantity3=in.nextInt();
			item3 = (price[2]*quantity3);
			System.out.println(treatment[2] + " RM " + item3);
			///////////////
			System.out.println();
			System.out.println(treatment[3]);
			System.out.println();
			
			System.out.print("Enter quantity product:");
			quantity4=in.nextInt();
			item4 = (price[3]*quantity4);
			System.out.println(treatment[3] + " RM " + item4);
			//////////////////////////////////////////////////////////////////////////////////
			System.out.println();
			System.out.println(treatment[4]);
			System.out.println();
			
			System.out.print("Enter quantity product:");
			quantity5=in.nextInt();
			item5 = (price[4]*quantity5);
			System.out.println(treatment[4] + " RM " + item5);
			///////////////////////////////////////////////////////////////////////////////
				System.out.println(" ");
			
			System.out.println();
			double total = (item1+item2+item3+item4+item5);
			
			System.out.println("Total price : RM"+ total);
		}
}//afiza
		

