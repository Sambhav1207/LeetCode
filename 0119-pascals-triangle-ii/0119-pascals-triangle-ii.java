class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(i == 0 || i == 1){
                    arr.add(1);
                }else{
                    if(j == 0 || j == i){
                        arr.add(1);
                    }else{
                        arr.add(ans.get(j - 1) + ans.get(j));
                    }
                }
            }
            ans = arr;
        }
        return ans;        
        /*
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1));
        for(int i = 1; i <= rowIndex; i++){
            List<Integer> list1 = new LinkedList<>();
            list1.add(1);
            List<Integer> list2 = list.get(i - 1);
            for(int j = 0; j < list2.size() - 1; j++){
                list1.add(list2.get(j) + list2.get(j + 1));
            }
            list1.add(1);
            list.add(list1);
        }
        return list.get(rowIndex);
        */
    }
}