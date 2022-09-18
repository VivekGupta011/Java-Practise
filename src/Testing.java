import java.util.Arrays;

/**
 *
 * @author Vivek Gupta
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String name="vivekGupta";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.replace('G','m'));
        System.out.println(name.length());
        
        // arrays
        int[] marks=new int[3];
        int[] data={44,55,55,645};
        marks[0]=129;
        marks[1]=55;
        marks[2]=235;
        for(int i=0;i<marks.length;i++){
        for(int j=0;j<data.length;j++){
            System.out.println("this is nested for loop:"+data[j] );         
        }
        Arrays.sort(marks);    
        System.out.println(marks[i]);
        }
        
    }
    
}