
package clase2pack;

import java.util.Scanner;

public class TanqueTemp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int temp_M_muyBuena = 20;
        int temp_M_Min = 15;
        int temp_M_Max = 25;
        int temp_T_muyBuena = 25;
        int temp_T_Min = 20;
        int temp_T_Max = 30;
        int temp_N_muyBuena = 15;
        int temp_N_Min = 10;
        int temp_N_Max = 20;

        System.out.println("Ingrese el momento del dia (maniana, tarde, noche):");
        String momentoDia = teclado.nextLine().toLowerCase();
        System.out.println("Ingrese la temperatura actual del tanque:");
        int temperatura = teclado.nextInt();

        String evaluacion = evaluarTemperatura(momentoDia, temperatura,
                temp_M_muyBuena, temp_M_Min, temp_M_Max,
                temp_T_muyBuena, temp_T_Min, temp_T_Max,
                temp_N_muyBuena, temp_N_Min, temp_N_Max);

        System.out.println("La temperatura es: " + evaluacion);

        teclado.close();
    }

    static String evaluarTemperatura(String momentoDia, int temperatura,int tempMMuyBuena, int tempMMin, 
            int tempMMax,int tempTMuyBuena, int tempTMin, int tempTMax,int tempNMuyBuena, int tempNMin, int tempNMax){
        String evaluacion = "";

        switch (momentoDia) {
            case "maniana":
                if (temperatura < tempMMuyBuena)
                    evaluacion = "Muy Buena";
                else if (temperatura >= tempMMin && temperatura <= tempMMax)
                    evaluacion = "Normal";
                else
                    evaluacion = "Peligrosa";
                break;
            case "tarde":
                if (temperatura < tempTMuyBuena)
                    evaluacion = "Muy Buena";
                else if (temperatura >= tempTMin && temperatura <= tempTMax)
                    evaluacion = "Normal";
                else
                    evaluacion = "Peligrosa";
                break;
            case "noche":
                if (temperatura < tempNMuyBuena)
                    evaluacion = "Muy Buena";
                else if (temperatura >= tempNMin && temperatura <= tempNMax)
                    evaluacion = "Normal";
                else
                    evaluacion = "Peligrosa";
                break;
            default:
                evaluacion = "Momento del dia no valido";
                break;
        }

        return evaluacion;
    }
}
