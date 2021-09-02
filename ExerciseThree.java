class E3{
    public static double mean(int [] vector){
        float promedio = 0;
        
        int s = 0;
        
        for (int i = 0; i < vector.length; i++){
            s = s + vector[i];
            promedio = (float) s / vector.length;
        }
        return promedio;
    }
}
