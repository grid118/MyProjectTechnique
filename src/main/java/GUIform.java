import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.IOException;

public class GUIform {
    private JPanel rootPanel;
    private JComboBox modelComboBox;
    private JPanel startForm;
    private JComboBox proizvoditelComboBox;
    private JTextArea VINTextArea;
    private JCheckBox требуетсяРемонтCheckBox;
    private JButton createDocumentButton;
    private Car car;
    public GUIform(){

    }



    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        ModeliAVTO modeliAVTO = new ModeliAVTO();
        car = new Car(null, "", false,"");
        proizvoditelComboBox = new JComboBox<>(modeliAVTO.getMarka());
        modelComboBox = new JComboBox<>();
        proizvoditelComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    switch (proizvoditelComboBox.getSelectedIndex()) {
                        case 0:
                            modelComboBox.removeAllItems();
                            for (int i  = 0; i<modeliAVTO.getKamaz().length;i++){
                                modelComboBox.addItem(modeliAVTO.getKamaz()[i]);
                            }
                            proizvoditelComboBox.addItemListener(new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (e.getStateChange() == ItemEvent.SELECTED) {
                                        switch (proizvoditelComboBox.getSelectedIndex()) {
                                            case 0:
                                                car.setCarModel(KAMAZ.KAMAZ_4310.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 1:
                                                car.setCarModel(KAMAZ.KAMAZ_4310_OT2004.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 2:
                                                car.setCarModel(KAMAZ.KAMAZ_43101.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 3:
                                                car.setCarModel(KAMAZ.KAMAZ_4350_4X4.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 4:
                                                car.setCarModel(KAMAZ.KAMAZ_5350_6X6.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 5:
                                                car.setCarModel(KAMAZ.KAMAZ_6350_8X8.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 6:
                                                car.setCarModel(KAMAZ.KAMAZ_4326_OT2003.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 7:
                                                car.setCarModel(KAMAZ.KAMAZ_43261_EVRO1_2.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 8:
                                                car.setCarModel(KAMAZ.KAMAZ_4326.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 9:
                                                car.setCarModel(KAMAZ.KAMAZ_43501_4X4.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 10:
                                                car.setCarModel(KAMAZ.KAMAZ_53504_6X6.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 11:
                                                car.setCarModel(KAMAZ.KAMAZ_53501_6X6.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                            case 12:
                                                car.setCarModel(KAMAZ.KAMAZ_63501_8X8.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KAMAZ);
                                                break;
                                        }
                                    }

                                }
                            });
                            break;
                        case 1:
                            modelComboBox.removeAllItems();
                            for (int i  = 0; i<modeliAVTO.getGaz().length;i++){
                                modelComboBox.addItem(modeliAVTO.getGaz()[i]);
                            }
                            proizvoditelComboBox.addItemListener(new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (e.getStateChange() == ItemEvent.SELECTED) {
                                        switch (proizvoditelComboBox.getSelectedIndex()) {
                                            case 0:
                                                car.setCarModel(GAZ.GAZ_MM_POLYTORKA.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 1:
                                                car.setCarModel(GAZ.GAZ_3308_3308_33081_ZMZE3.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 2:
                                                car.setCarModel(GAZ.GAZ_3308_3308_020_3308_214_33081_043.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 3:
                                                car.setCarModel(GAZ.GAZ_3308_3308_3308_33081.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 4:
                                                car.setCarModel(GAZ.GAZ_33081_33081_43_33081_57_33081_70_33081_73_33081_86_33081_87.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 5:
                                                car.setCarModel(GAZ.GAZ_3309_1.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 6:
                                                car.setCarModel(GAZ.GAZ_3309_ZMZE3.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 7:
                                                car.setCarModel(GAZ.GAZ_3309_EVRO2.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 8:
                                                car.setCarModel(GAZ.GAZ_4301.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 9:
                                                car.setCarModel(GAZ.GAZ_66_OT1983.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 10:
                                                car.setCarModel(GAZ.GAZ_66_OT1996.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 11:
                                                car.setCarModel(GAZ.GAZ_33104_VALDAY.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 12:
                                                car.setCarModel(GAZ.GAZ_33104_VALDAY_EVRO3.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                            case 13:
                                                car.setCarModel(GAZ.GAZ_33106_EVRO3.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.GAZ);
                                                break;
                                        }
                                    }
                                }
                            });
                            break;
                        case 2:
                            modelComboBox.removeAllItems();
                            for (int i  = 0; i<modeliAVTO.getZil().length;i++){
                                modelComboBox.addItem(modeliAVTO.getZil()[i]);
                            }
                            proizvoditelComboBox.addItemListener(new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    //TODO Надо доделать код для зила. На сайте ЗИЛ не работал.
                                    car.setCarManufacturer(CARMANYFACTURER.ZIL);
                                }
                            });
                            break;
                        case 3:
                            modelComboBox.removeAllItems();
                            for (int i  = 0; i<modeliAVTO.getKraz().length;i++){
                                modelComboBox.addItem(modeliAVTO.getKraz()[i]);
                            }
                            proizvoditelComboBox.addItemListener(new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (e.getStateChange() == ItemEvent.SELECTED) {
                                        switch (proizvoditelComboBox.getSelectedIndex()) {
                                            case 0:
                                                car.setCarModel(KRAZ.KRAZ_255.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KRAZ);
                                                break;
                                            case 1:
                                                car.setCarModel(KRAZ.KRAZ_260.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KRAZ);
                                                break;
                                            case 2:
                                                car.setCarModel(KRAZ.KRAZ_256.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.KRAZ);
                                                break;
                                        }
                                    }
                                }
                            });
                            break;
                        case 4:
                            modelComboBox.removeAllItems();
                            for (int i  = 0; i<modeliAVTO.getMaz().length;i++){
                                modelComboBox.addItem(modeliAVTO.getMaz()[i]);
                            }
                            proizvoditelComboBox.addItemListener(new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (e.getStateChange() == ItemEvent.SELECTED) {
                                        switch (proizvoditelComboBox.getSelectedIndex()) {
                                            case 0:
                                                car.setCarModel(MAZ.MAZ_6317.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.MAZ);
                                                break;
                                            case 1:
                                                car.setCarModel(MAZ.MAZ_543_7310.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.MAZ);
                                                break;
                                            case 2:
                                                car.setCarModel(MAZ.MAZ_5335.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.MAZ);
                                                break;
                                        }
                                    }
                                }
                            });
                            break;
                        case 5:
                            modelComboBox.removeAllItems();
                            for (int i  = 0; i<modeliAVTO.getUral().length;i++){
                                modelComboBox.addItem(modeliAVTO.getUral()[i]);
                            }
                            proizvoditelComboBox.addItemListener(new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (e.getStateChange() == ItemEvent.SELECTED) {
                                        switch (proizvoditelComboBox.getSelectedIndex()) {
                                            case 0:
                                                car.setCarModel(URAL.URAL_375.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 1:
                                                car.setCarModel(URAL.URAL_4320_X4320X43202X.getManefacturer());
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 2:
                                                car.setCarModel("УРАЛ-4320");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 3:
                                                car.setCarModel("УРАЛ-4420");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 4:
                                                car.setCarModel("УРАЛ-4320-31");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 5:
                                                car.setCarModel("УРАЛ-43203-10");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 6:
                                                car.setCarModel("УРАЛ-532301");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 7:
                                                car.setCarModel("УРАЛ-55571-1121-70");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 8:
                                                car.setCarModel("УРАЛ-43204-1111-70");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;
                                            case 9:
                                                car.setCarModel("УРАЛ-532361");
                                                car.setCarManufacturer(CARMANYFACTURER.URAL);
                                                break;

                                        }
                                    }
                                }
                            });
                            break;
                    }
                }
            }
        });

       createDocumentButton = new JButton();
        createDocumentButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (createDocumentButton.isSelected() && modelComboBox.isEditable()){
               if (!требуетсяРемонтCheckBox.isSelected()){
                   car.setVIN(VINTextArea.getText());
                    String path = System.getProperty("user.home") + "/Desktop";
                   try {
                       FileWriter file = new FileWriter(path + "/" + car.getCarModel() + car.getVIN() + ".txt");
                    file.write(car.getCarModel() +" "+ car.getVIN() + " техника находится в исправном состоянии, потребность в ремоте отсутствует");
                       file.flush();
                       file.close();
                   } catch (IOException ex) {
                       throw new RuntimeException(ex);
                   }

               }else {
                   System.out.println("ТУТ ВЕДЕТСЯ РАЗРАБОТКА");
               }
           }
           }
       });


    }
}
