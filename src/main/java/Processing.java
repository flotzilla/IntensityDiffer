import org.openimaj.image.colour.processing.CIEDE2000;

/**
 * Created with IntelliJ IDEA.
 * User: obyte
 * Date: 31.05.13
 * Time: 0:36
 * To change this template use File | Settings | File Templates.
 */
public class Processing {

    private float l1;
    private float a1;
    private float b1;

    private float l2;
    private float a2;
    private float b2;

    public Processing(){
    }

    public Processing(float l1, float a1, float b1, float l2, float a2, float b2) {
        this.l1 = l1;
        this.a1 = a1;
        this.b1 = b1;
        this.l2 = l2;
        this.a2 = a2;
        this.b2 = b2;
    }

    public double calculateDe(){
        double delataE = CIEDE2000.calculateDeltaE(l1, a1, b1, l2, a2, b2);
        return delataE;
    }

    public float getL1() {
        return l1;
    }

    public void setL1(float l1) {
        this.l1 = l1;
    }

    public float getA1() {
        return a1;
    }

    public void setA1(float a1) {
        this.a1 = a1;
    }

    public float getB1() {
        return b1;
    }

    public void setB1(float b1) {
        this.b1 = b1;
    }

    public float getL2() {
        return l2;
    }

    public void setL2(float l2) {
        this.l2 = l2;
    }

    public float getA2() {
        return a2;
    }

    public void setA2(float a2) {
        this.a2 = a2;
    }

    public float getB2() {
        return b2;
    }

    public void setB2(float b2) {
        this.b2 = b2;
    }
}
