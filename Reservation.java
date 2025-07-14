import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;
class R
{
	static Scanner sc=new Scanner(System.in);
	private String email;
	private String Username;
	private String pass;
	private String phoneno;
	private String name;
	private String USERNAME_PATTERN =
            "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";

    	private Pattern pattern = Pattern.compile(USERNAME_PATTERN);
	

	boolean validate_name(String name)
	{
		int c=0;
		for(int i=0;i<name.length();i++)
		{
			if(!Character.isLetter(name.charAt(i)))
			{
				c++;
			}
		}
		if(c==0)
			return true;
		else
			return false;
	}

	public boolean validate_mail(String email) 
	{
        	String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        	java.util.regex.Pattern p =java.util.regex.Pattern.compile(ePattern);
        	java.util.regex.Matcher m = p.matcher(email);
        	return m.matches();
	}

	public  boolean validate_username(String username)
 	{
        	Matcher matcher = pattern.matcher(username);
        	return matcher.matches();
    	}

	public boolean validate_phone(String str)  
	{  
	
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
		//the matcher() method creates a matcher that will match the given input against this pattern  
		Matcher match = ptrn.matcher(str);  
		 
		return (match.find() && match.group().equals(str));  
		/*This checks if there’s a match and confirms that the entire input string matches the pattern exactly.*/
	}
	
	public boolean validate_password(String password)
    	{
        	// Regex to check valid password.
        	String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])"+ "(?=\\S+$).{8,20}$";
              	Pattern p = Pattern.compile(regex);
         	if (password == null) 
		{
            		return false;
        	}
        	Matcher m = p.matcher(password);
           	return m.matches();
    	}

	void setEmail(String email)
	{
	    this.email = email;
	}
	void setUsername(String username)
	{
		this.username=username;
	}
	void setPassword(String password) 
	{
	    this.password = password;
	}

	void setPhoneno(String phoneno) 
	{
	    this.phoneno = phoneno;
	}

	void setName(String name) 
	{
	    this.name = name;
	}

	String getPassword()
	{
	    return this.pass;
	}

	String getUsername()
	{
	    return this.Username;
	}

	String getEmail() 
	{
	    return this.email;
	}

	String getPhoneno() 
	{
	    return this.phoneno;
	}

	String getName() 
	{
	    return this.name;
	}

	void register()
	{
		System.out.println();
		System.out.println("WELCOME TO REGISTRATION");
	    	while (true) 
	    	{
			System.out.println();
	        	System.out.print("Enter your name:");
	        	setName(sc.next());
	        	if (validate_name(name)) 
	        	{
	           		 break;
	        	}
	        	else 
	        	{
	            	System.out.println("Invalid Name, it should contain only letters!");
	  	      }
	    	}
	   	while (true) 
	    	{
			System.out.println();
	        	System.out.print("Enter your email:");			        			
			setEmail(sc.next());
	        	if (validate_mail(email)) 
	        	{
	            		break;
	        	} 
	        	else 
	        	{
	            		System.out.println("Invalid Email, email should be in the format: myname@gmail.com ");
	        	}
	    	}
	    	while (true) 
	    	{
			System.out.println();
	        	System.out.print("Enter your Username:");
	     	        setUsername(sc.next());
	        	if (validate_username(username)) 
	       		{
	            		break;
	        	} 
	        	else 
	        	{
	            		System.out.println("  Username can only use  alpha-numeric characters ");
	        	}
	    	}
	    	while (true) 
	    	{
			System.out.println();
	        	System.out.print("Enter your password:");
	       	        setPassword(sc.next());
	        	if (validate_password(password)) 
	       	 	{
	            		break;
	        	} 
	        	else 
	        	{
	            		System.out.println("  Password must have a length of 8 characters which includes at least one capital letter, one small letter, one special character, and one numeric character");
	        	}
	    	}	
	    	while (true) 
	    	{
			System.out.println();
	        	System.out.print("Enter your Phone number:");
	       	        setPhoneno(sc.next());
	        	if (validate_phone(phoneno)) 
	        	{
	        	    break;
	        	}
	        	else
	        	{
	            		System.out.println("  Phone number should contain only 10 digits and it should not contain any letters or special symbols");
	        	}
	    	}
	    	 
		System.out.println();
		System.out.println("	Do You like to Save or go back to changes	");
		System.out.println("\u001B[32;107;1m	Save	"+User4.bl+"\u001b[31;107;1m	Back	"+User4.bl);
		String sav=sc.next();
		String Save="Save";
		String Back="Back";
		if(Save.equalsIgnoreCase(sav))
		{
			System.out.println("\u001B[32m	Registration Successful	\u001B[0m");
			new User4().login();
			
		}
		else if(Back.equalsIgnoreCase(sav))
		{
			register();
		}
   		
	}
	
	private String username="c";
	private String password="1";
	private long phone_no=987654321;
	String getu()
	{
 		return username;
	}
	void setu(String user)
	{
		this.username=user;
	}
	String getp()
	{
 		return password;
	}
	void setp(String pass)
	{
		this.password=pass;
	}
	long get()
	{
 		return phone_no;
	}
	void set(long phone_no)
	{
		this.phone_no=phone_no;
	}
}
class User4
{
	static String green="\u001B[32;1m";
	static String red="\u001B[31;1m";
	static String bl="\u001B[00;1m";
	static String blue="\u001B[34;1m";
	static String yellow="\u001B[33;1m";
	static String pink="\u001B[35;1m";
	static User4 obj1=new User4();
	
