public class SortOfSort {
    static void sortOfSort(int[] numbers){

        for(int i = 0; i < numbers.length; i++){
            for(int k = 0; k < numbers.length; k++){
                if(numbers[i] > numbers[k]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[k] = temp;
                    //System.out.print(temp + " ");
                }
            }
            //System.out.println();

            //System.out.print(numbers[i]);
        }
        int [] A = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[A[i]-1];
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 7, 1, 3, 0, 9, 6, 5};
        sortOfSort(numbers);
    }
}

}
