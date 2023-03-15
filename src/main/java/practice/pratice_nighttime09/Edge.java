package practice.pratice_nighttime09;

public class Edge extends Browser {

    String adressCubugu;

    public Edge() {
    }

    public Edge(String adressCubugu) {
        this.adressCubugu = adressCubugu;
    }

    @Override
    public void search() {
        System.out.println("Edge Arama Yapar");
    }

    @Override
    public void sifreKaydetme() {

        System.out.println("Edge istenildiginde sifre kaydeder");
    }

}
