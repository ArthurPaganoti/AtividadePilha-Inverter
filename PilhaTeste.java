public class PilhaTeste {
    public static void main(String[] args) {
        String entrada = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        StringBuilder saida = new StringBuilder();

        Pilha<Character> pilha = new Pilha<Character>();

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if (c == ' ') {
                while (!pilha.isEmpty()) {
                    saida.append(pilha.pop());
                }
                saida.append(' ');
            } else {
                pilha.push(c);
            }
        }

        while (!pilha.isEmpty()) {
            saida.append(pilha.pop());
        }

        System.out.println(saida.toString());
    }
}