	static Scanner sc=new Scanner(System.in);
	static R obj=new R();
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("\t \t "+green+"WELCOME TO RESERVATION\u001b[00;1m\n");
		System.out.println("1.Register \n2.Sign In \n3.Close Application");
		int n=sc.nextInt();
		if(n==1)
			obj.register();
		else if(n==2)
			obj1.login();
		else
		{
			System.out.println("Invalid choice");
		}
		
	}
	int otp()
	{
		Random r=new Random();

		int n=r.nextInt(9000)+1000;
		return n;
	}
	void login()
	{
		System.out.println();
		System.out.print("\u001B[34;107;1m Username:"+bl);
		String uname=sc.next();
		System.out.println();
		System.out.print("\u001B[34;107;1m Password:"+bl);
		String pass=sc.next();
		System.out.println();

		if(uname.equals( obj.getu() ) && pass.equals(obj.getp()))
		{
			System.out.println("\u001b[32;1mLogin In"+bl);
			System.out.println();
			Booking obj=new Booking();
			obj.display();
		}
		else if(!uname.equals(obj.getu()) && !pass.equals(obj.getp()))
		{
			System.out.println("Invalid Details");
			Surya:
			while(true)
			{	
				System.out.println("Enter mobile no :");
				long phn=sc.nextLong();
				
				
				if(phn==obj.get())
				{
					while(true)
					{
						int n2=otp();
						System.out.println(n2);
						System.out.println("Enter your otp");
						int n1=sc.nextInt();
						if(n1==n2)
						{
							System.out.println(obj.getu());
							login();
							break Surya;								
						}	
					}
					
				}
				else
				{
					System.out.println(" User not found ");
					System.out.println(" 1 for re-enter mobile no 2 for exit");
					int n=sc.nextInt();
					if(n==1)
					{
					
					}
					else
					{
						System.out.println("  Bye ");
						break;
					}
				}
			} 
		}
		else if(uname.equals( obj.getu() ) && !pass.equals( obj.getp() ))
		{
			System.out.println("Invalid pass");
			System.out.println("enter new pass");
			obj.setp(sc.next());
			System.out.println("your new pass "+obj.getp());
			login();
		}
		else if(!uname.equals(obj.getu()) && pass.equals(obj.getp()))
		{
			System.out.println("Invalid username");
			System.out.println("enter new username");
			obj.setu(sc.next());
			System.out.println("yout new username "+obj.getu());
			login();
		}
	}
}
class Booking
{
	void display()
	{
		while(true)
		{
			System.out.println("\u001b[34;103;1m	 Booking Tickets 	"+User4.bl);
			System.out.println();
			System.out.println("1.Flight Ticket Booking ");
			System.out.println("2.Train Ticket Booking");
			System.out.println("3.Close Application ");
			int n1=User4.sc.nextInt();
			if(n1==1)
			{
				new Flight().Ticket();
				break;
			}
			else if(n1==2)
			{
				new Main().horse();
				display();
				break;
			}
			else if(n1==3)
			{
				System.out.println("Exiting");
				break;
			}
			else
			{
				System.out.println();
				System.out.println("Invalid Number,choose above numbers");
			}	
		}
	}
}



class Colors 
{
    public static final String RESET = "\u001B[00;1m";        
    public static final String BLUE = "\u001B[34m";         
    public static final String RED_BG = "\u001B[31;101m";   
    public static final String PURPLE = "\u001B[35m";      
}
class Train 
{
    private String trainNumber;
    private String trainName;
    private int totalAcSeats;
    private int totalNonAcSeats;
    private boolean[] Acseats; 
    private boolean[] nonacseats; 
    private double seatCost; // Cost per seat
    private String startPoint;
    private String destinationPoint;

    public Train(String trainNumber, String trainName, int totalAcSeats, int totalNonAcSeats, double seatCost, String startPoint, String destinationPoint) 
    {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.totalAcSeats = totalAcSeats;
        this.totalNonAcSeats = totalNonAcSeats;
        this.Acseats = new boolean[totalAcSeats];
        this.nonacseats = new boolean[totalNonAcSeats];
        this.seatCost = seatCost;
        this.startPoint = startPoint;
        this.destinationPoint = destinationPoint;
    }

    public String getTrainNumber() 
    {
        return trainNumber;
    }

