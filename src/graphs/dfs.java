package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dfs {
    public static List<Integer> helper(List<List<Integer>> adjList){
        boolean[] vis=new boolean[adjList.size()];
        vis[0]=true;
        List<Integer> ls =new ArrayList<>();
        dfsHelper(0,vis,adjList,ls);
        return ls;
    }

    private static void dfsHelper(int node, boolean[] vis, List<List<Integer>> adjList, List<Integer> ls) {
        vis[node]=true;
        ls.add(node);
        for(int it:adjList.get(node)){
            if(!vis[it]){
                dfsHelper(it,vis,adjList,ls);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList=new ArrayList<>();
        adjList.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adjList.add(new ArrayList<>(Arrays.asList(0)));
        adjList.add(new ArrayList<>(Arrays.asList(0, 4)));
        adjList.add(new ArrayList<>(Arrays.asList(0)));
        adjList.add(new ArrayList<>(Arrays.asList(2)));

        List<Integer> l=helper(adjList);
        for(int i:l){
            System.out.print(i+" ");
        }
    }
}
