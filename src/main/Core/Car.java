public class Car {
    private String carModel;
    private CARMANYFACTURER carManufacturer;
    private boolean state;
    private String VIN;



    public Car(CARMANYFACTURER carManufacturer, String carModel, boolean state, String VIN){
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.state = state;
        this.VIN = VIN;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public CARMANYFACTURER getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(CARMANYFACTURER carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
}
