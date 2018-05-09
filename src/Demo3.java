/**
 * Created by Administrator on 2018/3/9.
 */
public class Demo3
{
    public static void main(String[] args)
    {


    int[] arr=new int[3];

        try
        {
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
        }
    }


}

