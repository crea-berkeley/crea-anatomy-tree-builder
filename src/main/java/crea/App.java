package crea;


import java.io.IOError;
import java.io.IOException;

public class App
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello World");
        TreeBuilder treeBuilder = new TreeBuilder("theories.tree");
        treeBuilder.buildTree();
    }
}
