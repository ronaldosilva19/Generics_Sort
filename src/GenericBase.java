
public class GenericBase {

    public static <T extends Comparable<T>>void Sort(T[] vector){
      T aux;
        for(int i = 0; i < vector.length - 1; i++){
            for(int j = 0; j < vector.length - i - 1; j++){
                if(vector[j].compareTo(vector[j + 1]) > 0){
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    public static<T> void PrintVector(T[] vector){
        System.out.print("[ ");
        for(T value : vector){
            System.out.print(value + " ");
        }
        System.out.println("]");
    }

}
