class ContaBanco {

    private String NumeroConta;
    private String titular;
    private Double saldo;

    ContaBanco(){

    }

    ContaBanco(String NumeroConta, String titular, double saldo){
        this.NumeroConta = NumeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.print("deposido feito com sucesso!!");
            return;
        }

        System.out.print("Deposito não foi realizado!");
    }


    public void sacar(double valor){

        if(valor > this.saldo){
            System.out.print("Operacao inválida!");
            return;
        }

        this.saldo -= valor;

        int ce100, ce50, ce20, ce10, ce5, ce2, c1 = 0;
        int r100, r50, r20, r10, r5, r2;
        ce100 = (int) valor / 100;
        r100 = (int) valor % 100;

        ce50 = (int) r100 / 50;
        r50 = (int) r100 % 50;

        ce20 = (int) r50 / 20;
        r20 = (int) r50 % 20;

        ce10 = (int) r20 / 10;
        r10 = (int) r20 % 10;

        ce5 = (int) r10 / 5;
        r5 = (int) r10 % 5;

        ce2 = (int) r5 / 2;
        r2 = (int) r5 % 2;

        c1 = (int) r2;

        System.out.print("Saque feito com sucesso!");
        System.out.print(ce100 + "Cedulas de 100" );
        System.out.print(ce50 + "Cedulas de 50");
        System.out.print(ce20 + "Cedulas de 20");
        System.out.print(ce10 + "Cedulas de 10");
        System.out.print(ce5 + "Cedulas de 5");
        System.out.print(ce2 + "Cedulas de 2");
        System.out.print(c1 + "Cedulas de 1");


    }
    

}

