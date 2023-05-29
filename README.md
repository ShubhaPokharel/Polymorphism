# Polymorphism
Polymorphism is derived from  greek words - poly(many) + morphism(forms).


So, Polymorphism means one functionality with different behaviors in java.

ex: ---- Shubha ----> In school she is a student.

                        In a mall she is a customer.
                        
                       At home she is a daughter.
                       
          
          There are two types of Polymorphism: 
          
          1 - Compile time polymorphism / static binding
          2- Runtime polymorphsm / dynamic binding
          
          
          

Compile time polymorphism:

Method overloading is an example of compile time polymorphism. Method overloading means using the same method multiple times with different nnumber of 
arguments or the same method name with the same number of arguments but different data types.


Example --

class Test{
  //overloading method: same method name but different argyments
  
  void m1(int num);
  
  void m1(int num1, int num2;
  
  //overloaded method: same method name but different datatypes
  
  void m1(int num3);
  
  void(double d);
  
  }
  
  ************************* Application without method overloading example: **********************************************************
  *****************************************************************************************************************************
 
  
  class Operation{
  
    void sum2(int num1, int num2){}
    
    void sum3(int num1, int num2, int num3){}
    
    void sum4(int num1, int num2, int num3, num4){}
    
  }
  
   ************************* Application with method overloading example: **********************************************************
  ***************************************************************************************************************************
  class Operation{
  
    void sum(int num1, int num2){}
    
    void sum(int num1, int num2, int num3){}
    
    void sum(int num1, int num2, int num3, num4){}
    
  }
  
  The compiler checks the method's signature(method name and method arguements) while compiling the code.It means while overloading the compiler
  checks the metod signature.
  
  
  Note:
  
  If you repeat the same method name with the same number of arguments and same datatype, you will get an error like 
    ".........already defined in the class.........."
    
    
    If your project requirement is to execute the same functionality with different behaviors, use method overloading concept.
    
    
    Note:
     It is not possible to prevent overloading in Java. 
    
    
   *****************Operator Overloading*******************************************************
   
 *******************************************************************************************
 
 Java does not support operator overloading concept except +.
 Operator Overloading means one operator peforming different behaviors.
 
 Ex: 
 
    10 + 30 = 40        // Addition
    "Shubha" + "Math" = ShubhaMath      // concatination
    "Shubha" + 11 = Shubha11   // concatination
    
     *******************************************************************************************
     
    
    
       Other examples:
       
       case 1: Valid
       
       void m1(int a){}
       void m1(int a, int b){}  
       
       
       case 2: Valid
       
       void m1(int a){}
       void m1(chr ch){}  
       
       case 2: Invalid
       
       void m1(int a){}
       void m1(int b){}  
       
       case 4: Valid            // It is valid because the placement of arguemnts is different 
       
       void m1(int a, char ch){}
       void m1(char ch, int a){}  
  
  
   *******************************************************************************************
   
   To check the methods present in the class we use "javap" command.
   
   Ex:   Finding some examples of method overloading from String class by using the below command : 
   
     javap java.lang.String
   
   public java.lang.String toLowerCase(java.util.Locale);
   
  public java.lang.String toLowerCase();
  
  public static java.lang.String valueOf(java.lang.Object);
  
  public static java.lang.String valueOf(char[]);
  
  public static java.lang.String valueOf(char[], int, int);
  
  public static java.lang.String copyValueOf(char[], int, int);
  
  public static java.lang.String copyValueOf(char[]);
  
  public static java.lang.String valueOf(boolean);
  
  public static java.lang.String valueOf(char);
  
  public static java.lang.String valueOf(int);
  
  public static java.lang.String valueOf(long);
  
  public static java.lang.String valueOf(float);
  
  public static java.lang.String valueOf(double);
  
  
  
  
  
  
