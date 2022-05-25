package dictionary;

/*Problem Statement: – You are given a dictionary (a set of words). 
 *They will enter a set of characters you have to print all the words that c
 *an be formed using these characters.i.e
 * 
 		dict:- { “Rat”, “mat”, ”bat”, “chat”, “cat”, “tab”, “fab”, “batt” }
		chars:- t a b c
		output:- bat, cat, tab
 * 
 * 
*/
import java.util.*;
public class DictonaryWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		  String Dict[] = {"go", "bat", "me", "eat",
                  "goal", "boy", "run"} ;
		  String input=sc.nextLine();
		  HashSet<Character>letters=new HashSet<Character>();
		StringTokenizer st=new StringTokenizer(input," ");
		  while(st.hasMoreElements())
		  {
			  Character c=st.nextToken().charAt(0);
			  letters.add(c);
		  }
		
		for(String s:Dict)
		{
			if(isContainAllLetters(s,letters))
			{
				System.out.println(s);
			}
			//System.out.println("Remaining set "+set1 );
			
		}
		sc.close();
	}
	
	public static boolean isContainAllLetters(String s,HashSet<Character> set)
	{
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(!set.contains(c))
				{
					return false;
				}
			}
			return true;
			
			
	}

}

/*
 * 
 * 
// Java program to print all valid words that
// are possible using character of array
public class SearchDict_charArray {
     
    // Alphabet size
    static final int SIZE = 26;
     
    // trie Node
    static class TrieNode
    {
        TrieNode[] Child = new TrieNode[SIZE];
     
        // isLeaf is true if the node represents
        // end of a word
        boolean leaf;
        
        // Constructor
        public TrieNode() {
            leaf = false;
            for (int i =0 ; i< SIZE ; i++)
                    Child[i] = null;
        }
    }
     
    // If not present, inserts key into trie
    // If the key is prefix of trie node, just
    // marks leaf node
    static void insert(TrieNode root, String Key)
    {
        int n = Key.length();
        TrieNode pChild = root;
     
        for (int i=0; i<n; i++)
        {
            int index = Key.charAt(i) - 'a';
     
            if (pChild.Child[index] == null)
                pChild.Child[index] = new TrieNode();
     
            pChild = pChild.Child[index];
        }
     
        // make last node as leaf node
        pChild.leaf = true;
    }
     
    // A recursive function to print all possible valid
    // words present in array
    static void searchWord(TrieNode root, boolean Hash[],
                                            String str)
    {
        // if we found word in trie / dictionary
        if (root.leaf == true)
            System.out.println(str);
     
        // traverse all child's of current root
        for (int K =0; K < SIZE; K++)
        {
            if (Hash[K] == true && root.Child[K] != null )
            {
                // add current character
                char c = (char) (K + 'a');
     
                // Recursively search reaming character 
                // of word in trie
                searchWord(root.Child[K], Hash, str + c);
            }
        }
    }
     
    // Prints all words present in dictionary.
    static void PrintAllWords(char Arr[], TrieNode root, 
                                              int n)
    {
        // create a 'has' array that will store all 
        // present character in Arr[]
        boolean[] Hash = new boolean[SIZE];
     
        for (int i = 0 ; i < n; i++)
            Hash[Arr[i] - 'a'] = true;
     
        // tempary node
        TrieNode pChild = root ;
     
        // string to hold output words
        String str = "";
     
        // Traverse all matrix elements. There are only 
        // 26 character possible in char array
        for (int i = 0 ; i < SIZE ; i++)
        {
            // we start searching for word in dictionary
            // if we found a character which is child
            // of Trie root
            if (Hash[i] == true && pChild.Child[i] != null )
            {
                str = str+(char)(i + 'a');
                searchWord(pChild.Child[i], Hash, str);
                str = "";
            }
        }
    }
     
    //Driver program to test above function
    public static void main(String args[])
    {
        // Let the given dictionary be following
      
     
        // Root Node of Trie
        TrieNode root = new TrieNode();
     
        // insert all words of dictionary into trie
        int n = Dict.length;
        for (int i=0; i<n; i++)
            insert(root, Dict[i]);
     
        
        int N = arr.length;
     
        PrintAllWords(arr, root, N);
    }
}
// This code is contributed by Sumit Ghosh

*/