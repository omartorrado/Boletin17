/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio4 {
    
    public char obtenerLetraDni(int dni){
        if(dni>99999999||dni<1000000){
            System.out.println("Numero incorrecto");
            return 'Ç';
        }
        else{
        int resto=dni%23;
        switch(resto){
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
            default:
                System.out.println("Error");
                return 'Ç';
        }
        }          
    }
}
//B 11	C 20	D 9   E 22	F 7	H 18	J 13	K 21	L 19
//N 12	P 8	Q 16	S 15	V 17		X 10	Y 6
//Z 14.