    public String getTrainName() 
    {
        return trainName;
    }


    public int getAcTotalSeats() 
    {
        return totalAcSeats;
    }

    
    public int getNonAcTotalSeats() 
    {
        return totalNonAcSeats;
    }

  
    public boolean isSeatAvailable(int seatNumber) 
    {
        if (seatNumber < 1 || seatNumber > totalAcSeats) 
        {
            return false;
        }
        return !Acseats[seatNumber - 1];
    }

    
    public boolean isnSeatAvailable(int seatNumber) 
    {
        if (seatNumber < 1 || seatNumber > totalNonAcSeats) 
        {
            return false;
        }
        return !nonacseats[seatNumber - 1];
    }

    
    public boolean bookSeat(int seatNumber) 
    {
        if (isSeatAvailable(seatNumber)) 
        {
            Acseats[seatNumber - 1] = true;
            return true;
        } 
	else 
	{
            return false;
        }
    }

    
    public boolean nbookSeat(int seatNumber) 
    {
        if (isnSeatAvailable(seatNumber)) 
        {
            nonacseats[seatNumber - 1] = true;
            return true;
        } 
	else 
	{
            return false;
        }
    }

   
    public boolean cancelSeat(int seatNumber) 
    {
        if (seatNumber < 1 || seatNumber > totalAcSeats) 
	{
            return false;
        }
        if (Acseats[seatNumber - 1]) 
	{
            Acseats[seatNumber - 1] = false;
            return true;
        } 
	else 
	{
            return false;
        }
    }

   
    public boolean ncancelSeat(int seatNumber) 
    {
        if (seatNumber < 1 || seatNumber > totalNonAcSeats) 
	{
            return false;
        }
        if (nonacseats[seatNumber - 1]) 
	{
            nonacseats[seatNumber - 1] = false;
            return true;
        } 
	else 
	{
            return false;
        }
    }

    public boolean[] getSeats() 
    {
        return Acseats;
    }

    public boolean[] ngetSeats() 
    {
        return nonacseats;
    }

    public double getSeatCost() 
    {
        return seatCost;
    }

    public String getStartPoint() 
    {
        return startPoint;
    }

    public String getDestinationPoint() 
    {
        return destinationPoint;
    }
}


class Passenger 
{
    private String name;
    private int age;
    private String gender;
    private long phoneNumber;

    public Passenger(String name, int age, String gender, long phoneNumber) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public String getGender() 
    {
        return gender;
    }

    public long getPhoneNumber() 
    {
        return phoneNumber;
    }
}

abstract class Ticket 
{
    protected Train train;
    protected Passenger passenger;
    protected int seatNumber;
    protected double totalCost;

    public Ticket(Train train, Passenger passenger, int seatNumber, double totalCost) 
    {
        this.train = train;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.totalCost = totalCost;
    }

    public abstract void displayTicketDetails();
}

class ReservationTicket extends Ticket 
{
    public ReservationTicket(Train train, Passenger passenger, int seatNumber, double totalCost) 
    {
        super(train, passenger, seatNumber, totalCost);
    }

    @Override
    public void displayTicketDetails() 
    {
        System.out.println("\n" + Colors.PURPLE + "========================================" + Colors.RESET);
        System.out.println(Colors.PURPLE + "              TICKET DETAILS            " + Colors.RESET);
        System.out.println(Colors.PURPLE + "========================================" + Colors.RESET);
        System.out.println();

        // Passenger Information
        System.out.println(Colors.BLUE + "Passenger Information:" + Colors.RESET);
        System.out.println("  Name:               " + passenger.getName());
        System.out.println("  Age:                " + passenger.getAge());
        System.out.println("  Gender:             " + passenger.getGender());
        System.out.println("  Phone Number:       " + passenger.getPhoneNumber());
        System.out.println();

        // Train Information
        System.out.println(Colors.BLUE + "Train Information:" + Colors.RESET);
        System.out.println("  Train Name:         " + train.getTrainName());
        System.out.println("  Train Number:       " + train.getTrainNumber());
        System.out.println("  Start Point:        " + train.getStartPoint());
        System.out.println("  Destination Point:  " + train.getDestinationPoint());
        System.out.println();

	// Booking Details
        System.out.println(Colors.BLUE + "Booking Details:" + Colors.RESET);
   	System.out.println("  Seat Number:        " + seatNumber);
        System.out.println("  Cost per Seat:      " + String.format("%.2f", train.getSeatCost()));
        System.out.println("  Total Cost (incl. GST): " + String.format("%.2f", totalCost));

        System.out.println();
        //obj.display();
	System.out.println(Colors.PURPLE + "========================================" + Colors.RESET);

       	      	 	
    }
}

