
// Write and run Java online using this editor.

      public class Main {

            public static int maxSubArrayBF(int[] input) {
                int max =  Integer.MIN_VALUE;
                int n = input.length;

                for(int start = 0; start < n; start++) {
                    int runningSum = 0;
                    for(int range = start; range < n; range++) {
                        runningSum += input[range];
                        if (runningSum > max) {
                            max = runningSum;
                        }
                    }
                }

                return max;
            }

            // function maxSumWindow(arr, k): 
            // windowSum = sum of first k elements 
            //      maxSum = windowSum  
            // for right = k to arr.length - 1: 
            // windowSum = windowSum - arr[right - k] 
            // windowSum = windowSum + arr[right] 
            // maxSum = max(maxSum, windowSum)  
            // return maxSum

            public static int slidingWindowWithFixedSize(int[] input, int k) {
                int max = 0;

                for(int i = 0; i < k; i++) {
                    max = max + input[i];
                }

                int windowSum = max ;

                // TIme Complexity - O(N)
                for(int i = k; i < input.length; i++) {
                    windowSum = windowSum - input[i - k];
                    windowSum = windowSum + input[i];
                    max = Math.max(max, windowSum );
                }

                return max;
            }

            public static void main(String[] args) {
                int[] input = {44, 21, 30, 31, 20};
                System.out.println("Output = " + slidingWindowWithFixedSize(input, 2));
            }
        }

   
        







