
public class ArrayIntStack implements IntStack {
    private int[] values,temp;
    private int size,limit;
    
    public ArrayIntStack (){
        limit = 10;
        values = new int[limit];
        size = 0;
        
    }
    @Override
    public void push(int value) {
        if(size==limit){
            temp = new int[limit*2];
            for(int i = 0; i < limit; i++){
                temp[i] = values[i];
            }
            
            limit = 2*limit;
            
            this.values = new int[limit];
            for(int i = 0; i < limit/2; i++){
                this.values[i] = temp[i];
            }
        } 
        values[size] = value;
        this.size++;
    }
    
    @Override
    public int pop() throws Exception{
        
        if(size == 0){
            throw new Exception("the stack is empty");
        }
        int result = values[size-1];
        size--;
        return result;
    }
     
    public int getSize(){
        return this.size;
    }
    public void clear(){
        this.size = 0;
        values = new int[limit];
    }
       
   
    @Override
    public String toString(){
        String res = "";
        for(int i = 0; i < size; i++){
            res = res + " "+ values[i];
        }
        return res;
    }
}