/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.UInterfaces.AntonioJuego2;

import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import proyectofinal.Puntuacion;
import proyectofinal.UInterfaces.Ranking;

/**
 *
 * @author jacr3
 */
public class ERA4Dificil extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    private List<Preguntas> listaPreguntas; 
    private String RespuestaCorrecta;
    private int ronda=0;
    private int puntajes; // Variable para llevar un registro del puntaje.
    static int userIDF,juegoID;
    /**
     * Creates new form ERA1Facil
     */
    public ERA4Dificil(int userID, int juego) {
        this.setContentPane(fondo);
        initComponents();
        userIDF=userID;
        juegoID=juego;
        this.listaPreguntas = Arrays.asList(
        new Preguntas("¿Quién fue el autor del Plan de Ayala, que se oponía al gobierno de Francisco I. Madero?", "Pancho Villa", "Pascual Orozco", "Emiliano Zapata", "Venustiano Carranza", "Emiliano Zapata"),
        new Preguntas("¿Cuál de las siguientes afirmaciones describe el papel de las 'Adelitas' o 'Soldaderas' en la Revolución Mexicana?", "Eran espías durante la revolución", "Participaron como combatientes", "Apoyaron las fuerzas revolucionarias como cocineras, enfermeras y compañeras", "Eran figuras simbólicas sin participación activa", "Apoyaron las fuerzas revolucionarias como cocineras, enfermeras y compañeras"),
        new Preguntas("¿Cuál era la postura del Plan de Guadalupe proclamado por Venustiano Carranza?", "Apoyaba la reelección de Porfirio Díaz", "Buscaba la reinstalación de Francisco I. Madero", "Repudiaba la presidencia de Victoriano Huerta", "Pretendía disolver el ejército revolucionario", "Repudiaba la presidencia de Victoriano Huerta"),
        new Preguntas("¿Cuál fue uno de los principales resultados económicos de la Revolución Mexicana?", "La abolición de la moneda nacional", "La nacionalización del petróleo", "La creación de un banco central", "La distribución equitativa de la riqueza", "La nacionalización del petróleo"),
        new Preguntas("¿Qué acuerdo fue firmado en 1911 que llevó a Porfirio Díaz a renunciar a la presidencia y exiliarse?", "Pacto de la Ciudadela", "Tratados de Ciudad Juárez", "Convenio de Agua Prieta", "Acuerdo de la Embajada", "Tratados de Ciudad Juárez"),
        new Preguntas("¿Quién asumió la presidencia de México inmediatamente después del asesinato de Francisco I. Madero?", "Victoriano Huerta", "Venustiano Carranza", "Emiliano Zapata", "Pancho Villa", "Victoriano Huerta"),
        new Preguntas("¿Qué ley promulgada durante la presidencia de Venustiano Carranza se considera precursora de la legislación laboral en México?", "Ley Agraria", "Ley Federal del Trabajo", "Ley de Educación", "Ley de Nacionalización de Bienes del Clero", "Ley Federal del Trabajo"),
        new Preguntas("¿Cómo afectó la Revolución Mexicana a las relaciones exteriores de México, particularmente con Estados Unidos?", "Fortaleció la alianza militar con Estados Unidos", "Provocó una invasión estadounidense", "Mejoró inmediatamente el comercio bilateral", "Causó tensiones debido al reconocimiento de los gobiernos revolucionarios", "Causó tensiones debido al reconocimiento de los gobiernos revolucionarios"),
        new Preguntas("¿Cuál es la significancia del Plan de la Noria?", "Fue el documento que marcó el inicio de la Revolución Mexicana", "Fue un manifiesto contra la reelección de Benito Juárez, precursor ideológico de la Revolución", "Declaraba la independencia de México del dominio español", "Proponía reformas agrarias extensas", "Fue un manifiesto contra la reelección de Benito Juárez, precursor ideológico de la Revolución"),
        new Preguntas("¿Qué efecto tuvo la Revolución Mexicana en la constitución política del país?", "Se redactó una nueva constitución en 1917", "No hubo cambios significativos en la constitución", "Se reinstauró la constitución de 1857", "Se limitó el poder ejecutivo permanentemente", "Se redactó una nueva constitución en 1917")
        );
        mostrarPreguntaAleatoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BotonA = new javax.swing.JButton();
        BotonB = new javax.swing.JButton();
        BotonC = new javax.swing.JButton();
        BotonD = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        LabelResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Puntaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Revolucion Mexicana (1910 a 1920)");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pregunta");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        BotonA.setText("A");
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });

        BotonB.setText("B");
        BotonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBActionPerformed(evt);
            }
        });

        BotonC.setText("C");
        BotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCActionPerformed(evt);
            }
        });

        BotonD.setText("D");
        BotonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        LabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        LabelResultado.setText("Respuesta Correcta");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Puntaje.setForeground(new java.awt.Color(255, 255, 255));
        Puntaje.setText("Puntaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonA)
                    .addComponent(BotonB)
                    .addComponent(BotonC)
                    .addComponent(BotonD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonA)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonB)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonC)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonD)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(LabelResultado)
                .addGap(41, 41, 41)
                .addComponent(Puntaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BotonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAActionPerformed
        // TODO add your handling code here:
        verificarRespuesta(jTextField2.getText());
    }//GEN-LAST:event_BotonAActionPerformed

    private void BotonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBActionPerformed
        // TODO add your handling code here:
        verificarRespuesta(jTextField3.getText());
    }//GEN-LAST:event_BotonBActionPerformed

    private void BotonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCActionPerformed
        // TODO add your handling code here:
        verificarRespuesta(jTextField4.getText());
    }//GEN-LAST:event_BotonCActionPerformed

    private void BotonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDActionPerformed
        // TODO add your handling code here:
        verificarRespuesta(jTextField5.getText());
    }//GEN-LAST:event_BotonDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SeleccionEra SE = new SeleccionEra(userIDF,juegoID);
        SE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void mostrarPreguntaAleatoria() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaPreguntas.size());
        Preguntas preguntaAleatoria = listaPreguntas.get(indiceAleatorio);
        
        jTextField1.setText(preguntaAleatoria.getPregunta());
        jTextField4.setText(preguntaAleatoria.getOpcion1());
        jTextField5.setText(preguntaAleatoria.getOpcion2());
        jTextField2.setText(preguntaAleatoria.getOpcion3());
        jTextField3.setText(preguntaAleatoria.getOpcion4());
        RespuestaCorrecta = preguntaAleatoria.getOpcionCorrecta();
        System.out.println(RespuestaCorrecta);
        ronda+=1;
    }
    
    public void verificarRespuesta(String respuestaUsuario){
        if(respuestaUsuario.equals(RespuestaCorrecta)){
            
            LabelResultado.setText("Respuesta Correcta");
            puntajes +=10;
            Puntaje.setText(String.valueOf(puntajes));
        }else{
            LabelResultado.setText("Respuesta Incorrecta");
            puntajes -=5;
            Puntaje.setText(String.valueOf(puntajes));
        }
        
        if(ronda==10){
            Puntuacion puntuacion = new Puntuacion();
            puntuacion.almacenarPuntuacion(juegoID, puntajes, userIDF);
            Ranking ranking = new Ranking(userIDF,juegoID);
            ranking.setVisible(true);
            this.dispose();
        }else{
            mostrarPreguntaAleatoria();
        }
        
        /*
        if(puntajes <= 0){
           puntajes = 0;
           Resultados pantallaFinal = new Resultados();
            pantallaFinal.setVisible(true);
            this.dispose();
        } */
         
    }
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(ERA4Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ERA4Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ERA4Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ERA4Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ERA4Dificil(userIDF, juegoID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonA;
    private javax.swing.JButton BotonB;
    private javax.swing.JButton BotonC;
    private javax.swing.JButton BotonD;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel Puntaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables


    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/AntoniJuego1/ImagenMenu/Maquina.jpeg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
