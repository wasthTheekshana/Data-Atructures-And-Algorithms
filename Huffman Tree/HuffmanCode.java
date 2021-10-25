package mean;

public class HuffmanCode  {
     public static MyHashMap<Character,String> mapA=new MyHashMap<Character ,String>();
  
   
    public static Node buildTree(int[] charFreqs) {
      
        PQueue<Node> trees = new PQueue<Node>();
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));
 

        while (trees.size() > 1) {
            Node a = trees.poll();
            Node b = trees.poll();
            trees.offer(new HuffmanNode(a, b));
        }
      
        return trees.poll();
    }
  
 
    public static void printCodes(Node tree, StringBuffer prefix) {
      
        assert tree != null;
      
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;
 
            System.out.println(leaf.data + "\t" + leaf.frequency + "\t" + prefix);
            mapA.put(leaf.data,prefix.toString());

        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1);
 

            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
 
    public static   void decode(String S, Node root)
{
    StringBuilder sb = new StringBuilder();
    Node c = root;
    for (int i = 0; i < S.length(); i++) {
        c = S.charAt(i) == '1' ? c.right : c.left;
        if (c.left == null && c.right == null) {
            sb.append(c.data);
            c = root;
        }
    }
    System.out.print("decode the message : "+sb);
}

    
    public static void main(String[] args) {
         String test = "this is an example of a Huffman tree";
        int[] charFreqs = new int[256];
      
        for (char c : test.toCharArray())
            charFreqs[c]++;
 
        Node tree = buildTree(charFreqs);
   System.out.println("SYMBOL\tWEIGHT\tHUFFMAN CODE");
   
        printCodes(tree, new StringBuffer());
        StringBuffer s = new StringBuffer();
      
        for(int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            s.append(mapA.get(c));
        }
      
       decode(s.toString(), tree);

    }
}