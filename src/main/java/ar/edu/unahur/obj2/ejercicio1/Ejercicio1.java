package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio1 {

    public int[] getInverso(int[] list) {
        int[] temp = new int[list.length];
        int j =0;
        for (int i = list.length -1 ; i >= 0; i--, j++)
            temp[j] = list[i];
        return temp;
    }




}

