public class CelsiusTable
    {
    public static void main(String[] args) 
        {
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("-------------------------");


        for (int fahrenheit = 0; fahrenheit <= 20; fahrenheit++) 
        {
            double celsiusTemp = celsius(fahrenheit);
            // Print the values formatted to 2 decimal places
            System.out.printf("%d\t\t%.2f%n", fahrenheit, celsiusTemp);
        }
    }
    public static double celsius(double fahrenheit) 
        {
        
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}
