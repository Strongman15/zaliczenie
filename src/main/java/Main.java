import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj ilość liczb do posortowania: ");
    int n = input.nextInt();
    int[] tab = new int[n];
    for(int i=0; i<n; i++){
      System.out.println("Podaj liczbę: ");
      tab[i] = input.nextInt();
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<n-1; j++){
        if(tab[j]<tab[j+1]){
          int temp = tab[j];
          tab[j] = tab[j+1];
          tab[j+1] = temp;
        }
      }
    }
    for(int i=0; i<n; i++){
      System.out.println(tab[i]);
    }

  }
}