class Reservation 
{
    private static final double GST_RATE = 0.18; // 18% GST
    Bank bank=new Bank();
    public List<ReservationTicket> bookAcTickets(Train train, Passenger passenger, List<Integer> seatNumbers) 
    {
        List<ReservationTicket> tickets = new ArrayList<>();
       	double seatCost = train.getSeatCost();
        double totalBill = seatCost * seatNumbers.size() * (1 + GST_RATE);
        int paymentSuccess = bank.Billing(totalBill); 
        if (paymentSuccess == 1) // If payment is successful
        {
            for (int seatNumber : seatNumbers) 
            {
                if (train.bookSeat(seatNumber)) 
                {
                    double totalCost = seatCost * (1 + GST_RATE); 

                    ReservationTicket ticket = new ReservationTicket(train, passenger, seatNumber, totalCost);
                    tickets.add(ticket);
                } 
                else 
                {
                    System.out.println("Seat " + seatNumber + " is already booked.");
                }
            }
        }
        else 
        {
            System.out.println("Payment failed. Tickets not booked.");
        }
        return tickets;
    }

    public List<ReservationTicket> bookNonAcTickets(Train train, Passenger passenger, List<Integer> nseatNumbers) 
    {
        List<ReservationTicket> ntickets = new ArrayList<>();
       	double seatCost = train.getSeatCost();
        double totalBill = seatCost * nseatNumbers.size() * (1 + GST_RATE); 
	
        int paymentSuccess = bank.Billing(totalBill); // Call the Bank's Billing method
        if (paymentSuccess == 1) // If payment is successful
        {
	      
            for (int seatNumber : nseatNumbers) 
            {
                if (train.nbookSeat(seatNumber)) 
                {
                    double totalCost = seatCost * (1 + GST_RATE); // Cost per seat including GST
		    
                    ReservationTicket ticket = new ReservationTicket(train, passenger, seatNumber, totalCost);
                    ntickets.add(ticket);
                } 
                else 
                {
                    System.out.println("Seat " + seatNumber + " is already booked.");
                }
            }
        }
        else 
        {
            System.out.println("Payment failed. Tickets not booked.");
        }

        return ntickets;
    }

    public void cancelTicket(Train train, int seatNumber) 
    {
        if (train.cancelSeat(seatNumber)) 
	{
            System.out.println("Seat " + seatNumber + " has been cancelled.");
        } 
	else 
	{
            System.out.println("Seat " + seatNumber + " is not booked.");
        }
    }
}

