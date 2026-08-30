public class KorekBening extends KorekIjo {

    private boolean kelistrikan = true;
    private boolean listrik = true;

    public boolean cekKelistrikan() {

        if (listrik) {
            this.kelistrikan = true;
        } else {
            this.kelistrikan = false;
        }

        return this.kelistrikan;
    }

    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println("Listriknya? : " + kelistrikan);
    }
}