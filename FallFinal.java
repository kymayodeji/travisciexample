/**
* This is the Fall 2019 Final Exam for AP Computer Science.
* Student Name:
* Date: December 18, 2019
* Enter the numbers you did: 1,2,3,4,5,6,7,8,9,10
* Start Time:
* End/Submission Time:
**/
public class FallFinal {
    /* Add your method code below for each of the five methods you selected.
     * Feel free to temporarily add your own tester code for your methods, but
     * at final submission, only have your methods code listed in this FallFinal.java file.
     * You can use your notebook and any previous code completed for assignments.
     * NO OUTSIDE RESOURCES ARE ALLOWED.
     * YOU CAN NOT WORK COLLABORATIVELY!
     * Each method is worth 20 points.
     *           10 pts for Following Instructions & Accuracy
     *           5 pts for method code that Compiles
     *           5 pts for Javadoc notation/commenting
     */

     /* returns the first, last and number of digits of an integer
     @param n integer value
     @return an array with the first, last and number of digits
     */
     public static int[] number1(int n)
     {
        int[] result = new int[3];
        int count = 1;
        int value = n;
        int rem = value % 10;;
        result[1] = rem;
        while (value > Math.abs(9))
        {
            count++;
            rem = value % 10;
            value = value/10;
        }
        result[0] = value;
        result[2]= count;
        return result;
    }

    /** determine the middle character/letter(s) of a string returns it
    * @param str Initial String
    * @return a one or two character String of the middle charachter
    */
    public static String number2(String str)
    {
      if (str.length() == 0)
        return "";
      else if ( (str.length()%2) == 1 ) // then the string length is odd
      {
          int midindex = str.length()/2;
          return str.substring( midindex, midindex+1);
      }
      else  // then the string length is even
      {
          int midindex = str.length()/2;
          return str.substring(midindex -1, midindex +1);
      }

    }

    /** returns the count of the vowels in the string
    * @param str String to be inputted
    * @return integer count of vowels in the string
    */
    public static int number3(String str)
    {
      if (str.length() == 0)
        return 0;
      else
      {
        int count = 0;
        for (int i=0; i < str.length(); i++)
        {
          String s = str.substring(i,i+1);
          if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")
            || s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O")|| s.equals("U"))
            count++;
        }
        return count;
      }
    }

    /**  returns the alternating sum of numbers in an array
     * @param arr an integer array
     * @return a integer sum
  */
  public static int number4(int[] arr)
  {
      int s = arr.length;
      if (s == 0)
      {
        return 0;
      }
      else
      {
        int sum = 0;
        for (int i=0; i < s; i++)
        {
            if (i%2 == 0) // even position, so add
              sum += arr[i];
            else        // odd position, so subtract
              sum -= arr[i];
        }
        return sum;
      }
  }


   /** checks whether two arrays have the same elements in the same order
   * @param a an integer array
   * @param b an integer arrays
   * @return true if the elements are in the same order, false if not
   */
  public static boolean number5(int[] a, int[] b)
  {
    if (a.length != b.length)
         {
            return false;
         }

         for (int i = 0; i < a.length; i++)
         {
            if (a[i] != b[i])
            {
               return false;
            }
         }
         return true;
  }

  /** Checks if two arrays have the same elements (ignoring duplicates
  * @param a an integer arra
  * @param b an integer arra
  * @return true if the elements are the same
  **/
  public static boolean number6(int[] a, int[] b)
  {
    for (int i = 0; i < a.length; i++)
         {
            if (!number6helper(a[i],b))
            {
               return false;
            }
         }
         for (int i = 0; i < b.length; i++)
         {
            if (!number6helper(b[i],a))
            {
               return false;
            }
         }
         return true;
  }

  /** checks if an element is in an array
  * @param val element to be checked if in arrays
  * @param arr array that is used to look or element value
  * @return true if the element in in the arrays
  **/
  public static boolean number6helper(int val, int[] arr)
  {

    for (int i=0; i< arr.length; i++)
    {
        if (arr[i] == val)
        {
          return true;
        }
    }
    return false;
  }


/** Returns the standard deviation of an array of integers
* @param arr an integer array
* @return the standard deviation of the entries in the arrays
*/
  public static double number7(int[] arr)
  {
    if (arr.length > 0)
    {
      int sum = 0;
      for (int i=0; i<arr.length; i++)
      {
        sum += arr[i];
      }
      double xbar = (sum*1.0)/arr.length;

      double SUM = 0, diff = 0;
      for (int i=0; i< arr.length; i++)
      {
        diff = Math.pow((arr[i]-xbar),2);
        SUM += diff;
      }
      return SUM / (arr.length-1);
    }
    else
    {
      return 0;
    }
  }

