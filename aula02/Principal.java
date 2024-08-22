public class Principal {

    public static void main(String[] args) {
        No<String> obj1 = new No<String>("Rogerio");
        System.out.println(obj1.imprimeDados());

        No<String> obj2 = new No<String>("Carlos");
        System.out.println(obj2.imprimeDados());

        No<String> obj3 = new No<String>("Yasmim");
        System.out.println(obj3.imprimeDados());

        obj1.setNextDado(obj2);

        obj2.setNextDado(obj3);

        No<String> objAux = obj1;

        while(objAux != null){
            System.out.println(objAux.imprimeDados());
            objAux = objAux.getNextDado(); 
        }
    }
}