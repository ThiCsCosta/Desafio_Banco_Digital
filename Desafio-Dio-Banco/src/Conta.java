
public abstract class Conta implements IConta{
	
	private static final int Agencia_Padrao = 1;
	private static  int SEQUENCIAL = 1;
	
	public Conta(){
		this.agencia = Agencia_Padrao;
		this.conta = SEQUENCIAL++;
	}

	protected int agencia;
	protected int conta;
	protected double saldo;
	
	public void depositar() {
		
	}
	public void sacar() {
		
	}
	public void transferir() {
		
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfo() {
		System.out.println(String.format("Angencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	
}
