public class java_generics {

    public static <T> void printArray(T[] arrays){
        for(T arr : arrays){
            System.out.println(arr);
        }
    }
    public static void main(String[] args) {
        Integer[] array1 = {1,2,3,4,5,6,7,8};
        String[] array2 = {"Shubham","Manu","Vaibhavi"};

        printArray(array1);
        printArray(array2);
    }
}
