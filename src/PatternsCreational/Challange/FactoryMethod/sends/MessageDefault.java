package PatternsCreational.Challange.FactoryMethod.sends;

public enum MessageDefault {
    SEND_MESSAGE("MENSAGEM ENVIADO POR"), FIND_MESSAGE("BUSCA FEITA PELO");
    private String descricao;

    MessageDefault(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
