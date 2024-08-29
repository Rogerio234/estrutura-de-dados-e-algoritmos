class Fila<T>{
    No<T> primeiroNo;
    No<T> ultimoNo;
    String nomeFila;

    public Fila(String nomeFila) {
        this.nomeFila = nomeFila;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public No<T> getPrimeiroNo() {
        return this.primeiroNo;
    }

    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No<T> getUltimoNo() {
        return this.ultimoNo;
    }

    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public String getNomeFila() {
        return this.nomeFila;
    }
    
    public void setNomeFila(String nomeFila) {
        this.nomeFila = nomeFila;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        if(primeiroNo == null){
            System.out.println("Fila Vazia");
            return null;
        }

        T dado = primeiroNo.getDado();

        primeiroNo = primeiroNo.getNextNo();

        if(primeiroNo == null){
            ultimoNo = null;

        }
        return dado;
    }

    public void imprimeFila(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!"); 
        }else{
            System.out.printf("Dados da lista %s:\n", nomeFila);

            No<T> noImprime = primeiroNo;

            while(noImprime != null){
                System.out.printf("{%s}\n",noImprime.getDado());
                noImprime = noImprime.getNextNo();
            }
        }
    } 
}