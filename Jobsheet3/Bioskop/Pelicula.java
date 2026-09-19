package Jobsheet3.Bioskop;

public class Pelicula {
    private String judulFilm;
    private double hargaDasar = 0;
    private boolean statusPembayaran = false;

    public Pelicula(String judulFilm,double hargaDasar){
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
    }

    public String getJudulFilm(){
        return judulFilm;
    }

    public double getHargaDasar(){
        if (hargaDasar <= 0) {
            hargaDasar = 35000;
        }
        return hargaDasar;
    }

    public boolean isStatusPembayaran(){
        return statusPembayaran;
    }

    public void lakukanPembayaran(){
        statusPembayaran = true;
    }

}
