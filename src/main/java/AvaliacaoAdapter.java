public class AvaliacaoAdapter extends AvaliacaoNota{
    private IAvaliacao avaliacaoComportamento;

    public AvaliacaoAdapter(IAvaliacao avaliacaoComportamento) {

        this.avaliacaoComportamento = avaliacaoComportamento;
    }

    public String recuperarAvaliacao() {
        if (this.getNotaAnimal() >= 8.0f)
            avaliacaoComportamento.setAvaliacao("A - Doguinho mais doguinho dos doguinhos");
        else
        if (this.getNotaAnimal() >= 6.0f)
            avaliacaoComportamento.setAvaliacao("B - Quem é o bom menino?");
        else
        if (this.getNotaAnimal() >= 4.0f)
            avaliacaoComportamento.setAvaliacao("C - Brinca, porém depende");
        else
            avaliacaoComportamento.setAvaliacao("D - Ranzinza Master");
        return avaliacaoComportamento.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoComportamento.getAvaliacao().equals("A - Doguinho mais doguinho dos doguinhos"))
            this.setNotaAnimal(8.0f);
        else
        if (avaliacaoComportamento.getAvaliacao().equals("B - Quem é o bom menino?"))
            this.setNotaAnimal(6.0f);
        else
        if (avaliacaoComportamento.getAvaliacao().equals("C - Brinca, porém depende"))
            this.setNotaAnimal(4.0f);
        else
            this.setNotaAnimal(0.0f);
    }
}