class Main 
{
    private static final int MAX_TRAIN_NUM = 9999;
    private static final int MIN_TRAIN_NUM = 1000;
    static Booking obj=new Booking();
    void horse() 
    {
        Scanner scanner = new Scanner(System.in);

        // Initialize trains with cost per seat and points
        Train train1 = new Train(generateRandomTrainNumber(), "Rapid Express", 12,10, 100.0, "hyderabad", "vizag");
		Train train2 = new Train(generateRandomTrainNumber(), "Kakinda Express", 20,20, 140.0, "hyderabad", "vizag");

        	Train train3 = new Train(generateRandomTrainNumber(), "Superfast Line", 10,20, 120.0, "vizag", "kerala");


        Train[] trains = {train1, train2}; // Add more trains if needed
        List<Train> trainList = new ArrayList<>();
        trainList.add(train1);
        trainList.add(train2);
	trainList.add(train3);

        Reservation reservation = new Reservation();
        List<ReservationTicket> tickets = new ArrayList<>();
        List<ReservationTicket> ntickets = new ArrayList<>();
        Train selectedTrain = null;

        while (true) 
	{
            System.out.println("\nChoose Starting and Destination Points");
	    System.out.println(" ___________________________________");
	    System.out.println("|Starting points That are available:|");
	    System.out.println("|--->HYDERABAD			    |");
	    System.out.println("|--->VIZAG			    |");
	    System.out.println("|Ending points That are available:  |");
	    System.out.println("|--->VIZAG		            |");
	    System.out.println("|--->KERALA		 	    |");
	    System.out.println("|___________________________________|");
	    System.out.println();

            System.out.print("Enter Starting Point: ");
            String startPoint = scanner.nextLine();
            System.out.print("Enter Destination Point: ");
            String destinationPoint = scanner.nextLine();

	    if(startPoint.equals(destinationPoint))
	    {
		System.out.println();
		System.out.println(Flight.red+"Startpoint and Destinationpoint should not be same "+Colors.RESET);
		horse();
		break;		
 	    }


            // Display available trains based on points
            System.out.println("\nAvailable Trains:");
            int index = 1;
            for (Train train : trainList) 
	    {
                if (train.getStartPoint().equalsIgnoreCase(startPoint) && train.getDestinationPoint().equalsIgnoreCase(destinationPoint)) 
		{
                    System.out.println(index + ". " + train.getTrainName() + " (Train Number: " + train.getTrainNumber() +
                            ", Cost per Seat: " + train.getSeatCost() + ")");
                    index++;
                }
		
            }
      	    System.out.print("Choose a train by entering the corresponding number or enter 0 to exit: ");
	  
            int trainChoice = scanner.nextInt();
            scanner.nextLine(); 
            if (trainChoice == 0) 
	    {
		System.out.print(Flight.green+"choose from above locations"+Colors.RESET);
      		horse();		
            }

            selectedTrain = trainList.get(trainChoice - 1);

            while (true) 
	    {
                System.out.println("\nWelcome to " + selectedTrain.getTrainName());
                System.out.println("1. Book seats");
                System.out.println("2. Cancel Ticket");
                System.out.println("3. View Tickets");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                System.out.println(); 
                switch (choice) 
		{
                    case 1:
                        System.out.println("Enter Passenger Information:");
                        System.out.print("Name: ");
                        String name = scanner.next();
                        System.out.print("Age: ");
                        int age = scanner.nextInt();
                                                				        
			System.out.print("Gender: ");
                        String gender = scanner.next();
                        System.out.print("Phone Number: ");
                        long phoneNumber = scanner.nextLong();

                        Passenger passenger = new Passenger(name, age, gender, phoneNumber);
                        System.out.print("Enter number of seats to book: ");
                        int numSeats = scanner.nextInt();

                        List<Integer> seatNumbers = new ArrayList<>();
                        List<Integer> nseatNumbers = new ArrayList<>();
			while(true)
			{
                        System.out.println("Select 1. A/C  2. Non-A/C");
                        int n = scanner.nextInt(); // Choose AC or Non-AC

                        if (n == 1) 
			{
                            System.out.println("Welcome to A/C") ;
			    while(true)
			    {
                            	System.out.println("1. Sleeper 2. Seater");
                                int d = scanner.nextInt(); 
                                if (d == 1 || d == 2) 
			        {
                               
                                    AcdisplaySeats(selectedTrain);
				    break;
                                }
				else
				{
				     System.out.println(Colors.RED_BG+User4.green+"Invalid Number, please try again."+Colors.RESET);
 			        }
			    }
                            System.out.println("Enter seat numbers: ");
			    
                            for (int i = 0; i < numSeats; i++) 
			    {
                                int seatNumber = scanner.nextInt();
                                seatNumbers.add(seatNumber); 
                            }

                            List<ReservationTicket> AcBookedTickets = reservation.bookAcTickets(selectedTrain, passenger, seatNumbers);
                            for (ReservationTicket ticket : AcBookedTickets) 
			    {
                                ticket.displayTicketDetails();
                                tickets.add(ticket);                             
			    }
			    break;
                        } 
			else if (n == 2) 
			{
                            System.out.println("Welcome to Non-A/C");
			    while(true)
			    {
                                System.out.println("1. Sleeper 2. Seater");
                                int d = scanner.nextInt(); 

                                if (d == 1 || d == 2) 
			        {		                                                          				    nonAcdisplaySeats(selectedTrain);
				    break;
                                }
			        else
			        {
				  System.out.println(Colors.RED_BG+User4.green+"Invalid Number, please try again."+Colors.RESET);
 			        }
			    }
                            System.out.println("Enter seat numbers: ");
			    
                            for (int i = 0; i < numSeats; i++) 
			    {
                                int seatNumber = scanner.nextInt();
                                nseatNumbers.add(seatNumber); 
                            }
			    
                            List<ReservationTicket> nonAcBookedTickets = reservation.bookNonAcTickets(selectedTrain, passenger, nseatNumbers);
                            for (ReservationTicket ticket : nonAcBookedTickets) 
			    {
                                ticket.displayTicketDetails();
                                ntickets.add(ticket); // Add tickets to the list
                            }
			
			    break;
                        }
			else
			{
				System.out.println(Colors.RED_BG+Colors.BLUE+"Invalid Number,Please try again."+Colors.RESET);
			}
			}

                        break;

                    case 2:
                        System.out.print("Enter Seat Number to Cancel: ");
                        int seatToCancel = scanner.nextInt();
                        reservation.cancelTicket(selectedTrain, seatToCancel);
                        removeTicket(tickets, selectedTrain, seatToCancel);
                        break;

                    case 3:
                        if (tickets.isEmpty()) 
			{
                            System.out.println("No tickets booked In Ac.");
                        } 
			else 
			{
                            for (ReservationTicket t : tickets) 
			    {
                                t.displayTicketDetails();
                            }
                        }

                        if (ntickets.isEmpty())
			{
                            System.out.println("No tickets booked In Non-Ac.");
                        } 
			else 
			{
                            for (ReservationTicket t : ntickets) 
			    {
                                t.displayTicketDetails();
                            }
                        }
                        break;

                    
                    case 4:
                        //System.out.println("Exiting...");
			System.out.println("1.Continue Booking \n2.Login Page");
			int n1=User4.sc.nextInt();
			if(n1==1)
				horse();
			else
				obj.display();

                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println(Colors.RED_BG+"Invalid choice. Please try again."+Colors.RESET);
                }
            }
        }
    }

