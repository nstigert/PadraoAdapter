public class Animal {
    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Animal() {
        avaliacao = new AvaliacaoComportamental();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public float getNota() {
        return persistencia.getNotaAnimal();
    }
}
