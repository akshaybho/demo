package classesonly;

public class Address {

    private int houseNo;

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    @Override
    public String toString() {
        return ""+city+" "+houseNo;
    }
}
