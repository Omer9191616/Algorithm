package Practical_20;

public class sierpinskiCarpet {
    //     array  to store the carpet
    static String [][] carpet;
    //size stores the dimension size of the carpet
    static int size;

    public sierpinskiCarpet(int x) {
        // function use to creates the array of size and initialize it with stars
        this.size=x;
        carpet=new String[size][size];
        int a=0;int b=0;
        while(a<x)
        {
            b=0;
            while(b<x)
            {
                this.carpet[a][b]=" * ";
                b++;
            }
            a++;
        }

    }
    public static void makeEmpty(int size,int x,int y)
    {
//        function  used for removing the middle block to make carpet
        int i=y+size/3;int j=0;
        while(i<=y+2*(size/3)-1)
        {
            j=x+size/3;
            while(j<=x+2*(size/3)-1)
            {
                carpet[i][j]="   ";
                j++;
            }
            i++;
        }
    }
    public static void create(String[][] carpet, int x,int y, int size)
    {
        //empty the center block
        makeEmpty(size,x,y);

//        if size is less than one return
        if(size<=1)
        {
            return;
        }
        int i=0;int j=0;
        //loops to go through all  blocks
        while(i<size)
        {
            j=0;
            while(j<size)
            {
//                recursive function to move to the 3n-1x3n-1 block
                create(carpet,i+y,j+x,size/3);
                j+=(size/3);
            }
            i+=(size/3);
        }

    }
    public static void print(int size){
//        loops through all the array and prints it
        int i=0;int j=0;String output="";
        while(i<size)
        {
            j=0;output="";
            while(j<size)
            {
                output+=carpet[i][j];
                j++;
            }
            System.out.println(output);
            i++;
        }
    }
    //main function
    public static void main(String[] args) {
        System.out.println("Carpet is created and initi" +
                "alized with stars");
        //set a new carpet of size 27
        sierpinskiCarpet board=new sierpinskiCarpet(27);
        print(27);
//converting

        System.out.println("Converting  into sierpinski carpet");
        create(carpet,0,0,27);
        //print
        print(27);
    }
}