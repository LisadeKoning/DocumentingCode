/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.documenting_code;

/**
 * Saying Hello
 * @author Lisa18003
 */ 
public class Greetings {
    /**
     * Function: Greeting gives return: String says Hello
     * @return String Says Hello
     */
   public static String SayHello(){
       return "Hello";  
   }
   /**
    * Function: Greeting gives return: String says Goodbye
    * @return String Says Goodbye
    */
   public static String SayGoodbye(){
       return "Goodbye";
   }
   /**
    * Function: Greeting by name gives return: String says Hello
    * @param Name = String 
    * @return Strings Says Hello to a certain person
    */
   public static String SayHello (String Name){
       return "Hello " + Name;
   }
   /**
    * Function: Greeting by name gives return: String says Goodbye 
    * @param Name = String
    * @return String Says Goodbye to a certain person
    */
   public static String SayGoodbye (String Name){
       return "Goodbye " + Name;    

   }
}
   
