package unitconverter;

import converters.AbstractConverter;
import converters.MeasureType;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
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

    static class helpAction implements ActionListener{ 
        public void actionPerformed(ActionEvent e) {
            JFrame helpScreen = new JFrame();
            JPanel panel = new JPanel();
            ImageIcon imageIcon = new ImageIcon("/Users/victorspolaor/Downloads/unicampLogo.png");
            JLabel imageLabel = new JLabel(imageIcon);
            JTextArea helpTextArea = new JTextArea(10, 25);
            JScrollPane scrollPane = new JScrollPane(helpTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

            // Help JFrame configurations
            helpScreen.setTitle("Help for Unit Converter - Ver. 1.0 - November, 2020");
            helpScreen.setVisible(true);
            helpScreen.setSize(600, 200);

            // Inserting help JTextArea
            String helpText = "This program was written as a part of a college project, it's intention is to demonstrate resources of Graphical User Interface (Swing) through the conversion between to measure units.\n\n Menu options:\n * In the 'Converter' menu is where the conversion operations are set\n * In the 'Help' menu informations about the program and how to use it are displayed\n\n Hope that's useful to you!";
            helpTextArea.setLineWrap(true);
            helpTextArea.setWrapStyleWord(true);
            helpTextArea.append(helpText);
            helpTextArea.setEditable(false);

            // Inserting components into JFrame
            panel.add(imageLabel);
            panel.add(scrollPane, BorderLayout.PAGE_START);
            helpScreen.add(panel);
        }
    }

    static class howToAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JFrame howToScreen = new JFrame();
            JPanel panel = new JPanel();
            ImageIcon imageIcon = new ImageIcon("/Users/victorspolaor/Downloads/unicampLogo.png");
            JLabel imageLabel = new JLabel(imageIcon);
            JTextArea howToTextArea = new JTextArea(10, 25);
            JScrollPane scrollPane = new JScrollPane(howToTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

            // Help JFrame configurations
            howToScreen.setTitle("How to use it - Ver. 1.0 - November, 2020");
            howToScreen.setVisible(true);
            howToScreen.setSize(600, 200);

            // Inserting how to JTextArea
            String helpText = "In terms of using the software, it's very easy and intuitive:\n * In the combox right below the menu, choose the type of conversion you want to make\n * Insert the numeric value you want to convert in front of the 'Convert from' label\n * Choose the units you want to convert from and convert to\n * Click on the 'convert' button to make the conversion";
            howToTextArea.setLineWrap(true);
            howToTextArea.setWrapStyleWord(true);
            howToTextArea.append(helpText);
            howToTextArea.setEditable(false);

            // Inserting components into JFrame
            panel.add(imageLabel);
            panel.add(scrollPane, BorderLayout.PAGE_START);
            howToScreen.add(panel);
        }
    }

    public FrameBuilder() {
        initComponents();
    }

    private void initComponents() {
        // Converter JFrame
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setSize(700, 250);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // Menu buttons
        JMenu menuButton = new JMenu("Converter");
        JMenu helpButton = new JMenu("Help");
        menuButton.setMnemonic(KeyEvent.VK_A);
        helpButton.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menuButton);
        menuBar.add(helpButton);

        frame.setJMenuBar(menuBar);

        // Help menu
        JMenuItem helpScreenMenuItem = new JMenuItem("Help for Unit Converter");
        JMenuItem howToMenuItem = new JMenuItem("How to use it");
        helpButton.add(helpScreenMenuItem);
        helpButton.add(howToMenuItem);
        helpScreenMenuItem.addActionListener(new helpAction());
        howToMenuItem.addActionListener(new howToAction());

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