    public static void AcdisplaySeats(Train train) 
    {
        System.out.println(Colors.PURPLE + "AC Seats Availability:" + Colors.RESET);
        for (int i = 1; i <= train.getAcTotalSeats(); i++) 
	{
            if (train.isSeatAvailable(i)) 
	    {
		if(i<10)
                	System.out.print(Colors.BLUE + i + "  " + Colors.RESET);
		else
			System.out.print(Colors.BLUE + i + " " + Colors.RESET);
	
            } 
	    else 
	    {
		if(i<10)
                	System.out.print(Colors.RED_BG + i + " " + Colors.RESET);
		else
			System.out.print(Colors.RED_BG + i + " " + Colors.RESET);
			
            }
            if (i % 5 == 0) System.out.println(); 
        }
        System.out.println();
    }

    public static void nonAcdisplaySeats(Train train) 
    {
        System.out.println(Colors.PURPLE + "Non-AC Seats Availability:" + Colors.RESET);
        for (int i = 1; i <= train.getNonAcTotalSeats(); i++)
        {
            if (train.isnSeatAvailable(i))
	    {
                if(i<10)
                	System.out.print(Colors.BLUE + i + "  " + Colors.RESET);
		else
			System.out.print(Colors.BLUE + i + " " + Colors.RESET);
	
            } 
	    else 
 	    {
                if(i<10)
                	System.out.print(Colors.RED_BG + i + " " + Colors.RESET);
		else
			System.out.print(Colors.RED_BG + i + " " + Colors.RESET);
			
            }
            if (i % 5 == 0) System.out.println(); 
        }
        System.out.println();
    }

    public static String generateRandomTrainNumber() 
    {
        Random random = new Random();
        return String.valueOf(random.nextInt(MAX_TRAIN_NUM - MIN_TRAIN_NUM + 1) + MIN_TRAIN_NUM);
    }

    public static void removeTicket(List<ReservationTicket> tickets, Train train, int seatNumber)
    {
        tickets.removeIf(t -> t.train.getTrainNumber().equals(train.getTrainNumber()) && t.seatNumber == seatNumber);
    }
   
}

class Flight 
{
	static String purple = "\u001B[35;1m";
    	static String blue = "\u001b[37;1m";
    	static String red = "\u001B[31;1m";
    	static String green = "\u001B[32;1m";
    	static double bill = 0;
    	String n; // name of passenger
    	String n1; // date of journey
    	int n2; // seat no's
    	static String startPoint; // starting point
    	static String destination; // destination point
    	int n3; // age
    	String n4; // gender
    	static Flight obj = new Flight();
    	static User4 obj2 = new User4();
	static double gst ;

    
    	static boolean[] firstClassSeats = new boolean[12];    // Seats 1-12 for first class
    	static boolean[] businessClassSeats = new boolean[16]; // Seats 1-16 for business class
    	static boolean[] economyClassSeats = new boolean[20];  // Seats 1-20 for economy class

       	void Ticket() 
	{
        	Bank obj1 = new Bank();
        	System.out.println("\u001b[34;107;1m    Airline Business    " + User4.bl);
	 	System.out.println("\nChoose Starting and Destination Points");
	    	System.out.println(" ______________________________________");
	    	System.out.println("|Starting points That are available:   |");
		System.out.println("|				       |");
	    	System.out.println("|--->HYDERABAD			       |");
	    	System.out.println("|--->MUMBAI			       |");
		System.out.println("|--->DELHI		   	       |");
	    	System.out.println("|--->SINGAPORE		 	       |");
	    	System.out.println("||");
	    	System.out.println();
		
               	getLocations();

        	while (true) 
		{
            		System.out.println("1.First class \n2.Business class \n3.Economy class");
            		int n = User4.sc.nextInt();
            		if (n == 1) 
			{
                		bill = obj.Firstcls();
                		processBilling(obj1);
                		break;
            		} 
			else if (n == 2) 
			{
                		bill = obj.Businesscls();
               		 	processBilling(obj1);
                		break;
            		} 
			else if (n == 3) 
			{
                		bill = obj.Economycls();
                		processBilling(obj1);
                		break;
            		} 
			else 
			{
                		System.out.println("Invalid Number, choose a number from the options above.");
            		}
			
        	}
    	}

       	void processBilling(Bank obj1) 
	{
        	System.out.print("1.Billing");
        	int b = User4.sc.nextInt();
        	
		if(b==1)
		{
			gst = bill * 0.05;
			bill=bill+gst;
			System.out.println();
			System.out.println("YOUR TOTAL BILL : "+bill);
			
            		int n1 = obj1.Billing(bill);
            		if (n1 == 1) 
			{
				
                		obj.display();
              		} 
        	}
		else
		{
			System.out.println("Invalid Number,please Try again.");
			processBilling(obj1);
		}
    	}

    	void getLocations() 
	{
        	System.out.print("Enter the starting point: ");
        	startPoint = User4.sc.next();

        	showDestinationsBasedOnStart(startPoint);
    	}
	
