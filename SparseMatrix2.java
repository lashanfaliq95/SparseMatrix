
import java.util.HashMap;

public class SparseMatrix {
    private int size;
    HashMap<Integer,Integer> map;
    public SparseMatrix(){

    }

    // create an empty square matrix of given size
    public void createEmptyMatrix(int size) {
        map=new HashMap<>();
        this.size = size;
    }

    // put A[i][j] = 1
    public void set(int i, int j) {
        map.put(i*this.size+j,1);

    }

    // return value at A[i][j]
    public int get(int i, int j) {
        
        if(map.containsKey(i*this.size+j))
            return map.get(i*this.size+j);
        return 0;
    }
  

}

