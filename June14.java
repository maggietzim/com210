package june14;

public class June14 {

    public static void main(String[] args) {
    
//#3
        int x=20;
        if ((x>40)||(x<10))
        {
            System.out.println("Number out of bounds.");
        }
        else
        {
            if (x%2==0)
            {
                System.out.println("Number is in bounds and even.");
            }
            else
            {
                System.out.println("Number is in bounds and odd.");
            }
        }
//#5    
        for (int i=0; i<2; i++)
        {
            for (int j=0; j<2; j++)
            {
                System.out.println(i+" "+j);
            }
        }
       
//#6
    String[] B= new String[]{"eggs", "cereal", "toast", "bacon"};
    int[] I= new int[]{10, 20, 30, 40};
    System.out.println(B[2]);
    System.out.println(I[3]);
    B[1]= "oatmeal";
    for (int j=0; j<B.length; j++)
    {
        System.out.println(B[j]);
    }
    int sum=0;
    for (int j=0; j<I.length; j++)
    {
      sum= sum+ I[j];
    }
    System.out.println(sum);
    
    for (int j=0; j<B.length; j++)
    {
        for (int k=0; k<I.length; k++)
        {
            System.out.println(B[j] + I[k]);
        }
    }   
    }
}