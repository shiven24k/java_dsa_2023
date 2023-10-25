public class factors {
    public static void main(String[] args) {   
        int num =34;   
        for(int j =2 ;j<=100;j++){ 
                while(num%j==0){
                    System.out.println(j);
                    num=num/j;
                }
                
              
            }
             
       }
}
