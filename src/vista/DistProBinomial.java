package vista;

import java.awt.Font;
import javax.swing.JOptionPane;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleInsets;

public class DistProBinomial extends javax.swing.JInternalFrame {

    private double resProbabilidad;
    private int opcion;
    private int x;
    private double media;
    private double desvTip;
    private double varianza;

    public DistProBinomial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtVariableX = new javax.swing.JTextField();
        txtProbabilidad = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        cbmSelect = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbMedia = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbDesvTip = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbVarianza = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValorQ = new javax.swing.JTextField();
        panelGrafica = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("DISTRIBUCIÓN BINOMIAL");
        setVisible(true);

        panelDatos.setBackground(new java.awt.Color(204, 204, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
        panelDatos.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText(" n = ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelDatos.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("x = ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelDatos.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("p = ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelDatos.add(jLabel3, gridBagConstraints);

        txtN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNFocusLost(evt);
            }
        });
        txtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtN, gridBagConstraints);

        txtVariableX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVariableX.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtVariableXCaretUpdate(evt);
            }
        });
        txtVariableX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVariableXFocusLost(evt);
            }
        });
        txtVariableX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVariableXKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        panelDatos.add(txtVariableX, gridBagConstraints);

        txtProbabilidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProbabilidad.setToolTipText("La probabilidad debe ser un valor entre 0 y 1");
        txtProbabilidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProbabilidadFocusLost(evt);
            }
        });
        txtProbabilidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProbabilidadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtProbabilidad, gridBagConstraints);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calcular.png"))); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelDatos.add(btnCalcular, gridBagConstraints);

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(255, 255, 153));
        txtResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtResultado, gridBagConstraints);

        cbmSelect.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cbmSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P(X = x)", "P(X <= x)", "P(X >= x)" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
        panelDatos.add(cbmSelect, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("= ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        panelDatos.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("X ~ Bin(n,p) ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        panelDatos.add(jLabel6, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("μ=E(X)=");
        jPanel1.add(jLabel7);

        lbMedia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbMedia.setText("0.0");
        jPanel1.add(lbMedia);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("   σ=SD(X)=");
        jPanel1.add(jLabel9);

        lbDesvTip.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbDesvTip.setText("1.0");
        jPanel1.add(lbDesvTip);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("   σ^2=Var(X)=");
        jPanel1.add(jLabel11);

        lbVarianza.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbVarianza.setText("1.0");
        jPanel1.add(lbVarianza);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        panelDatos.add(jPanel1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("q =");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelDatos.add(jLabel4, gridBagConstraints);

        txtValorQ.setEditable(false);
        txtValorQ.setBackground(new java.awt.Color(153, 255, 153));
        txtValorQ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtValorQ, gridBagConstraints);

        getContentPane().add(panelDatos, java.awt.BorderLayout.PAGE_START);

        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        panelGrafica.setBorder(javax.swing.BorderFactory.createTitledBorder("GRÁFICA"));
        panelGrafica.setLayout(new javax.swing.BoxLayout(panelGrafica, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panelGrafica, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (!txtN.getText().equals("") && !txtProbabilidad.getText().equals("")) {
            int n = Integer.parseInt(txtN.getText());
            double probabilidad = Double.parseDouble(txtProbabilidad.getText());
            darValorFormulas(n, probabilidad);
            if (!txtVariableX.getText().equals("")) {
                x = Integer.parseInt(txtVariableX.getText());
                opcion = cbmSelect.getSelectedIndex();
                resProbabilidad = obtenerProbabilidad(opcion, n, probabilidad, x);
                txtResultado.setText(String.format("%.4f", resProbabilidad));
                txtValorQ.setText(String.format("%.2f", 1 - probabilidad));
            }
            panelGrafica.removeAll();
            panelGrafica.add(obtenerGraficaDistBinomial(n, probabilidad));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Los valores n y p son obligatorios.", "VALOR VACÍO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNKeyTyped
        char tecla = evt.getKeyChar();
        if ((tecla < '0' || tecla > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNKeyTyped

    private void txtProbabilidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProbabilidadKeyTyped
        char tecla = evt.getKeyChar();
        if ((tecla < '0' || tecla > '9') && tecla != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtProbabilidadKeyTyped

    private void txtVariableXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVariableXKeyTyped
        char tecla = evt.getKeyChar();
        if ((tecla < '0' || tecla > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtVariableXKeyTyped

    private void txtVariableXCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtVariableXCaretUpdate
        txtResultado.setText("");
        txtValorQ.setText("");
    }//GEN-LAST:event_txtVariableXCaretUpdate

    private void txtVariableXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVariableXFocusLost
        String n = txtN.getText();
        if (!txtVariableX.getText().equals("") && !n.equals("")) {
            x = Integer.parseInt(txtVariableX.getText());
            if (x < 0 || x > Integer.parseInt(n)) {
                JOptionPane.showMessageDialog(rootPane, "Elija un valor de x = 0,1,...,n", "VALOR INVÁLIDO", JOptionPane.ERROR_MESSAGE);
                txtVariableX.setText("");
            }
        }
    }//GEN-LAST:event_txtVariableXFocusLost

    private void txtNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNFocusLost
        if (!txtN.getText().equals("")) {
            if (Integer.parseInt(txtN.getText()) < 1) {
                JOptionPane.showMessageDialog(rootPane, "Elija un valor de x = 1,2,3,..", "VALOR INVÁLIDO", JOptionPane.ERROR_MESSAGE);
                txtN.setText("");
            }
        }
    }//GEN-LAST:event_txtNFocusLost

    private void txtProbabilidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProbabilidadFocusLost
        if (!txtProbabilidad.getText().equals("")) {
            double probabilidad = Double.parseDouble(txtProbabilidad.getText());
            if (probabilidad < 0 || probabilidad > 1) {
                JOptionPane.showMessageDialog(rootPane, "La probabilidad p debe estar entre 0 y 1.", "VALOR INVÁLIDO", JOptionPane.ERROR_MESSAGE);
                txtProbabilidad.setText("");
            }
        }
    }//GEN-LAST:event_txtProbabilidadFocusLost

    private ChartPanel obtenerGraficaDistBinomial(int n, double probabilidad) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        BinomialDistribution binomial = new BinomialDistribution(n, probabilidad);

        for (int i = 0; i <= n; i++) {
            if (binomial.probability(i) > 0.00001) {
                dataset.setValue(binomial.probability(i), "x", String.valueOf(i));
            }
        }

        JFreeChart grafico = ChartFactory.createBarChart(null, "x", "P(X=x)", dataset, PlotOrientation.VERTICAL, true, true, false);
        grafico.removeLegend();

        CategoryPlot plot = grafico.getCategoryPlot();
        plot.setAxisOffset(new RectangleInsets(0, 0, 0, 0));
        plot.getRangeAxis().setTickLabelFont(new Font("Tahoma", Font.PLAIN, 10));
        plot.getDomainAxis().setTickLabelFont(new Font("Tahoma", Font.PLAIN, 9));
        plot.setDomainGridlinesVisible(true);

        return new ChartPanel(grafico);
    }

    private double obtenerProbabilidad(int opcion, int n, double probabilidad, int x) {
        BinomialDistribution binomial = new BinomialDistribution(n, probabilidad);
        double valor = 0.0;
        switch (opcion) {
            case 0:
                valor = binomial.probability(x);
                break;
            case 1:
                valor = binomial.cumulativeProbability(x);
                break;
            default:
                valor = 1 - binomial.cumulativeProbability(x) + binomial.probability(x);
                break;
        }
        return valor;
    }

    private void darValorFormulas(int n, double probabilidad) {
        media = n * probabilidad;
        varianza = media * (1 - probabilidad);
        desvTip = Math.sqrt(varianza);
        lbMedia.setText(String.format("%.1f", media));
        lbDesvTip.setText(String.format("%.1f", desvTip));
        lbVarianza.setText(String.format("%.1f", varianza));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbmSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDesvTip;
    private javax.swing.JLabel lbMedia;
    private javax.swing.JLabel lbVarianza;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelGrafica;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtProbabilidad;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValorQ;
    private javax.swing.JTextField txtVariableX;
    // End of variables declaration//GEN-END:variables
}
