import java.util.Scanner;
public class Track
{
    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        Scanner scan = new Scanner (System.in);

        BandBooster student1 = new BandBooster("Amal");
        BandBooster student2 = new BandBooster("Vamsi");
        
        while (i < 4) {
            System.out.println("Enter the number of boxes sold by " + student1.getName() + " on week " + i);
            double num = scan.nextDouble();
            student1.updateSales(num);
            i++;
        }
        
        while (a < 4) {
            System.out.println("Enter the number of boxes sold by " + student2.getName() + " on week " + i);
            double num = scan.nextDouble();
            student2.updateSales(num);
            a++;
        }
        
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}


