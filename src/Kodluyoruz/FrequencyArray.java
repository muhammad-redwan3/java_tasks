package Kodluyoruz;

public class FrequencyArray {
    public static void main(String[] args) {

        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        int [] tekrar  = new int[array.length];
        int index = -1;

        for(int i=0;i<array.length; i++)
        {
            int count =1;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i] == array[j])
                {
                    count++;
                    tekrar [j] = index;
                }
            }
            if(tekrar [i]!=index)
                tekrar [i]=count;
        }

        for(int i=0;i<tekrar .length;i++)
        {
            if(tekrar [i]!=index)
                System.out.println(array[i] +" sayısı  "+tekrar [i]+" kere tekrar edildi");
        }

    }
}
