
package hi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Tags {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileReader f =new FileReader("C:\\Users\\Student\\Desktop\\input.txt");
        BufferedReader r = new BufferedReader(f);
        HashMap<String, HashMap<String, String>> tagMap = new HashMap<String, HashMap<String, String>>();
        Stack<String> stack = new Stack<String>();
        
        Stream<String> lines = r.lines();
        String line;
                
        while((line = r.readLine()) != null )
        {
        int start = line.indexOf('<');
        int end = line.indexOf('>');
        
            while(start != -1 && end != -1)
            {
        
            String content = line.substring(start+1, end);
            System.out.println(content);
        
            if(content.startsWith("/"))
            {
            content = content.substring(1);
            String pop = stack.pop();
            if(content.equals(pop) == false)
            {
               System.out.println(pop+" tag not closed properly");
               return;
            }
            }
            else{
            StringTokenizer st = new StringTokenizer(content);
            String tag = st.nextToken();
            stack.push(tag);
        
            HashMap<String, String> map = new HashMap<String, String>();
        
            while(st.hasMoreTokens())
            {
                String s = st.nextToken();
                String[] ar = s.split("=");
            
                if(ar[1].charAt(0) == '"')
                    ar[1] = ar[1].substring(1, ar[1].length()-1);
            
                map.put(ar[0], ar[1]);
            }
        
            tagMap.put(tag, map);
        
                    }
            line = line.substring(line.indexOf('>')+1);
            start = line.indexOf('<');
            end = line.indexOf('>');
            }
        
    }
        System.out.println("");
        
        for(HashMap.Entry<String, HashMap<String, String>> entry : tagMap.entrySet())
        {
            String tag = entry.getKey();
            HashMap<String, String> map = entry.getValue();
            System.out.println(tag);
            for(HashMap.Entry<String, String> e : map.entrySet())
            {
                System.out.print(e.getKey()+" : "+e.getValue()+" ");
            }
            System.out.println("");
        }
    }
    
}
