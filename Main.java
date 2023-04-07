import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> vendas = new ArrayList<>();
        List<String> historicoVendas = new ArrayList<>();
        List<String> historicoCompras = new ArrayList<>();
        vendas.add("A2RXH2");
        vendas.add("BEI8S2");
        historicoVendas.add("IS9WWJ");
        historicoVendas.add("MNMN22");
        historicoCompras.add("P8IUY4");
        historicoCompras.add("TU329S");
        Utilizador u = new Utilizador("AR21D", "migueljacinto@gmail.com", "Miguel Jacinto",
                "Rua Nossa Senhora da Assunção, 207, Cepelos", "232893233", vendas,
                historicoVendas, historicoCompras);
        Sapatilha s = new Sapatilha("A5TDBS", false, 0, 0, "Sap",
                "Adidas", 19.99, 0.0, "UX78D2", "T9DK2S",
                45, "Vermelha", false, 2020, false);
        TShirt t = new TShirt("A5TDBS", false, 0, 0, "Sap", "Adidas", 19.99, 0.0, "U8SCH3", "T4DS2D",
                "XL", "Liso");
        // Mala m = new Mala(4, 5, 6, 2019, "Plástico", false);
        // System.out.println(u);
        // System.out.println(s);
        // System.out.println(t);
        // System.out.println(s);
        List<String> artigos = new ArrayList<>();
        artigos.add("A5TDBS");
        artigos.add("A983JD");
        LocalDateTime data = LocalDateTime.now();
        Encomenda e = new Encomenda("EXHK87", artigos, 1, 45.99,
                data, 0, "UT8SXN", artigos, artigos);
        // System.out.println(e);
        LocalDateTime a1 = LocalDateTime.of(2020, 4, 20, 12, 40);
        LocalDateTime a2 = LocalDateTime.of(2020, 4, 25, 12, 40);
        long diff = ChronoUnit.HOURS.between(a2, a1);
        System.out.println(diff);
    }
}