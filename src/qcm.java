import java.util.*;
public class qcm {
    private static Scanner scan;

	public static void main(String []args){    
        
//      declarer var, function

     int score = 0;
     boolean next = false;
     scan = new Scanner ( System.in );
     
//     On commener programe

     System.out.println("1. Java est un langage:");
     System.out.println("(a) Compil´e");
     System.out.println("(b) Interpr´et´e");
     System.out.println("(c) Compil´e et interpr´et´e");
     System.out.println("(d) Ni compil´e ni interpr´et´e");
     System.out.println("Votre repondre ?");

     String in;
     in = scan.nextLine();
     
//     si vous choissisez vrai réponse il va passer prochain question (56)

     if(in.equals("c"))
     {
         System.out.println("Bravoooo\n");
         score ++;
         System.out.println("Votre Point: " + score+ "\n");
         next = true;
         
//     afficher votre point.. Bravooooo
//         si faut il va afficher votre point aussi et demande pour continuer (64)
     }
     else
     {
         System.out.println("Nope\n");
         next = false;
         System.out.println("Votre point: " + score+ "\n");
         
     }
//     ici on passer prochain question si vous réponse vrai

     if (next) {
         System.out.println("2. Java est un langage d´evelopp´e par:");
         System.out.println("(a) Hewlett-Packard");
         System.out.println("(b) Sun Microsystems");
         System.out.println("(c) Microsoft");
         System.out.println("(d) Oracle");
     }
     
//      il va demander pour continuer si OUI il va passer prochain question
     
     else {
         System.out.println("Vous voulez continuer? (O/N)\n");
     }
     
//     il va recommencer function et les même code suivant

     in=scan.nextLine();

     if ( next ) {
         if(in.equalsIgnoreCase("b")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
     }
     else {
         if(in.equalsIgnoreCase("O")) 
         {
         System.out.println("2. Java est un langage d´evelopp´e par:");
         System.out.println("(a) Hewlett-Packard");
         System.out.println("(b) Sun Microsystems");
         System.out.println("(c) Microsoft");
         System.out.println("(d) Oracle");
         }
         else {
             System.out.println("Merci ! À Bientot");
             System.out.println("Votre point: " + score +"\n");
         }
     }
     ///////////
         
         if (next){
             if(in.equalsIgnoreCase("b"))
             {
             } else {
                 System.out.println("Bravoooo\n");
                 score ++;
                 System.out.println("Votre point: " + score+ "\n");
                 next = true;
         }
         }
        if (next){
         System.out.println("Combien d’instances de la classe A cr´ee le code suivant?\n" +"A x,u,v;\n" +"x=new A();\n" +"A y=x;\n" +"A z=new A();");
         System.out.println("(a) Aucune");
         System.out.println("(b) Cinq");
         System.out.println("(c) Trois");
         System.out.println("(d) Deux");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in=scan.nextLine();
        
        if ( next ) {
         if(in.equalsIgnoreCase("d")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
     }else{
         if(in.equalsIgnoreCase("O"))   
         {
         System.out.println("Combien d’instances de la classe A cr´ee le code suivant?\n" +"A x,u,v;\n" +"x=new A();\n" +"A y=x;\n" +"A z=new A();");
         System.out.println("(a) Aucune");
         System.out.println("(b) Cinq");
         System.out.println("(c) Trois");
         System.out.println("(d) Deux");
 
         }   
        }
        /////
//        if (next){
             if(in.equalsIgnoreCase("d"))
             {
             } else {
                 System.out.println("Bravoooo\n");
                 score ++;
                 System.out.println("Votre point: " + score+ "\n");
                 next = true;
         }
         
        if (next){
         System.out.println("Pour la classe B d´efinie comme suit:\n" +"class B {\n" +"public B(){System.out.print(”Ciao”);};\n" +"public B(int i) {this(); System.out.println(”Bonjour ”+i);};\n" +"}\n" +"qu’affichera l’instruction suivante?\n" +"B monB=new B(2003);");
         System.out.println("(a) erreur de compilation");
         System.out.println("(b) erreur d’ex´ecution");
         System.out.println("(c) CiaoBonjour 2003");
         System.out.println("(d) Bonjour 2003");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in=scan.nextLine();
        
        if ( next ) {
         if(in.equalsIgnoreCase("c")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
                 
     }else{
         if(in.equalsIgnoreCase("O"))   
         {
         System.out.println("Pour la classe B d´efinie comme suit:\n" +"class B {\n" +"public B(){System.out.print(”Ciao”);};\n" +"public B(int i) {this(); System.out.println(”Bonjour ”+i);};\n" +"}\n" +"qu’affichera l’instruction suivante?\n" +"B monB=new B(2003);");
         System.out.println("(a) erreur de compilation");
         System.out.println("(b) erreur d’ex´ecution");
         System.out.println("(c) CiaoBonjour 2003");
         System.out.println("(d) Bonjour 2003");
 
         }   
        }
        ///////////////
          if (next){
             if(in.equalsIgnoreCase("c"))
             {
             } else {
                 System.out.println("Bravoooo\n");
                 score ++;
                 System.out.println("Votre point: " + score+ "\n");
                 next = true;
         }
         }
        if (next){
         System.out.println("(a) Une classe peut impl´ementer plusieurs interfaces mais doit ´etendre une seule classe");
         System.out.println("(b) Une classe peut impl´ementer plusieurs classes mais doit ´etendre une seule interface");
         System.out.println("(c) Une classe peut impl´ementer plusieurs classes et peut ´etendre plusieurs interfaces");
         System.out.println("(d) Une classe doit impl´ementer une seule interface et ´etendre une seule classe");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in=scan.nextLine();
        
        if ( next ) {
         if(in.equalsIgnoreCase("a")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
     }else{
         if(in.equalsIgnoreCase("O"))   
         {
         System.out.println("(a) Une classe peut impl´ementer plusieurs interfaces mais doit ´etendre une seule classe");
         System.out.println("(b) Une classe peut impl´ementer plusieurs classes mais doit ´etendre une seule interface");
         System.out.println("(c) Une classe peut impl´ementer plusieurs classes et peut ´etendre plusieurs interfaces");
         System.out.println("(d) Une classe doit impl´ementer une seule interface et ´etendre une seule classe");
         }   
        }
        //////////////////
        if(next){
            if(in.equalsIgnoreCase("a"))
            {
        }else{
                System.out.println("Bravoooooooo!");
                score ++;
                System.out.println("Votre point: " + score+"\n");
                next = true;
             }
            }
        if (next){
            System.out.println("La liaison tardive est essentielle pour assurer");
            System.out.println("(a) l’encapsulation");
            System.out.println("(b) le polymorphisme");
            System.out.println("(c) l’h´eritage");
            System.out.println("(d) la marginalisation");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in = scan.nextLine();
            if (next){
             if(in.equalsIgnoreCase("a"))
             {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
             }else{
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
             }
            }else{
                if(in.equalsIgnoreCase("O"))
                {
            System.out.println("La liaison tardive est essentielle pour assurer");
            System.out.println("(a) l’encapsulation");
            System.out.println("(b) le polymorphisme");
            System.out.println("(c) l’h´eritage");
            System.out.println("(d) la marginalisation");
                }
            }
            /////////////
                         if (next){
             if(in.equalsIgnoreCase("a"))
             {
             } else {
                 System.out.println("Bravoooo\n");
                 score ++;
                 System.out.println("Votre point: " + score+ "\n");
                 next = true;
         }
         }
        if (next){
         System.out.println("Pour spécifier que la valeur d'une variable ne peut changer, on la déclare comme une constante avec le mot réservé :");
         System.out.println("(a) finalize");
         System.out.println("(b) const");
         System.out.println("(c) define");
         System.out.println("(d) final");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in=scan.nextLine();
        
        if ( next ) {
         if(in.equalsIgnoreCase("d")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
     }else{
         if(in.equalsIgnoreCase("O"))   
         {
         System.out.println("Pour spécifier que la valeur d'une variable ne peut changer, on la déclare comme une constante avec le mot réservé :");
         System.out.println("(a) finalize");
         System.out.println("(b) const");
         System.out.println("(c) define");
         System.out.println("(d) final");
         }   
        }
            //////////////////////
            
            if (next){
             if(in.equalsIgnoreCase("d"))
             {
             } else {
                 System.out.println("Bravoooo\n");
                 score ++;
                 System.out.println("Votre point: " + score+ "\n");
                 next = true;
         }
         }
        if (next){
         System.out.println("Pour avoir un commentaire sur une ligne, on place en début de ligne le(s) caractère(s) :");
         System.out.println("(a) //////");
         System.out.println("(b) *");
         System.out.println("(c) '");
         System.out.println("(d) %");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in=scan.nextLine();
        
        if ( next ) {
         if(in.equalsIgnoreCase("a")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
     }else{
         if(in.equalsIgnoreCase("O"))   
         {
         System.out.println("Pour avoir un commentaire sur une ligne, on place en début de ligne le(s) caractère(s) :");
         System.out.println("//////");
         System.out.println("*");
         System.out.println("'");
         System.out.println("%");
         System.out.println("}");
         }   
        }
       ///////////////////    
          if (next){
             if(in.equalsIgnoreCase("a"))
             {
             } else {
                 System.out.println("Bravoooo\n");
                 score ++;
                 System.out.println("Votre point: " + score+ "\n");
                 next = true;
         }
         }
        if (next){
         System.out.println("Lequel de ces identificateurs est incorrect :");
         System.out.println("class A { class B extends A {");
         System.out.println("(a)ToTaL");
         System.out.println("(b) nom_prenom");
         System.out.println("(c) 2emechoix");
         System.out.println("(d) valeur$");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in=scan.nextLine();
        
        if ( next ) {
         if(in.equalsIgnoreCase("c")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
     }else{
         if(in.equalsIgnoreCase("O"))   
         {
         System.out.println("Lequel de ces identificateurs est incorrect :");
         System.out.println("class A { class B extends A {");
         System.out.println("(a)ToTaL");
         System.out.println("(b) nom_prenom");
         System.out.println("(c) 2emechoix");
         System.out.println("(d) valeur$");
         }   
        }         
        /////////////////////
                     if (next){
             if(in.equalsIgnoreCase("c"))
             {
             } else {
                 System.out.println("Bravoooo\n");
                 score ++;
                 System.out.println("Votre point: " + score+ "\n");
                 next = true;
         }
         }
        if (next){
         System.out.println("Pour déclarer une variable de type primitif int qui a pour nom jour, il faut écrire :");
         System.out.println("(a) int jour;");
         System.out.println("(b) declare(type int) : jour;");
         System.out.println("(c) dim jour as integer;");
         System.out.println("(d) jour = new int;");
        }else{
            System.out.println("Vous voulez continuer? (O/N)\n");
        }
        in=scan.nextLine();
        
        if ( next ) {
         if(in.equalsIgnoreCase("a")) 
         {
             System.out.println("Bravoooo\n");
             score ++;
             System.out.println("Votre point: " + score+ "\n");
             next = true;
         }
         else {
             System.out.println("Nope\n");
             next = false;
             System.out.println("Votre point: " + score+ "\n");
         }
     }else{
         if(in.equalsIgnoreCase("O"))   
         {
         System.out.println("Pour déclarer une variable de type primitif int qui a pour nom jour, il faut écrire :");
         System.out.println("(a) int jour;");
         System.out.println("(b) declare(type int) : jour;");
         System.out.println("(c) dim jour as integer;");
         System.out.println("(d) jour = new int;");
         }   
        }   
       /////////////
       
        }

}
