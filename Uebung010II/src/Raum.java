public class Raum {
    String raumnummer;
    int kapa;

    public Raum(String raumnummer, int kapa){
        validateKapa(kapa);
        this.kapa = kapa;
        this.raumnummer = raumnummer;
    }

    private void validateKapa(int kapa){
        if (kapa < 1){
            throw new RuntimeException("Kapa ist kleiner 1");

        }
        else {
            System.out.println("Kapa ist okay");
        }
    }

    public int getKapa(){
        return kapa;
    }
}


