class New
{
    static void rec(int num)
    {
        if(num>0)


        rec(num-1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        rec(20);

    }
}