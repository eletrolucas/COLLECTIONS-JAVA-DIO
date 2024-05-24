package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c: contatoPorNome){
            if(c.getNome().startsWith(nome));
            contatoPorNome.add(c);
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("lucas araujo", 1111);
    agendaContatos.adicionarContato("lucas vinicius", 97275388);

    agendaContatos.exibirContatos();
    
    agendaContatos.atualizarNumeroContato("lucas araujo", 379898);

    agendaContatos.exibirContatos();
        
    }
}
