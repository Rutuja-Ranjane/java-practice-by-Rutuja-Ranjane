import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalesTracker<SalesRecord> tracker = new SalesTracker<>();

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Soft Copy");
            System.out.println("2. Hard Copy");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Soft Copy.");
                    System.out.println("how many copies do you want");
                    int copies = sc.nextInt();
                    System.err.println("Enter how many pages are there");
                    int pages = sc.nextInt();
                    System.out.println("do you want 1.Color print 2. Black and White");
                    int c = sc.nextInt();
                    int pri=2;

                    if(c==1)
                    {
                        pri = pri+8; 
                    }
                    tracker.addRecord(new SalesRecord(new Date(), copies, pages, pri)); 
                    break;
                case 2:
                    System.out.println("You selected Hard Copy.");
                    System.out.println("how many copies do you want");
                    copies = sc.nextInt();
                    System.err.println("Enter how many pages are there");
                    pages = sc.nextInt();
                    System.out.println("do you want 1.Color print 2. Black and White");
                    int ch = sc.nextInt();
                    int pric=2;

                    if(ch==1)
                    {
                        pri = pric+8; 
                    }
                    tracker.addRecord(new SalesRecord(new Date(), copies, pages, pric)); 
                    break;
                case 3:
                    System.out.println("Exiting.");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }

            // Get today's sales
            double todaySales = tracker.getDailySales(new Date());
            System.out.println("Today's Sales: $" + todaySales);

            // Get monthly sales(e.g., for october 2024)
            Calendar cal = Calendar.getInstance();
            cal.set(2024, Calendar.OCTOBER, 1);
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            double monthlySales = tracker.getMonthlySales(month, year);
            System.out.println("October 2024 Sales: $" + monthlySales);
        }
    }
}