package com.uttara.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class ContactApp
{

	public static void main(String[] args) 
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		int choice=0;
		String cbName;
			
		Scanner sc1  = new Scanner(System.in);
		Scanner sc2  = new Scanner(System.in);
		
		try
		{
			while(choice!=3)
			{
				System.out.println("");
				System.out.println("Enter 1 to Create Contact Book => ");
				System.out.println("Enter 2 to Load Contact Book => ");
				System.out.println("Enter 3 to Exit => ");
				
				System.out.println("");
				System.out.println("Please Enter your choice => ");
				
				
				while(!sc1.hasNextInt())
				{
					System.out.println("Enter the valid integer input");
					sc1.next();
				}		
		
				choice = sc1.nextInt();
				
				String path;
				switch(choice)
				{
				
				case 1 :
						System.out.println("Enter ContactBook name =>");
						cbName = sc1.next();
						path = "C:/MyContact/"+cbName+".cb";
						File f = new File(path);
						
						while(f.exists())
						{
							System.out.println("Contact Book allready exist...please choose another name....");
							System.out.println("Enter New Contact Book Name =>  ");
							cbName = sc1.next();
							path = "C:/MyContact/"+cbName+".cb";
							f = new File(path);
						}
						
						int choice1=0;
						while(choice1!=6)
						{
							System.out.println("");
							System.out.println("Enter 1 to add contact => ");
							System.out.println("Enter 2 to edit contact => ");
							System.out.println("Enter 3 to remove contact => ");
							System.out.println("Enter 4 to to list contacts => ");
							System.out.println("Enter 5 to to search contacts => ");
							System.out.println("Enter 6 to go back => ");
							System.out.println("");
						
							while(!sc1.hasNextInt())
							{
								System.out.println("Enter the valid integer input");
								sc1.next();
							}		
							
							choice1 = sc1.nextInt();
						
							switch(choice1)
							{
								case 1 ://add contact to contact book
										br = new BufferedReader(new FileReader(path));
										bw = new BufferedWriter(new FileWriter(path,true));
										Collection<String> coll = new ArrayList<String>();
										String w;
										System.out.println("Enter the name to add => ");
										String nameOfContact = sc2.nextLine();
										
										while( ((w=br.readLine())!=null))	
										{
											coll.add(w);
											for(String hj : coll)
											while(hj.startsWith(nameOfContact))
											{
												System.out.println("Name already contain..Name list...");
												System.out.println("Plz provide another name to add...");
												nameOfContact = sc2.nextLine();
											
											}	
										}
										Date d = new Date();
										SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
										System.out.println("Enter date of birth in formate dd/mm/yyyy =>");
										String dob = sc1.next(); 
										d = sdf.parse(dob);
													
										System.out.println("Enter Address => ");
										String address = sc2.nextLine();
																					
										System.out.println("Enter petname => ");
										String petName = sc1.next();
											
										//adding email
										String email1;
										String email="";
										boolean ChoiceEmail = true;
										while(ChoiceEmail)
										{
											System.out.println("Enter Email => ");
											email1 = sc1.next();
											email = email+email1+",";
											sc1.nextLine();
											System.out.println("Do you want to add more??? Y or N");
											String emailChoice = sc1.nextLine();	
										
											if(emailChoice.equals("y")||emailChoice.equals("Y"))
											{
												ChoiceEmail = true;
											}
											else
											{
												ChoiceEmail = false;
											}
										}			
											
										//adding phone number 
										String phoneNum1;
										String phNo="";
										boolean ChoicePh = true;
										while(ChoicePh)
										{
											System.out.println("Enter Phone no => ");
											phoneNum1 = sc1.next();
											phNo = phNo+phoneNum1+",";
											sc1.nextLine();
											System.out.println("Do you want to add more??? true or false");
											String phoneChoice = sc1.nextLine();	
										
											if(phoneChoice.equals("y")||phoneChoice.equals("Y"))
											{
												ChoicePh = true;
											}
											else
											{
												ChoicePh = false;
											}
										}	
																									
										bw.write(nameOfContact+" : ");
										bw.write(dob+" : ");
										bw.write(petName+" : ");
										bw.write(address+" : ");
										bw.write(phNo+" : ");
										bw.write(email);
										bw.newLine();
										bw.close();
										
										break;
								
								case 2://edit contact
										
										
										break;
								
								case 3 ://to remove contact
										String str;
										
										Collection<String> col = new ArrayList<String>();
										
										br = new BufferedReader(new FileReader(path));
										
										System.out.println("Enter the name to remove => ");
										nameOfContact = sc2.nextLine();
										
										while((str=br.readLine())!=null)
											{
												col.add(str);
												if(str.contains(nameOfContact))
													col.remove(str);
											}	
											
										System.out.println(col);
											
											BufferedWriter temp = new BufferedWriter(new FileWriter(path));
											
											if(!(col.isEmpty()))
											{
												for(String ad : col)
												{
													temp.write(ad);
													temp.newLine();
													
												}
												temp.close();
														
											}
											else
											{
												temp = new BufferedWriter(new FileWriter(path));
												temp.close();
											}
										
										break;
								
								case 4 ://to list contact
										int choice3=0;
										while(choice3!=4)
										{
											System.out.println("");
											System.out.println("Enter 1 to list contacts by alphabetical listing by name => ");
											System.out.println("Enter 2 to list contacts by alphabetical ordering of tags => ");
											System.out.println("Enter 3 to list contacts by Name String length => ");
											System.out.println("Enter 4 to to go back => ");			
											
											while(!sc1.hasNextInt())
											{
												System.out.println("Enter valid integer input");
												sc1.next();
											}
													
											choice3 = sc1.nextInt();
											switch(choice3)
											
											{
												case 1 ://listing by natural ordering
													Collection<String> col1 = new ArrayList<String>();
													
													while((str=br.readLine())!=null)
													{
														col1.add(str);
													}
													System.out.println(col1);
													
													break;
												
												case 2 ://list contacts by alphabetical ordering of tags
													
													
													break;
												
												case 3 ://list contacts by Name String length 

													NameLengthComparator tag = new NameLengthComparator();
													Collection<String> col2 = new TreeSet<String>(tag);	
													while((str=br.readLine())!=null)
														{
															col2.add(str);
														}
														
														System.out.println(col2);
													break;
												
												case 4 :
													System.out.println("Going back to previous menu");
													break;
												
												default :
													System.out.println("Enter a valid int input between 1-4");
													break;
											}	
										}										
											break;
								
								case 5 ://to search contact
											System.out.println("Name of search contact => ");
										break ;
								
								case 6 :System.out.println("Going back to main menu");
										break;
									
								default :
											System.out.println("Please Enter a valid integer input between 1 and 6");
										break;
							}
				
						}
						break;
				case 2 ://to Load Group	
							int choice3 = 0;
							
							while(choice3!=2)
							{
								System.out.println("");
								System.out.println("Enter 1 to load ContactBook =>");
								System.out.println("Enter 2 to go back =>");
								
								while(!sc1.hasNextInt())
								{
									System.out.println("Please Enter a valid int input");
									sc1.next();
								}
								
								choice3 =sc1.nextInt();
								
								switch(choice3)
								{
									case 1 ://to load Contact book
											System.out.println("Enter Contact book name to load => ");
											cbName = sc1.next();	
											path = "C:/MyContact/"+cbName+".cb";
											f = new File(path);
											
											while(!f.exists())
											{
												
												System.out.println("The given contact book does not exist...please provide another ContactBook Name =>");
												System.out.println("Enter the Contact Book Name =>");
												cbName = sc1.next();
												path = "C:/MyContact/"+cbName+".cb";
												f = new File(path);
											}
											
											int choice4=0;
											while(choice4!=6)
											{
												System.out.println("");
												System.out.println("Enter 1 to add contact to ContactBook "+cbName+" => ");
												System.out.println("Enter 2 to edit contact in ContactBook "+cbName+"=> ");
												System.out.println("Enter 3 to remove contact in ContactBook "+cbName+"=> ");
												System.out.println("Enter 4 to to list contacts in ContactBook "+cbName+"=> ");
												System.out.println("Enter 5 to to search contacts in ContactBook "+cbName+"=> ");
												System.out.println("Enter 6 to go back => ");
												System.out.println("");
											
												while(!sc1.hasNextInt())
												{
													System.out.println("Enter the valid integer input");
													sc1.next();
												}		
												
												choice4 = sc1.nextInt();
											
												switch(choice4)
												{
												
												case 1 :
														//to add name to existing contact book
														br = new BufferedReader(new FileReader(path));
														bw = new BufferedWriter(new FileWriter(path,true));
														Collection<String> coll = new ArrayList<String>();
														String w;
														System.out.println("Enter the name to add => ");
														String nameOfContact = sc2.nextLine();
														
														while( ((w=br.readLine())!=null))	
														{
															coll.add(w);
															for(String hj : coll)
															while(hj.startsWith(nameOfContact))
															{
																System.out.println("Name already contain..Name list...");
																System.out.println("Plz provide another name to add...");
																nameOfContact = sc2.nextLine();
															
															}	
														}
														
														//adding date of birth
														Date d = new Date();
														SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
														System.out.println("Enter date of birth in formate dd/mm/yyyy =>");
														String dob = sc1.next(); 
														d = sdf.parse(dob);	
														
														//adding address
														System.out.println("Enter Address => ");
														String address = sc2.nextLine();
														
														//adding pet name
														System.out.println("Enter petname => ");
														String petName = sc1.next();
															
														//adding email
														String email1;
														String email="";
														boolean ChoiceEmail = true;
														while(ChoiceEmail)
														{
															System.out.println("Enter Email => ");
															email1 = sc1.next();
															email = email+email1+",";
															sc1.nextLine();
															System.out.println("Do you want to add more??? Y or N");
															String emailChoice = sc1.nextLine();	
														
															if(emailChoice.equals("y")||emailChoice.equals("Y"))
															{
																ChoiceEmail = true;
															}
															else
															{
																ChoiceEmail = false;
															}
														}	
															
														//adding phone number 
														String phoneNum1;
														String phNo="";
														boolean ChoicePh = true;
														while(ChoicePh)
														{
															System.out.println("Enter Phone no => ");
															phoneNum1 = sc1.next();
															phNo = phNo+phoneNum1+",";
															sc1.nextLine();
															System.out.println("Do you want to add more??? Y or N");
															String phoneChoice = sc1.nextLine();	
														
															if(phoneChoice.equals("y")||phoneChoice.equals("Y"))
															{
																ChoicePh = true;
															}
															else
															{
																ChoicePh = false;
															}
														}	
																													
														bw.write(nameOfContact+" : ");
														bw.write(dob+" : ");
														bw.write(petName+" : ");
														bw.write(address+" : ");
														bw.write(phNo+" : ");
														bw.write(email);
														bw.newLine();
														bw.close();
												
															break;
												
												case 2 ://edit contact in ContactBook
														
													
															break;
																					
												case 3 ://to remove contact from contactBook
														String str;
														Collection<String> col = new ArrayList<String>();
														
														br = new BufferedReader(new FileReader(path));
														
														System.out.println("Enter the name to remove => ");
														nameOfContact = sc2.nextLine();
														
														while((str=br.readLine())!=null)
															{
																col.add(str);
																if(str.contains(nameOfContact.trim()))
																	col.remove(str);
															}	
															System.out.println(col);
															
															BufferedWriter temp = new BufferedWriter(new FileWriter(path));
															
															if(!(col.isEmpty()))
															{
																for(String ad : col)
																{
																	temp.write(ad);
																	temp.newLine();
																	
																}
																temp.close();
																		
															}
															else
															{
																temp = new BufferedWriter(new FileWriter(path));
																temp.close();
															}
														
															break;
												case 4 ://list name from contact book
														br = new BufferedReader(new FileReader(path));
														int choice5=0;
														while(choice5!=4)
														{
															System.out.println("");
															System.out.println("Enter 1 to list contacts by alphabetical listing by name => ");
															System.out.println("Enter 2 to list contacts by alphabetical ordering of tags => ");
															System.out.println("Enter 3 to list contacts by Name String length => ");
															System.out.println("Enter 4 to to go back => ");			
														
															while(!sc1.hasNextInt())
															{
																System.out.println("Enter valid integer input");
																sc1.next();
															}
																
															choice5 = sc1.nextInt();
															switch(choice5)
														
															{
																case 1 ://listing by natural ordering
																		Collection<String> col1 = new ArrayList<String>();
																		while((str=br.readLine())!=null)
																		{
																			col1.add(str+"\n");
																		}
																		System.out.println(col1);
																		
																		break;
																
																case 2 ://list contacts by alphabetical ordering of tags
																		TagNameComparator tag = new TagNameComparator();
																		Collection<String> temp1 = new ArrayList<String>();
																		Collection<String> col2 = new TreeSet<String>(tag);	
																		while((str=br.readLine())!=null)
																		{
																				//String [] t = str.split(":");
																				temp1.add(str);
																				//temp1.add(t [0] +":"+ t [1] +":"+ t [2] +":"+ t [3]+":"+ t [4] +":"+ t [5]);		
																				
																				
																		}
																		System.out.println(col2);
																		
																		break;
																
																case 3 ://list contacts by Name String length 
	
																		NameLengthComparator StringLength = new NameLengthComparator();
																		Collection<String> col3 = new TreeSet<String>(StringLength);	
																		
																		while((str=br.readLine())!=null)
																			{
																				col3.add(str);
																			}
																			
																			System.out.println(col3);
																			break;
																	
																case 4 ://go to previous menu
																		System.out.println("Going back to previous menu");
																		break;
																
																default :
																		System.out.println("Enter a valid int input between 1-4");
																		break;
															}
														}
															break;
												case 5 ://search contacts in ContactBook
													
															break;
																				
												case 6 ://going back
														System.out.println("Going back...");
															break;
												
												default :
														System.out.println("Enter valid int input between 1-6");
															break;
												}
											}
											
											break;
										
									case 2 ://going back
											System.out.println("Going back to main menu....");
											break;
									
									default :
											System.out.println("Please Enter int input between 1-2");
											break;
								}
							}
							break;
	
				case 3 ://Exit 
						System.out.println("Good bye!!!See you again!!!");
							break;
				default :
						System.out.println("Please Enter a valid integer input between 1 and 3");
							break;				
				
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	private static void While(boolean choice1) {
		// TODO Auto-generated method stub
		
	}

}