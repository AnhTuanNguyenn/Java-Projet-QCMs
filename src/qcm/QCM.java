/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qcm;
import java.util.*;
/**
 *
 * @author Alienware
 */
public class QCM
{
     public static void main(String []args)
     {    
       String in;
//         declarer var, function

        int score = 0;
        boolean next = true;
        Scanner scan = new Scanner ( System.in );
        
//        On commener programe
            if (next) 
            {
             next = false;
            System.out.println("1. Java est un langage:");
            System.out.println("(a) Compil´e");
            System.out.println("(b) Interpr´et´e");
            System.out.println("(c) Compil´e et interpr´et´e");
            System.out.println("(d) Ni compil´e ni interpr´et´e");
            System.out.println("Votre reponse?");     
                in = scan.nextLine();
                if(in.equals("c"))
                {
                    System.out.println("Bravoooo\n");                   //        si vous choissisez vrai réponse il va passer prochain question.
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");          
                    next = true;        //        ici on passer prochain question si vous réponse vrai
                }
                else
                {
                    System.out.println("Nope\n");                                    //        afficher votre point.. Bravooooo
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");               //            si faut il va afficher votre point aussi et demande pour continuer
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else 
                    { next = true; }
                }
            }
//        il va recommencer function et les même code suivant
            if (next) 
            {
                next = false;
                System.out.println("2. Java est un langage d´evelopp´e par:");
                System.out.println("(a) Hewlett-Packard");
                System.out.println("(b) Sun Microsystems");
                System.out.println("(c) Microsoft");
                System.out.println("(d) Oracle");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("b"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
            

             if (next) 
            {
                next = false;
                System.out.println("Combien d’instances de la classe A cr´ee le code suivant?\n" +"A x,u,v;\n" +"x=new A();\n" +"A y=x;\n" +"A z=new A();");
                System.out.println("(a) Aucune");
                System.out.println("(b) Cinq");
                System.out.println("(c) Trois");
                System.out.println("(d) Deux");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("d"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
            
             
              if (next) 
               {
                next = false;
                System.out.println("Pour la classe B d´efinie comme suit:\n" );
                System.out.println("class B {");
                System.out.println("public B(){System.out.print(”Ciao”);};" );
                System.out.println("public B(int i) {this(); System.out.println(”Bonjour ”+i);}");
                System.out.println("}");
                System.out.println("qu’affichera l’instruction suivante?\n" +"B monB=new B(2003);");
            
                System.out.println("(a) erreur de compilation");
                System.out.println("(b) erreur d’ex´ecution");
                System.out.println("(c) CiaoBonjour 2003");
                System.out.println("(d) Bonjour 2003");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("c"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
            
              
               if (next) 
               {
                next = false;
                System.out.println("(a) Une classe peut impl´ementer plusieurs interfaces mais doit ´etendre une seule classe");
                System.out.println("(b) Une classe peut impl´ementer plusieurs classes mais doit ´etendre une seule interface");
                System.out.println("(c) Une classe peut impl´ementer plusieurs classes et peut ´etendre plusieurs interfaces");
                System.out.println("(d) Une classe doit impl´ementer une seule interface et ´etendre une seule classe");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("a"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
            
               if (next) 
               {
                next = false;
                    System.out.println("La liaison tardive est essentielle pour assurer");
                   System.out.println("(a) l’encapsulation");
                   System.out.println("(b) le polymorphisme");
                   System.out.println("(c) l’h´eritage");
                   System.out.println("(d) la marginalisation");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("a"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
            
               
                   if (next) 
               {
                next = false;
                    System.out.println("Pour spécifier que la valeur d'une variable ne peut changer, on la déclare comme une constante avec le mot réservé :");
                    System.out.println("(a) finalize");
                    System.out.println("(b) const");
                    System.out.println("(c) define");
                    System.out.println("(d) final");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("d"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
               
                   if (next) 
               {
                next = false;
                    System.out.println("Pour avoir un commentaire sur une ligne, on place en début de ligne le(s) caractère(s) :");
                    System.out.println("(a) //////");
                    System.out.println("(b) * ");
                    System.out.println("(c)  # ");
                    System.out.println("(d) %");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("a"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
         
                   
                    if (next) 
               {
                next = false;
                        System.out.println("Lequel de ces identificateurs est incorrect :");
                        System.out.println("class A { class B extends A {");
                        System.out.println("(a)ToTaL");
                        System.out.println("(b) nom_prenom");
                        System.out.println("(c) 2emechoix");
                        System.out.println("(d) valeur$");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("c"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }
                               
                 if (next) 
               {
                next = false;
                        System.out.println("Pour déclarer une variable de type primitif int qui a pour nom jour, il faut écrire :");
                        System.out.println("(a) int jour;");
                        System.out.println("(b) declare(type int) : jour;");
                        System.out.println("(c) dim jour as integer;");
                        System.out.println("(d) jour = new int;");

                System.out.println("Votre repondre ?");
                in = scan.nextLine();
                if(in.equals("a"))
                {
                    System.out.println("Bravoooo\n");
                    score ++;
                    System.out.println("Votre Point: " + score+ "\n");
                    next = true;
                }
                else
                {
                    System.out.println("Nope\n");
                    System.out.println("Votre point: " + score+ "\n");

                    System.out.println("Vous voulez continuer? (o/n)\n");
                    in=scan.nextLine();
                    if(in.equalsIgnoreCase("n"))
                    {  System.exit(0); }
                    else { next = true; }
                }
             }             
    ////////////////// 
         }
}