public class PlanoOperadoraIFpadrao {
    public static void main(String[] args) {
        String plano = "M";

        if (plano == "B"){
            System.out.println("100 minutos de ligação.");
        }else if (plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram grátis");
        }else if (plano == "T"){
            System.out.println("100 minutos de ligação grátis");
            System.out.println("Whatsapp e Instagram grátis");
            System.out.println("5GB e Youtube inclusos");
        }
    }
}
