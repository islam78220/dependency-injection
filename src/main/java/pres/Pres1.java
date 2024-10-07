package pres;

import ext.DaoImplV2;
import metier.IMetierImpl;
import ext.DaoImplV2;


public class Pres1 {
    public static void main(String[]args) {
        DaoImplV2 d = new DaoImplV2();
        IMetierImpl metier = new IMetierImpl(d);
       // metier.setDao(d);
        System.out.println("RES ="+metier.calcul());
    }

}
