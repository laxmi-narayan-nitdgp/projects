/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pck;

import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author laxmi
 */
public class Adminconsole extends javax.swing.JFrame {

    /**
     * Creates new form Adminconsole
     */
    public Adminconsole() {
        
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(252, 200, 99));
        setForeground(new java.awt.Color(60, 60, 109));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(61, 11, 80));
        jButton1.setText("Open System Default Browser");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(61, 111, 80));
        jButton2.setText("System Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, 30));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(41, 37, 80));
        jButton3.setText("Running Process");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 170, -1));

        jTextArea1.setBackground(new java.awt.Color(249, 215, 142));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1000, 240));

        jButton4.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jButton4.setText("Network Information");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 190, -1));

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(69, 69, 142));
        jButton5.setText("Open Terminal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, -1));

        jButton6.setBackground(new java.awt.Color(73, 87, 144));
        jButton6.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jButton6.setText("LIST All User");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 220, -1));

        jLabel1.setBackground(new java.awt.Color(216, 173, 79));
        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("ADMIN CONSOL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 400, 40));

        jButton7.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(209, 50, 50));
        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        URI uri = new URI("http://www.google.com");
      Desktop desktop = null;
      if (Desktop.isDesktopSupported()) {
        desktop = Desktop.getDesktop();
      

      if (desktop != null)
          {
        desktop.browse(uri);
          }
      }}
catch(Exception e){
          System.out.println(e.toString());
          
      }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(" ");
        String st =System.getProperties().toString();
        StringTokenizer stk = new StringTokenizer(st,",");
        int x = stk.countTokens();
        for(int i=0;i<x;i++){
            jTextArea1.append(stk.nextToken()+"\n");
        }
     String str = System.getProperty("os.name");
     jTextArea1.append("\n"+"Os name is "+str.toLowerCase()); 
      str = System.getProperty("user.name");
      jTextArea1.append("\n"+"User Name is "+str.toLowerCase());           
     jTextArea1.append("\n"+"Os version"+"os.version");
     jTextArea1.append("\n"+"Os Arch"+"os.arch"+"\n"+"Processors "+Runtime.getRuntime().availableProcessors());
      

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(" ");
        try {
        String line;
        Process p = Runtime.getRuntime().exec("ps aux");
        BufferedReader input =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = input.readLine()) != null) {
            jTextArea1.append("\n"+line); //<-- Parse data here.
        }
        input.close();
    } catch (Exception err) {
        err.printStackTrace();
    }
    Properties properties = System.getProperties();  
        Set<Object> keys = properties.keySet();  
        for(Object key : keys){  
            jTextArea1.append("\n"+key +  "\t: " + properties.get(key)+"\n");  
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(" ");
              try {
            NetworkInterface ntAdapter = null;
            InetAddress inet = null;

            jTextArea1.append("Network Interface Informations"+"\n");

            Enumeration   enums = NetworkInterface.getNetworkInterfaces();

            while ( 
                enums.hasMoreElements())
   {
     
       ntAdapter = (NetworkInterface) 
                enums.nextElement();
   jTextArea1.append("\n"+"Adapter Display Name :" + ntAdapter.getDisplayName());
                jTextArea1.append("\n"+"Adapter Name : " + ntAdapter.getName());
                
                Enumeration e = ntAdapter.getInetAddresses();
                while (e.hasMoreElements()) {
                    inet = (InetAddress) e.nextElement();
                    jTextArea1.append("\n"+"    Host Address : " + inet.getHostAddress());
                    
                }
                jTextArea1.append("\n "+"Look backaddress  "+inet.getLoopbackAddress());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
               try{
              Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();{
        for (NetworkInterface netint : Collections.list(nets)){     
            jTextArea1.append("\n Display name"+netint.getDisplayName());
            jTextArea1.append("\n hardware address"+netint.getHardwareAddress().toString());
            jTextArea1.append("\n MTU"+String.valueOf(netint.getMTU()));
            jTextArea1.append("\n Lookback"+String.valueOf(netint.isLoopback()));
            jTextArea1.append("\n Is virtual"+String.valueOf(netint.isVirtual()));
            jTextArea1.append("\n Support Multicast"+String.valueOf(netint.supportsMulticast()));
            jTextArea1.append("\n IS point to point"+String.valueOf(netint.isPointToPoint()));
            jTextArea1.append("\n Is Up"+String.valueOf(netint.isUp()));
            jTextArea1.append("\n Harware name"+String.valueOf(netint.getHardwareAddress()));
            
            Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
            for (InetAddress inetAddress : Collections.list(inetAddresses)) {
                jTextArea1.append(inetAddress.toString());
            }
        }
               }
               }catch(Exception e){
                   System.out.println(e.toString());
               }
  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String[] cmdArray = {"gnome-terminal","java -classpath /home/r/byz/ Orchestrator"};

        try {
            Runtime.getRuntime().exec(cmdArray);
        } catch (IOException e) {
            
            e.printStackTrace();
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(" ");
         try{
                String line;
        Process p = Runtime.getRuntime().exec("cat /etc/passwd");
        BufferedReader input =   new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = input.readLine()) != null) {
            jTextArea1.append("\n  "+ line +"\n"); 
        }
        input.close();
    
        }catch(Exception e){
            System.out.println(e.toString());
        }
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminconsole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Adminconsole as = new Adminconsole();
                as.setBackground(Color.magenta);
                        new Adminconsole().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
