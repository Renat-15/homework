public class ArrayRunning {
    public void runArray(String[][] array) throws MyArraySizeException, MyArrayDataException{
        if(array.length != 4 || array[0].length != 4){ // Если массив не соответствует размеру 4х4
            throw new MyArraySizeException("Ошибка: размер массива должен быть 4х4"); // То выбрасывается это исключение
        }

        int[][] intArray = new int[4][4]; // Сам массив
        int sum = 0; // Сумма элементов массива

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                try{
                    intArray[i][j] = Integer.parseInt(array[i][j]); // Добавление в массив элемента
                    sum+=intArray[i][j]; // Суммирование
                } catch (NumberFormatException e){ // NumberFormatException - неверное преобразование символьной строки в числовой формат
                    throw new MyArrayDataException("Ошибка: неверные даннные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        System.out.println("Массив успешно создан: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}

