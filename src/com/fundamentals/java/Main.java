package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {
    /*
    * define the basic use of the numbers
    * patterned after example on page 22
    * */
     int i = -27;
     short s = 17;
     long l = 1008L;
     float f = 11.1f;
     float F = 11.9F;
     double d = 19.2;

     //display the numbers
     System.out.println("Integer (int) types are from -2,147,483,648 to 2,147,483,647, for example: " + i + ".");
     System.out.println("Short types are from -32,768 to 32,767, for example: " + s + ".");
     System.out.println("Long types are from -9223372036854775808 to 9223372036854775808, for example: " + l + ".");
     System.out.println("The literal for " + l + " ends with L.");
     System.out.println("Float types are from -3.402823e38 to 3.402823e38, for example : " + f + " and " + F + ".");
     System.out.println("The literal for " + f + " ends with f and the one for " + F + " ends with F.");
     System.out.println("Double types are from -1.79769313486232e308 to 1.79769313486232e308, for example " + d + ".\n");

     int a = -1;  //page 24 example; define the number
     System.out.println("The absolute function changes the literal " + a + " to " + Math.abs(a) + ".\n"); //use the absolute function

     double b = 18.1;  //page 25 example; define the number
     System.out.println("The ceiling function changes the literal " + b +  " to " + Math.ceil(b) + ".\n");  //use the ceiling function

     double c = 17.9; //page 26 example; define the number
     System.out.println("The floor function changes the literal " + c +  " to " + Math.floor(c) + ".\n"); //use the floor function

     int e = 5, g = 7; //pages 26-27 example; define the number
     System.out.println("As for " + e + " and " + g + ", the maximum value between the two is " + Math.max(e, g) + ".\n"); //use the maximum function

     int h = 11, j = 12; // page 27 example; define the number
     System.out.println("The minimum value between " + h + " and " + j + " is " + Math.min(h, j) + ".\n"); //use the minimum function

     int k = 7, m = 2; //page 28 example; define the number
     System.out.println(k + " to the " + m + "nd power is " +  (int)Math.pow(k, m) + ".\n"); //use the power function

     double n = 7.9; //pages 28- 29 example; define the number
     System.out.println("Rounding " + n + " to the nearest whole number makes it " + Math.round(n) + ".\n");  //use the round function

     int o = 2401;  //page 29 example
     System.out.println("The square root of the square root of " + o + " is " + (int)Math.sqrt(Math.sqrt(o)) + ".\n"); //use the square root function

     double p = 45;  //page 30 example - using the same variable for page 31 & pages 31-32 example
     System.out.println("The ratio of the opposite side to the hypotenuse for a " + (int)p + " degree angle is " + Math.sin(p) + ".\n"); //use the sine function

     System.out.println("The ratio of the opposite side to the adjacent side of a " + (int)p + " degree angle is " + Math.tan(p) + ".\n"); //use the tangent function (page 31)

     System.out.println("The ratio of the adjacent side to the hypotenuse for a " + (int)p + " degree angle is " + Math.cos(p) + ".\n"); //use of cosine function (pages 31-32)

     //defining a string; page 33 example
     String q = "Jump up and down";
     System.out.println("The literal for the variable aa is " + q + ".\n");

     //length function - page 35 example
     String r = "Jumping all around";
     System.out.println("The length of the phrase " + "\"" + r + "\"" + " is " + r.length() + " characters long.\n");

     //toLowerCase function - pages 35-36 example
     String t = "LOWER CASE";
     System.out.println("Changing " + t + " to all non-capital letters makes it " + t.toLowerCase() + ".\n");

     //toUpperCase function - page 36 example
     String u = "upper case";
     System.out.println("When using all " + u.toUpperCase() + " characters, it probably means someone is shouting.\n");

     //contains function - page 37 example
     String  v = "running back and forth";
     System.out.println("It\'s " + v.contains("back") + " that the string \"" + v + "\" contains the word \'back\'.\n");

     //endsWith function - pages 37-38 example
     String w = "Take the plunge";
     System.out.println("Does the phrase \"" + w + "\" end with \'plunge\'? - " + w.endsWith("plunge") + "\n");

     //indexOf function - page 38 example
     String x = "New Shoes";
     System.out.println("For \"" + x + "\", the index of the upper case letters are " + x.indexOf('N') +  " and " + x.indexOf('S') + "\n");

     //replace function - page 39 example
     String y = "walking below";
     System.out.println("Instead of " + y + ", why not try " + y.replace("below", "above") + "?\n");

     //substring function - pages 39-40 example
     String z = "turkey sandwich";
     System.out.println("The type of meat used on the " + z + " is " + z.substring(0, 6) + ", of course.\n");

     //compareTo function - pages 40-41 example
     String aa = "who\'s got the basketball?";
     System.out.println("When using the compare to function for \'basketball' on the phrase \"" + aa + "\", the output is " + aa.compareTo("basketball") + "."); //answer is 21
     System.out.println("The output is " + aa.compareTo("got") + " when using \'got\' and it\'s " + aa.compareTo("the") + " when using \'the\'.");  //16 and 3
    }
}
