import java.util.Arrays;

class E4{
    public static int [] ordenamientoPersonalizado(int [] vector){
        
        int[] vectorOrdenado = new int[vector.length];
        
        Arrays.sort(vector,0,vector.length/2);
        
        for (int i = vector.length/2; i < vector.length; i++) {
            int aux2;
            for (int k = vector.length/2; k < vector.length; k++) {
                if(vector[k] < vector[i]){
                    aux2 = vector[i];
                    vector[i] = vector[k];
                    vector[k] = aux2;
                }
            }
        }
        
        vectorOrdenado = vector;
        
        return vectorOrdenado;
    }
}
