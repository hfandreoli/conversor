package unitconverter;

import converters.AbstractConverter;
import converters.MeasureType;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FrameBuilder {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrameBuilder window = new FrameBuilder();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FrameBuilder() {
        initComponents();
    }

    private void initComponents() {
        // JFrame
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setSize(700, 250);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Labels
        JLabel convertFromLabel = new JLabel("Convert from", SwingConstants.CENTER);
        convertFromLabel.setBounds(20, 45, 150, 60);
        frame.getContentPane().add(convertFromLabel);

        JLabel convertToLabel = new JLabel("to", SwingConstants.CENTER);
        convertToLabel.setBounds(20, 130, 150, 60);
        frame.getContentPane().add(convertToLabel);

        Border border = BorderFactory.createLineBorder(Color.black, 1);
        convertFromLabel.setBorder(border);
        convertToLabel.setBorder(border);

        // Text fields
        NumberFormat numberFormat = DecimalFormat.getNumberInstance(Locale.ENGLISH);
        numberFormat.setMaximumFractionDigits(Integer.MAX_VALUE);

        JFormattedTextField convertFromTextField = new JFormattedTextField(numberFormat);
        convertFromTextField.setBounds(180, 45, 150, 60);
        frame.getContentPane().add(convertFromTextField);
        convertFromTextField.setHorizontalAlignment(SwingConstants.CENTER);
        convertFromTextField.setColumns(10);

        JFormattedTextField convertToTextField = new JFormattedTextField();
        convertToTextField.setBounds(180, 130, 150, 60);
        frame.getContentPane().add(convertToTextField);
        convertToTextField.setHorizontalAlignment(SwingConstants.CENTER);
        convertToTextField.setEditable(false);
        convertToTextField.setColumns(10);

        // ComboBoxes
        JComboBox<AbstractConverter> convertFromComboBox = new JComboBox<>();
        convertFromComboBox.setBounds(360, 45, 300, 25);
        frame.getContentPane().add(convertFromComboBox);

        JComboBox<AbstractConverter> convertToComboBox = new JComboBox<>();
        convertToComboBox.setBounds(360, 130, 300, 25);
        frame.getContentPane().add(convertToComboBox);

        JComboBox<MeasureType> typesComboBox = new JComboBox<>();
        typesComboBox.setBounds(20, 10, 300, 25);
        MeasureType[] typeArray = MeasureType.getAllTypes();
        typesComboBox.addActionListener(new TypeActionListener(typesComboBox, convertFromComboBox, convertToComboBox));
        for (MeasureType measureType : typeArray) {
            typesComboBox.addItem(measureType);
        }
        frame.getContentPane().add(typesComboBox);

        // Button
        Button button = new Button();
        button.setBounds(360, 10, 75, 25);
        button.setLabel("Convert");
        button.addActionListener(new Calculator(convertFromComboBox, convertToComboBox, convertFromTextField, convertToTextField));
        frame.getContentPane().add(button);
    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}
