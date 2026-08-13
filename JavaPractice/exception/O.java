class O{
    public static void main(String[] args){
        int[] arr = new int[5];
        try{
            arr[10] = 100;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds.");
        }
    }
}