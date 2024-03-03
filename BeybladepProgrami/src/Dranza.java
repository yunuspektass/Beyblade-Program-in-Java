import java.util.SortedMap;

public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu , String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'ı ortaya çıkaeıyor." );
        System.out.println(getBeybladeci() + "'ın Saldırısı: Alev Kılıcı");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Ad: " + kutsalCanavar);

    }
}
