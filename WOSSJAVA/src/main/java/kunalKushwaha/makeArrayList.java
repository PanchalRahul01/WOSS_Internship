package kunalKushwaha;

public class makeArrayList {

    private int[] data;
    private int defaultSize=10;
    private int size=0;

    public makeArrayList(){
        this.data=new int[defaultSize];
    }

    public void addData(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    public boolean isFull(){
        return size==defaultSize;
    }

    public void resize(){
        int[] temp=new int[defaultSize*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    }

    public static void main(String[] args) {
        makeArrayList list=new makeArrayList();

        int length=list.size();
        list.addData(10);
        list.addData(20);
        list.addData(30);
        list.addData(40);
        list.addData(50);
        list.addData(60);
        list.addData(70);
        list.addData(80);
        list.addData(90);
        list.addData(10);
        list.addData(20);


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        System.out.println("<UNK>"+list);



    }
}
