class E6{
    public static String join(char [] vector){
        String vectorConcatenado = "";
        
        for (int i = 0; i <= vector.length-1; i++)
        
            vectorConcatenado = vectorConcatenado+(char)(vector[i]);
        
        
        return vectorConcatenado;
    }
}
