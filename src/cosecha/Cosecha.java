/*7.En un arreglo unidimensional se ha almacenado el número total de toneladas 
de cereales cosechadas durante cada mes del año anterior. Escriba un programa 
que obtenga e imprima la siguiente información:
    a)El promedio anual de toneladas cosechadas.
    b)¿Cuántos meses tuvieron cosecha superior al promedio anual?
    c)¿Cuántos meses tuvieron cosecha inferior al promedio anual?*/
package cosecha;
/*** @author Saira Ma. Urbina Cienfuegos*/
import java.util.Scanner; //Para leer datos de teclado

public class Cosecha { //Inicio clase principal
 
    public static void main(String[] args) {//Inicio Método principal de la clase
        // Declaración de variables
        //Definir objeto de tipo Scanner, para leer datos desde teclado
       Scanner entrada=new Scanner(System.in );
       double promedioAnual; //Variable para almacenar el resultado de promedio
       double suma=0; //Variable acumulador para el calculo del promedio
       //Variable contador para los datos mayores al prom
       int cosechaSuperior=0; 
       //Variable contador para los datos menores al prom
       int cosechaInferior=0; 
       int i; //Variable contador para controlar los ciclos
       //Arreglo para almacenar datos de cosecha por mes
       double []cosechado=new double[12]; 
       //Ciclo para llenar arreglo con datos de cosecha por mes
       for(i=0; i<cosechado.length; i++){ //Inicio ciclo for
           System.out.println("Ingrese la cantidad cosechada de cereal para el "
                   + "mes: ["+i+"]");
           //El dato ingresa por teclado, se lee usando objeto entrada
           //y se asigna al arreglo en la posición i
           cosechado[i]=entrada.nextDouble();
           //Se acumula cada dato almacenado en el arreglo, para luego 
           //hacer calculo del promedio
           suma+=cosechado[i];
       }//Fin del ciclo for
       
       //Cálculo del promedio anual de la cosecha
       promedioAnual=suma/cosechado.length;
       
       for(i=0; i<cosechado.length; i++){//Inicio ciclo for
           //Evaluando el elemento en la posición i, si es menor que promedio
           if (cosechado[i]<promedioAnual){//Inicio del if
              //Si la condición es verdadera, suma 1 a cosechaInferior
               cosechaInferior+=1; 
           }//Cierre del if
           else{//Inicio del else
               //Si la condición es falsa, suma 1 a cosechaSuperior
               cosechaSuperior+=1; 
           }//Cierre del else
           //Muestra en pantalla los elementos del arreglo 
           System.out.println("Posición["+i+"]: "+ cosechado[i]);
       } //Fin del for
       //Muestra en pantalla el valor del promedio
       System.out.println("Promedio de la cosecha:"+promedioAnual);
       //Muestra en pantalla el valor de cosechaSuperior
       System.out.println("Cantidad de meses con consecha mayores al promedio: "
               +cosechaSuperior);
       //Muestra en pantalla el valor de cosechaInferior
       System.out.println("Cantidad de meses con consecha menores al promedio: "
               +cosechaInferior);     
    }//Cierre del método main
}//Cierre de la clase principal
