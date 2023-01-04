public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(30, 333);
        System.out.println(conta.getAgencia());
        conta.setAgencia(12234234);

        Conta conta2 = new Conta(132, 232);

        System.out.println(Conta.getTotal());
    }
}
