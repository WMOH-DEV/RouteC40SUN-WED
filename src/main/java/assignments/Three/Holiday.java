package assignments.Three;

/**
 * This is the third assignment [Holiday]
 * 
 * @version 1.0
 * @since 2024-06-03
 */
public class Holiday {
    private String name;
    private int day;
    private String month;

    /**
     * parameterized Constructor :) 7lwa parameterized de =D
     * 
     * Write a constructor for the class Holiday, which takes a String representing
     * the name, an int representing the day, and a String representing the month as
     * its arguments, and sets the class variables to these values.
     * 
     * @param name
     * @param day
     * @param month
     */
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    /**
     * Write a method inSameMonth, which compares two instances of the class
     * Holiday, and returns the Boolean value true if they have the same month,
     * and false if they do not.
     * 
     * Method to check if two holidays are in the same month
     * We are using here Holiday object(instance) as a parameter (translate from
     * English to English :D :D)
     * 
     * @param otherHoliday
     * @return
     */
    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
        // another way ~_^
        // return this.month == otherHoliday.month;

    }

    /**
     * Write a method avgDate which takes an array of base type Holiday as its
     * argument, and
     * returns a double that is the average of the day variables in the Holiday
     * instances in
     * the
     * array. You may assume that the array is full (i.e. does not have any null
     * entries).
     * 
     * Static method to calculate the average day of holidays in an array
     * (translation)
     * 
     * @param holidays
     * @return
     */
    public static double avgDate(Holiday[] holidays) {
        int sum = 0;
        for (Holiday holiday : holidays) {
            sum += holiday.day;
        }
        return (double) sum / holidays.length;
    }

    // Main method to test the Holiday class
    public static void main(String[] args) {
        // Creating a Holiday instance
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

        // Creating other Holiday instances for testing
        Holiday newYear = new Holiday("New Year", 1, "January");
        Holiday christmas = new Holiday("Christmas", 25, "December");
        Holiday thanksgiving = new Holiday("Thanksgiving", 25, "November");
        Holiday newYear2 = new Holiday("New Year", 1, "January");

        // Array of Holiday objects
        Holiday[] holidays = { independenceDay, newYear, christmas, thanksgiving, newYear2 };

        // Test inSameMonth method
        System.out.println(independenceDay.inSameMonth(newYear)); // Output: false
        System.out.println(newYear.inSameMonth(newYear2)); // Output: true

        // Test avgDate method
        System.out.println("Average day: " + Holiday.avgDate(holidays)); // Output: Average day: 11.2

        // Output the created Holiday instance details
        System.out.println("Created Holiday: " + independenceDay.name + " on " + independenceDay.month + " "
                + independenceDay.day);
    }
}
