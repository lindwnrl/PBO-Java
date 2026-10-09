package Jobsheet6.id.ac.polinema.Tugas2;

public class Televisi {
    public String merk;
    public int jumlahChannel;
    private int channelAktif = 1;

    public Televisi(String merk,int jumlahChannel){
        this.merk = merk;
        this.jumlahChannel = jumlahChannel;
    }

    public void pindahChannel(int channel){
        this.channelAktif = channel;
    }

    public int getChannelAktif(){
        return channelAktif;
    }
}
