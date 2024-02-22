import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
public class Extrato {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		Date now = new Date();
		String nowFormat = DateFormat.getInstance().format(now);
		nowFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);
		System.out.println("\n"+nowFormat);

	}

}


/*
 *  ---- ESCOLHA UMA OPERAÇÃO ----
 *  
 *  TRANSFERIR DA CONTA CORRENTE --> CONTA POUPANÇA
 *  TRANSFERIR DA CONTA POUPANÇA --> CONTA CORRENTE
 *  MOSTRAR NO EXTRATO O DIA/HORA DA TRANSAÇÃO
 */