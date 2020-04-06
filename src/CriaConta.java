public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100; // Igual a primeiraConta.saldo = primeiraConta.saldo + 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;  //Referência(segundaConta).Atributo(saldo). Do objeto Conta, neste caso.

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        primeiraConta.agencia = 146;
        System.out.println("agência primeira conta " + primeiraConta.agencia); // Quando o Java cria/instancia objetos,todos os seus atributos
        System.out.println(primeiraConta.numero);  // são zerados de forma automática. (Valor default)

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta está na agência " + segundaConta.agencia);

        /*Valores padrão por tipo dos atributos:
            boolean = false;
           int, doouble, long = 0;
            char = 0 (zero da tabela de caracteres);
            String = ???
        */

        if (primeiraConta == segundaConta){
            System.out.println("são a mesma conta");
        } else{
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}