package proiect.primul;

public abstract class MagazinInghetata{
    public Inghetata comandaInghetata(String type){
        Inghetata inghetata = creazaInghetata(type);
        inghetata.pune();
        inghetata.adaugaBomboane();
        inghetata.adaugaToping();
        return inghetata;
    }

    protected abstract Inghetata creazaInghetata(String type);
}
