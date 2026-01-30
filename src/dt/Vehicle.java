package dt;

public class Vehicle {



    private String ownerName;
    private String ownerAddress;
    protected String brand;
    protected String model;
    protected String licencePlate;
    protected float value;


    protected Vehicle(String ownerName, String ownerAddress, String brand, String model, String licencePlate, float value) {
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.brand = brand;
        this.model = model;
        this.licencePlate = licencePlate;
        this.value = value;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    @Override
    public String toString(){
        return this.ownerName + ", " + this.ownerAddress + ", " + this.brand+ ", " + this.model+ ", " + this.licencePlate
                + ", " + this.value;
    }

}
