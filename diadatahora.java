import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class diadatahora {


public static class trabalho1 {
    public static void main(String args[]) {
    Calendar agora = Calendar.getInstance();
    System.out.println("Dia: "+agora.get(Calendar.DAY_OF_MONTH));
    System.out.println("Mes: "+(agora.get(Calendar.MONTH)+1));
    System.out.println("Ano: "+agora.get(Calendar.YEAR));
    System.out.println("Hora: "+agora.get(Calendar.HOUR));
    System.out.println("Minuto: "+agora.get(Calendar.MINUTE));
    System.out.println("Segundo: "+agora.get(Calendar.SECOND));
    System.out.println("Nome do aluno !! JOREL MARTINS DECZUTA !!");
    System.out.println("Trabalho T1 sendo entregue em...");
    System.out.println("data e hora de hoje : ");
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"+"\n HH:mm:ss");
    System.out.println(dateFormat.format(agora.getTime()));
    }
    }
    
}
