package practica3;

import java.awt.Color;

public abstract class FiguraGeometrica {
   protected int codi=0;
   protected String nom="";
   protected Color color=Color.white;

   public abstract double getArea();
   
   public FiguraGeometrica (int ncodi, String nnom, Color ncolor) {
      if (ncodi>0) codi = ncodi;
      nom = nnom;
      color = ncolor;
   }

   public FiguraGeometrica(FiguraGeometrica f)  {
      this (f.codi, f.nom, f.color);
   }

   public FiguraGeometrica () {}

   public void setCodi(int nouCodi)  {
      if (nouCodi>=0) codi = nouCodi;
   }

   public void setNom (String nouNom)  {
      nom = nouNom;
   }

   public void setColor (Color nouColor) {
      color = nouColor;
   }   

   public int getCodi () {
      return codi;
   }

   public String getNom () {
      return nom;
   }
   
   public Color getColor () {
      return color;
   }

   @Override
public String toString() {
	return "FiguraGeometrica [codi=" + codi + ", nom=" + nom + ", color="
			+ color + "]";
}

public void visualitzar () {
//      System.out.println ("Codi..........:" + codi);
//      System.out.println ("Nom...........:" + nom);
//      System.out.println ("Color.........:" + color);
   }

   
   public static void main(String args[]) {
/*  
 * Una clase abstracta no se puede instanciar a si misma  
 * 
 *  FiguraGeometrica f1 = new FiguraGeometrica();
    FiguraGeometrica f2 = new FiguraGeometrica(1,"FiguraGeometrica 1", Color.orange);
     f1.visualitzar();
    f2.visualitzar();*/
   }
}