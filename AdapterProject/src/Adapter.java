import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
	O Padrão Adapter converte uma interface de uma classe para outra interface que o cliente espera encontrar.
	O Adaptador permite que classes com interfaces incompatíveis trabalhem juntas
*/
public class Adapter 
{
	// cria um formato padrao de data
	static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	//metodo para captar o dia de um Date
	public static int get_dia(Date data)
	{
		String string_data = formatter.format(data);
		String[] array = string_data.split("/");
		int dia = Integer.parseInt(array[0]);
		return dia;
	}
	
	//metodo para captar o mes de um Date
	public static int get_mes(Date data)
	{
		String string_data = formatter.format(data);
		String[] array = string_data.split("/");
		int mes = Integer.parseInt(array[1]);
		return mes;
	}
	
	//metodo para captar o ano de um Date
	public static int get_ano(Date data)
	{
		String string_data = formatter.format(data);
		String[] array = string_data.split("/");
		int ano = Integer.parseInt(array[2]);
		return ano;
	}
}

