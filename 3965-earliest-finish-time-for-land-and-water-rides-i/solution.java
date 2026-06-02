class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < wst.length; j++) {
                int landFinish = lst[i] + ld[i];
                int waterStart = Math.max(landFinish, wst[j]);
                int finish1 = waterStart + wd[j];
                int waterFinish = wst[j] + wd[j];
                int landStart = Math.max(waterFinish, lst[i]);
                int finish2 = landStart + ld[i];
                ans = Math.min(ans, Math.min(finish1, finish2));
            }
        }

        return ans;
    }
}
