package main;

import javax.swing.*;

//  main class
public class Main {
    
    // The main method is the entry point 
    public static void main(String[] args) {
        
        // Create a new instance of your splash screen
        splashScreen splash = new splashScreen();
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Set the splash screen visible
                splash.setVisible(true);
                
                JLabel percentageLbl = splash.getpercentageLbl();
                JProgressBar progressBar = splash.getprogressBar();
            }
        });
           
        // Simulate a loading process with a progress bar
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100); // Sleep for 10 seconds to simulate loading
                splash.getprogressBar().setValue(i); // Update the progress bar value
                splash.getpercentageLbl().setText(Integer.toString(i) + "%"); // Update the percentage label
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle any potential exceptions 
        }
        
        // Once loading is complete, hide the splash screen and show the main menu  
        splash.setVisible(false); // Hide the splash screen
        Menu next = new Menu(); // Create an instance of main menu
        next.setVisible(true); // Show the main menu
        
        // Dispose the splash screen after transitioning to the main menu
        splash.dispose(); 
    }
}
