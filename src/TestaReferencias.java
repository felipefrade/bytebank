public class TestaReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // Quando utilizamos o new Conta(); estamos de fato criando o Objeto do tipo conta
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // A variável do segundaConta está recebendo a referência da primeiraConta e não o valor

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        //Neste caso temos somente um objeto do tipo conta pois iniciamos somente 1 new Conta();

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);
        //Através da variável segundaConta, que possui a referência da primeiraConta, foi alterado o saldo de 300 para 400;

        System.out.println("novo saldo da primeira conta: " + primeiraConta.saldo);
        /* Como a variavel segundaConta possui a referência, por mais que não queremos, ao alterar o valor do saldo pela segundaConta,
           ao chamarmos o saldo pela primeiraConta, o valor será 400.
         */

        if (primeiraConta == segundaConta){
            System.out.println("mesma conta");
        } else{
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
