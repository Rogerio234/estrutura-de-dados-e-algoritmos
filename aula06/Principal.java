public class Principal{
  public static void main(String[] args) {
    ListaDupla<String> lista = new ListaDupla<String>("ALUNOS");
    lista.imprimeLista();
    lista.addInicio("Rogerio");
    lista.imprimeLista();
    lista.addInicio("Yasmim");
    lista.imprimeLista();
    lista.addFinal("Carlos");
    lista.imprimeLista();
  }
}