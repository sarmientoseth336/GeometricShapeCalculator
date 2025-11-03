package project.shapecalculator;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frame extends javax.swing.JFrame {

    AllShapeToggleGroup shapeToggles;

    ButtonGroup toggles;

    ArrayList<Shape2D> shapes2d;
    ArrayList<Shape3D> shapes3d;

    ShapeBase shapebase;

    Shape2D[] shapes2dlist = {
        new Circle(this),
        new Square(this)
    };

    Shape3D[] shapes3dlist = {
        new Sphere(this)
    };

    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Frame.class.getName());
    public Frame() {
        initComponents();

        shapeToggles = new AllShapeToggleGroup();

        toggles = new ButtonGroup();
        toggles.add(AreaToggleButton);
        toggles.add(PerimeterToggleButton);
        toggles.add(VolumeToggleButton);

        AreaToggleButton.setEnabled(false);
        PerimeterToggleButton.setEnabled(false);
        VolumeToggleButton.setEnabled(false);

        load2DShapes();
        load3DShapes();

        pack();
        setLocationRelativeTo(null);
    }

    private void load2DShapes() {
        shapes2d = new ArrayList<>();
        shapes2d.addAll(Arrays.asList(shapes2dlist));

        for (Shape2D shape : shapes2d) {
            shapeToggles.add(shape.buttonDisplay());
            container2dshapes.add(shape.buttonDisplay());
        }
    }

    private void load3DShapes() {
        shapes3d = new ArrayList<>();
        shapes3d.addAll(Arrays.asList(shapes3dlist));

        for (Shape3D shape : shapes3d) {
            shapeToggles.add(shape.buttonDisplay());
            container3dshapes.add(shape.buttonDisplay());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        container2dshapes = new javax.swing.JPanel();
        container3dshapes = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        AreaToggleButton = new javax.swing.JToggleButton();
        PerimeterToggleButton = new javax.swing.JToggleButton();
        VolumeToggleButton = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        CalculateButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        shapeNameLabel = new javax.swing.JLabel();
        contentDisplayPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shape Calculator");
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 500));

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        container2dshapes.setBackground(new java.awt.Color(204, 204, 204));
        container2dshapes.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        container2dshapes.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(container2dshapes);

        container3dshapes.setBackground(new java.awt.Color(204, 204, 204));
        container3dshapes.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        container3dshapes.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(container3dshapes);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        AreaToggleButton.setBackground(new java.awt.Color(204, 255, 255));
        AreaToggleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AreaToggleButton.setText("Area");
        AreaToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AreaToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaToggleButtonActionPerformed(evt);
            }
        });
        jPanel8.add(AreaToggleButton);

        PerimeterToggleButton.setBackground(new java.awt.Color(204, 255, 255));
        PerimeterToggleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PerimeterToggleButton.setText("Perimeter");
        PerimeterToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PerimeterToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerimeterToggleButtonActionPerformed(evt);
            }
        });
        jPanel8.add(PerimeterToggleButton);

        VolumeToggleButton.setBackground(new java.awt.Color(204, 255, 255));
        VolumeToggleButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        VolumeToggleButton.setText("Volume");
        VolumeToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolumeToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumeToggleButtonActionPerformed(evt);
            }
        });
        jPanel8.add(VolumeToggleButton);

        jPanel7.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Pick a Shape");
        jPanel7.add(jLabel3);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 44));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Geometric Shape Calculator");
        jPanel9.add(jLabel1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 200));
        jPanel3.setLayout(new java.awt.BorderLayout());

        CalculateButton.setBackground(new java.awt.Color(204, 255, 255));
        CalculateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CalculateButton.setText("CALCULATE");
        CalculateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CalculateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalculateButton.setPreferredSize(new java.awt.Dimension(150, 30));
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });
        jPanel10.add(CalculateButton);

        jPanel3.add(jPanel10, java.awt.BorderLayout.SOUTH);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel5.setPreferredSize(new java.awt.Dimension(0, 50));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0);
        flowLayout1.setAlignOnBaseline(true);
        jPanel5.setLayout(flowLayout1);

        shapeNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        shapeNameLabel.setText("Shape Name");
        jPanel5.add(shapeNameLabel);

        jPanel3.add(jPanel5, java.awt.BorderLayout.NORTH);

        contentDisplayPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentDisplayPanel.setPreferredSize(new java.awt.Dimension(642, 100));
        contentDisplayPanel.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(contentDisplayPanel, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AreaToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaToggleButtonActionPerformed

    }//GEN-LAST:event_AreaToggleButtonActionPerformed

    private void VolumeToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumeToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolumeToggleButtonActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        // 1️⃣ Check if a shape has been selected
        if (shapebase == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select a shape before calculating.",
                    "Missing Shape",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // 2️⃣ Check if a calculation type (Area, Volume, Perimeter) is selected
        int calcType = checkToggleButtons();
        if (calcType == 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select what to calculate (Area, Perimeter, or Volume).",
                    "Missing Calculation Type",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // 3️⃣ Try to get user inputs and handle numeric errors
        try {
            shapebase.loadInputValues(); // Loads values from text fields
            double calculation = shapebase.calculate(calcType);
            JOptionPane.showMessageDialog(
                    this,
                    "Result: " + calculation,
                    "Calculation Successful",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numerical values for all dimensions.",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "An unexpected error occurred: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void PerimeterToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerimeterToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerimeterToggleButtonActionPerformed

    private int checkToggleButtons() {
        if (AreaToggleButton.isSelected()) {
            return 1;
        } else if (VolumeToggleButton.isSelected()) {
            return 2;
        } else if (PerimeterToggleButton.isSelected()) {
            return 3;
        }
        return 0; // return perimeter
    }

    public void setShapeUsed(ShapeBase shapebase, String name) {
        shapeNameLabel.setText(name);
        this.shapebase = shapebase;
    }

    public void shape2dSelected() {
        AreaToggleButton.setEnabled(true);
        PerimeterToggleButton.setEnabled(true);

        VolumeToggleButton.setEnabled(false);

        toggles.clearSelection();
    }

    public void shape3dSelected() {
        AreaToggleButton.setEnabled(true);
        VolumeToggleButton.setEnabled(true);

        PerimeterToggleButton.setEnabled(false);

        toggles.clearSelection();
    }

    public void setContentDisplay(JPanel panel) {
        contentDisplayPanel.removeAll();
        contentDisplayPanel.add(panel);
        contentDisplayPanel.revalidate();
        contentDisplayPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AreaToggleButton;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JToggleButton PerimeterToggleButton;
    private javax.swing.JToggleButton VolumeToggleButton;
    private javax.swing.JPanel container2dshapes;
    private javax.swing.JPanel container3dshapes;
    private javax.swing.JPanel contentDisplayPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel shapeNameLabel;
    // End of variables declaration//GEN-END:variables
}
