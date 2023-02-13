public class Car {
    private String carModel;
    private CARMANYFACTURER carManufacturer;
    private boolean state;

    public Car(CARMANYFACTURER carManufacturer,String carModel, boolean state){
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.state = state;
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
}
