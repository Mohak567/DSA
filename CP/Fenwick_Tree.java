package CP;
import java.util.*;
class fenwickTree{
    int n;
    List<Integer> list;
    fenwickTree(int n){
        this.n = n+1;
        Integer arr[] = new Integer[this.n];
        Arrays.fill(arr, 0);
        list = Arrays.asList(arr);
    }
    void add(int index,int value){
        //consider index from 1
        index++;//1 based indexing
        while (index<n) {
            list.set(index,list.get(index)+value);
            index += (index & (-index));//lsb       
        }
    }

    int rangeQuery (int left,int right){
        return sum(right)-sum(left-1);
    }

    int sum(int index){
        index++;
        int result = 0;
        while (index>0) {
            result += list.get(index);

            index -= (index & (-index));//lsb
        }
        return result;
    }
}

class Fenwick_Tree_Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        fenwickTree obj = new fenwickTree(list.size());
        for(int i=0;i<list.size();i++){
            obj.add(i,list.get(i));
        }
        System.out.println(("Range (3,4)"+obj.rangeQuery(3,4)));
        System.out.println(("Range (3,5)"+obj.rangeQuery(3,5)));
    }
}
