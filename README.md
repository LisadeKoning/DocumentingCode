#Project _Documenting code_

__Name__ | __Studentnumber__ | __Date__
-------- | ----------------- | --------
Lisa de Koning | 1802518 | 14.11.18

__Decription document__
This project can greet in general with 'Hello' and 'Goodbye'.
This project can also greet you in person with 'Hello' and ' Goodbye'.

__Classes__
1. Main
2. Greetings

__Methodes__

_Main_

'''java
public static void main(String[] args) {
            System.out.println(Greetings.SayHello());
            System.out.println(Greetings.SayGoodbye());
            System.out.println(Greetings.SayHello("Hans"));
            System.out.println(Greetings.SayGoodbye("Hans"));
    }
'''

_Greeting_

1. Say Hello
This methode says Hello in gerneral.

'''java
public static String SayHello(){
       return "Hello";  
   }
'''
2. Say Goodbye
This methode says Goodbye in gerneral.

'''java
public static String SayGoodbye(){
       return "Goodbye";
   }
'''

3. Say Hello 'Hans'
This methode says Hello to you.

'''java
fpublic static String SayHello (String Name){
       return "Hello " + Name;
   }
'''

4. Say Goodbye 'Hans'
This methode says Goodbye to you.

'''java
public static String SayGoodbye (String Name){
       return "Goodbye " + Name;    
   }
'''

__How to use this project__
Greetings are easy to use because it is a static.