    	void showDestinationsBasedOnStart(String start) 
	{
        	List<String> destinations = new ArrayList<>();

        	// Example of available routes based on starting point
        	switch (start.toLowerCase()) 
		{
           		 case "hyderabad":
                		destinations = Arrays.asList("Delhi", "Mumbai", "Singapore", "Dubai");
                		break;
            		case "mumbai":
                		destinations = Arrays.asList("Delhi", "Hyderabad", "New York", "London");
                		break;
            		case "delhi":
                		destinations = Arrays.asList("Hyderabad", "Mumbai", "Paris", "Sydney");
                		break;
            		case "singapore":
                		destinations = Arrays.asList("Hyderabad", "London", "New York", "Tokyo");
                		break;
            		default:
                		System.out.println("Sorry, no flights available from this location.");
		 		Ticket();
		            		
        	}

        	
        	System.out.println("Available destinations from " + start + ":");
        	for (int i = 0; i < destinations.size(); i++) 
		{
            		System.out.println((i + 1) + ". " + destinations.get(i));
        	}

        	
        	System.out.print("Choose your destination (enter number): ");
        	int choice = User4.sc.nextInt();
        	if (choice > 0 && choice <= destinations.size()) 
		{
            		destination = destinations.get(choice - 1);
        	} 
		else 
		{
            		System.out.println("Invalid choice, please choose a valid destination.");
            		showDestinationsBasedOnStart(start);  // Re-prompt for valid input
        	}
		
    	}

       	double Firstcls() 
	{
		System.out.println(purple + " Welcome to First class " + User4.bl + "\n");	

        	System.out.print("Name of passenger: ");
        	n = User4.sc.next();
        	System.out.print("Age: ");
        	n3 = User4.sc.nextInt();
       	 	System.out.print("Gender: ");
        	n4 = User4.sc.next();
        	System.out.print("Date of Journey: ");
        	n1 = User4.sc.next();

        	
        	System.out.println("Choose your seats \n");

        	displaySeats(firstClassSeats, 12); // Display first class seats

        	n2 = User4.sc.nextInt();
        	if (n2 < 1 || n2 > 12 ) 
		{
               		System.out.println("Invalid Seat No. Please enter seat numbers between 1 to 12.");
              		return Firstcls(); // Retry seat selection
        	}
		
		if (firstClassSeats[n2 - 1]) 
		{
               		System.out.println("Seat already booked. Please choose a different seat.");
			return Firstcls(); 
            	} 
        	firstClassSeats[n2 - 1] = true; // Mark seat as booked
		displaySeats(firstClassSeats, 12);

        	return 2999;
    	}

    	
    	double Businesscls() 	
	{
		System.out.println(purple + " Welcome to Business class " + User4.bl + "\n");

        	System.out.print("Name of passenger: ");
        	n = User4.sc.next();
        	System.out.print("Age: ");
        	n3 = User4.sc.nextInt();
        	System.out.print("Gender: ");
        	n4 = User4.sc.next();
        	System.out.print("Date of Journey: ");
        	n1 = User4.sc.next();

        	
        	System.out.println("Choose your seats: ");

        	displaySeats(businessClassSeats, 16); 

        	n2 = User4.sc.nextInt();
        	if (n2 < 1 || n2 > 16 ) 
		{
                	System.out.println("Invalid Seat No. Please enter seat numbers between 1 to 16.");
            		
            		return Businesscls(); // Retry seat selection
        	}

		if (businessClassSeats[n2 - 1]) 
		{
                	System.out.println("Seat already booked. Please choose a different seat.");
			return Businesscls();
            	} 
        	businessClassSeats[n2 - 1] = true; // Mark seat as booked
		displaySeats(businessClassSeats, 16);

        	return 1999;
    	}

      	double Economycls() 
	{
		System.out.println(purple + " Welcome to Economy class " + User4.bl + "\n");		

        	System.out.print("Name of passenger: ");
        	n = User4.sc.next();
        	System.out.print("Age: ");
        	n3 = User4.sc.nextInt();
        	System.out.print("Gender: ");
        	n4 = User4.sc.next();
        	System.out.print("Date of Journey: ");
        	n1 = User4.sc.next();

        	
        	System.out.println("Choose your seat: ");

        	displaySeats(economyClassSeats, 20); 

        	n2 = User4.sc.nextInt();
        	if (n2 < 1 || n2 > 20 ) 
		{
                	System.out.println("Invalid Seat No. Please enter seat numbers between 1 to 20.");
            		
            		return Economycls(); // Retry seat selection
        	}

		if (economyClassSeats[n2 - 1]) 	
		{
                	System.out.println("Seat already booked. Please choose a different seat.");
			return Economycls(); 
            	} 
        	economyClassSeats[n2 - 1] = true; // Mark seat as booked
		System.out.println();
		displaySeats(economyClassSeats, 20);
       		return 999;
    	}

