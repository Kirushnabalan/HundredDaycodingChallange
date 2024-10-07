public class ListAdding{
    public static void list(){
        String[] list1={"2","5","5"};
        String[] list2={"5","6","7"};
        String temp="";
        String temp1="";
        for(int i = 0;i<list1.length;i++ ){
            temp+=list1[i];
        }
        for(int i = 0;i<list2.length;i++ ){
            temp1+=list2[i];
        }

        int temp2 = Integer.parseInt(temp) + Integer.parseInt(temp1); // assume temp2 = 256
        String temp2Str = String.valueOf(temp2); // convert the integer to a string
        
        // Create an array to store the digits
        int[] digits = new int[temp2Str.length()];
        
        // Iterate over the string and convert each character to an integer
        for(int i = 0; i < temp2Str.length(); i++){
            digits[i] = Character.getNumericValue(temp2Str.charAt(i));
        }
        
        // Now the digits array contains [2, 5, 6]
        
        System.out.println(digits);
    }
    
    public static void main(String args[]){
        ListAdding.list();
    }
}