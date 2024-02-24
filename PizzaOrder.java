import java.util.*;
public class PizzaOrder
{
	
	//StandoutPizzasn cost
	int DragonfireMargherita = 370;
	int VampireSlayer = 499;
	int DragonfirePaneer = 550;
	int PestoVegParadiso = 599;
	int CluckerPepperoni = 450;
	int FetaTandooriThunderChicken = 549;
	int PestoChickenParadiso = 550;
	int BadBoyButterChicken = 599;
	int ChickenKebabKaboodie = 699;
	//Semizzas cost
	int MargheritaSemizza = 175;
	int ArabianNightsSemizza = 299;
	int firePannerSemizza = 330;
	int PestoVegsemizza = 360;
	int ChickenTikkaSemizza = 270;
	int DoubleChickenFeastSemizza = 350;
	int RajasthaniHeatwaveSemizza = 399;
	//Desserts & Beverages
	int ChocoLavaCake = 109;
	int ThumsUp = 67;
	int CocaCola = 67;
	int MasalaLemonade = 46;
	int ChocolateIndulgenceBrownie = 159;
	int JeeraMasalaSoda = 57;
	int GreenApple = 57;
	int ch;
	int quantity;
	int total;
	String again;
	
	Scanner sc = new Scanner(System.in);
	
	//displaymenu
	public void displayMenu()
	{
		System.out.println("*****************Welcome to OvenStory*****************");
		System.out.println("======================================================");
		System.out.println();
		System.out.println("*****************Standout Veg Pizzas******************");
		System.out.println("======================================================");
		System.out.println("  1.Dragonfire Margherita(serves 2)              370/-	  ");
		System.out.println("  2.Vampire Slayer(serves 2)        	   	 499/-	  ");
		System.out.println("  3.Dragon fire Paneer(serves 2)                 550/-	  ");
		System.out.println("  4.Pesto Veg Paradiso(serves 2)                 599/-	  ");
		System.out.println();
		System.out.println("***************Standout Non-Veg Pizzas****************");
		System.out.println("======================================================");
		System.out.println("  5.Clucker Pepperoni(serves 2)                  450/-	  ");
		System.out.println("  6.Feta Tandoori Thunder Chicken(serves 2)      549/-	  ");
		System.out.println("  7.Pesto Chicken Paradiso(serves 2)             550/-	  ");
		System.out.println("  8.Bad Boy Butter Chicken(serves 2)             599/-	  ");
		System.out.println("  9.Chicken Kebab Kaboodie(serves 2)             699/-	  ");
		System.out.println();
		System.out.println("*****************Classic Veg Semizzas*****************");
		System.out.println("======================================================");
		System.out.println("  10.Margherita Semizza(Half Pizza serves 1)     175/-	  ");
		System.out.println("  11.ArabianNights Semizza(Half Pizza serves 1)  299/-	  ");
		System.out.println("  12.fire Panner Semizza(Half Pizza serves 1)    330/-	  ");
		System.out.println("  13.Pesto Veg semizza(Half Pizza serves 1)      360/-	  ");
		System.out.println();
		System.out.println("***************Classic Non-veg Semizzas***************");
		System.out.println("======================================================");
		System.out.println("  14.Chicken Tikka Semizza(Half Pizza serves 1)  270/-	  ");
		System.out.println("  15.Double Chicken Feast(Half Pizza serves 1)   350/-	  ");
		System.out.println("  16.Rajasthani Heatwave(Half Pizza serves 1)    399/-	  ");
		System.out.println();
		System.out.println("*****************Desserts & Beverages*****************");
		System.out.println("======================================================");
		System.out.println("  17.Choco Lava Cake  			         109/-	  ");
		System.out.println("  18.Thums Up 330 ml Can   		          67/-	  ");
		System.out.println("  19.Coca-Cola Bottle(475 ML)                     67/-	  ");
		System.out.println("  20.Masala Lemonade(180 ML)  	                  46/-	  ");
		System.out.println("  21.Chocolate Indulgence Brownie                159/-	  ");
		System.out.println("  22.SWIG Jeera Masala Soda    	                  57/-	  ");
		System.out.println("  23.SWIG Green Apple    		          57/-	  ");
		System.out.println("  24.Exit    		        	  					  ");
		System.out.println("======================================================");
		System.out.println("           What do you want to order today??          ");
		
	}
	
