import javax.print.DocFlavor;
import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class ProblemSet9 {


    public int[] evenOdd(int[] arr) {
        int count = 0;
        if(arr == null){
            return null;
        }

        int[] evenOddOut = new int[arr.length];
        for (int i = 0;i < arr.length; i++ ){

            if (arr[i] % 2 == 0){
                 evenOddOut[count] = arr[i];
                 count++;
            }
        }
        for (int i = 0;i < arr.length; i++ ){
            if (arr[i] % 2 != 0){
                evenOddOut[count] = arr[i];
                count++;
            }
        }
        return evenOddOut;
    }

    public int[] notAlone(int[] arr, int alone) {
        if (arr == null || arr.length == 0){
            return null;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == alone){

                if(i == 0 || i == arr.length-1){
                }else if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                    if (arr[i-1] > arr[i+1]){
                        arr[i] = arr[i-1];
                    }else{
                        arr[i] = arr[i+1];
                    }

                }
            }
        }
        return arr;
    }

    public int[] shiftLeft(int[] arr) {
        if (arr == null){
            return null;
        }
        int[] leftShifted = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            if(i==0){
                leftShifted[arr.length-1] = arr[0];
            }else{
                leftShifted[i-1] = arr[i]; ///MIGHT NEED TO ADJUST THE RUN TIME TO GET PROPER NUMBERS
            }
        }
        return leftShifted;
    }

    public int[] fillIn(int start, int end) {
        if (start > end){
            return null;
        }else{
            int[] filled = new int[end - start];
            for(int i = 0; i < filled.length; i++){
                filled[i] = start + i;
            }
            return filled;
        }
    }

    public boolean triple(int[] arr) {
        int count = 0;

        if(arr == null){
            return false;
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 3){
                    count++;
                }
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }

    public int pairs(int[] a, int[] b) {
        int count = 0;
        int temp = 0;

        if(b == null || a == null || a.length != b.length){
            return -1;
        }else{
            for(int i = 0; i < a.length; i++){
                {
                    temp = a[i] - b[i];
                    if (temp != 0 && temp >= -2 && temp <= 2){
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public boolean twentyFour(int[] arr) {
        boolean fourFour = false;
        boolean twoTwo = false;

        if(arr == null || arr.length == 1){
            return false;
        }else{
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i] == 2 && arr[i+1] == 2){
                    twoTwo = true;
                }
                if(arr[i] == 4 && arr[i+1] == 4){
                    fourFour = true;
                }
            }
            if (twoTwo && fourFour){
                return false;
            }else if (twoTwo){
                return true;
            }else if (fourFour){
                return true;
            }
        }
        return false;
    }

    public boolean fourteen(int[] arr) {

        if(arr == null){
            return false;
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 1 && arr[i] != 4){
                return false;
            }
        }
        return true;
    }

    public int centeredAverage(int[] arr) {
        if(arr == null || arr.length < 3){
            return -1;
        }
        int largest = arr[0];
        int smallest = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
            sum += arr[i];
        }
        sum -= (largest + smallest);
        sum /= (arr.length-2);
        return sum;
    }

    public int outliers(int[] arr) {

        if(arr == null || arr.length < 1){
            return -1;
        }
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        largest = largest-smallest;
        return largest;
    }
}