       	void displaySeats(boolean[] seats, int totalSeats) 
	{
        	for (int i = 0; i < totalSeats; i++) 
		{
            		if (seats[i]) 
			{
                		System.out.print(red + (i + 1) + " (Booked) " + blue);
            		} 
			else 
			{
                		System.out.print(green + (i + 1) + " (Available) " + blue);
           	 	}
            		if ((i + 1) % 4 == 0) System.out.println(); // New line after every 4 seats
        	}
        	System.out.println();
        			
    	}

    	void display() 
	{
        	SimpleDateFormat formatter24Hour = new SimpleDateFormat("HH:mm");
        	Date now = new Date();
        	String time24Hour = formatter24Hour.format(now);
        	
        	String flghtno = flightno();
        	char z = 'A';

        	
		System.out.println();
		System.out.println(green + "Booking Successful!" + blue);
    		System.out.println(purple + "	------------------------" + blue);
    		System.out.println(purple + "	Flight Ticket" + blue);
    		System.out.println(purple + "	------------------------" + blue);
    
    		System.out.println("	Passenger Name: " + n);
    		System.out.println("	Age: " + n3);
    		System.out.println("	Gender: " + n4);
    		System.out.println("	Flight No: " + flghtno);
    		System.out.println("	Seat No: " + n2);
    		
    		System.out.println("	Date of Journey: " + n1);
    		System.out.println("	Departure Time: " + time24Hour);
    		//System.out.println("	Gate: " + gate);
    		System.out.println("	From: " + startPoint);
    		System.out.println("	To: " + destination);
    		System.out.println(purple+"	------------------------"+blue);
    		System.out.println("	Base Fare: Rs:" + bill);
    		System.out.println("	GST (5%): " +String.format("%.2f", gst));
    		System.out.println("	Total Fare: Rs:" +(bill));
    		System.out.println("	Booking Date: " + time24Hour);
    		System.out.println(purple+"	------------------------"+blue);
    		System.out.println(green + "Have a safe journey!" + blue); 
		System.out.println();
		System.out.println("1.Continue Booking \n2.login page");
		int n=User4.sc.nextInt();
		if(n==1)
		{
			Ticket();
			
		}
		else
		{
			Booking obj=new Booking();
			obj.display();
						
		}
    	}

    	
    	String flightno() 
	{
        	Random r = new Random();
        	return "AF " + r.nextInt(9000);
    	}
}

class Bank
{
	static java.util.Scanner sc=new java.util.Scanner(System.in);
	static double bal=5000;
	static Flight obj=new Flight();
	static User4 obj1=new User4();
	static double amt;
	int Billing(double bill)
	{
		System.out.println();
		System.out.println(User4.blue+"Net Banking"+User4.bl);
		System.out.println("Choose your bank payment application:");
		System.out.println("1.Phonepay \n2.Googlepay");
		int pay=User4.sc.nextInt();
		if(pay==1)
		{
			int g=paymentmethod(bill);
			if(g==1)
			{
				System.out.println();
                		System.out.println(User4.green + "Payment Successful" + User4.bl);
				System.out.println();
				System.out.println("YOUR AVAILABLE BALANCE:  "+String.format("%.2f", Bank.bal));
				return 1;
			}
			else 	
			{
				System.out.println();
                		System.out.println(User4.red + "Canceled payment" + User4.bl);
				System.out.println();
				System.out.println("YOUR AVAILABLE BALANCE: "+Bank.bal);

				return 0;		
			}
		}
		else if(pay==2)
		{
			
			int g1=paymentmethod(bill);
			if(g1==1)		
			{		
				System.out.println();
                		System.out.println(User4.green + "Payment Successful" + User4.bl);
				System.out.println();
				System.out.println("YOUR AVAILABLE BALANCE:  "+String.format("%.2f", Bank.bal));

				return 1;
			}
			else
			{
				System.out.println();
                		System.out.println(User4.red + "Canceled payment" + User4.bl);
				System.out.println();
				System.out.println("YOUR AVAILABLE BALANCE: "+Bank.bal);

				return 0;		
			}

		}
		else
		{
			System.out.println("Invalid Number, enter number should be 1 or 2");
			Billing(bill);
			return 0;
		}
	}
	int paymentmethod(double bill)
	{
		int b;
		if(bill>bal)	
		{
			System.out.println("Insufficient balnace");
			System.out.println("1.Deposit \n2.Exit");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.print("Amount for deposit");
				amt=sc.nextDouble();
				deposit(amt);
				return paymentmethod(bill);

			}
			else if(n==2)
			{
				return 0;
			}
			else
			{
				System.out.println("Invalid Number, enter number should be 1 or 2");
				return paymentmethod(bill);
			}
					
		}
		else
		{
			bal= bal-bill;
			return 1;
		}
			
	}
	void deposit(double amount)
	{
		bal=bal+amount;
	}
		
}