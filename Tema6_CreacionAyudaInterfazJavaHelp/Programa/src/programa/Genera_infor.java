/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package programa;




import java.io.File;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JFrame;


/**
 *
 * @author benmu
 */
public class Genera_infor extends javax.swing.JDialog {
    


    /**
     * Creates new form generador_infor
     */
    public Genera_infor(
            java.awt.Frame parent, boolean modal
    ) 
            {
        super(parent, modal);
        initComponents();
        ayuda();
        
                
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblogotipo = new javax.swing.JLabel();
        btcancelar = new javax.swing.JButton();
        btgenerar = new javax.swing.JButton();
        lbuno = new javax.swing.JLabel();
        lbdos = new javax.swing.JLabel();
        lbinicial = new javax.swing.JLabel();
        lbfinal = new javax.swing.JLabel();
        cboxinicial = new javax.swing.JComboBox<>();
        cboxfinal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informe sobre duración y número de reservas de habitaciones");
        setResizable(false);

        lblogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logotipo.jpg"))); // NOI18N

        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Cancelar3.jpg"))); // NOI18N
        btcancelar.setToolTipText("Se cuerra la ventana de generación de informes");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        btgenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/GenerarInforme2.jpg"))); // NOI18N
        btgenerar.setToolTipText("Se genera el informe de las habitaciones selecionadas");
        btgenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgenerarActionPerformed(evt);
            }
        });

        lbuno.setText("GENERAR INFORME SOBRE DURACIÓN Y NÚMERO DE RESERVAS DE HABITACIONES");

        lbdos.setText("Elegir RANGO de números de habitación");

        lbinicial.setText("Nº habitación INICIAL:");
        lbinicial.setToolTipText("Nº de la habitacón inicial");

        lbfinal.setText("Nº habitación FINAL:");

        cboxinicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "201", "202", "203", "204" }));
        cboxinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxinicialActionPerformed(evt);
            }
        });

        cboxfinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "201", "202", "203", "204" }));
        cboxfinal.setToolTipText("Nº de la habitación final");
        cboxfinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxfinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbinicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbdos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboxinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lbfinal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btgenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btcancelar)
                        .addGap(84, 84, 84))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbuno)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbuno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbdos)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxfinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbfinal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbinicial, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btgenerar)
                    .addComponent(btcancelar))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void cboxinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxinicialActionPerformed
        // TODO add your handling code here:
        if (cboxinicial.getSelectedIndex()>cboxfinal.getSelectedIndex()){
            cboxinicial.setSelectedIndex(0);
            cboxfinal.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, "El número de habitación inicial debe ser menor o igual al número de la habitación final");
            
        }
    }//GEN-LAST:event_cboxinicialActionPerformed

    private void cboxfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxfinalActionPerformed
        // TODO add your handling code here:
        if (cboxinicial.getSelectedIndex()>cboxfinal.getSelectedIndex()){
            cboxinicial.setSelectedIndex(0);
            cboxfinal.setSelectedIndex(0);
            JOptionPane.showMessageDialog(null, "El número de habitación inicial debe ser menor o igual al número de la habitación final");
            
        }
    }//GEN-LAST:event_cboxfinalActionPerformed

    private void btgenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgenerarActionPerformed
        // TODO add your handling code here:

        
        String reportSource="./informes/reservasBMP.jrxml";
        
        String reportDest="./informes/reservasBMP.pdf";
        
        Map<String, Object> params=new HashMap<String, Object>();
        
        //Path donde se introduce la ruta obsoluta donde se encuentra el programa. Posteriormente se utilizará con "/imagenes/logotipo.jpg"
        //para dirigir al programa donde se encuentra la imagen para ingresarla en el reporte.
        Path path = FileSystems.getDefault().getPath("");
	
        String directoryName = path.toAbsolutePath().toString();
        
        System.out.println(directoryName);
        
        
        
        try {
            //Intoduciendo parámetros: habitación inicial, habitación final y ruta donde se encuentra el programa ejecutándose.
            params.put("room_inicial", cboxinicial.getSelectedItem());  
        
            params.put("room_final", cboxfinal.getSelectedItem());
        
            params.put("logo", directoryName);

            //Compilar la plantilla
            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);
        
            //Habilitar el driver necesario.
            Class.forName("com.mysql.jdbc.Driver");
       
            //Crear una conexión para pasar el informe
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root",null);
        
            //Sustituir el parámetro datasource JR vacío por 
            //el parámentro de conexión conn.
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);   
        
            //Exportar PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, reportDest);
        
            //Ver el informe
            JasperViewer.viewReport (jasperPrint);
        
        }
        //Excepciones
        catch (JRException ex){
            
            System.out.println(ex.getMessage());
        
        } catch (SQLException b) {
            
            System.out.println(b.getMessage());
        
        } catch (Exception c) {
            
            System.out.println(c.getMessage());
        }
        
        JOptionPane.showMessageDialog(null, "Informe generado");

    }//GEN-LAST:event_btgenerarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btgenerar;
    private javax.swing.JComboBox<String> cboxfinal;
    private javax.swing.JComboBox<String> cboxinicial;
    private javax.swing.JLabel lbdos;
    private javax.swing.JLabel lbfinal;
    private javax.swing.JLabel lbinicial;
    private javax.swing.JLabel lblogotipo;
    private javax.swing.JLabel lbuno;
    // End of variables declaration//GEN-END:variables


private void ayuda(){
    try{
        //Carga el fichero
        File fichero=new File ("help/help_set.hs");
        URL hsURL=fichero.toURI().toURL();
        
        //Crea el HelpSet y el HelpBroker
        HelpSet helpset=new HelpSet(getClass().getClassLoader(),hsURL);
        HelpBroker hb=helpset.createHelpBroker();
 
        //Pone ayuda a F1
        hb.enableHelpKey(getContentPane(),"ayuda_reservas", helpset);

    }catch (Exception a){
    
        a.printStackTrace();
    }
}
}
