class No<T> {
    private T dado;
    private No<T> nextDado;

    public No(T dado){
        this.dado = dado;
        this.nextDado = null;
    }

    public void setNextDado(No<T> nextDado) {
        this.nextDado = nextDado;
    }

    public No<T> getNextDado() {
        return this.nextDado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return this.dado;
    }

    public String imprimeDados(){
        return "{ Dado: " + getDado() + " }";
    }
}