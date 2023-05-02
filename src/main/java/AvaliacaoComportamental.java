public class AvaliacaoComportamental implements IAvaliacao{
    private String comportamento;

    @Override
    public String getAvaliacao() {
        return this.comportamento;
    }

    @Override
    public void setAvaliacao(String comportamento) {
        this.comportamento = comportamento;
    }
}
