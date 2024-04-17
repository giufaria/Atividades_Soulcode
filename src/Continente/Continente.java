package Continente;


import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        this.paises.add(pais);
    }

    public double dimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : this.paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }


    public long populacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : this.paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }


    public double densidadePopulacional() {
        return this.populacaoTotal() / this.dimensaoTotal();
    }


    public Pais paisComMaiorPopulacao() {
        Pais paisMaiorPopulacao = null;
        long maxPopulacao = Long.MIN_VALUE;
        for (Pais pais : this.paises) {
            if (pais.getPopulacao() > maxPopulacao) {
                maxPopulacao = pais.getPopulacao();
                paisMaiorPopulacao = pais;
            }
        }
        return paisMaiorPopulacao;
    }


    public Pais paisComMenorPopulacao() {
        Pais paisMenorPopulacao = null;
        long minPopulacao = Long.MAX_VALUE;
        for (Pais pais : this.paises) {
            if (pais.getPopulacao() < minPopulacao) {
                minPopulacao = pais.getPopulacao();
                paisMenorPopulacao = pais;
            }
        }
        return paisMenorPopulacao;
    }


    public Pais paisMaiorDimensao() {
        Pais paisMaiorDimensao = null;
        double maxDimensao = Double.MIN_VALUE;
        for (Pais pais : this.paises) {
            if (pais.getDimensao() > maxDimensao) {
                maxDimensao = pais.getDimensao();
                paisMaiorDimensao = pais;
            }
        }
        return paisMaiorDimensao;
    }

    public Pais paisMenorDimensao() {
        Pais paisMenorDimensao = null;
        double minDimensao = Double.MAX_VALUE;
        for (Pais pais : this.paises) {
            if (pais.getDimensao() < minDimensao) {
                minDimensao = pais.getDimensao();
                paisMenorDimensao = pais;
            }
        }
        return paisMenorDimensao;
    }

    public double razaoTerritorial() {
        return this.paisMaiorDimensao().getDimensao() / this.paisMenorDimensao().getDimensao();
    }

    public static void main(String[] args) {
        Continente continente = new Continente("América");

        continente.adicionarPais(new Pais("Brasil", 8516000, 211000000));
        continente.adicionarPais(new Pais("Estados Unidos", 9834000, 331000000));
        continente.adicionarPais(new Pais("Canadá", 9976000, 38000000));
        
        System.out.println("Dimensão total do continente: " + continente.dimensaoTotal() + " km²");
        System.out.println("População total do continente: " + continente.populacaoTotal());
        System.out.println("Densidade populacional do continente: " + continente.densidadePopulacional() + " pessoas/km²");
        System.out.println("País com maior população no continente: " + continente.paisComMaiorPopulacao().getNome());
        System.out.println("País com menor população no continente: " + continente.paisComMenorPopulacao().getNome());
        System.out.println("País de maior dimensão territorial no continente: " + continente.paisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão territorial no continente: " + continente.paisMenorDimensao().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país: " + continente.razaoTerritorial());
    }
}

class Pais {
    private String nome;
    private double dimensao; // em km²
    private long populacao;

    public Pais(String nome, double dimensao, long populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public long getPopulacao() {
        return populacao;
    }
}

