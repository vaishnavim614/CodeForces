import java.util.ArrayList;



class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list.add(i+1);
        }
        int ans=funtion(list,0,k);
        return ans;
    }
    public int funtion(ArrayList<Integer> list,int ind,int k){
        if(list.size()==1){
            return list.get(0);
        }
        int temp=(ind+k-1)%list.size();
        list.remove(temp);
        int ans=funtion(list,temp,k);
        return ans;

    }
}