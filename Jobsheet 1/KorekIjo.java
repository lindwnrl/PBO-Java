public class KorekIjo {

    
    private int harga;
    private int gasLiquid = 21;
    public boolean gas = false;
    private boolean batuApi = false;
    private boolean nyala;

    

    public void liatHarga(int harganya){
        harga = harganya;
    }

    public boolean checkGas(){
        if (gasLiquid <= 0  ) {
            this.gas = false;
        }else if (gasLiquid > 0 ) {
            this.gas = true;
        }
        return this.gas;
    }

    public boolean checkBatu(boolean batu){
        if (batu = true) {
            batuApi = true;
        }
        return batuApi;
    }

    public boolean nyalaEnggak(){
        if (checkGas() && checkBatu(batuApi) == true) {
            nyala = true;
        }else{
            nyala =false;
        }
        return nyala;
    }

    public void printInfo(){
        System.out.println("Harga : " + harga );
        System.out.println("Batu Api : " + batuApi);
        System.out.println("Gas : " + gas);
        System.out.println("Nyala? : " + nyala);
    }
}