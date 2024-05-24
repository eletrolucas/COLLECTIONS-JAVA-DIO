package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private String nome;

    private long codigo;
    private int quantidade;
    double preco;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public String toString() {
        return "Produto{" + "Codigo= " + codigo +
        ", nome= " + nome + ", preco= " + preco
        + ", quantidade= " + quantidade + "}";
    }

    
}

class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
