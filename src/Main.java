
public class Main {

	public static void main(String[] args) {
		Cliente gleyce = new Cliente();
		gleyce.setNome("Gleyce");
		
		Conta cc = new ContaCorrente(gleyce);
		Conta poupanca = new ContaPoupanca(gleyce);
		
		cc.depositar(100);
		cc.transferir(80, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
