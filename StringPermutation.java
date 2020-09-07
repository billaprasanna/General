public class StringPermutations {

    public static void main(String[] args) {
        StringPermutation("", "ABCD");
        System.out.println(palindrome("civic"));
    }
    private static void StringPermutation(String permutation, String input)
    {
        if(input.length() == 0)
        {
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1));
            }
        }
    }

    public static boolean palindrome(String str) {
        int n = str.length();
        if (n < 2) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == str.charAt(n - (i+1))) {
            }
            else
                return  false;
        }
        return true;
    }

      public static int nonrepeatingElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j;
            for ( j = 0; j < array.length; j++)
                if (i != j && array[i] == array[j])
                        break;
                    if (j == array.length)
                        return array[i];
                }

        return -1;
    }
   }
