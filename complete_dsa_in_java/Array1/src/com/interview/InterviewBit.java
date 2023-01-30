package com.interview;

class InterviewBit{
    public int num1;
  static int num2;
    void calculate(int a, int b)
    {
        num1 +=  a ;
        num2 +=  b;
    }        
}    
class Driver{
    public static void main(String args[])
    {
        InterviewBit obj1 = new InterviewBit();
        InterviewBit obj2 = new InterviewBit();   
        obj1.num1 = 0;
        obj1.num2 = 0;
        obj1.calculate(1, 2);
        obj2.num1 = 0;
        obj2.calculate(2, 3);
        System.out.println(obj1.num1 + " " + obj2.num2);     
    }
}

