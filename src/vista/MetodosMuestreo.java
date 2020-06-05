package vista;

import com.csvreader.CsvReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class MetodosMuestreo extends javax.swing.JInternalFrame {

    private HashMap listaAleatorios;
    private Object[] columnas;
    private DefaultTableModel model;
    private int numRegistros;

    public MetodosMuestreo() {
        initComponents();
        cargarDatos("demo/Demo.csv", ',');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelMetodos = new javax.swing.JPanel();
        btnSimple = new javax.swing.JButton();
        btnSistematico = new javax.swing.JButton();
        btnEstratificado = new javax.swing.JButton();
        btnConglomerado = new javax.swing.JButton();
        panelTablaDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        panelDatos = new javax.swing.JPanel();
        panelSimple = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPoblacionSimple = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMuestraSimple = new javax.swing.JTextField();
        panelSistematico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPoblacion = new javax.swing.JTextField();
        txtMuestra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorK = new javax.swing.JTextField();
        panelOpciones = new javax.swing.JPanel();
        btnCargarNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSplit = new javax.swing.JTextField();
        btnCargarDemo = new javax.swing.JButton();
        lbNombreArchivo = new javax.swing.JLabel();
        lbNombreA = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MÉTODOS DE MUESTREO");
        setVisible(true);

        panelMetodos.setBackground(new java.awt.Color(204, 255, 255));
        panelMetodos.setBorder(javax.swing.BorderFactory.createTitledBorder("MÉTODOS DE MUESTREO PROBABILÍSTICO"));

        btnSimple.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/muestra.png"))); // NOI18N
        btnSimple.setText("A. SIMPLE");
        btnSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpleActionPerformed(evt);
            }
        });
        panelMetodos.add(btnSimple);

        btnSistematico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSistematico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/muestra.png"))); // NOI18N
        btnSistematico.setText("A. SISTEMÁTICO");
        btnSistematico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSistematicoActionPerformed(evt);
            }
        });
        panelMetodos.add(btnSistematico);

        btnEstratificado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEstratificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/muestra.png"))); // NOI18N
        btnEstratificado.setText("ESTRATIFICADO");
        btnEstratificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstratificadoActionPerformed(evt);
            }
        });
        panelMetodos.add(btnEstratificado);

        btnConglomerado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConglomerado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/muestra.png"))); // NOI18N
        btnConglomerado.setText("POR CONGLOMERADOS");
        panelMetodos.add(btnConglomerado);

        getContentPane().add(panelMetodos, java.awt.BorderLayout.PAGE_START);

        panelTablaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS CARGADOS"));
        panelTablaDatos.setLayout(new javax.swing.BoxLayout(panelTablaDatos, javax.swing.BoxLayout.LINE_AXIS));

        tbDatos.setBackground(new java.awt.Color(204, 204, 255));
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        panelTablaDatos.add(jScrollPane1);

        getContentPane().add(panelTablaDatos, java.awt.BorderLayout.CENTER);

        panelDatos.setBackground(new java.awt.Color(204, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS ADICIONALES"));

        panelSimple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSimple.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Población (n):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        panelSimple.add(jLabel5, gridBagConstraints);

        txtPoblacionSimple.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        panelSimple.add(txtPoblacionSimple, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Muestra (m):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        panelSimple.add(jLabel6, gridBagConstraints);

        txtMuestraSimple.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 5);
        panelSimple.add(txtMuestraSimple, gridBagConstraints);

        panelDatos.add(panelSimple);

        panelSistematico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelSistematico.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Población (n):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        panelSistematico.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Muestra (m):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        panelSistematico.add(jLabel3, gridBagConstraints);

        txtPoblacion.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 5);
        panelSistematico.add(txtPoblacion, gridBagConstraints);

        txtMuestra.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 5);
        panelSistematico.add(txtMuestra, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("k=n/m:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 10);
        panelSistematico.add(jLabel4, gridBagConstraints);

        txtValorK.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 5);
        panelSistematico.add(txtValorK, gridBagConstraints);

        panelDatos.add(panelSistematico);

        getContentPane().add(panelDatos, java.awt.BorderLayout.PAGE_END);

        panelOpciones.setBackground(new java.awt.Color(204, 255, 255));
        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES"));
        panelOpciones.setLayout(new java.awt.GridBagLayout());

        btnCargarNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subirCsv.png"))); // NOI18N
        btnCargarNuevo.setText("CARGAR");
        btnCargarNuevo.setToolTipText("Cargar nuevo archivo .csv");
        btnCargarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarNuevoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        panelOpciones.add(btnCargarNuevo, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("SEPARADOR:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        panelOpciones.add(jLabel1, gridBagConstraints);

        txtSplit.setColumns(1);
        txtSplit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSplit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSplit.setText(",");
        txtSplit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSplitFocusLost(evt);
            }
        });
        txtSplit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSplitKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 0);
        panelOpciones.add(txtSplit, gridBagConstraints);

        btnCargarDemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/demo.png"))); // NOI18N
        btnCargarDemo.setToolTipText("Cargar archivo de ejemplo");
        btnCargarDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDemoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        panelOpciones.add(btnCargarDemo, gridBagConstraints);

        lbNombreArchivo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        panelOpciones.add(lbNombreArchivo, gridBagConstraints);

        lbNombreA.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelOpciones.add(lbNombreA, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 10, 0);
        panelOpciones.add(jSeparator1, gridBagConstraints);

        getContentPane().add(panelOpciones, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarNuevoActionPerformed
        // Creamos un filtro para que se reconozcan los archivos de texto
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos *.csv", "csv");
        JFileChooser fileChooserCargar = new JFileChooser();
        fileChooserCargar.setFileFilter(filtro);
        fileChooserCargar.setDialogTitle("Abrir");

        int seleccion = fileChooserCargar.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File file = fileChooserCargar.getSelectedFile();
            cargarDatos(file.getAbsolutePath(), txtSplit.getText().charAt(0));
            lbNombreA.setText("NOMBRE:");
            lbNombreArchivo.setText(file.getName());
            txtPoblacion.setText("");
            txtMuestra.setText("");
            txtValorK.setText("");
            txtPoblacionSimple.setText("");
            txtMuestraSimple.setText("");
            cambiarEstadoBotones(true);
        }

    }//GEN-LAST:event_btnCargarNuevoActionPerformed

    private void txtSplitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSplitKeyTyped
        if (txtSplit.getText().length() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSplitKeyTyped

    private void txtSplitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSplitFocusLost
        btnCargarNuevo.setEnabled(true);
        if (txtSplit.getText().equals("")) {
            btnCargarNuevo.setEnabled(false);
        }
    }//GEN-LAST:event_txtSplitFocusLost

    private void btnCargarDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDemoActionPerformed
        txtSplit.setText(",");
        lbNombreA.setText("");
        lbNombreArchivo.setText("");
        txtPoblacion.setText("");
        txtMuestra.setText("");
        txtValorK.setText("");
        txtPoblacionSimple.setText("");
        txtMuestraSimple.setText("");
        cambiarEstadoBotones(true);
        cargarDatos("demo/Demo.csv", ',');
    }//GEN-LAST:event_btnCargarDemoActionPerformed

    private void btnSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpleActionPerformed
        String valor = JOptionPane.showInputDialog(rootPane, "Ingrese el valor de la muestra:", "MUESTRA A SELECCIONAR", JOptionPane.OK_CANCEL_OPTION);
        int n;
        if (valor != null && !valor.equals("")) {
            try {
                n = Integer.parseInt(valor);
                if (n > numRegistros) {
                    JOptionPane.showMessageDialog(rootPane, "Elija un valor entre 0 y " + numRegistros + ".", "VALOR INVÁLIDO", JOptionPane.ERROR_MESSAGE);
                } else {
                    model = new DefaultTableModel();
                    for (Object c : columnas) {
                        model.addColumn(c);
                    }
                    muestreoSimple(n);
                    if (n != numRegistros) {//Cuándo la muestra es = a la población, no bloqueo el botón
                        cambiarEstadoBotones(false);
                    }
                }
            } catch (NumberFormatException ex) {
                Logger.getLogger(MetodosMuestreo.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Ingresar solo valores numéricos positivos.", "VALOR INVÁLIDO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnSimpleActionPerformed


    private void btnSistematicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSistematicoActionPerformed
        String valor = JOptionPane.showInputDialog(rootPane, "Ingrese el valor de la muestra m:", "MUESTRA A SELECCIONAR", JOptionPane.OK_CANCEL_OPTION);
        int m;
        if (valor != null && !valor.equals("")) {
            model = new DefaultTableModel();
            for (Object c : columnas) {
                model.addColumn(c);
            }
            try {
                m = Integer.parseInt(valor);
                int k = numRegistros / m;
                muestreoSistematico(k, m);
                cambiarEstadoBotones(false);
            } catch (NumberFormatException ex) {
                Logger.getLogger(MetodosMuestreo.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Ingresar solo valores numéricos positivos.", "VALOR INVÁLIDO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSistematicoActionPerformed

    private void btnEstratificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstratificadoActionPerformed
        
    }//GEN-LAST:event_btnEstratificadoActionPerformed

    private void cargarDatos(String archivo, char split) {
        CsvReader reader;
        model = new DefaultTableModel();
        int numReg = 0, numColumnas;
        try {
            reader = new CsvReader(new File(archivo).getAbsolutePath(), split, Charset.forName("UTF-8"));
            while (reader.readRecord()) {
                numColumnas = reader.getColumnCount();//Número de columnas del archivo .csv
                if (numReg == 0) {//Cuándo se lee la primera fila, es decir, el encabezado
                    columnas = new Object[numColumnas + 1];
                    columnas[0] = "Nro.";
                    for (int i = 1; i < columnas.length; i++) {
                        columnas[i] = reader.get(i - 1);
                    }
                    for (Object c : columnas) {
                        model.addColumn(c);
                    }
                } else {
                    Object[] datos = new Object[numColumnas + 1];
                    datos[0] = numReg;
                    for (int i = 1; i < datos.length; i++) {
                        datos[i] = reader.get(i - 1);
                    }
                    model.addRow(datos);
                }
                numReg++;
            }
            numRegistros = numReg - 1;
            tbDatos.setModel(model);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ir a la ubicación del programa y copiar la carpeta \"demo\" a \"dist\".", "NO SE PUEDE CARGAR EL DEMO", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(MetodosMuestreo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MetodosMuestreo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void muestreoSistematico(int k, int m) {
        Object[] muestra = new Object[columnas.length];
        listaAleatorios = new HashMap();
        int aleatorio = aleatorioNoRepetido(k + 1);//Aleatorio de los k primeros
        for (int i = 0; i < k; i++) {
            if (aleatorio > numRegistros) {
                break;
            }
            for (int j = 0; j < muestra.length; j++) {
                muestra[j] = tbDatos.getModel().getValueAt(aleatorio, j);
            }
            aleatorio += k;//Se aumenta k
            model.addRow(muestra);
        }
        txtPoblacion.setText(String.valueOf(numRegistros));
        txtMuestra.setText(String.valueOf(m));
        txtValorK.setText(String.valueOf(k));
        tbDatos.setModel(model);
    }

    private void muestreoSimple(int n) {
        Object[] muestra = new Object[columnas.length];
        listaAleatorios = new HashMap();
        for (int i = 0; i < n; i++) {
            if (i == numRegistros) {//Cuándo la muestra es = a la población se detiene
                break;
            }
            int aleatorio = aleatorioNoRepetido(numRegistros);//Método recursivo
            for (int j = 0; j < muestra.length; j++) {
                muestra[j] = tbDatos.getModel().getValueAt(aleatorio, j);
            }
            model.addRow(muestra);
        }
        txtPoblacionSimple.setText(String.valueOf(numRegistros));
        txtMuestraSimple.setText(String.valueOf(n));
        tbDatos.setModel(model);
    }

    private int aleatorioNoRepetido(int limite) {
        int aleatorioNoRepit = (int) (Math.random() * limite);
        if (!listaAleatorios.containsValue(aleatorioNoRepit)) {
            listaAleatorios.put(aleatorioNoRepit, aleatorioNoRepit);
            return aleatorioNoRepit;
        } else {
            return aleatorioNoRepetido(limite);
        }
    }

    private void cambiarEstadoBotones(boolean estado) {
        btnSimple.setEnabled(estado);
        btnSistematico.setEnabled(estado);
        btnEstratificado.setEnabled(estado);
        btnConglomerado.setEnabled(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDemo;
    private javax.swing.JButton btnCargarNuevo;
    private javax.swing.JButton btnConglomerado;
    private javax.swing.JButton btnEstratificado;
    private javax.swing.JButton btnSimple;
    private javax.swing.JButton btnSistematico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbNombreA;
    private javax.swing.JLabel lbNombreArchivo;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelMetodos;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelSimple;
    private javax.swing.JPanel panelSistematico;
    private javax.swing.JPanel panelTablaDatos;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtMuestra;
    private javax.swing.JTextField txtMuestraSimple;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtPoblacionSimple;
    private javax.swing.JTextField txtSplit;
    private javax.swing.JTextField txtValorK;
    // End of variables declaration//GEN-END:variables
}
