package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.io.File;
import java.math.BigInteger;
import java.math.BigDecimal;
// Zadanie 1
// a)
//public class Main {
//
//    public static  int countChar(String str,char c)
//    {
//        int wynik=0;
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==c)
//            {
//                wynik++;
//            }
//        }
//
//        return wynik;
//    }
//
//    public static void main(String[] args) {
//
//        String napis="czubackaz";
//        char c= 'c';
//        System.out.print("W napisie "+napis+ " litera "+c +" występuje w nim następującą ilość razy: "+countChar(napis,c));
//
//
//
//    }
//}
// b)
//public class Main {
//
//    public static  int countSubStr(String str,String substr)
//    {
//        int j=0;
//        int ciag=0;
//        int wynik=0;
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==substr.charAt(j))
//            {
//               ciag++;
//               j++;
//            }
//            else
//            {
//                ciag=0;
//                j=0;
//            }
//            if(ciag==substr.length())
//            {
//                wynik++;
//                ciag=0;
//                j=0;
//            }
//        }
//
//        return wynik;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj pierwszy napis: \n");
//        String napis=scan.next();
//        System.out.print("Podaj drugi napis: \n");
//        String napis2=scan.next();
//        System.out.print("W napisie "+napis+ " napis "+napis2 +" występuje w nim następującą ilość razy: "+countSubStr(napis,napis2));
//
//
//
//    }
//}
// c)
//public class Main {
//
//    public static  String Middle(String str)
//    {
//
//        String wynik="";
//
//            if(str.length()%2==0)
//            {
//                wynik+=str.charAt(str.length()/2-1);
//                wynik+=str.charAt(str.length()/2);
//
//
//            }
//            else
//            {
//                wynik+=str.charAt(str.length()/2);
//
//
//
//            }
//
//
//return wynik;
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: \n");
//        String napis=scan.next();
//
//        System.out.print(Middle(napis));
//
//
//
//    }
//}
// d)
//public class Main {
//
//    public static  String repeat(String str, int n)
//    {
//
//        String wynik="";
//
//        for(int i=0;i<n;i++)
//        {
//            wynik+=str;
//        }
//
//        return wynik;
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: \n");
//        String napis=scan.next();
//
//        System.out.print(repeat(napis,3));
//
//
//
//    }
//}
// e)
//public class Main {
//
//    public static  int[] Where(String str,String substr)
//    {
//        int j=0;
//        int ciag=0;
//        int x=0;
//        int wynik[]=new int[str.length()];
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==substr.charAt(j))
//            {
//               ciag++;
//               j++;
//            }
//            else
//            {
//                ciag=0;
//                j=0;
//            }
//            if(ciag==substr.length())
//            {
//                wynik[x]=i;
//                x++;
//                ciag=0;
//                j=0;
//            }
//        }
//
//        return wynik;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj pierwszy napis: \n");
//        String napis=scan.next();
//        System.out.print("Podaj drugi napis: \n");
//        String napis2=scan.next();
//        int tab[] = new int[napis.length()];
//        tab=Where(napis,napis2);
//        for(int i=0;i<napis.length();i++)
//        {
//            System.out.print(tab[i]);
//        }
//    }
//}
// f)
//public class Main{
//    public static String Change(String str)
//    {
//
//        StringBuffer sb = new StringBuffer();
//
//        for(int i=0;i<str.length();i++)
//
//            if(Character.isUpperCase(str.charAt(i)))
//            {
//               sb.append(Character.toLowerCase(str.charAt(i))) ;
//            }
//            else
//                sb.append((Character.toUpperCase(str.charAt(i))));
//
//        return sb.toString();
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: ");
//        String napis= scan.next();
//        System.out.print(Change(napis));
//
//    }
//}
//g)
//public class Main{
//    public static String nice(String str)
//    {
//
//        StringBuffer sb = new StringBuffer();
//
//
//        for(int i=0;i<str.length();i++)
//
//            if(i%3==0)
//            {
//
//                sb.append(str.charAt(i));
//                sb.append("'") ;
//            }
//            else
//                sb.append(str.charAt(i));
//        return sb.toString();
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: ");
//        String napis= scan.next();
//        System.out.print(nice(napis));
//
//
//    }
//}
//public class Main{
//    public static String nice(String str,char sep,int poz)
//    {
//
//        StringBuffer sb = new StringBuffer();
//
//
//        for(int i=0;i<str.length();i++)
//
//            if(i%poz==0)
//            {
//
//                sb.append(str.charAt(i));
//                sb.append(sep) ;
//            }
//            else
//                sb.append(str.charAt(i));
//        return sb.toString();
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: ");
//        String napis= scan.next();
//        char sep='/';
//        int poz=5;
//        System.out.print(nice(napis,sep,poz));
//
//
//    }
//}
// 4.
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj n: \n");
//        String n=scan.next();
//        int x=Integer.parseInt(n);
//        BigInteger y=new BigInteger("1");
//        BigInteger wynik=new BigInteger("0");
//        BigInteger dwa=new BigInteger("2");
//        for(int i=1;i<x*x;i++)
//        {
//            y=y.multiply(dwa);
//            wynik=wynik.add(y);
//
//
//        }
//
//        System.out.print(wynik);
//
//
//
//    }
//}
//5.
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj lata oszczedzania: \n");
        String n_=scan.next();
        System.out.print("Podaj kapital poczatkowy: \n");
        String k_=scan.next();
        System.out.print("Podaj oprocentowanie: \n");
        String p_=scan.next();
        BigDecimal n=new BigDecimal(Integer.parseInt(n_));
        BigDecimal k=new BigDecimal(Integer.parseInt(k_));
        BigDecimal p=new BigDecimal(Integer.parseInt(p_));
        BigDecimal wynik=new BigDecimal("0");
        BigDecimal one=new BigDecimal("1");
        BigDecimal sto=new BigDecimal("100");
        wynik = k.multiply(one.add(p.divide(sto))).pow(Integer.parseInt(n_));




        System.out.print(wynik);



    }
}
