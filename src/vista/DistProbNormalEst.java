package vista;

import clases.DistribucionNormal;
import java.awt.Color;
import java.awt.Font;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.NormalDistributionFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

public class DistProbNormalEst extends javax.swing.JInternalFrame {

    private double xRes;
    private int opcion;
    private double z;
    private double x;

    public DistProbNormalEst() {
        initComponents();
        panelGrafica.add(obtenerGraficaDistNormal(0, 1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        txtVariableX = new javax.swing.JTextField();
        txtDesvTip = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        cbmSelect = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtValorZ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbMedia = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbDesvTip = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbVarianza = new javax.swing.JLabel();
        panelGrafica = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("DISTRIBUCIÓN NORMAL ESTÁNDAR");
        setVisible(true);

        panelDatos.setBackground(new java.awt.Color(255, 255, 153));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
        panelDatos.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("μ = ");
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
        jLabel3.setText("σ = ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelDatos.add(jLabel3, gridBagConstraints);

        txtMedia.setEditable(false);
        txtMedia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMedia.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtMedia, gridBagConstraints);

        txtVariableX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVariableX.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtVariableXCaretUpdate(evt);
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

        txtDesvTip.setEditable(false);
        txtDesvTip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDesvTip.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtDesvTip, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        panelDatos.add(btnCalcular, gridBagConstraints);

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(153, 255, 153));
        txtResultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtResultado, gridBagConstraints);

        cbmSelect.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cbmSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P(X > x)", "P(X < x)", "2P(X > |x|)" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
        panelDatos.add(cbmSelect, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("z =");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelDatos.add(jLabel4, gridBagConstraints);

        txtValorZ.setEditable(false);
        txtValorZ.setBackground(new java.awt.Color(204, 204, 255));
        txtValorZ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 10;
        panelDatos.add(txtValorZ, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("= ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        panelDatos.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("X ~ N(μ,σ)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        panelDatos.add(jLabel6, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
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

        getContentPane().add(panelDatos, java.awt.BorderLayout.PAGE_START);

        panelGrafica.setBackground(new java.awt.Color(255, 255, 255));
        panelGrafica.setBorder(javax.swing.BorderFactory.createTitledBorder("GRÁFICA"));
        panelGrafica.setLayout(new javax.swing.BoxLayout(panelGrafica, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panelGrafica, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double media = Double.parseDouble(txtMedia.getText());
        double desvTip = Double.parseDouble(txtDesvTip.getText());
        if (!txtVariableX.getText().equals("")) {
            x = Double.parseDouble(txtVariableX.getText());
            z = DistribucionNormal.obtenerZ(media, desvTip, x);
            opcion = cbmSelect.getSelectedIndex();
            xRes = obtenerValorTablaZ(opcion, media, desvTip, x);
            txtValorZ.setText(String.format("%.2f", z));
            txtResultado.setText(String.format("%.4f", xRes));
        }
        panelGrafica.removeAll();
        panelGrafica.add(obtenerGraficaDistNormal(media, desvTip));
        panelGrafica.updateUI();//Actualizar la gráfica
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtVariableXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVariableXKeyTyped
        char tecla = evt.getKeyChar();
        if ((tecla < '0' || tecla > '9') && tecla != '.' && tecla != '-') {
            evt.consume();
        }
    }//GEN-LAST:event_txtVariableXKeyTyped

    private void txtVariableXCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtVariableXCaretUpdate
        txtResultado.setText("");
    }//GEN-LAST:event_txtVariableXCaretUpdate

    private ChartPanel obtenerGraficaDistNormal(double media, double desvTip) {
        Function2D normal = new NormalDistributionFunction2D(media, desvTip);
        double inicio = media - 4 * desvTip;
        double fin = media + 4 * desvTip;
        XYDataset dataset = DatasetUtilities.sampleFunction2D(normal, inicio, fin, 50, "Normal");
        JFreeChart grafica;
        if (!txtVariableX.getText().equals("")) {
            XYSeries serie = new XYSeries("Normal Area");
            switch (opcion) {
                case 0:
                    serie.add(fin, 0);
                    break;
                case 1:
                    serie.add(inicio, 0);
                    break;
                default:
                    serie.add((x > 0) ? fin : inicio, 0);
                    XYSeries serieOpuesta = new XYSeries("Normal Area Opuesta");
                    serieOpuesta.add((x > 0) ? inicio : fin, 0);
                    serieOpuesta.add(-1 * x, 0);
                    ((XYSeriesCollection) dataset).addSeries(serieOpuesta);
                    break;
            }
            serie.add(x, 0);

            ((XYSeriesCollection) dataset).addSeries(serie);

            NumberAxis ejeX = new NumberAxis("x");
            ejeX.setLabelFont(new Font("Tahoma", Font.BOLD, 14));
            ejeX.setTickLabelFont(new Font("Tahoma", Font.PLAIN, 12));
            ejeX.setRange(inicio, fin);//Rango de valores en x

            NumberAxis ejeY = new NumberAxis("f(x)");
            ejeY.setLabelFont(new Font("Tahoma", Font.BOLD, 14));
            ejeY.setTickLabelFont(new Font("Tahoma", Font.PLAIN, 12));

            XYPlot plot = new XYPlot(dataset, ejeX, ejeY, new XYDifferenceRenderer());
            plot.setBackgroundPaint(Color.LIGHT_GRAY);
            plot.setRangeGridlinePaint(Color.WHITE);
            plot.setDomainGridlinePaint(Color.WHITE);
            plot.getRenderer().setSeriesPaint(0, Color.RED);//Color a la línea

            grafica = new JFreeChart(null, null, plot, false);
            grafica.setBackgroundPaint(Color.WHITE);
        } else {
            grafica = ChartFactory.createXYLineChart(null, "x", "f(x)", dataset, PlotOrientation.VERTICAL, true, true, false);
            grafica.getXYPlot().setAxisOffset(new RectangleInsets(0, 0, 0, 0));//Quita los espacios de la gráfica y los ejes
            grafica.getXYPlot().getRenderer().setSeriesPaint(0, Color.RED);//Color a la línea 
            grafica.removeLegend();//Quita la leyenda
        }
        return new ChartPanel(grafica);
    }

    private double obtenerValorTablaZ(int opcion, double media, double desvTip, double x) {
        NormalDistribution a = new NormalDistribution(media, desvTip);
        double valor = 0.0;
        switch (opcion) {
            case 0:
                valor = 1 - a.cumulativeProbability(x);
                break;
            case 1:
                valor = a.cumulativeProbability(x);
                break;
            default:
                valor = (1 - a.cumulativeProbability(x)) + (1 - a.cumulativeProbability(x));
                break;
        }
        return valor;
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
    private javax.swing.JTextField txtDesvTip;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValorZ;
    private javax.swing.JTextField txtVariableX;
    // End of variables declaration//GEN-END:variables
}
