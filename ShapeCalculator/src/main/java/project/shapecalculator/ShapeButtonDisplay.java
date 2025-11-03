package project.shapecalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ShapeButtonDisplay extends JToggleButton {
    
    public ShapeButtonDisplay(Frame frame, ShapeBase shapebase, JPanel panel, String imageLink, String name, Boolean is2D) {
        super(name);
        
        ImageIcon icon = new ImageIcon(getClass().getResource(imageLink));

        Image img = icon.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);

        setIcon(icon);
        setPreferredSize(new Dimension(0, 20));
        setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setHorizontalTextPosition(SwingConstants.RIGHT);
        setVerticalTextPosition(SwingConstants.CENTER);
        setIconTextGap(10);

        setFocusPainted(false);
        setBackground(Color.WHITE);
        setFont(new Font("Segoe UI", Font.PLAIN, 14));
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        
        addActionListener((ActionEvent e) -> {
            
            if (is2D) {
                frame.shape2dSelected();
                
            } else {
                frame.shape3dSelected();
            }
            frame.setShapeUsed(shapebase, name);
            frame.setContentDisplay(panel);
        });
    }
}
