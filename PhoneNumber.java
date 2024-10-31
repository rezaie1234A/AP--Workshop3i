public class PhoneNumber {
    private String CountryCode;
    private String number;
    public PhoneNumber(String CountryCode, String number) {
        this.CountryCode = CountryCode;
        this.number = number;

    }
    public String getCountryCode() {
        return CountryCode;
    }
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
       return "Countrycode:" + CountryCode + " Number:" + number;
    }
}
