/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.BoxLayout;

import controller.Waiter_Subpanel_Controller;


/**
 *
 * @author Nishna2
 */
public class Waiter_Results extends javax.swing.JPanel {

    /**
     * Creates new form Waiter_Results
     */
    public Waiter_Results() {
        initComponents();
        // Layout our contents vertically
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);
    }
    
    
    public void layoutWaiterResults(String name) {
        
    	Waiter_Subpanel subPanel = new Waiter_Subpanel();
		
		new Waiter_Subpanel_Controller(subPanel,name);
           this.add(subPanel);
        
     revalidate();
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
