package CP;

// import java.util.Arrays;
// import java.util.List;
import java.util.*;
class SegmentTree{
    int n;
    List<Integer> segments;
    SegmentTree(int n){
        this.n = n;
        Integer arr[] = new Integer[4*n];
        Arrays.fill(arr, 0);
        segments = Arrays.asList(arr);

    }

    void createSegmentTreeHelper(int start,int end,int node,List<Integer> values){
        //termination case(leaf node)
        if(start == end){
            segments.set(node, values.get(start));
            return;
        }
        //compute mid
        int mid = (start+end)/2;
        //create left sub tree
        createSegmentTreeHelper(start,mid,2*node+1,values);
        //create right sub tree
        createSegmentTreeHelper(mid+1,end,2*node+2,values);
        //backtracking
        //fill the ancestors
        int leftChildval = segments.get(2*node+1);
        int rightChildval = segments.get(2*node+2);

        //update ancestor
        int ancestor = leftChildval+rightChildval;
        segments.set(node,ancestor);
    }

    void createSegmentTree(List<Integer> values){
        createSegmentTreeHelper(0,n-1,0,values);
    }

    int rangeQueryHelper(int start,int end,int left,int right,int node){
        //no overlapping
        if(start>right || end<left){
            return 0;//not found in this sub tree
        }
        //complete overlapping
        if (start>=left && end<=right) {
            return segments.get(node);
        }
        //partial overlapping
        int mid = (start+end)/2;
        int leftNodeVal = rangeQueryHelper(start, mid, left, right, 2*node+1);
        int rightNodeVal = rangeQueryHelper(mid+1,end, left, right, 2*node+2);
        return leftNodeVal+rightNodeVal;
    }

    int rangeQuery(int left,int right){
        return rangeQueryHelper(0,n-1,left, right,0);
    }

    void updateHelper(int startIndex, int endIndex,int node, int index, int value){
        // Termination Case
        if(startIndex == endIndex){
            segments.set(node, value);
            return ; 
        }
        
        int mid = (startIndex + endIndex )/2;
        // either Lookup the Value on Left SubTree or Right SubTree
        if(index<=mid){
            // Go to Left Sub Tree
            updateHelper(startIndex, mid, 2*node+1, index, value);
        }
        else{
            // Go to Right Sub Tree
            updateHelper(mid+1, endIndex, 2*node+2, index, value);
        }
        // Back Track
        // Update Ancestor Update
        int leftChildValue = segments.get(2 * node + 1);
        int rightChildValue = segments.get(2 * node + 2);
        int ancestor = leftChildValue + rightChildValue;
        segments.set(node, ancestor);

    }

    void update(int index, int value){
        updateHelper(0, n-1, 0, index, value);
    }
}

class Segment_Tree_Example {
    public static void main(String[] args) {
        List<Integer> arrayValues = Arrays.asList(1,2,3,4,5,6,7,8);
        SegmentTree obj = new SegmentTree(arrayValues.size());
        obj.createSegmentTree(arrayValues);
        System.out.println("(0,4)"+obj.rangeQuery(0, 4));
        System.out.println("(2,5)"+obj.rangeQuery(2,5));
        obj.update(4, 100);
        System.out.println("*********** After Update");
        System.out.println("Range (0,4) " +obj.rangeQuery(0, 4));
        System.out.println("Range (2,5) " +obj.rangeQuery(2, 5));
    }
}
