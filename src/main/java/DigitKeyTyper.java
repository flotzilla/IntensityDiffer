import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created with IntelliJ IDEA.
 * User: obyte
 * Date: 31.05.13
 * Time: 3:28
 * To change this template use File | Settings | File Templates.
 */
public class DigitKeyTyper extends KeyAdapter {
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!(Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))) {
            e.consume();
        }
    }
}

