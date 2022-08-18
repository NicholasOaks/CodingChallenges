

public class Sorting{

    public static void main(String[] args) {
        
        int[] intlist = new int[]{4,6,2,3,8,9};

        int[] sortedlist = Sort(intlist);

        for(int x = 0;x<sortedlist.length;x++){
            System.out.print(sortedlist[x]+" : ");
        }




    }





    public static int[] Sort(int[] list) {

        for(int x = 0;x < list.length-1;x++){

            int y = x+1;

            while(y < list.length){
                if(list[x]>list[y]){
                    int z = list[y];
                    list[y] = list[x];
                    list[x] = z;
                }
                y++;
            } 

        }

        return list;
    }

}