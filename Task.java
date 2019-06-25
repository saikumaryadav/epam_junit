package task;
public class Task {
static int c=0,c1=0;

public String char2(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        int n=s.length();
        if(n>=2)
        {
            for(int i=0;i<2;i++)
            {
                if(sb.charAt(i)=='A')
                {
                c++;
                }
            }
            if(c==2 && n==2)
            {
            return "sai"; // if total 2character string will become null  i set it as a "sai"
            }
           if(sb.charAt(0)=='A')
           {
                    sb.deleteCharAt(0);
                    c1=1;
            }
            if(c1!=1)
            {
                if(sb.charAt(1)=='A')
                {
                    sb.deleteCharAt(1);
                }
            }
            if(c1==1)
            {
                if(sb.charAt(0)=='A')
                {
                    sb.deleteCharAt(0);
                }
            }
        }
        return sb.toString();
    }
}
    
    
