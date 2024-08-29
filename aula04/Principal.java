class Principal{
    public static void main(String[] args) {
        Fila<String> listaAlunos = new Fila<String>("Alunos");

        listaAlunos.enfileirar("Rogerio");
        listaAlunos.enfileirar("Carlos");
        listaAlunos.enfileirar("Rodrigo");
        listaAlunos.imprimeFila();
        listaAlunos.desenfileirar();
        listaAlunos.imprimeFila();
        listaAlunos.desenfileirar();
        listaAlunos.imprimeFila();
        listaAlunos.desenfileirar();
        listaAlunos.imprimeFila();
    }
}