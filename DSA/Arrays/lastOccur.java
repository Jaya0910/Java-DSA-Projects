class lastOccur{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int target = 3;
        int lastIndex = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                lastIndex = i;
            }
        }

        if(lastIndex != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}