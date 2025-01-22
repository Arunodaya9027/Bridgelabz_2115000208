public class VolumeOfEarthComputation {
    public static void main(String[] args) {
        double RADIUS = 6378;       //Radius of Earth in km
		double PI = Math.PI;		// ValueOfPI
        double volumeInKm = (4 / 3) * PI * Math.pow(RADIUS, 3);
        double volumeInMiles = volumeInKm * Math.pow(0.621371, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);
    }  
}
