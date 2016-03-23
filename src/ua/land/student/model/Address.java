package ua.land.student.model;

public class Address {

    private String city;
    private String street;
    private String houseNum;

    public Address() {
//        new this()
    }

    public Address(String city, String street, String houseNum) {
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    @Override
    public String toString() {
        return String.format("\nCity: %s \nStreet: %s \nHouse: %s",
                getCity(), getStreet(), getHouseNum());
    }
}
