package Practice6;

public class MergeSort {
    public static void sortArr(Comparable[] arrA){
        if (arrA.length<2){
            return;
        }
        Comparable[] arrB = new Comparable[arrA.length/2];
        System.arraycopy(arrA,0,arrB,0,arrB.length);

        Comparable[] arrC = new Comparable[arrA.length - arrA.length / 2];
        System.arraycopy(arrA, arrB.length, arrC,0,arrC.length);

        sortArr(arrB);
        sortArr(arrC);
        System.arraycopy(mergeArr(arrB, arrC), 0, arrA, 0, arrA.length);
    }
    public static Comparable[] mergeArr(Comparable[] arrA, Comparable[] arrB){
        Comparable[] arrC = new Comparable[arrA.length+ arrB.length];
        int posA=0;
        int posB=0;

        for (int i=0; i<arrC.length;i++){
            if (posA==arrA.length){
                arrC[i]=arrB[posB];
                posB++;
            } else if (posB == arrB.length){
                arrC[i]=arrA[posA];
                posA++;
            } else if (arrA[posA].compareTo(arrB[posB])<0){
                arrC[i]=arrA[posA];
                posA++;
            } else {
                arrC[i]=arrB[posB];
                posB++;
            }
        }
        return arrC;
    }
    public static void main(String[] args){
        Student[] students = {
                new Student("Иванов", 3),
                new Student("Петров", 5),
                new Student("Сидоров", 4),
        };
        sortArr(students);
        for (Student s : students){
            System.out.println(s);
        }
    }
}
