public class Day1{
    public static void main(String arg[]){
        int[] list={12,13,2,44};
        for(int i=0; i<list.length; i++){
            if(list[i+1]<list[i]){
                int temp=list[i];
                list[i]=list[i+1];
                list[i+1]=temp;
            }
        }
        System.out.println(list.length-1);
    }
}
