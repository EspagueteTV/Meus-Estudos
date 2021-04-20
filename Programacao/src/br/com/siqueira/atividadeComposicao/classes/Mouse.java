package br.com.siqueira.atividadeComposicao.classes;

public class Mouse {
    private int sensibilidade;
    private String tipoConexao;

    public Mouse(){
        setSensibilidade(0);
        setTipoConexao("Indefinido");
    }

    public Mouse(int sensibilidade, String tipoConexao){
        setSensibilidade(sensibilidade);
        setTipoConexao(tipoConexao);
    }

    @Override
    public String toString(){
        return "Sensibilidade: " + getSensibilidade() + " DPI, Tipo de Conexão: " + getTipoConexao();
    }

    public int getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(int sensibilidade) {
        this.sensibilidade = sensibilidade;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }
}
