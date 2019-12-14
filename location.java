public class location {
  private String city;
  private String stateOrProvince;
  private String country;
  
  public location (String city, String stateOrProvince, String country)
  {
    this.city = city;
    this.stateOrProvince = stateOrProvince;
    this.country = country;
    
    if(stateOrProvince.length() == 0)
    {
      //when user does not put in this argument.
    }
    else
    {
      //when user uses 3 arguements
    }
  }
  
  public String getCity()
  {
    return this.city;
  }
  public void setCity(String city)
  {
    this.city = city;
  }
  
  public String getStateOrProvince()
  {
    return this.stateOrProvince;
  }
  public void setStateOrProvince(String stateOrProvince)
  {
    this.stateOrProvince = stateOrProvince;
  }
  public String getCountry()
  {
    return this.country;
  }
  public void setCountry(String country)
  {
    this.country = country;
  }
}