package Entidades;

import javax.swing.JProgressBar;

/**
 *
 * @author °-°_°Sprock°_°-°
 */
public class tiempo extends Thread {

    JProgressBar progreso;

    public tiempo(JProgressBar progreso) {
        super();
        this.progreso = progreso;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            progreso.setValue(i);
            pausa(20);
        }
    }

    public void pausa(int mlSeg) {
        try {
            Thread.sleep(mlSeg);
        } catch (Exception e) {
        }
    }
}
