package clases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DistribucionNormal {

    private double media;
    private double desvTip;
    private double x;

    /**
     * Constructor para la <code>Distribución de Probabilidad Normal</code>.
     *
     * @param media la media.
     * @param desvTip la desviación Típica.
     * @param x la variable.
     */
    public DistribucionNormal(double media, double desvTip, double x) {
        this.media = media;
        this.desvTip = desvTip;
        this.x = x;
    }

    /**
     * Constructor para la <code>Distribución de Probabilidad Normal Estándar</code>.
     *
     * @param x la variable.
     */
    public DistribucionNormal(double x) {
        this.media = 0;
        this.desvTip = 1;
        this.x = x;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getDesvTip() {
        return desvTip;
    }

    public void setDesvTip(double desvTip) {
        this.desvTip = desvTip;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double obtenerDistribucionProbalidad() {
        this.x = obtenerZ(this.media, this.desvTip, this.x);
        String z = String.format("%.2f", this.x);
        String csvDistNormal;
        int valorDig1;
        String valorDig2;
        if (this.x >= 0) {
            csvDistNormal = "D:\\Documents\\NetBeansProjects\\Sistema Estadistico\\src\\archivo\\DistribucionNormalPositiva.csv";
            valorDig1 = Integer.parseInt(z.substring(3));
            valorDig2 = z.substring(0, 3).replace(',', '.');
        } else {
            csvDistNormal = "D:\\Documents\\NetBeansProjects\\Sistema Estadistico\\src\\archivo\\DistribucionNormalNegativa.csv";
            valorDig1 = Integer.parseInt(z.substring(4));
            valorDig2 = z.substring(0, 4).replace(',', '.');
        }
        String linea = "";
        String[] valoresTablaDistNormal;
        double valorTablaDistNormal = 0.0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvDistNormal));
            while ((linea = br.readLine()) != null) {
                valoresTablaDistNormal = linea.split(";");
                if (valoresTablaDistNormal[0].equals(valorDig2)) {
                    valorTablaDistNormal = Double.parseDouble(valoresTablaDistNormal[valorDig1 + 1]);
                    if (this.x >= 0) {
                        valorTablaDistNormal += 0.5;
                    }
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DistribucionNormal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DistribucionNormal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valorTablaDistNormal;
    }

    public static double obtenerZ(double media, double desvTip, double x) {
        return (x - media) / desvTip;
    }
}
