//import java.io.*;
import java.util.Scanner;
class TravelItineraryPlan
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int choice;
        System.out.println("WELCOME TO TravelItinerayPlan !");
        System.out.println("Enter customer name :");
        String name=s.next();
        travelDestination t=new travelDestination();
        do{
            System.out.println("1.Select Destination");
            System.out.println("2.Enter dates");
            System.out.println("3.Choose Preferences");
            System.out.println("4.Exit");
            System.out.println("Enter your choice :");
            choice=s.nextInt();
            switch (choice) {
                case 1:t.selectDestination();
                    break;
                case 2:t.enterdates();
                    break;
                case 3:t.choosePreferences();
                    break;
                case 4:
                    System.out.println("Exiting..."); 
                    break;  
                default:System.out.println("Invalid choice!");
                    break;
            }
        }while(choice!=4);
        t.calculateBudgetWeatherInformation();
        System.out.println("THANK YOU! "+name+" for visiting TravelItineraryPlan ");
        s.close();
    }
}
class travelDestination{  
    Scanner s=new Scanner(System.in);
    int d;      
        void selectDestination()
        {
            System.out.println("**Destination Places**");
             System.out.println("1.Ahmedabad ");
             System.out.println("2.Mumbai ");
             System.out.println("3.Delhi ");
             System.out.println("4.Hydrebad ");
             System.out.println(" Choose your Destination Place :");
            d=s.nextInt();
            if(d==1)
            {
                System.out.println("Your Selected Destination is Ahmedabad ");
            }
            else if(d==2)
            {
                System.out.println("Your Selected Destination is Mumbai ");
            }
            else if(d==3)
            {
                System.out.println("Your Selected Destination is Delhi ");
            }
            else if(d==4)
            {
                System.out.println("Your Selected Destination is Hydrebad ");
            }
            else
            {
                System.out.println("Destination is NOT selected!");
            }
        }
        void enterdates()
        {
            System.out.println("Enter your prefered date for travelling ");
            String date=s.next();
            System.out.println("your prefered date for travelling is : "+date);
        }
        void choosePreferences()
        {
            System.out.println("1.Luxury");
            System.out.println("2.Economy");
            System.out.println("3.General");
            System.out.println("Choose your travel Preferences :");
            int ch=s.nextInt();
            if(ch==1)
            {
                System.out.println("TravelPreference :Luxury");
            }
            else if(ch==2)
            {
                System.out.println("TravelPreference :Economy");
            }
            else if(ch==3)
            {
                System.out.println("TravelPreference :General");
            }
            else{
                System.out.println("Invalid Prefernce");
            }
        }
        void calculateBudgetWeatherInformation()
        {
           if(d==1)
           {
              System.out.println("Total Budget for Ahmedabad is :"+30000);
              System.out.println("Weather Information : Mediterranean climate with hot summers and cool winters");
           }
           else if(d==2)
           {
              System.out.println("Total Budget for Mumbai is :"+25000);
              System.out.println("Weather Information : Temperate oceanic climate with mild summers and cool winters");
           } 
           else if(d==3)
           {
            System.out.println("Total Budget for Delhi is :"+35000);
            System.out.println("Weather Information : Mediterranean climate with hot summers and mild,dry winters");
           }
           else if(d==4)
           {
            System.out.println("Total Budget for Hydrebad is :"+20000);
            System.out.println("Weather Information : Mediterranean climate with hot,dry summers and winters are mild,rainy ");
           }
           else
           {
            System.out.println("No destination selected!!");
           }

        }
        
    }
