class firstOccur {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int target = 3;
        int firstIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                firstIndex = i;
                break;
            }
        }

        if (firstIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}