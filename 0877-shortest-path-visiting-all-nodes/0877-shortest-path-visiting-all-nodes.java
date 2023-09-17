class Solution {
    public int shortestPathLength(int[][] graph) {
        int numNodes = graph.length;
        int allVisitedMask = (1 << numNodes) - 1;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[allVisitedMask + 1][numNodes];
        for(boolean[] row : visited){
            Arrays.fill(row, false);
        }
        for(int node = 0; node < numNodes; node++){
            int initalMask = (1 << node);
            q.add(new int[] {node, initalMask, 1});
            visited[initalMask][node] = true;
        }
        while(!q.isEmpty()){
            int[] current = q.poll();
            int currentNode = current[0];
            int currentMask = current[1];
            int currentLength = current[2];
            if(currentMask == allVisitedMask){
                return currentLength - 1;
            }
            for(int i = 0; i < graph[currentNode].length; i++){
                int neighbour = graph[currentNode][i];
                int newMask = currentMask | (1 << neighbour);
                if(visited[newMask][neighbour]){
                    continue;
                }
                q.add(new int[] {neighbour, newMask, currentLength + 1});
                visited[newMask][neighbour] = true;
            }
        }
        return -1;
    }
}