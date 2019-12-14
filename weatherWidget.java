import java.util.Scanner;
public class weatherWidget {
  public static void main(String[] args) {
    //variables
    String cityName;
    
    
    //getting user input
    Scanner city = new Scanner(System.in);
    System.out.println("Enter your city and country (City,Country or City, Province/State, Country)");
    cityName = city.nextLine();
    
    String[] location = validateArguement(cityName);
    
    location loc = new location(location[0],location[1],location[2]);
    
    System.out.println(loc.getCity() + " " + loc.getCountry())
;
    
    
  }
  
  public static String[] validateArguement(String cityName)
  {
    String [] location = new String [3];
    int numberOfArgs = 0;
    char comma = ',';
    String token = "";
    String cityToken = "";
    String countryToken = "";
    String stateToken = "";
    
    Scanner city = new Scanner(System.in);
    
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
      //if the number of args is 1 (city, country)
      //if the number of args is 2 (city, state, country)
      //number of args counts the number of commas in the input
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
          //if user put in city country and state/province
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
        location[0] = cityToken;
        location[1] = stateToken;
        location[2] = countryToken;
        
        for(int i = 0; i < 3; i++)
        {
          System.out.println(location[i]);
        }
        break;
      }
    }
    return location;
  }
}
