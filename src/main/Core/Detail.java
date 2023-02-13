
public class Detail {
    private String nameDetail;
    private boolean stateDetail; // исправность детали
    private boolean partAvailability; // наличие детали
    private boolean possibilityOfRepair; // возможность ремонта
    private boolean replacementDetail; // замена
    private Boolean state;
    Car car;

    public Detail(Car car, String nameDetail, boolean stateDetail, boolean partAvailability, boolean possibilityOfRepair, boolean replacementDetail, Boolean state) {
        this.car = car;
        this.nameDetail = nameDetail;
        this.stateDetail = stateDetail;
        this.partAvailability = partAvailability;
        this.possibilityOfRepair = possibilityOfRepair;
        this.replacementDetail = replacementDetail;
        this.state = state;

    }

    public String getNameDetail() {
        return nameDetail;
    }

    public void setNameDetail(String nameDetail) {
        this.nameDetail = nameDetail;
    }

    public boolean isStateDetail() {
        return stateDetail;
    }

    public void setStateDetail(boolean stateDetail) {
        this.stateDetail = stateDetail;
    }

    public boolean isPartAvailability() {
        return partAvailability;
    }

    public void setPartAvailability(boolean partAvailability) {
        this.partAvailability = partAvailability;
    }

    public boolean isPossibilityOfRepair() {
        return possibilityOfRepair;
    }

    public void setPossibilityOfRepair(boolean possibilityOfRepair) {
        this.possibilityOfRepair = possibilityOfRepair;
    }

    public boolean isReplacementDetail() {
        return replacementDetail;
    }

    public void setReplacementDetail(boolean replacementDetail) {
        this.replacementDetail = replacementDetail;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
