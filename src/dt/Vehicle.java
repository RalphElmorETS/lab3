package dt;

public class Vehicle {



    private String ownerName;
    private String ownerAddress;
    protected String brand;
    protected String model;
    protected String licencePlate;
    protected float value;


    protected Vehicle(String ownerName, String ownerAddress, String brand, String model, String licencePlate, float value) throws VehicleException {

        if (ownerName.equals("")) {
            throw new VehicleException("ownerName");
        }
        else if (ownerAddress.equals("")) {
            throw new VehicleException("ownerAddress");
        }
        else if (brand.equals("")) {
            throw new VehicleException("brand");
        }
        else if (model.equals("")) {
            throw new VehicleException("model");
        }
        else if (licencePlate.equals("")) {
            throw new VehicleException("licencePlate");
        }


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
