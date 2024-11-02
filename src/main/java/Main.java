public class Main {
    public static void main(String[] args) {
        ArrayRunning arrayRunning = new ArrayRunning();
        try {
            String[][] invalidDataArray = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "строка", "12"},
                    {"13", "14", "15", "16"}
            };
            arrayRunning.runArray(invalidDataArray);

        } catch (MyArraySizeException | MyArrayDataException exception){
            exception.printStackTrace();
        }
    }
}

