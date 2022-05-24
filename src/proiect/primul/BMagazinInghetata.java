package proiect.primul;

public class BMagazinInghetata extends MagazinInghetata {
    @Override
    protected Inghetata creazaInghetata(String type){
        switch(type){
            case "Ciocolata": return new proiect.primul.CJInghetaCiocolata();
            case "Vanilie": return new proiect.primul.CJInghetataVanilie();
            default: return null;
        }
    }
}
