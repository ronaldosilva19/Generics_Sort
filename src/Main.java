
public class Main {
    public static void main(String[] args) {
       Double[] arrayD = {100.5, 40.7, 35.7, 23.5, 13.9};
       GenericBase.Sort(arrayD);
       GenericBase.PrintVector(arrayD);

       Integer[] arrayInt = {100, 99, 45, 23, 12, 0, 88};
       GenericBase.Sort(arrayInt);
       GenericBase.PrintVector(arrayInt);

       String[] string = {"Ronaldo", "Jose", "Carol", "Bruna", "Andressa", "Gaby"};
       GenericBase.Sort(string);
       GenericBase.PrintVector(string);

    }

}