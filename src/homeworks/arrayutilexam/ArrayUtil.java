package homeworks.arrayutilexam;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {5, 30, -8, 2, 58, 71, 11, 27, -45, 9};

        //Տպեք մասիվի բոլոր էլեմենտները,
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println();

        //Տպեք մասիվի ամենամեծ թիվը,
        System.out.print("Array largest number: ");
        int arrIndex = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arrIndex){
                arrIndex = arr[i];
            }
        }
        System.out.println(arrIndex);


        //Տպեք մասիվի ամենափոքրը թիվը,
        System.out.print("Array smallest number: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arrIndex){
                arrIndex = arr[i];
            }
        }
        System.out.println(arrIndex);

        //Տպեք մասիվի բոլոր զույգ էլեմենտները + քանակը
        System.out.print("Array pair elements and count: ");
        int countElem = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                countElem++;
                System.out.print(arr[i] + "  ");
            }
        }
        System.out.println(":Count pair number in array(" + countElem + ")");

        countElem = 0;

        //Տպեք մասիվի բոլոր կենտ էլեմենտները + քանակը
        System.out.print("Array odd elements and count: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                countElem++;
                System.out.print(arr[i] + "  ");
            }
        }
        System.out.println(":Count odd number in array(" + countElem + ")");

        countElem = 0;

        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        System.out.print("Array average number: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            countElem++;
        }
        System.out.println(sum / countElem);
        System.out.println("Sum of the elements in array: " + sum);
    }
}