  /** Prints the average, min, max and range of values of an array
  * @param arr an integer array
  */
  public static void number8(int[] arr)
  {
    if (arr.length > 0)
    {
      int sum = 0, themin = arr[0], themax = arr[0];
      for (int i=0; i < arr.length; i++)
      {
          sum += arr[i];
          if (arr[i] < themin)
            themin = arr[i];
          if (arr[i] > themax)
            themax = arr[i];
      }
      System.out.print( (sum*1.0)/arr.length + ",   ");
      System.out.print( themin + ",   ");
      System.out.print( themax + ",   ");
      System.out.println( (themax -themin) + ". ");
    }
    else
    {
      System.out.println("No entries, thus no average, min, max or range.");
    }
  }

/** Returns a reverse StringBuilder
* @param str a String
* @return a reversed String
**/
  public static String number9(String str)
  {

    if (str.length() > 0)
    {
      if (str.length() == 1)
      {
        return str;
      }
      else
      {
        String rstr = str.substring(str.length()-1);
        for (int i=str.length()-2; i>=0; i--)
        {
          rstr = rstr + str.substring(i,i+1);
        }
        return rstr;
      }
    }
    return ""; //empty string passed
  }

  /** Returns a string with stars to replace certain characters
  * @param str A string with the original characters
  * @param stars[] a String array with charachters to be starred
  * @return a string with the characters/string sin stars[] replaced with *
  **/
  public static String number10(String str, String[] stars)
  {
    if (str.length()== 0) // If str is empty, then return empty string
    {
      return "";
    }
    else
    {
      if (stars.length == 0) // if stars is empty, then return original str
      {
        return str;
      }
      else    // if stars is not empty, then process the stars array
      {
        String newstr ="";
        for (int i = 0; i<stars.length; i++)
        {
          String s = stars[i];
          int slength = s.length();
          String addstars ="*";
          if (slength > 1)    // if slength is more than 1, then add numbers of stars
          {
            for (int k=1; k<slength; k++)
            {
              addstars = addstars + "*";
            }
          }
          for (int j=0; j < str.length(); j++)
          {
            String scheck="";
            if (j+slength < str.length())
            {
                scheck = str.substring(j,j+slength);
            }
            else
            {
                scheck = str.substring(j);
            }
            if (scheck.equals(s))
            {
              newstr = newstr + addstars;
            }
            else
            {
              if (newstr.length() < str.length())
              {
                newstr = newstr + scheck;
              }
            }
            if ( (j+slength-1) < str.length())
            {
              j=j+slength-1;
            }
            else
            {
              j = str.length() - 1;
            }
          }
          str = newstr;
        }
        return newstr;
      }
    }
  }
  public static void main(String[] args)
  {
  /* Before submission, Uncomment the lines below
  * ONLY for the number methods you decided to code */

  number1Tester();
  number2Tester();
  number3Tester();
  number4Tester();
  number5Tester();
  number6Tester();
  number7Tester();
  number8Tester();
  number9Tester();
  number10Tester();

  }

