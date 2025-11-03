package project.shapecalculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.HashMap;

public class ShapeDimensionDisplay extends JPanel {

    private final HashMap<String, JTextField> inputFields = new HashMap<>();

    public ShapeDimensionDisplay(String[] parameters) {
        setLayout(new GridLayout(parameters.length, 1, 10, 10));

        for (String param : parameters) {
            JPanel fieldGroup = inputFieldGroup(param);
            add(fieldGroup);
        }

        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // padding
    }

    private JPanel inputFieldGroup(String name) {
        JPanel group = new JPanel(new BorderLayout(10, 0));
        JLabel label = new JLabel(name + ":");
        JTextField field = new JTextField(10);

        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        field.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        // 🔹 Restrict input to numeric only (and optional decimal point)
        ((AbstractDocument) field.getDocument()).setDocumentFilter(new NumericFilter());

        group.add(label, BorderLayout.WEST);
        group.add(field, BorderLayout.CENTER);

        inputFields.put(name, field);
        return group;
    }

    public String getValue(String name) {
        JTextField field = inputFields.get(name);
        return (field != null) ? field.getText() : "";
    }

    public HashMap<String, String> getAllValues() {
        HashMap<String, String> values = new HashMap<>();
        for (String key : inputFields.keySet()) {
            values.put(key, inputFields.get(key).getText());
        }
        return values;
    }

    private static class NumericFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                throws BadLocationException {
            if (isNumeric(string, fb.getDocument().getText(0, fb.getDocument().getLength()))) {
                super.insertString(fb, offset, string, attr);
            } else {
                Toolkit.getDefaultToolkit().beep();
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            if (isNumeric(text, fb.getDocument().getText(0, fb.getDocument().getLength()))) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                Toolkit.getDefaultToolkit().beep();
            }
        }

        private boolean isNumeric(String text, String existing) {
            if (text == null) {
                return true;
            }

            String full = existing.substring(0, existing.length()) + text;
            return full.matches("\\d*\\.?\\d*");
        }
    }
}
