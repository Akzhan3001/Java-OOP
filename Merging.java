public class Merging {
    public static void main(String [] args){
        new Merging().runApp();
    }
    void runApp(){
        int[] a = {1, 6, 11, 12};
        int[] b = {3, 5, 7, 9, 10};
        int[] c = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) {
                c[k]=a[i];
                i++;
                k++;
            }
            else {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        for(int n=0;n<c.length;n++){
            System.out.print(c[n]+" ");
        }
    }
}
