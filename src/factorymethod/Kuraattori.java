
package factorymethod;

/**
 *
 * @author ottoj_000
 */
public class Kuraattori extends AterioivaOtus{

    public Juoma createJuoma() {
        return new Maito();
    }    
}
