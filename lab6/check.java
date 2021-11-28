public class check {
    public static void main(String [] args){
        new check().runApp();
    }
    void runApp(){
        int num1 = 21;
        int num2 = 22;
        int num3 = 23;
        int[] a = {10, 11, 12, 13};
        int[] b = {30, 31, 32, 33};

        num3 = num1;
        num1 = num2;
        num2 = num3;

        a[2] = 42;
        b = a;
        b[0] = 40;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("n1: "+num1);
        System.out.println("n2: "+num2);
        System.out.println("n3: "+num3);
    }
}
