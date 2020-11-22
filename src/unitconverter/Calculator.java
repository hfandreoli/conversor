package unitconverter;

import converters.AbstractConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    private final JComboBox<AbstractConverter> fromComboBox;
    private final JComboBox<AbstractConverter> toComboBox;
    private final JFormattedTextField fromTextField;
    private final JFormattedTextField toTextField;

    public Calculator(JComboBox<AbstractConverter> fromComboBox, JComboBox<AbstractConverter> toComboBox,
                      JFormattedTextField fromTextField, JFormattedTextField toTextField) {
        this.fromComboBox = fromComboBox;
        this.toComboBox = toComboBox;
        this.fromTextField = fromTextField;
        this.toTextField = toTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AbstractConverter fromConverter = (AbstractConverter) fromComboBox.getSelectedItem();
        AbstractConverter toConverter = (AbstractConverter) toComboBox.getSelectedItem();

        double operand = 0;

        try {
            operand = Double.parseDouble(fromTextField.getText());
        } catch (NumberFormatException ignored) {
        }

        double value = toConverter.fromBasicUnit(fromConverter.toBasicUnit(operand));

        toTextField.setText(Double.toString(value));
        System.out.println(value);
    }
}
