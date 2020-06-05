package vista;

import clases.FondoEscritorio;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EscritorioPrincipal extends javax.swing.JFrame {

    public EscritorioPrincipal() {
        initComponents();
        cargarFondo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuContinua = new javax.swing.JMenu();
        menuItemNormal = new javax.swing.JMenuItem();
        menuItemNormalEst = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuDiscreta = new javax.swing.JMenu();
        menuItemBinomial = new javax.swing.JMenuItem();
        menuMuestreo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA ESTADÍSTICO");
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/probabilidad.png"))); // NOI18N
        menu.setMnemonic('D');
        menu.setText("Distribución de Probabilidad");
        menu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuContinua.setMnemonic('C');
        menuContinua.setText("Distribuciones Continuas");
        menuContinua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuItemNormal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemNormal.setMnemonic('N');
        menuItemNormal.setText("D. Normal");
        menuItemNormal.setInheritsPopupMenu(true);
        menuItemNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNormalActionPerformed(evt);
            }
        });
        menuContinua.add(menuItemNormal);

        menuItemNormalEst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemNormalEst.setMnemonic('E');
        menuItemNormalEst.setText("D. Normal Estándar");
        menuItemNormalEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNormalEstActionPerformed(evt);
            }
        });
        menuContinua.add(menuItemNormalEst);

        menu.add(menuContinua);
        menu.add(jSeparator1);

        menuDiscreta.setMnemonic('D');
        menuDiscreta.setText("Distribuciones Discretas");
        menuDiscreta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuItemBinomial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuItemBinomial.setMnemonic('B');
        menuItemBinomial.setText("D. Binomial");
        menuItemBinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBinomialActionPerformed(evt);
            }
        });
        menuDiscreta.add(menuItemBinomial);

        menu.add(menuDiscreta);

        barraMenu.add(menu);

        menuMuestreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/muestreo.png"))); // NOI18N
        menuMuestreo.setText("Métodos de Muestreo");
        menuMuestreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuMuestreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMuestreoMouseClicked(evt);
            }
        });
        barraMenu.add(menuMuestreo);

        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        menuSalir.setMnemonic('S');
        menuSalir.setText("Salir");
        menuSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        barraMenu.add(menuSalir);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNormalActionPerformed
        DistProbNormal dpN = new DistProbNormal();
        dpN.reshape(0, 0, 450, 500);
        escritorio.add(dpN);
        dpN.toFront();
    }//GEN-LAST:event_menuItemNormalActionPerformed

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir del sistema?", "SALIR DEL SISTEMA",
                0, JOptionPane.WARNING_MESSAGE);
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_menuSalirMouseClicked

    private void menuItemNormalEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNormalEstActionPerformed
        DistProbNormalEst dpnE = new DistProbNormalEst();
        dpnE.reshape(0, 0, 450, 500);
        escritorio.add(dpnE);
        dpnE.toFront();
    }//GEN-LAST:event_menuItemNormalEstActionPerformed

    private void menuItemBinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBinomialActionPerformed
        DistProBinomial dpB = new DistProBinomial();
        dpB.reshape(0, 0, 600, 500);
        escritorio.add(dpB);
        dpB.toFront();
    }//GEN-LAST:event_menuItemBinomialActionPerformed

    private void menuMuestreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMuestreoMouseClicked
        MetodosMuestreo mm = new MetodosMuestreo();
        escritorio.add(mm);
        mm.toFront();
    }//GEN-LAST:event_menuMuestreoMouseClicked

    private void cargarFondo() {
        try {
            BufferedImage image = ImageIO.read(getClass().getResource("/imagenes/fondo.jpg"));
            escritorio.setBorder(new FondoEscritorio(image));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscritorioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritorioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritorioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritorioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritorioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenu menuContinua;
    private javax.swing.JMenu menuDiscreta;
    private javax.swing.JMenuItem menuItemBinomial;
    private javax.swing.JMenuItem menuItemNormal;
    private javax.swing.JMenuItem menuItemNormalEst;
    private javax.swing.JMenu menuMuestreo;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
