public class Twopointers {
    // Online Java Compiler (Editor)
// Write and run Java online using this editor.



        public static int[] findTwoNumsTwoPointers(int[] input, int target) {
            int N = input.length;
            int[] output = new int[2];
            int left = 0;
            int right = N - 1;

            while(left < N && left <= right && right >= left) {
                int sum = input[left] + input[right];
                System.out.println(left + " " + right + " " + sum);
                if(sum == target) {
                    output[0] = left;
                    output[1] = right;
                    return output;
                } else if (sum < target) {
                    left = left + 1;
                } else {
                    right = right - 1;
                }
            }

            return output;
        }

        public static void main(String[] args) {
            int[] input = {1, 2, 3, 5, 9, 12};
            int[] output = findTwoNumsTwoPointers(input, 10);

            for(int i: output) {
                System.out.println(i);
            }
        }
    }



