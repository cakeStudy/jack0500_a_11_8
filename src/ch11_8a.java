import java.util.HashSet;
import java.util.Set;

public class ch11_8a
{
    /*Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest
    string in the list. If your method is passed an empty set, it should return 0.*/
    
    public void run()
    {
        Set<String> set = new HashSet<>();
        set.add("kage");
        set.add("lagkage");
        set.add("slikepind");
        set.add("is");
        set.add("sodavand");
        set.add("chips");

        System.out.println(minLength(set));
    }

    public int minLength(Set<String> set)
    {
        int minLength = 0;
        String minString = "aaaaaaaaaaaaaaaaaaaaaaaa";
        if (set.size() == 0)
        {
            return minLength;
        }else
        {
            for (String string: set)
            {
               if (string.length() < minString.length())
               {
                   minString = string;
               }
            }
            minLength = minString.length();
        }
        return minLength;
    }
}
