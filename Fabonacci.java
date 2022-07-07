public class Fabonacci {
    public static void main(String[] args){
        int a=0,b=1,num=10;
        int next;
        for(int i=0;i<10;i++){
            System.out.println(a+" ");
            next=a+b;
            a=b;
            b=next;
        }



    }
}
