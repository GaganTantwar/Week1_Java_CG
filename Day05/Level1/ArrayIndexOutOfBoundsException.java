class ArrayIndexOutOfBoundsException {
    
    // Method to generate an exception
    public static void generateException(int[] numArr) {
        System.out.println("Value of a Array at index : ");
        // This line will throw ArrayIndexOutOfBoundsException
        System.out.println(numArr[numArr.length]);
    }

    // Method to handle exceptions
    public static void handleException(int[] numArr) {
        try {
            // This line will throw ArrayIndexOutOfBoundsException
            System.out.println(numArr[numArr.length]);
        } catch (ArrayStoreException e) {
            // This block will not be executed as the exception is not ArrayStoreException
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // This block will catch the ArrayIndexOutOfBoundsException
            System.out.println(e.getMessage());
        }
    }

    // Main method
    public static void main(String args[]) {
        int[] numArr = {1, 2, 3, 4, 5};
        try {
            // Call method to generate exception
            generateException(numArr);
        } catch (Exception e) {
            System.out.print("Exception Generated: ");
            // Call method to handle exception
            handleException(numArr);
        }
    }
}
