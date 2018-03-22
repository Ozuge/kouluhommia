package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus kuraattori = new Kuraattori();
        AterioivaOtus rehtori = new Rehtori();
        opettaja.aterioi();
        kuraattori.aterioi();
        rehtori.aterioi();
    }
}
