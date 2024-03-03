public class Dracel extends Beyblade {
    private String kutsalCanavar;
    public Dracel(String beybladeci, int donusHizi, int saldiriGucu , String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'ı ortaya çıkaeıyor." );
        System.out.println(getBeybladeci() + "'ın Savunması: Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Ad: " + kutsalCanavar);

    }
}
