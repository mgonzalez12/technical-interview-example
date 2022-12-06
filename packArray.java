/*  
Given an array of 2k integers (for some integer k, which will be betwen 0 and 5 inclusive), perform the following operations until the array contains only one element:

On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
After the algorithm has finished, there will be a single element left in the array. Return that element
*/

 public static int packArray(ArrayList<Integer> integers) {
    
    // Keep track of whether we need to sum or multiply
        // the elements in each iteration
        boolean sum = true;

        // Keep looping until the array contains only one element
        while (integers.size() > 1) {
            // Create a new list to store the results of the current iteration
            ArrayList<Integer> result = new ArrayList<>();

            // Loop through the array in pairs
            for (int i = 0; i < integers.size() - 1; i += 2) {
                // Get the two elements we are currently working with
                int a = integers.get(i);
                int b = integers.get(i + 1);

                // If we need to sum the elements, do that and add the result
                // to the result list. Otherwise, multiply the elements and
                // add the result to the result list.
                if (sum) {
                    result.add(a + b);
                } else {
                    result.add(a * b);
                }
            }

            // Replace the original array with the result of the current iteration
            integers = result;

            // Flip the value of the sum flag to prepare for the next iteration
            sum = !sum;
        }

        // Return the remaining element
        return integers.get(0);
    }