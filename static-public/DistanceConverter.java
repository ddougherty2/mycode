public class DistanceConverter {
    // Static Method - can be called without creating an object
    static double convertInchesToCentimeters(double inches) {
        return (inches * 2.54);
    }

    // Instance (public method - must be called using object
    public double convertCentimetersToInches(double centimeters) {
        return (centimeters / 2.54);

    }

    // Static method - can be called without creating an object
    static double convertInchesToFeet(double inches) {
        return (inches / 12);
    }

    // Instance (public method - must be called using object
    public double convertFeetToInches(double feet) {
        return (feet * 12);
    }

    // Main method
    public static void main(String[] args) {
        // Calling the static method directly without an object
        double inchesToConvert = 12;
        double distanceInCentimeters = convertInchesToCentimeters(inchesToConvert);
        System.out.println(inchesToConvert + " inches in centimeters: " + distanceInCentimeters);
 
        // Creating an object of the Converter class
        DistanceConverter distanceConverter = new DistanceConverter();
        double centimetersToConvert = 14;

        // Using the object to call the instance method
        double distanceInInches = distanceConverter.convertCentimetersToInches(centimetersToConvert);
        System.out.println(centimetersToConvert + " centimeter in inches: " + distanceInInches);

        // Calling the static method directly without an object
        inchesToConvert = 24;
        double distanceInFeet = convertInchesToFeet(inchesToConvert);
        System.out.println(inchesToConvert + " inches in feet: " + distanceInFeet);

        double feetToConvert = 28;

        // Using the object to call the instance method
        distanceInInches = distanceConverter.convertFeetToInches(feetToConvert);
        System.out.println(feetToConvert + " feet in inches: " + distanceInInches);
    }
}
