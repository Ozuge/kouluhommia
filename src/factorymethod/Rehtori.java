
package factorymethod;

/**
 *
 * @author ottoj_000
 */
public class Rehtori extends AterioivaOtus{
    
    public Juoma createJuoma() {
        return new Mehu();
    }
}
