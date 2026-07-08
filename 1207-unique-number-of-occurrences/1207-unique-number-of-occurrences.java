class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int n = arr.length;
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];   
        for(int i = 0; i < n; i++){
            if(visited[i]) continue;  
            int count = 1;
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;  
                }
            }
            freq[i] = count;
        }
        for(int i = 0; i < n; i++){
            
            if(freq[i] == 0) continue;
            
            for(int j = i + 1; j < n; j++){
                if(freq[i] == freq[j] && freq[j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
