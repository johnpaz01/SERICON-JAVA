
package Mensagem;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlinkingText {
    private Timer blinkTimer;
    private javax.swing.JLabel label;

    public BlinkingText(javax.swing.JLabel label) {
        this.label = label;
    }

    public void startBlinking() {
        blinkTimer = new Timer(500, new ActionListener() {
            private boolean visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(visible);
                visible = !visible;
            }
        });
        blinkTimer.start();
    }

    public void stopBlinking() {
        if (blinkTimer != null) {
            blinkTimer.stop();
            label.setVisible(true); // Garante que o texto esteja visível quando parar de piscar
        }
    }
}
