

public class EjemploJPanelConFondo extends javax.swing.JFrame {

    public EjemploJPanelConFondo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new JPanelConFondo();
        final javax.swing.JButton btFondo1 = new javax.swing.JButton();
        final javax.swing.JButton btFondo2 = new javax.swing.JButton();
        final javax.swing.JButton btSinImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Probando JPanel con Imagen de Fondo");

        panelFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelFondo.setOpaque(false);

        btFondo1.setText("fondo 1");
        btFondo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFondo1ActionPerformed(evt);
            }
        });

        btFondo2.setText("fondo 2");
        btFondo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFondo2ActionPerformed(evt);
            }
        });

        btSinImagen.setText("sin fondo");
        btSinImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSinImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSinImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFondo1)
                    .addComponent(btFondo2)
                    .addComponent(btSinImagen))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFondo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFondo1ActionPerformed
        ((JPanelConFondo) panelFondo).setImagen("recursos/satelite.jpg");
    }//GEN-LAST:event_btFondo1ActionPerformed

    private void btFondo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFondo2ActionPerformed
        ((JPanelConFondo) panelFondo).setImagen("recursos/tierra.jpg");
    }//GEN-LAST:event_btFondo2ActionPerformed

    private void btSinImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSinImagenActionPerformed
        ((JPanelConFondo) panelFondo).setImagen((String) null);
    }//GEN-LAST:event_btSinImagenActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EjemploJPanelConFondo jf = new EjemploJPanelConFondo();
                jf.setLocationRelativeTo(null);
                jf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
