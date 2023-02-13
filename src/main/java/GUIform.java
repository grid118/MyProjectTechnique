import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUIform {
    private JPanel rootPanel;
    private JComboBox modelComboBox;
    private JPanel startForm;
    private JComboBox proizvoditelComboBox;
    private Car car;
    private int i;


    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        ModeliAVTO modeliAVTO = new ModeliAVTO();
        car = new Car(null, "", false);
        proizvoditelComboBox = new JComboBox<>(modeliAVTO.getMarka());
        modelComboBox = new JComboBox<>(modeliAVTO.getKamaz());
        proizvoditelComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    switch (proizvoditelComboBox.getSelectedIndex()) {
                        case 0:
                            car.setCarManufacturer(CARMANYFACTURER.KAMAZ);

                            break;
                        case 1:
                            car.setCarManufacturer(CARMANYFACTURER.GAZ);
                            break;
                        case 2:
                            car.setCarManufacturer(CARMANYFACTURER.ZIL);
                            break;
                        case 3:
                            car.setCarManufacturer(CARMANYFACTURER.KRAZ);
                            break;
                        case 4:
                            car.setCarManufacturer(CARMANYFACTURER.MAZ);
                            break;
                        case 5:
                            car.setCarManufacturer(CARMANYFACTURER.URAL);
                            break;
                        default:
                            System.out.println("Что-то пошло не так с производителем автомобиля =(");
                            break;
                    }
                }
            }
        });
    }
}
