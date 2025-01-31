/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author ragne
 */
public class viewRoom extends javax.swing.JFrame {

    /**
     * Creates new form viewRoom
     */
    public viewRoom() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roomIDtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        typeTxt = new javax.swing.JTextField();
        floorTxt = new javax.swing.JTextField();
        capacityTxt = new javax.swing.JTextField();
        roomNumbertxt = new javax.swing.JTextField();
        pcsLbl = new javax.swing.JLabel();
        operatingLbl = new javax.swing.JLabel();
        microphoneLbl = new javax.swing.JLabel();
        seatingLbl = new javax.swing.JLabel();
        pcsTxt = new javax.swing.JTextField();
        operatingSystemTxt = new javax.swing.JTextField();
        microphoneTxt = new javax.swing.JTextField();
        seatingTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        backBtn.setText("Go Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Room");

        jLabel2.setText("Room ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Room Details");

        jLabel4.setText("Room Number:");

        jLabel5.setText("Floor:");

        jLabel6.setText("Capacity:");

        jLabel7.setText("Type:");

        pcsLbl.setText("No. of PCs:");

        operatingLbl.setText("Operating System:");

        microphoneLbl.setText("Microphone Type:");

        seatingLbl.setText("Tiered Seating:");

        pcsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcsTxtActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 204, 204));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(roomIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(searchBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(typeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(capacityTxt)
                                    .addComponent(floorTxt)
                                    .addComponent(roomNumbertxt))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(microphoneLbl)
                                            .addComponent(seatingLbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(seatingTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(microphoneTxt)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(pcsLbl)
                                                .addGap(48, 48, 48)
                                                .addComponent(pcsTxt))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(operatingLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(operatingSystemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(73, 73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(exitBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitBtn)
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(roomIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(floorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(capacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomNumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcsLbl)
                            .addComponent(pcsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operatingSystemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(operatingLbl))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(microphoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(microphoneLbl))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seatingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatingLbl))
                        .addGap(33, 33, 33)
                        .addComponent(backBtn)
                        .addGap(0, 43, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(592, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // Create a new instance of roomMenu to navigate back to the room menu
        roomMenu obj = new roomMenu();

        // Set the roomMenu window to be visible
        obj.setVisible(true);

        // Hide the current window (viewRoom window)
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void pcsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcsTxtActionPerformed

    }//GEN-LAST:event_pcsTxtActionPerformed
    private viewRoom exit;
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // Create a new instance of viewRoom for the exit action
        exit = new viewRoom();

        // Display a confirmation dialog asking the user if they want to exit
        if (JOptionPane.showConfirmDialog(exit, "Confirm if you want to exit", "Booking System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // If the user confirms (chooses "Yes"), exit the application
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        try {
            // Get the room ID entered by the user
            String roomIDtext = roomIDtxt.getText();

            // Check if the room ID field is empty
            if (roomIDtext.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please enter a valid Room ID", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the room ID entered is not a valid room ID (contains only digits)
            if (!roomIDtext.equals(roomIDtxt.getText()) || roomIDtext.matches("\\d+")) {
                JOptionPane.showMessageDialog(rootPane, "Room Not Found", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the room ID contains any digits
            if (!roomIDtext.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(rootPane, "Room Not Found", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Retrieve the room ID
            String roomID = roomIDtxt.getText();

            // Iterate through the list of lab rooms to find a matching room ID
            for (labRoom labs : AppLib.labRoomlst) {
                if (roomID.equals(labs.getRoomID())) {
                    // Populate the text fields with lab room details if a match is found
                    this.roomNumbertxt.setText(String.valueOf(labs.getroomNumber()));
                    this.floorTxt.setText(String.valueOf(labs.getfloor()));
                    this.capacityTxt.setText(String.valueOf(labs.getcapacity()));
                    this.typeTxt.setText("Lab Room");
                    this.pcsTxt.setText(String.valueOf(labs.getNumberPCs()));
                    this.operatingSystemTxt.setText(String.valueOf(labs.getoperatingSystem()));
                    this.operatingSystemTxt.setVisible(true);
                    this.operatingLbl.setVisible(true);
                    this.pcsLbl.setVisible(true);
                    this.pcsTxt.setVisible(true);
                    this.microphoneLbl.setVisible(false);
                    this.microphoneTxt.setVisible(false);
                    this.seatingLbl.setVisible(false);
                    this.seatingTxt.setVisible(false);
                    JOptionPane.showMessageDialog(rootPane, "Booking Exists");
                    return;
                }
            }

            // Iterate through the list of lecture halls to find a matching room ID
            for (lectureHall lecture : AppLib.lectureHalllst) {
                if (roomID.equals(lecture.getRoomID())) {
                    // Populate the text fields with lecture hall details if a match is found
                    this.roomNumbertxt.setText(String.valueOf(lecture.getroomNumber()));
                    this.floorTxt.setText(String.valueOf(lecture.getfloor()));
                    this.capacityTxt.setText(String.valueOf(lecture.getcapacity()));
                    this.typeTxt.setText("Lecture Hall");
                    this.microphoneTxt.setText(lecture.getmicrophoneType());
                    this.seatingTxt.setText(lecture.gettieredSeating());
                    this.operatingSystemTxt.setVisible(false);
                    this.operatingLbl.setVisible(false);
                    this.pcsLbl.setVisible(false);
                    this.pcsTxt.setVisible(false);
                    this.microphoneLbl.setVisible(true);
                    this.microphoneTxt.setVisible(true);
                    this.seatingLbl.setVisible(true);
                    this.seatingTxt.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Booking Exists");
                    return;
                }
            }
        } catch (Exception e) {
            // Display an error message if an exception occurs during processing
            JOptionPane.showMessageDialog(rootPane, "***Room Not Found***\n Please enter a valid Room ID ", "Error Message", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_searchBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Set certain components (microphoneTxt, microphoneLbl, seatingLbl, seatingTxt) to be initially invisible when the window opens
        this.microphoneTxt.setVisible(false);
        this.microphoneLbl.setVisible(false);
        this.seatingLbl.setVisible(false);
        this.seatingTxt.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField capacityTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField floorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel microphoneLbl;
    private javax.swing.JTextField microphoneTxt;
    private javax.swing.JLabel operatingLbl;
    private javax.swing.JTextField operatingSystemTxt;
    private javax.swing.JLabel pcsLbl;
    private javax.swing.JTextField pcsTxt;
    private javax.swing.JTextField roomIDtxt;
    private javax.swing.JTextField roomNumbertxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel seatingLbl;
    private javax.swing.JTextField seatingTxt;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables
}
