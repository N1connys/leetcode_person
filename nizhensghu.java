

//题目大意是输入123可以输出321
//思路
//我是先在纸上想两位数该怎么写，怎么得到后面位数的值和让他十倍的变大
//先得到某个数的余数，然后再通过用10除以这个数，得到倒数第二个数。以此类推
//如果是三位数那么，第一个余数在result=0之前会被乘以两次十，倒数第二位的会被乘以一次10，而第三位由于result=0不会再继续乘了。
//从而得到倒序出来的值 如：
//    input 321，output，123



public class math {
    public int nmath(int result)
    {
        int t=0;
        while(result!=0)
        {
            t=t*10+result%10;
            result=result/10;
        }
        return t;
    }

}
