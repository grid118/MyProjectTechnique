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
  /*  private String[] marka = {
            "КАМАЗ",//0
            "ГАЗ",//1
            "ЗИЛ",//2
            "КрАЗ",//3
            "МАЗ",//4
            "УРАЛ"//5
    };
    private String[] kamaz = {
            "КамАЗ 4310\n" + "(4310, 43105)",//0
            "КамАЗ 4310 (каталог 2004г)\n" + "(4310, 43105))",//1
            "КамАЗ 43101\n" + "(43101, 43106)",//2
            "КамАЗ 4350 (4X4)",//3
            "КамАЗ 5350 (6X6)",//4
            "КамАЗ 6350 (8X8)",//5
            "КамАЗ 4326 (каталог 2003г)",//6
            "КамАЗ 43261 (Евро-1, 2)\n" + "(43261, 4326, 43114, 43118)",//7
            "КамАЗ-4326",//8
            "КамАЗ 43501 (4X4)",//9
            "КамАЗ 53504 (6X6)",//10
            "КамАЗ 53501 (6X6)",//11
            "КамАЗ 63501 (8X8)"//12
    };
    private String[] gaz = {
            "ГАЗ ММ 'Полуторка'", // 0
            "ГАЗ-3308 (доп. с дв. ЗМЗ Е 3)\n" + "(3308, 33081)", // 1
            "ГАЗ-3308\n" + "3308-020, 3308-214, 33081-043", // 2
            "ГАЗ-3308\n" + "3308, 33081", //3
            "ГАЗ-33081\n" + "33081-43, 33081-57, 33081-70, 33081-73, 33081-86, 33081-87", //4
            "ГАЗ-3309", //5
            "ГАЗ-3309 (доп. с дв. ЗМЗ Е 3)", //6
            "ГАЗ-3309 (Евро 2)", //7
            "ГАЗ-4301", //8
            "ГАЗ-66 (Каталог 1983 г.)\n" + "66-01, 66-05", //9
            "ГАЗ-66 (Каталог 1996 г.)\n" + "66-01, 66-02, 66-04, 66-05, 66-11, 66-12,66-14, 66-15", //10
            "ГАЗ-33104 Валдай", //11
            "ГАЗ-33104 Валдай Евро 3",//12
            "ГАЗ-33106 Евро 3"//13
    };
    private String[] kraz = {
            "КрАЗ-255",//0
            "КрАЗ-260",//1
            "КрАЗ-256"//2
    };
    private String[] maz = {
            "МАЗ-6317",//0
            "МАЗ-543 (7310)\n" + "МАЗ-543, 543А, 543М",//1
            "МАЗ-5335\n" + "5335, 5549, 5429, 509А, 504В"//2
    };
    private String[] ural = {
            "УРАЛ-375\n" + "375, 375Д, 377, 375С, 377С, 375А",//0
            "УРАЛ-4320\n" + "4320, 43202",//1
            "УРАЛ-4320",//2
            "УРАЛ-4420",//3
            "УРАЛ-4320-31",//4
            "УРАЛ-43203-10",//5
            "УРАЛ-532301",//6
            "УРАЛ-55571-1121-70",//7
            "УРАЛ-43204-1111-70",//8
            "УРАЛ-532361\n" + "532361-311, 532361-311П, 532361-312, 532361-312П, 532362-1026, 532362-1042, 542301-11,\n" +
                    "542301-11П, 542301-11П1, 542301-17, 542301-11-10, 542301-17-10, 542301-17-10П1, 542301-117-10" //9
    };
*/