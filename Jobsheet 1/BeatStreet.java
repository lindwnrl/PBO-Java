public class BeatStreet {
    private String brand;
    private double bensin = 3;
    private boolean mesin = true;
    private boolean bisaNyala;
    private boolean mesinNyala = true;
    private boolean bisaBerangkat = false;

    public void setBrand(String brandName){
        brand = brandName;
    }

    public boolean checkBensin(){
        if (bensin >= 1) {
            bisaNyala = true;
        }else{
            bisaNyala = false;
        }
        return bisaNyala;
    }
    public boolean checkMesin(){
        if (mesin == false) {
            mesinNyala = false;
        }else{
            mesinNyala = true;
        }
        return mesinNyala;
    }
    public boolean berangkat(){
        if (mesinNyala && bisaNyala == true) {
            this.bisaBerangkat = true;
        }else{
            this.bisaBerangkat = false;
        }
        return this.bisaBerangkat;
    }

    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Bensin : " + bensin);
        System.out.println("Mesin : " + mesinNyala);
        System.out.println("Bisa gas? : " + bisaBerangkat);
    }

}