	//GenerateBill
	public void generatebill()
	{
		System.out.println();
		System.out.println("***************** Thankyou for Ordering *****************");
		System.out.println("********************Your Bill is :" +total+"********************");
	}
	
	
	//orderprocess
	public void order()
	{
		while(true)
		{
		System.out.print("Enter your order:");
		ch=sc.nextInt();
			switch(ch)
			{
				case 1://DragonfireMargherita
				System.out.println("You have ordered Dragonfire Margherita Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*DragonfireMargherita;
				break;
			
				case 2://VampireSlayer
				System.out.println("You have ordered Vampire Slayer Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*VampireSlayer;
				break;
				
				case 3://DragonfirePaneer
				System.out.println("You have ordered Dragonfire Dragon fire Paneer Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*DragonfirePaneer;
				break;
				
				case 4://PestoVegParadiso
				System.out.println("You have ordered Pesto Veg Paradiso Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*PestoVegParadiso;
				break;
				
				case 5://CluckerPepperoni
				System.out.println("You have ordered Clucker Pepperoni Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*CluckerPepperoni;
				break;
				
				case 6://FetaTandooriThunderChicken
				System.out.println("You have ordered Feta Tandoori Thunder Chicken Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*FetaTandooriThunderChicken;
				break;
				
				case 7://PestoChickenParadiso
				System.out.println("You have ordered Pesto Chicken Paradiso Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*PestoChickenParadiso;
				break;
				
				case 8://BadBoyButterChicken
				System.out.println("You have ordered Bad Boy Butter Chicken Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*BadBoyButterChicken;
				break;
				
				case 9://ChickenKebabKaboodie
				System.out.println("You have ordered Chicken Kebab Kaboodie Pizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*ChickenKebabKaboodie;
				break;
				
				case 10://MargheritaSemizza
				System.out.println("You have ordered Margherita Semizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*MargheritaSemizza;
				break;
				
				case 11://ArabianNightsSemizza
				System.out.println("You have ordered Arabian Nights Semizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*ArabianNightsSemizza;
				break;
				
				case 12://firePannerSemizza
				System.out.println("You have ordered fire Panner Semizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*firePannerSemizza;
				break;
				
				case 13://PestoVegsemizza
				System.out.println("You have ordered Pesto Veg semizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*PestoVegsemizza;
				break;
				
				case 14://ChickenTikkaSemizza
				System.out.println("You have ordered Chicken Tikka Semizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*ChickenTikkaSemizza;
				break;
				
				case 15://DoubleChickenFeastSemizza
				System.out.println("You have ordered Double Chicken Feast Semizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*DoubleChickenFeastSemizza;
				break;
				
				case 16://RajasthaniHeatwaveSemizza
				System.out.println("You have ordered Rajasthani Heatwave Semizza");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*RajasthaniHeatwaveSemizza;
				break;
				
				case 17://ChocoLavaCake
				System.out.println("You have ordered ChocoLavaCake");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*ChocoLavaCake;
				break;
				
				case 18://ThumsUp
				System.out.println("You have ordered Thums Up 330 ml Can");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*ThumsUp;
				break;
				
				case 19://CocaCola
				System.out.println("You have ordered Coca-Cola Bottle(475 ML)");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*CocaCola;
				break;
				
				case 20://MasalaLemonade
				System.out.println("You have ordered Masala Lemonade(180 ML)");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*MasalaLemonade;
				break;
				
				case 21://ChocolateIndulgenceBrownie
				System.out.println("You have ordered Chocolate Indulgence Brownie");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*ChocolateIndulgenceBrownie;
				break;
				
				case 22://JeeraMasalaSoda
				System.out.println("You have ordered SWIG Jeera Masala Soda");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*JeeraMasalaSoda;
				break;
				
				case 23://GreenApple
				System.out.println("You have ordered SWIG Green Apple");
				System.out.println();
				System.out.println("Enter the desiered quantity:");
				quantity = sc.nextInt();
				total = total+quantity*GreenApple;
				break;
				
				case 24://Exit
				System.exit(1);
				break;
				
				default:
				break;
			}
			System.out.println();
			System.out.print("Do you wish to order anything else(yes/no) : ");
			again=sc.next();
			if(again.equals("yes"))
			{order();}
		    else if(again.equals("no"))
			{generatebill();
			System.exit(1);
			}
			else{System.out.println("Invalid Choice");}
			
		}
		
	}
	
}