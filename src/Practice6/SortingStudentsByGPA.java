package Practice6;

public class SortingStudentsByGPA {

    private static void quicksort(Comparable[] comparables, int low, int high) {
        int i = low, j = high;
        Comparable comp = comparables[low + (high - low) / 2];

        while (i <= j) {
            while (comparables[i].compareTo(comp) > 0) {
                i++;
            }
            while (comparables[j].compareTo(comp) < 0) {
                j--;
            }

            if (i <= j) {
                Comparable tmp = comparables[i];
                comparables[i] = comparables[j];
                comparables[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(comparables, low, j);
        if (i < high)
            quicksort(comparables, i, high);
    }


    public static void sort(Comparable[] list) {
        quicksort(list,0,list.length - 1);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов", 3),
                new Student("Петров", 5),
                new Student("Сидоров", 4),
        };
        sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
