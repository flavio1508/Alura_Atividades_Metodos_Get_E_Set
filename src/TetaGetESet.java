public class TetaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 0);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente flavio = new Cliente();
        flavio.setNome("flavio augusto");

        conta.setTitular(flavio);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
    }

}
