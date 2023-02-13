import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class StartForm {
    private JPanel RootPanel;
    private JButton carManufacturer;
    private JComboBox markaComboBox;
    private Car car;
    private String[] marka = {"КАМАЗ", "ГАЗ", "ЗИЛ", "КрАЗ", "МАЗ", "УРАЛ"};


    public JPanel getRootPanel() {
        return RootPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        car=new Car(null,"",false);

        markaComboBox = new JComboBox<>(marka);
        markaComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (markaComboBox.getSelectedIndex() == 0) {
                        car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                    } else if (markaComboBox.getSelectedIndex() == 1) {
                        car.setCarManufacturer(CARMANYFACTURER.GAZ);
                    } else if (markaComboBox.getSelectedIndex() == 2) {
                        car.setCarManufacturer(CARMANYFACTURER.ZIL);
                    } else if (markaComboBox.getSelectedIndex() == 3) {
                        car.setCarManufacturer(CARMANYFACTURER.KRAZ);
                    } else if (markaComboBox.getSelectedIndex() == 4) {
                        car.setCarManufacturer(CARMANYFACTURER.MAZ);
                    } else if (markaComboBox.getSelectedIndex() == 5) {
                        car.setCarManufacturer(CARMANYFACTURER.URAL);
                    }

                }
                ;
            }
        });


    }
}
