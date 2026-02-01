package dt;

public final class Truck extends Vehicle {

    private String[] materials = new String[5];
    private long permit;
    private String company;

    public Truck(String[] materials, long permit, String company,
                 String ownerName, String ownerAddress,
                 String brand, String model,
                 String licencePlate, float value) throws VehicleException {

        super(ownerName, ownerAddress, brand, model, licencePlate, value);

        if (company.equals("")) {
            throw new VehicleException("company");
        }

        this.permit = permit;
        this.company = company;
        setMaterials(materials);
    }

    public String[] getMaterials() {
        return materials.clone();
    }

    public long getPermit() {
        return permit;
    }

    public String getCompany() {
        return company;
    }

    public void setMaterials(String[] materials) {
        this.materials = new String[5];

        if (materials != null) {
            int limit = Math.min(materials.length, this.materials.length);
            for (int i = 0; i < limit; i++) {
                this.materials[i] = materials[i];
            }
        }
    }

    public void setPermit(long permit) {
        this.permit = permit;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        StringBuilder nvString = new StringBuilder();
        nvString.append(super.toString());
        nvString.append(", [");
        boolean premier = true;
        for (String m : materials) {
            if (m != null) {
                if (!premier) {
                    nvString.append("/");
                }
                nvString.append("/").append(m);
                premier = false;
            }
        }
        nvString.append("/]");
        nvString.append(", ");
        nvString.append(permit);
        nvString.append(", ");
        nvString.append(company);
        return nvString.toString();
    }

}
