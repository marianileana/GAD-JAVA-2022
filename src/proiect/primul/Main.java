package proiect.primul;

public class Main {
   public static void main(String[] args) {
      MagazinInghetata bMagazinInghetata = new CJMagazinInghetata();
      Inghetata bInghetataCiocolata = bMagazinInghetata.comandaInghetata("Ciocolata");
      Inghetata bInghetataVanilie = bMagazinInghetata.comandaInghetata("Vanilie");
      MagazinInghetata cjMagazinInghetata = new CJMagazinInghetata();
      Inghetata cjInghetata = cjMagazinInghetata.comandaInghetata("Vanilie");
   }
}
