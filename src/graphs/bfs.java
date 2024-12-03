package graphs;
import java.util.*;

public class bfs {
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
    public static List<Integer> helper(List<List<Integer>> adjList){
        boolean[] vis =new boolean[adjList.size()];
        List<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();

        q.add(0); // for 0 based indexing graph
        vis[0]=true;
//        q.add(1)   for 1 based indexing graph
//        vis[1]=true;
        while (!q.isEmpty()){
            int node=q.poll();
            list.add(node);

            for(int i:adjList.get(node)){
                if(!vis[i]){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        return list;
    }

    public static List<Integer> bfs(List<List<Integer>> adjList){
        boolean[] vis =new boolean[adjList.size()-1];
        List<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();

        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()){
            int node =q.poll();
            list.add(node);
            for(int i:adjList.get(node)){
                if(!vis[i]){
                    q.add(i);
                    vis[i]=true;
                }
            }
        }
        return list;
    }
}
