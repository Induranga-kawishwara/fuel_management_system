import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Arrays_version{
	public static String[] Queues_1 = new String[6];
	public static String[] Queues_2 = new String[6];
	public static String[] Queues_3 = new String[6];
	public static String[] name_remove = new String[6];
	public static String[] alfali = new String[6];
	public static int fuel = 6600;
	public static String file = "";
	public static void main(String[] args){
		menu();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void menu(){
		Scanner input = new Scanner(System.in);
		/////////////////////////////////////////////////////////
		for(int i=0;i<=97;i++){//not important
			if(i<3){
				System.out.print("\t");}
			else{
				System.out.print("-");
			}
		}
		/////////////////////////////////////////////////////////////
		System.out.println("\n\t\t\t100 or VFQ: View all Fuel Queues.\n\t\t\t101 or VEQ: View all Empty Queues.\n\t\t\t102 or ACQ: Add customer to a Queue\n\t\t\t103 or RCQ: Remove a customer from a Queue.(From a specific location)\n\t\t\t104 or PCQ: Remove a served customer.\n\t\t\t105 or VCS: View Customers Sorted in alphabetical order (Do not use library sort routine)\n\t\t\t106 or SPD: Store Program Data into file.\n\t\t\t107 or LPD: Load Program Data from file.\n\t\t\t108 or STK: View Remaining Fuel Stock.\n\t\t\t109 or AFS: Add Fuel Stock.\n\t\t\t999 or EXT: Exit the Program.");
		//////////////////////////////////////////////////////////
		for(int i=0;i<=97;i++){//not important
			if(i<3){
				System.out.print("\t");}
			else{
				System.out.print("-");
			}
		}
		///////////////////////////////////////////////////		
		System.out.print("\nWhat is your choice? ");
		String choice = input.nextLine();
		choice = (choice.toUpperCase());
		System.out.println();
		switch(choice){
			case "100":
			case "VFQ":
				VFQ();
				menu();
				break;
			case "101":
			case "VEQ":
				VEQ();
				menu();
				break;
			case "102":
			case "ACQ":
				System.out.println("---------------------ADD_customer------------------------");
				System.out.print("\nWhat is the name??");
				String name = input.nextLine();
				System.out.print("\n(we have 3 Quenes)which Queues??");
				int Queues_Add = input.nextInt();
				Add(name,Queues_Add);
				menu();
				break;
			case "103":
			case "RCQ":
				System.out.println("---------------------Remove_customer from a specific location ------------------------");
				System.out.print("\nWhat name do you want to remove ??");
				String name_re = input.nextLine();
				System.out.print("\n(we have 3 Quenes)which Queues??");
				int Quenes_re = input.nextInt();
				Remove(name_re,Quenes_re);
				menu();
				break;
			case "104":
			case "PCQ":
				System.out.println("---------------------Remove a served customer------------------------");
				System.out.print("\n(we have 3 Quenes)which Queues??");
				int remove = input.nextInt();
				served(remove);
				menu();
				break;
			case "105":
			case "VCS":
				System.out.println("--------------------- View Customers Sorted in alphabetical order -------------------------");
				alphabetical();
				menu();
				break;
			case "106":
			case "SPD":
				System.out.println("---------------------Store Program Data into file-------------------------");
				System.out.print("\nEnter a name to create a file?  ");
				file = input.nextLine();
				store();
				menu();
				break;
			case "107":
			case "LPD":
				System.out.println("---------------------Load Program Data from file-------------------------\n");
				LPD();
				menu();
				break;
			case "108":
			case "STK":
				System.out.println("---------------------View Remaining Fuel Stock-------------------------\n");
				System.out.println("The remaining fuel stock is "+fuel+" liters");
				break;
			case "109":
			case "AFS":
				System.out.println("---------------------Add Fuel Stock.-------------------------\n");
				System.out.print("\nHow much fuel stock do you want to add(add as liters)??");
				int add = input.nextInt();
				fuel+=add;
				menu();
				break;
			case "999":
			case "EXT":
				System.out.println("Thanks for use this program");
				break;
			default:
				System.out.println("Read menu the correctly !!!!!!!!! ");
				menu();
				break;
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void VFQ(){
		System.out.println("---------------------Queues_01------------------------");
		System.out.println();
		for(int j=1;j <= Queues_1 .length;j++){
				if(Queues_1[j-1]==null){
					System.out.println(j+".Empty");
					}
				else{
					System.out.println(j+"."+Queues_1[j-1]);
					}	
	   }
		System.out.println();
		System.out.println("---------------------Queues_02------------------------");
		System.out.println();
		for(int j=1;j <= Queues_2 .length;j++){
			if(Queues_2[j-1]==null){
				System.out.println(j+".Empty");
				}
			else{
				System.out.println(j+"."+Queues_2[j-1]);
				}
		}		
		System.out.println();
		System.out.println("---------------------Queues_03------------------------");
		System.out.println();
		for(int j=1;j <= Queues_3.length;j++){
			if(Queues_3[j-1]==null){
				System.out.println(j+".Empty");
				}
			else{
				System.out.println(j+"."+Queues_3[j-1]);
				}	
		}	
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void VEQ(){
		System.out.println("---------------------Queues_01------------------------");
		for(int j=0;j < 6;j++){
			if(Queues_1[j]==null){
				System.out.println((j+1)+".empty");
				}
			else{
				continue;
				}
		}		
		System.out.println("---------------------Queues_02------------------------");		
		for(int j=0;j < Queues_2 .length;j++){
			if(Queues_2[j]==null){
				System.out.println((j+1)+".empty");
				}
			else{
				continue;
				}	
		}
		System.out.println("---------------------Queues_03------------------------");
		for(int j=0;j < Queues_3 .length;j++){
			if(Queues_3[j]==null){
				System.out.println((j+1)+".empty");
				}
			else{
				continue;
				 }
		}		 	
		System.out.println();
			
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void Add(String name,int Queues_Add){
		switch(Queues_Add){
			case 1 :
				for(int j=0;j < Queues_1.length;j++){
					if(Queues_1[j]==null){
						Queues_1[j]=name;
						System.out.println("\nYou are add as "+(j+1)+" customer in the queues ");
						break;					
						}
					else{
						if(j<6){
							continue;
						}
						else{
							System.out.println("This queues is full so add another queues");
							}

						}
				}	
				break;
					
			case 2:
				for(int j=0;j < Queues_1.length;j++){
					if(Queues_1[j]==null){
						Queues_1[j]=name;
						System.out.println("\nYou are add as "+(j+1)+" customer in the queues");
						break;					
						}
					else{
						if(j<6){
							continue;
						}
						else{
							System.out.println("This queues is full so add another queues");
							}

						}
				}	
				break;
			case 3 :
				for(int j=0;j < Queues_1.length;j++){
					if(Queues_1[j]==null){
						Queues_1[j]=name;
						System.out.println("\nYou are add as "+(j+1)+" customer in the queues");
						break;					
						}
					else{
						if(j<6){
							continue;
						}
						else{
							System.out.println("This queues is full so add another queues");
							}

						}

				}	
				break;
			default:
				System.out.println("read commands correctly");
				break;
			
		}

	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void Remove(String name_re,int Quenes_re){
		String find="";
		switch(Quenes_re){
			case 1 :
				for(int i=0;i<6;i++){
					if(Queues_1[i]==null){
						continue;
					}
					else if(Queues_1[i].equals(name_re)){
						Queues_1[i]=null;
						find="true";
						break;
					}
				}
				if(find.equals("true")){
					int less=0;
					for(int i=0;i<6;i++){
						if(Queues_1[i]!=null){
							name_remove[less]=Queues_1[i];
							less++;

						}else{continue;}

					}
					Queues_1=name_remove;
				}else{
					System.out.println("Can't find you enterd name");}
				
				System.out.println(Arrays.toString(Queues_1));
				break;
			case 2 :
				for(int i=0;i<6;i++){
					if(Queues_2[i]==null){
						continue;
					}
					else if(Queues_2[i].equals(name_re)){
						Queues_2[i]=null;
						find="true";
						break;
					}
				}
				if(find.equals("true")){
					int less1=0;
					for(int i=0;i<6;i++){
						if(Queues_2[i]!=null){
							name_remove[less1]=Queues_2[i];
							less1++;

						}else{continue;}
					}
					Queues_2=name_remove;
				}else{
					System.out.println("Can't find you enterd name");}
				System.out.println(Arrays.toString(Queues_2));
				break;
			case 3 :
				for(int i=0;i<6;i++){
					if(Queues_3[i]==null){
						continue;
					}
					else if(Queues_3[i].equals(name_re)){
						find="true";
						Queues_2[i]=null;
						break;
					}
				}
				if(find.equals("true")){
					int less2=0;
					for(int i=0;i<6;i++){
						if(Queues_3[i]!=null){
							name_remove[less2]=Queues_3[i];
							less2++;

						}else{continue;}
					}
					Queues_3=name_remove;
				}else{
					System.out.println("Can't find you enterd name");}
				System.out.println(Arrays.toString(Queues_3));
				break;

			default:
				System.out.println("Invalid input");
		}

	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void served(int remove){
		switch(remove){
			case 1 :
				Queues_1[0]=null;
				fuel-=10;

				int lis=0;
				int less=0;
				for(int i=0;i<6;i++){
					if(Queues_1[i]!=null){
						name_remove[less]=Queues_1[i];
						less++;

					}else{
						lis++;
						continue;}

					}
				Queues_1=name_remove;
				if(lis == 6){
					System.out.println("this Queues is empty");}
				
				else{
					System.out.println(Arrays.toString(Queues_1));
					System.out.println("successfuly removed served customer");};
				break;
			case 2 :
				Queues_2[0]=null;
				fuel-=10;
				int lis1=0;
				int less1=0;
				for(int i=0;i<6;i++){
					if(Queues_2[i]!=null){
						name_remove[less1]=Queues_2[i];
						less1++;

					}else{
						lis1++;
						continue;}

					}
				Queues_2=name_remove;
				if(lis1 == 6){
					System.out.println("this Queues is empty");}
			
				else{
					System.out.println(Arrays.toString(Queues_2));
					System.out.println("successfuly removed served customer");};
				break;
			case 3 :
				Queues_3[0]=null;
				fuel-=10;
				int lis2=0;
				int less2=0;
				for(int i=0;i<6;i++){
					if(Queues_3[i]!=null){
						name_remove[less2]=Queues_3[i];
						less2++;

					}else{
						lis2++;
						continue;}

				}
				Queues_3=name_remove;
				if(lis2 == 6){
					System.out.println("this Queues is empty");}
			
			else{
				System.out.println(Arrays.toString(Queues_3));
				System.out.println("successfuly removed served customer");};
			break;
			default:
				System.out.println("Invalid input");

	
		}
		if(fuel==500){
			System.out.println("Warning :- the stock reached to the 500 liters ");
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void alphabetical(){
		String temp;
		System.out.println("---------------------Queues_01------------------------");
		alfali = Queues_1;
		for(int i=0;i<alfali.length;i++){
			for(int k =i+1;k<alfali.length;k++){
				if(alfali[i]==null || alfali[k]==null){
					continue;
				}
				else{
					if(alfali[i].compareTo(alfali[k])>0){
						temp = alfali[i];
						alfali[i] = alfali[k];
						alfali[k]=temp;
						}
					}
			}
		}
		for(String w : alfali){
			if(w==null){
				continue;
			}else{
				System.out.println(w);}
		}
			
		System.out.println("---------------------Queues_02------------------------");
	    alfali = Queues_2;
		for(int i=0;i<alfali.length;i++){
			for(int k =i+1;k<alfali.length;k++){
				if(alfali[i]==null || alfali[k]==null){
					continue;
				}
				else{
					if(alfali[i].compareTo(alfali[k])>0){
						temp = alfali[i];
						alfali[i] = alfali[k];
						alfali[k]=temp;
					}
				}
			}
		}
		for(String w : alfali){
			if(w==null){
				continue;
			}else{
				System.out.println(w);}
		}
		
		System.out.println("---------------------Queues_03------------------------");
		alfali = Queues_3;
		for(int i=0;i<alfali.length;i++){
			for(int k =i+1;k<alfali.length;k++){
				if(alfali[i]==null || alfali[k]==null){
					continue;
				}
				else{
					if(alfali[i].compareTo(alfali[k])>0){
						temp = alfali[i];
						alfali[i] = alfali[k];
						alfali[k]=temp;
					}
				}
			}
		}
		for(String w : alfali){
			if(w==null){
				continue;
			}else{
				System.out.println(w);}
		}
		System.out.println();
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void store(){
		try{
			File txt = new File(file+".txt");
			boolean x =(txt.createNewFile());
		if(x==false){
			System.out.println("\nWarning!!!!!!!!!!!!!\n\nAlrady created txt file using this name!!!!!");
		}else{
			PrintWriter wo = new PrintWriter(txt);
			wo.println("---------------------Queues_01------------------------\n");
			for(int j=1;j <= Queues_1 .length;j++){
				if(Queues_1[j-1]==null){
					wo.println(j+".Empty");
					}
				else{
					wo.println(j+"."+Queues_1[j-1]);
					}	
			}
			wo.println("\n---------------------Queues_02------------------------\n");
			for(int j=1;j <= Queues_2 .length;j++){
				if(Queues_2[j-1]==null){
					wo.println(j+".Empty");
					}
				else{
					wo.println(j+"."+Queues_2[j-1]);
					}	
			}
			wo.println("\n---------------------Queues_03------------------------\n");
			for(int j=1;j <= Queues_3.length;j++){
				if(Queues_3[j-1]==null){
					wo.println(j+".Empty");
					}
				else{
					wo.println(j+"."+Queues_3[j-1]);
					}	
			}
			wo.close();
			System.out.println("\nSuccessfuly Saved data into file");
	      }
	    }
		catch(Exception e){
			System.out.println("Something Wrong!!!!");
		}	

		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void LPD(){
		System.out.println(file);
		try{
			FileReader reader = new FileReader(file+".txt");
			int data = reader.read();
			while(data != -1){
				System.out.print((char)data);
				data=reader.read();

			}
			reader.close();
		}catch(Exception e){
			System.out.println("can't find file");
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

}