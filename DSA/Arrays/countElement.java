class countElement {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 10, 15};
        int target = 10;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
              t=t+1;
            }
             
            
        }

        System.out.println("Count of element is: " + t);
    }
}
