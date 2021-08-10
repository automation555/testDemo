
public class ImproperValidationOfArrayIndex{
    static int badCase(int data1) throws Throwable{
        int array[] = { 0, 1, 2, 3, 4 };
        // EMB-ISSUE: CodeIssueNames.IMPROPER_VALIDATION_OF_ARRAYINDEX
        if (data1 < array.length)
        {
            System.out.println(array[data1]);
        }
        return data1;
    }

    static int badCase1(int data1) throws Throwable{
        int array[] = { 0, 1, 2, 3, 4 };
        // EMB-ISSUE: CodeIssueNames.IMPROPER_VALIDATION_OF_ARRAYINDEX/no-detect
        if (data1 >= 0) {
            if (data1 < array.length) {
                System.out.println(array[data1]);
            }
            return data1;
        }
    }

    static int goodCase(int data) throws Throwable{
        int array[] = { 0, 1, 2, 3, 4 };
        // EMB-ISSUE: CodeIssueNames.IMPROPER_VALIDATION_OF_ARRAYINDEX/no-detect
        if (data >= 0 && data < array.length)
        {
            System.out.println(array[data]);
        }
        else
        {
            System.out.println("Array index out of bounds");
        }
        return data;
    }

    public static void main(String args[]) throws Throwable {
        int n = badCase(-1);
        int m = goodCase(4);
    }
}
