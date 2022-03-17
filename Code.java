public class Code
{
	//I learned to push and pull using java -Vagish
    interface PQuotient
    {
        void printQuotient(float x, float y);
    }

    interface PerfectSquare
    {
        boolean isPerfectSquare(double n);
    }

    public Code()
    {
		PQuotient run = (x,y)-> System.out.printf("The quotient of %.3f and %.3f is : %.3f",x,y,x/y);
        run.printQuotient(4.0f,6.0f);

        PerfectSquare ps = (double x)->
        {
            double num = Math.sqrt(x);
            if(num%1==0)
                return true;
            return false;
        };
        System.out.println(ps.isPerfectSquare(64));
        System.out.println(ps.isPerfectSquare(5));

    }
    public static void main(String[]args)
    {
        Code app = new Code();
    }

}