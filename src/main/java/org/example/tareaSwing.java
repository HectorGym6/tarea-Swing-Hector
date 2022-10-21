package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class tareaSwing {
    public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setBounds(10, 10, 500, 400);
            f.setVisible(true);
            f.setResizable(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainpanel = new JPanel(new BorderLayout());
            mainpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JPanel panelNorth = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));



            panelNorth.setBackground(Color.CYAN.darker());

            JButton option1Button = new JButton("Option 1");
            JButton option2Button = new JButton("Option 2");
            JButton option3Button = new JButton("Option 3");

            ButtonGroup buttonGroup = new ButtonGroup();

            buttonGroup.add(option1Button);
            buttonGroup.add(option2Button);
            buttonGroup.add(option3Button);

            panelNorth.add(option1Button);
            panelNorth.add(option2Button);
            panelNorth.add(option3Button);

            JPanel panelWest = new JPanel(new GridBagLayout());

            panelWest.setPreferredSize(new Dimension(90, 10));

            panelWest.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Submenu"));

            panelWest.setBackground(Color.CYAN.darker());

            JLabel option1Label = new JLabel("Option 1");
            panelWest.add(option1Label, new GridBagConstraints(
                    0,
                    0,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 10, 0, 0),
                    0,
                    0)
            );

            JLabel option2Label = new JLabel("Option 2");
            panelWest.add(option2Label, new GridBagConstraints(
                    0,
                    1,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 10, 0, 0),
                    0,
                    0)
            );
            JLabel option3Label = new JLabel("Option 3");
            panelWest.add(option3Label, new GridBagConstraints(
                    0,
                    2,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 10, 0, 0),
                    0,
                    0)
            );
            JLabel option4Label = new JLabel("Option 4");
            panelWest.add(option4Label, new GridBagConstraints(
                    0,
                    3,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 10, 0, 0),
                    0,
                    0)
            );
            JLabel option5Label = new JLabel("Option 5");
            panelWest.add(option5Label, new GridBagConstraints(
                    0,
                    4,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 10, 0, 0),
                    0,
                    0)
            );
            panelWest.add(new JLabel(), new GridBagConstraints(
                    0,
                    5,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 10, 0, 0),
                    0,
                    0)
            );

            JPanel panelCenter = new JPanel(new GridBagLayout());

            JCheckBox name = new JCheckBox("Name");
            panelCenter.add(name, new GridBagConstraints(
                    0,
                    0,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 20, 0, 0),
                    0,
                    0)
            );
            JCheckBox address = new JCheckBox("Address");
            panelCenter.add(address, new GridBagConstraints(
                    0,
                    1,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 20, 0, 0),
                    0,
                    0)
            );
            panelCenter.add(new JLabel("City"), new GridBagConstraints(
                    0,
                    2,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 50, 0, 0),
                    0,
                    0)
            );
            JCheckBox description = new JCheckBox("Description");
            panelCenter.add(description, new GridBagConstraints(
                    0,
                    3,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.NORTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 20, 0, 0),
                    0,
                    0)
            );
            JTextField nameTextField = new JTextField();
            nameTextField.setEnabled(false);
            panelCenter.add(nameTextField, new GridBagConstraints(
                    1,
                    0,
                    5,
                    1,
                    5.0,
                    1.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );
            JTextField addressTextField = new JTextField();
            addressTextField.setEnabled(false);
            panelCenter.add(addressTextField, new GridBagConstraints(
                    1,
                    1,
                    5,
                    1,
                    5.0,
                    1.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );
            JTextField cityTextField = new JTextField();
            panelCenter.add(cityTextField, new GridBagConstraints(
                    1,
                    2,
                    4,
                    1,
                    4.0,
                    1.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );
            JComboBox<String> jComboBox = new JComboBox<>();
            jComboBox.addItem("Spain");
            jComboBox.addItem("Germany");
            jComboBox.addItem("France");
            panelCenter.add(jComboBox, new GridBagConstraints(
                    5,
                    2,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );
            JTextArea descriptionTextArea = new JTextArea();
            descriptionTextArea.setEnabled(false);
            panelCenter.add(descriptionTextArea, new GridBagConstraints(
                    1,
                    3,
                    5,
                    5,
                    5.0,
                    5.0,
                    GridBagConstraints.CENTER,
                    GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );
            ButtonGroup buttonGroupActiveInactive = new ButtonGroup();
            JRadioButton active = new JRadioButton("Active");
            JRadioButton inactive = new JRadioButton("Inactive");
            buttonGroupActiveInactive.add(active);
            buttonGroupActiveInactive.add(inactive);
            panelCenter.add(active, new GridBagConstraints(
                    1,
                    8,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );
            panelCenter.add(inactive, new GridBagConstraints(
                    5,
                    8,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.SOUTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );
            JButton save = new JButton("Save");
            panelCenter.add(save, new GridBagConstraints(
                    5,
                    9,
                    1,
                    1,
                    1.0,
                    1.0,
                    GridBagConstraints.NORTH,
                    GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0),
                    0,
                    0)
            );

            name.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if(name.isSelected()){
                        nameTextField.setEnabled(true);
                    }
                    else if (!name.isSelected()) {
                        nameTextField.setEnabled(false);
                    }
                }
            });
            address.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if(address.isSelected()){
                        addressTextField.setEnabled(true);
                    }
                    else if (!active.isSelected()) {
                        addressTextField.setEnabled(false);
                    }
                }
            });
            description.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if(description.isSelected()){
                        descriptionTextArea.setEnabled(true);
                    }
                    else if (!name.isSelected()) {
                        descriptionTextArea.setEnabled(false);
                    }
                }
            });

            option1Label.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                }
                @Override
                public void mousePressed(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseReleased(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseEntered(MouseEvent mouseEvent) {
                    option1Label.setForeground(Color.RED);
                }
                @Override
                public void mouseExited(MouseEvent mouseEvent) {
                    option1Label.setForeground(Color.BLACK);
                }
            });

            option2Label.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                }
                @Override
                public void mousePressed(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseReleased(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseEntered(MouseEvent mouseEvent) {
                    option2Label.setForeground(Color.RED);
                }
                @Override
                public void mouseExited(MouseEvent mouseEvent) {
                    option2Label.setForeground(Color.BLACK);
                }
            });

            option3Label.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                }
                @Override
                public void mousePressed(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseReleased(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseEntered(MouseEvent mouseEvent) {
                    option3Label.setForeground(Color.RED);
                }
                @Override
                public void mouseExited(MouseEvent mouseEvent) {
                    option3Label.setForeground(Color.BLACK);
                }
            });

            option4Label.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                }
                @Override
                public void mousePressed(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseReleased(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseEntered(MouseEvent mouseEvent) {
                    option4Label.setForeground(Color.RED);
                }
                @Override
                public void mouseExited(MouseEvent mouseEvent) {
                    option4Label.setForeground(Color.BLACK);
                }
            });

            option5Label.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                }
                @Override
                public void mousePressed(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseReleased(MouseEvent mouseEvent) {
                }
                @Override
                public void mouseEntered(MouseEvent mouseEvent) {
                    option5Label.setForeground(Color.RED);
                }
                @Override
                public void mouseExited(MouseEvent mouseEvent) {
                    option5Label.setForeground(Color.BLACK);
                }
            });

            mainpanel.add(panelNorth, BorderLayout.NORTH);
            mainpanel.add(panelWest, BorderLayout.WEST);
            mainpanel.add(panelCenter, BorderLayout.CENTER);


            f.setContentPane(mainpanel);
            f.repaint();
            f.revalidate();
        }
    }

