import java.util.HashMap;

public class SparseMatrix {
    private int size;
    HashMap<Index,Integer> map;
    public SparseMatrix(){

    }

    // create an empty square matrix of given size
    public void createEmptyMatrix(int size) {
        map=new HashMap<>();
        this.size = size;
    }

    // put A[i][j] = 1
    public void set(int i, int j) {
        map.put(new Index(i,j,size),1);

    }

    // return value at A[i][j]
    public int get(int i, int j) {
        Index temp=new Index(i,j,size);
        if(map.containsKey(temp))
            return map.get(temp);
        return 0;
    }

}

class Index{
    protected int x;
    protected int y;
    protected int size;

    Index(int x,int y,int size){
        this.x=x;
        this.y=y;
        this.size=size;
    }

    public int getX() {
        return x;
    }

 

    public int getY() {
        return y;
    }



    public int getSize() {
        return size;
    }

  


    @Override
    public boolean equals(Object o) {


        if(((Index) o).getX() == this.getX() && ((Index) o).getY()==this.getY()){
            return  true;
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode() {

         return this.getX()*this.getSize()+this.getY();
    }



}
