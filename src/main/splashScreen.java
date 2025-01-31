/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 *
 * @author ragne
 */
public class splashScreen extends javax.swing.JFrame {

    /**
     * Creates new form splashScreen
     */
    public splashScreen() {
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

        panaelLbl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        percentageLbl = new javax.swing.JLabel();
        loadingLbl = new javax.swing.JLabel();
        picLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panaelLbl.setBackground(new java.awt.Color(204, 204, 255));
        panaelLbl.setForeground(new java.awt.Color(153, 51, 255));

        titleLbl.setBackground(new java.awt.Color(0, 0, 0));
        titleLbl.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Room Booking System");

        progressBar.setBackground(new java.awt.Color(0, 0, 255));
        progressBar.setForeground(new java.awt.Color(204, 204, 255));

        percentageLbl.setForeground(new java.awt.Color(255, 255, 255));
        percentageLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentageLbl.setText("0%");

        loadingLbl.setForeground(new java.awt.Color(255, 255, 255));
        loadingLbl.setText("Loading...");

        picLbl.setMaximumSize(new java.awt.Dimension(512, 512));
        picLbl.setMinimumSize(new java.awt.Dimension(512, 512));

        javax.swing.GroupLayout panaelLblLayout = new javax.swing.GroupLayout(panaelLbl);
        panaelLbl.setLayout(panaelLblLayout);
        panaelLblLayout.setHorizontalGroup(
            panaelLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panaelLblLayout.createSequentialGroup()
                .addGroup(panaelLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panaelLblLayout.createSequentialGroup()
                        .addComponent(loadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(panaelLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panaelLblLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(percentageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panaelLblLayout.createSequentialGroup()
                                .addGroup(panaelLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(picLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 163, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panaelLblLayout.setVerticalGroup(
            panaelLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panaelLblLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(picLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 220, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addGroup(panaelLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(percentageLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadingLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panaelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panaelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(575, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        splashScreen splash =  new splashScreen();
        splash.setVisible(true);
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel loadingLbl;
    private javax.swing.JPanel panaelLbl;
    private javax.swing.JLabel percentageLbl;
    private javax.swing.JLabel picLbl;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables


    public javax.swing.JProgressBar getprogressBar(){
        return progressBar;
    }
    public javax.swing.JLabel getpercentageLbl(){
        return percentageLbl;
    }

}
