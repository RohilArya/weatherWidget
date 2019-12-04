import java.util.Scanner;
public class weatherWidget {
  public static void main(String[] args) {
    String cityName;
    int numberOfArgs = 0;
    char comma = ',';
    Scanner city = new Scanner(System.in);
    System.out.println("Enter your city and country (City,Country or City, Province/State, Country)");
    cityName = city.nextLine();
    while (numberOfArgs >= 0)
    {
      for(int i = 0; i < cityName.length(); i++)
      {
        if(cityName.charAt(i) == comma)
        {
          numberOfArgs ++;
        }
      }
      if(numberOfArgs >= 3)
      {
        System.err.println("Not correct format, use: City,Country or City, Province/State, Country \n Try again.");
        cityName = city.nextLine();
      }
      else if(numberOfArgs == 0)
      {
        System.err.println("Not correct format, use: City,Country or City, Province/State, Country \n Try again.");
        cityName = city.nextLine();
      }
      else
      {
        System.out.println("Correct Format");
        break;
      }
    }
    
  }
}
