public class hello {
    public static void main(String[] args) {
        int[] temp = {30,543,1,4,6,300,40};

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(temp);

        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

    }
}
