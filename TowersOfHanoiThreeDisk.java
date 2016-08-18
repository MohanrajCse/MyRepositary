import java.util.Scanner;

public class TowersOfHanoiThreeDisk {

   public void DiskEx(int n, String pole1, String pole2, String pole3) {
       if (n == 1) {
           System.out.println(pole1 + " -> " + pole3);
       } else {
           DiskEx(n - 1, pole1, pole3, pole2);
           System.out.println(pole1 + " -> " + pole3);
           DiskEx(n - 1, pole2, pole1, pole3);
       }
   }

   public static void main(String[] args) {
       TowersOfHanoiThreeDisk towersOfHanoi = new TowersOfHanoiThreeDisk();
      
       towersOfHanoi.DiskEx(3, "A", "B", "C");
   }
}