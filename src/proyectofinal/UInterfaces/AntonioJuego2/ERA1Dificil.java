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
public class ERA1Dificil extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    private List<Preguntas> listaPreguntas; 
    private String RespuestaCorrecta;
    private int ronda=0;
    private int puntajes; // Variable para llevar un registro del puntaje.
    static int userIDF;
    static int juegoID;
    /**
     * Creates new form ERA1Facil
     */
    public ERA1Dificil(int userID,int juego) {
        this.setContentPane(fondo);
        initComponents();
        userIDF=userID;
        juegoID=juego;
        this.listaPreguntas = Arrays.asList(
        new Preguntas("¿Cuál fue la principal diferencia entre la democracia ateniense y la democracia moderna?", "Una democracia directa vs. una democracia representativa", "Una democracia inclusiva vs. una democracia excluyente", "Una democracia igualitaria vs. una democracia desigual", "Una democracia participativa vs. una democracia pasiva", "Una democracia directa vs. una democracia representativa"),
        new Preguntas("¿Cómo influyó la geografía de Grecia en su desarrollo cultural?", "La geografía accidentada fomentó la navegación y el comercio", "El clima mediterráneo favoreció la agricultura y la ganadería", "La ubicación en el Mediterráneo como centro de intercambio cultural", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Por qué los griegos crearon colonias?", "Para expandir su territorio e influencia", "Para buscar nuevas tierras para cultivo y pastoreo", "Para comerciar con otras culturas", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Cuál fue el impacto de la conquista macedonia sobre la antigua Grecia?", "La unificación de Grecia bajo un solo gobierno", "La difusión de la cultura griega por todo el Mediterráneo", "El declive de la democracia griega", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Cuál fue la principal contribución de Sócrates a la filosofía?", "Su método de enseñanza, la mayéutica", "Su teoría de las ideas", "Su teoría de la ética", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Cuál fue la principal contribución de Platón a la filosofía?", "Su teoría de las ideas", "Su teoría de la ética", "Su teoría del Estado ideal", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Cuál fue la principal contribución de Aristóteles a la filosofía?", "Su teoría de la lógica", "Su teoría de la física", "Su teoría de la biología", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Cuál fue la principal contribución de Arquímedes a la ciencia?", "Sus descubrimientos en el campo de la geometría", "Sus descubrimientos en el campo de la física", "Sus inventos, como la palanca y el tornillo", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Cuál fue la principal contribución de Pericles a la antigua Grecia?", "Su liderazgo durante la Guerra del Peloponeso", "Su promoción de las artes y la cultura", "Su reforma de la democracia ateniense", "Todas las anteriores", "Todas las anteriores"),
        new Preguntas("¿Cuál fue la principal contribución de Fidias a la antigua Grecia?", "Sus esculturas de los dioses griegos", "Su diseño del Partenón", "Su pintura de las Panateneas", "Todas las anteriores", "Todas las anteriores")
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
        jLabel1.setText("Antigua Grecia (800 A.c al 146 A.c)");

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
            java.util.logging.Logger.getLogger(ERA1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ERA1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ERA1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ERA1Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ERA1Dificil(userIDF,juegoID).setVisible(true);
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
