public class pratice {
    public static void main(String[] args) {
       
        double speedOfLight = 186000;

        
        int days = 1000;

        double totalSeconds = days * 24 * 60 * 60;

         double distanceTraveled = speedOfLight * totalSeconds;

         System.out.println("The distance traveled by light in " + days + " days is: " + distanceTraveled + " miles");
    }
}