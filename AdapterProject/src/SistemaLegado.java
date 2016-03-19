import java.text.SimpleDateFormat;
import java.util.Date;

public class SistemaLegado 
{  
    public static void consultaServico(int dia, int mes, int ano)
    {
    	try
    	{
    		// Print dia, mes e ano.
    		System.out.println(dia + "/" + mes + "/" + ano);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
}