  /* Don't modify/touch anything below this */
  public static void number1Tester()
  {

    System.out.println("Number1 Tester: First Digit, Last Digit, Total Number of Digits: ");
    int[] result1 = number1(1729);
    System.out.print("1.1: inputted number1(1729) : ");
    for (int i = 0; i < result1.length; i++)
    {
      System.out.print(result1[i] + ", ");
    }
    System.out.println("");

    int[] result2 = number1(29847314);
    System.out.print("1.2: inputted number1(29847314) : ");
    for (int i = 0; i < result2.length; i++)
    {
      System.out.print(result2[i] + ", ");
    }
    System.out.println("");
  }
  public static void number2Tester()
  {
    System.out.println("Number2 Tester: Returns the middle charachter : ");
    System.out.print("2.1: inputted number2(middle) ... should return dd: ");
    System.out.println(number2("middle"));
    System.out.print("2.2: inputted number2(themiddle) ... should return i: ");
    System.out.println(number2("themiddle"));
  }
  public static void number3Tester()
  {
    System.out.println("Number3 Tester: Returns the Vowel count of a string : ");
    System.out.println("3.1: inputted number3(middle) ... should return 2: " + number3("middle"));
    System.out.println("3.2: inputted number3(thEmiddleEOuo) ... should return 7: " + number3("thEmiddleEOuo"));
  }
  public static void number4Tester()
  {
    System.out.println("Number4 Tester: Returns an alternating sum of integers in an array : ");
    int[] t1 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] t2 = {-1, -1, -1, -1, -1, -1, -1, -1};
    System.out.println("4.1: inputted number4({1, 4, 9, 16, 9, 7, 4, 9, 11}) ... should return 2: " + number4(t1));
    System.out.println("4.2: inputted number4({-1, -1, -1, -1, -1, -1, -1, -1}) ... should return 2: " + number4(t2));
  }
  public static void number5Tester()
  {
    System.out.println("Number5 Tester: tests if arrays have values in the same order : ");
    int[] t1 = {1, 1, 1, 2, 3, 3, 3, 3, 4};
    int[] t2 = {1,2,3,4};
    int[] t3 = {1, 1, 1, 2, 3, 3, 3, 4, 5};
    int[] t4 = {1, 1, 1, 2, 3, 3, 3, 3, 4};
    System.out.println("5.1: compare {1,1,1,2,3,3,3,4} and {1,2,3,4} ... should return false: " + number5(t1, t2));
    System.out.println("5.2: compare {1,1,1,2,3,3,3,4} and {1,1,1,2,3,3,3,4,5} ... should return false: " + number5(t1, t3));
    System.out.println("5.3: compare {1,1,1,2,3,3,3,4} and {1,1,1,2,3,3,3,3,4} ... should return true: " + number5(t1, t4));
  }
  public static void number6Tester()
  {
    System.out.println("Number6 Tester: tests if arrays have values in the same order : ");
    int[] t1 = {1, 1, 1, 2, 3, 3, 3, 3, 4};
    int[] t2 = {1,2,3,4};
    int[] t3 = {1, 1, 1, 2, 3, 3, 3, 4, 5};
    int[] t4 = {1, 1, 1, 2, 3, 3, 3, 3, 4};
    System.out.println("6.1: compare {1,1,1,2,3,3,3,4} and {1,2,3,4} ... should return true: " + number6(t1, t2));
    System.out.println("6.2: compare {1,1,1,2,3,3,3,4} and {1,1,1,2,3,3,3,4,5} ... should return false: " + number6(t1, t3));
    System.out.println("6.3: compare {1,1,1,2,3,3,3,4} and {1,1,1,2,3,3,3,3,4} ... should return true: " + number6(t1, t4));
  }
  public static void number7Tester()
  {
    System.out.println("Number7 Tester: Returns the standard deviation of an array of integers : ");
    int[] t1 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] t2 = {-1, -1, -1, -1, -1, -1, -1, -1};
    System.out.println("7.1: inputted number7({1, 4, 9, 16, 9, 7, 4, 9, 11}) ... should return 19.6: " + number7(t1));
    System.out.println("7.2: inputted number7({-1, -1, -1, -1, -1, -1, -1, -1}) ... should return 0: " + number7(t2));

  }
  public static void number8Tester()
  {
    System.out.println("Number8 Tester: Prints the average,min,max, and range of an array of integers : ");
    int[] t1 = {1, 4, 9, 16, 9, 7, 4, 9, 11};
    int[] t2 = {-1, -1, -1, -1, -1, -1, -1, -1};
    System.out.println("8.1: inputted number8({1, 4, 9, 16, 9, 7, 4, 9, 11}) ... should print 7.77, 1, 16, 15: ");
    number8(t1);
    System.out.println("8.2: inputted number8({-1, -1, -1, -1, -1, -1, -1, -1}) ... should print -1,-1,-1,0: ");
    number8(t2);

  }
  public static void number9Tester()
  {
    System.out.println("Number9 Tester: Returns the reverse string: ");
    System.out.print("9.1: inputted number9(Harry) ... should return yrraH: ");
    System.out.println(number9("Harry"));
    System.out.print("9.2: inputted number9(The Middle) ... should return elddiM ehT: ");
    System.out.println(number9("The Middle"));
  }
  public static void number10Tester()
  {
    System.out.println("Number10 Tester: Returns the string with stars for certain characters: ");
    String[] s1 = {"a", "rr"};
    String[] s2 = {"y", "ber"};
    System.out.print("10.1: inputted number10(Harry, {a,rr}) ... should return H***y: ");
    System.out.println(number10("Harry", s1));
    System.out.print("10.2: inputted number10(Kymberly, {y,ber}) ... should return K*m***l*: ");
    System.out.println(number10("Kymberly", s2));
  }
}
