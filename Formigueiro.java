package Trabalho_Final_POO;


public class Formigueiro{
    private static final int l_cenario = 1000;
    private static final int h_cenario = 500;

    private static final int taxa_mut = 40;
    private static final int tan_DNA = 16;
    
    private int indice;
    List<List<Celula>> matriz;
    private int DNA[tan_DNA];
    private float x_medio;
    private int x_max;
    private float fitness;

    public Formigueiro(int indice) {
        this.indice = indice;
        x_medio = -1;
        x_max = -1;
        fitness = 0;
        matriz = new ArrayList<List<Celula>>()
        for (int i = 0; i < h_cenario; i++) {
            // seu Objeto é a classe que representa o objeto q vc ta armazenando no ARrayList
            matriz.add(new ArrayList<Celula>());
        }
        for (int i = 0; i < h_cenario; i++) {
            for (int j = 0; i < h_cenario; i++) {
                if (i == 0 || i == (l_cenario - 1) || j == 0 || j == (h_cenario - 1))
                    matriz[i][j] = new Celula(3, j, i);
                else if (j > 0.5 * l_cenario && j < 0.7 * l_cenario)
                    matriz[i][j] = new Celula(2, j, i);
                else
                    matriz[i][j] = new Celula(0, j, i);
            }
        }
    }


}