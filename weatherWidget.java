import java.util.Scanner;
public class weatherWidget {
  public static void main(String[] args) {
    //variables
    String cityName;
    int numberOfArgs = 0;
    char comma = ',';
    String token = "";
    String cityToken = "";
    String countryToken = "";
    String stateToken = "";
    
    //getting user input
    Scanner city = new Scanner(System.in);
    System.out.println("Enter your city and country (City,Country or City, Province/State, Country)");
    cityName = city.nextLine();
    
    //checking for valid number of arguements
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
      //if the number or args are 1 or 2 break out of loop
      //if the number of args is 2 (city, country)
      //if the number of args is 3 (city, state, country)
      else
      {
        System.out.println("Correct Format");
        if(numberOfArgs == 1)
        {
          for(int i = 0; i < cityName.length(); i ++)
          {
            if(cityName.charAt(i) == comma)
            {
              cityToken = token;
              token = "";
            }
            else
            {
              token += cityName.charAt(i);
            }
          }
          countryToken = token;
        }
        else
        {
          int commaCounter = 0;
          for(int i = 0; i < cityName.length(); i ++)
          {
            if(cityName.charAt(i) == comma)
            {
              if(commaCounter == 0)
              {
                cityToken = token;
                token = "";
                commaCounter ++;
              }
              else if(commaCounter == 1)
              {
                stateToken = token;
                token = "";
                commaCounter ++;
              }
              
            }
            else
            {
              token += cityName.charAt(i);
            }
          }
          countryToken = token;
        }
        System.out.println("City token is : " + cityToken + " Country token is: " + countryToken + " State/Province token is :" + stateToken);
        break;
      }
    }
    
  }
}
