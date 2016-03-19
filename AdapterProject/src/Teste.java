
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste 
{
	public static void main(String args[]) throws ParseException
	{
		// cria um date
		Date data_teste = parseToDate("31012016");		
		// Instancia Sistema Legado
		SistemaLegado sl = new SistemaLegado();
		//consulta servico atraves de um parametro
		sl.consultaServico(31,01,2016); 
		// instancia adapter
		Adapter adapter = new Adapter();
		//Chama metodos do adapter para retirar dia, mes e ano.
		int dia = adapter.get_dia(data_teste);
		int mes = adapter.get_mes(data_teste);
		int ano = adapter.get_ano(data_teste);
		// consulta atraves do parametro.
		sl.consultaServico(dia, mes, ano);
	}
	
	//Uma vez que eh complexo criar um Date eu decidi usar esse metodo para fazer o Parse de uma String para Date.
	public static Date parseToDate(String data) throws ParseException
	{
		//Utilizado para capturar o formato em qual a data devera ser escrita
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");	
		// Faz o Parse da String pra Date
		Date data_final = formatter.parse(data);
		//Retorna o valor final em Date.
		return data_final;
	}
}
