public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoFelipe = new Conta();            // Instanciando o Objeto conta através da referência contaDoFelipe
        contaDoFelipe.saldo = 100;                    // Adicionando o valor 100 no atributo saldo

        contaDoFelipe.deposita(50);             // O método deposita neste caso será aplicado somente para a contaDoFelipe devido ao this.saldo adicionado no metodo da Conta
        System.out.println(contaDoFelipe.saldo);

        //Testando o método saca()
        boolean conseguiuRetirar = contaDoFelipe.saca(20);      // Atribuindo o resultado da chamada do método saca() em contaDoFelipe. Se sacou (true), senão (false)
        System.out.println(contaDoFelipe.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        //contaDaMarcela.transfere(300, contaDoFelipe);           // Efetuando a transferência da contaDaMarcela apra a contaDoFelipe
        if(contaDaMarcela.transfere(300, contaDoFelipe)){   // Efetuando a transferência e informando se deu certo ou não
            System.out.println("transferência com sucesso!");
        } else{
            System.out.println("faltou dinheiro!");
        }

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoFelipe.saldo);

        /*Segunda maneira de verificar se transferiu ou não o dinheiro:
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoFelipe);
        if (sucessoTransferencia){
            System.out.println("transferência com sucesso!")
        } else{
            System.out.println("faltou dinheiro!");
        }
        */


    }
}
