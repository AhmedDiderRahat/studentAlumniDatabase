public class teste 
{
    public static void main(String args[])
    {
        char c1;
        String s1;
        s1 = "123";
        
        int cnt2 = 0, l = s1.length();
        for(int i=0; i<l; i++)
        {
            c1 = s1.charAt(i);
            if(c1>='0' && c1<='9')
                cnt2++;       
        }
        
        if( (cnt2 != l) )
        {
            System.out.println("False");
        }
        else
            System.out.println("true");
    }
}
