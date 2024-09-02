public class FunctionSort {

    public static Double[] bubbleSort(Double[] xDoubles){
        int n = xDoubles.length;
        for (int z = 0; z < n; z++){
            for(int j = 0; j < n - z - 1 ; j++){
                if(xDoubles[j] > xDoubles[j + 1]){
                    double temp = xDoubles[j];
                    xDoubles[j] = xDoubles[j + 1];
                    xDoubles[j + 1] = temp; 
                }
            }
        }
        return xDoubles;
    }
}