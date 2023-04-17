public class DNA {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACTGA";
        String dna2 = "ATGCGATAGA";
        String dna3 = "ATGAAACGATCCTGA";
        
        String dna = dna1; // Altere para testar com dna1, dna2 ou dna3
        
        int inicio = dna.indexOf("ATG");
        int fim = dna.indexOf("TGA", inicio + 3); // Começando a partir do próximo índice depois do códon de início
        
        if (inicio != -1 && fim != -1 && (fim - inicio) % 3 == 0) {
            String proteina = dna.substring(inicio +3, fim - 0);
            System.out.println("Contém uma proteína: " + proteina);
        } else {
            System.out.println("Sem proteína");
        }
    }
}
