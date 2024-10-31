import java.io.PrintStream;
public class Address {
    private String Zipcode;
    private String Country;
    private String City;


    public Address(String zipcode, String country, String city ) {
        this.Zipcode = zipcode;
        this.Country = country;
        this.City = city;
    }
    public String getZipcode() {
        return Zipcode;
    }

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }
    public void setZipcode(String zipcode) {
        this.Zipcode = zipcode;
    }
    public void setCountry(String country) {
        this.Country = country;
    }
    public void setCity(String city) {
        this.City = city;
    }
    public String toString() {
        return "Zipcode: " + Zipcode + ", Country: " + Country + ", City: " + City;
    }

}
