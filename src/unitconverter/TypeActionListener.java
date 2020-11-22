package unitconverter;

import converters.AbstractConverter;
import converters.MeasureType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class TypeActionListener implements ActionListener {
    private final JComboBox<MeasureType> typeComboBox;
    private final JComboBox<AbstractConverter> fromComboBox;
    private final JComboBox<AbstractConverter> toComboBox;

    public TypeActionListener(JComboBox<MeasureType> typeCombobox, JComboBox<AbstractConverter> fromComboBox, JComboBox<AbstractConverter> toComboBox) {
        this.typeComboBox = typeCombobox;
        this.fromComboBox = fromComboBox;
        this.toComboBox = toComboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (!e.getActionCommand().equals("comboBoxChanged")) {
            return;
        }

        fromComboBox.removeAllItems();
        toComboBox.removeAllItems();

        MeasureType selectedType = (MeasureType) typeComboBox.getSelectedItem();
        assert selectedType != null;
        String packageName = selectedType.getTypeString();

        String[] fileList = new File("C:\\repos\\java\\conversor\\src\\converters\\" + packageName).list();
        if (fileList != null) {
            for (String file : fileList) {
                try {

                    String className = file.substring(0, file.indexOf("."));
                    AbstractConverter converter = (AbstractConverter) Class.forName("converters." + packageName + "." + className).getDeclaredConstructor().newInstance();
                    fromComboBox.addItem(converter);
                    toComboBox.addItem(converter);

                } catch (InstantiationException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException instantiationException) {
                    instantiationException.printStackTrace();
                }
            }
        }
    }
}
