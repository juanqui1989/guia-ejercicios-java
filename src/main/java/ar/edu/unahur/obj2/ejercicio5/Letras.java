package ar.edu.unahur.obj2.ejercicio5;

public class Letras {
  char [] alfabeto = new char[26];

  Letras(){
    this.setAlfabeto();
  }

  public int[] contarLetras(String s) {
    int[] letrasContadas = new int[26];
    for (int i =0; i < s.length(); i++) {
      letrasContadas[s.charAt(i) -'a'] ++;
    }
    return letrasContadas;

  }



  private void setAlfabeto() {
    for (int i = 0; i < 26; i++) {
      alfabeto[i] = (char)(97 + i);
    }
  }
}
