public class DNA {
    public static boolean verificador(String dna) {
        int inicio = dna.indexOf("ATG");
        int fim = dna.indexOf("TGA", inicio + 3); // Começando a partir do próximo índice depois do códon de início
        
        if (inicio != -1 && fim != -1 && (fim - inicio) % 3 == 0) {
            String proteina = dna.substring(inicio +3, fim - 0);
            System.out.println("Contém uma proteína: " + proteina);
            return true;
        } else {
            System.out.println("Sem proteína");
            return false;
        }
    }
    public static void main(String[] args) {
        String dna1 = "ATGCGATACTGA";
        String dna2 = "ATGCGATAGA";
        String dna3 = "ATGAAACGATCCTGA";
        DNA.verificador(dna1);
        DNA.verificador(dna2);
        DNA.verificador(dna3);
    }
}
