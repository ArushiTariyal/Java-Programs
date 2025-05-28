public class MColoringProblem_Recursion_Optimal {
    class Solution {
        public boolean assignColors(int v, int[][] edges, int m, int node, int[] colors){
            if(node==v) return true;

            for(int col = 1; col<=m; col++){
                if(isPossible(node, col, edges, colors)){
                    colors[node] = col;
                    if(assignColors(v,edges,m,node+1,colors)) return true;
                    else colors[node] = 0;
                }
            }
            return false;
        }
        public boolean isPossible(int node, int col, int[][] edges, int[] colors){

            // for(int i: edges[][0]){
            //     if(i==0){
            //         for(int j: edges[]){
            //             if(colors[j]==col) return false;
            //         }
            //     }
            // }

            for(int i = 0; i<edges.length; i++){
                if(edges[i][0]==node){
                    for(int j = 0; j<edges[i].length; j++){
                        if(colors[edges[i][j]]==col) return false;
                    }
                }
            }
            return true;
        }
        boolean graphColoring(int v, int[][] edges, int m) {
            // code here
            int[] colors = new int[v];
            return assignColors(v,edges,m,0,colors);

        }
    }
}
