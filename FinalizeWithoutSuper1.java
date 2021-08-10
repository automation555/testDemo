import java.lang.*;
public class FinalizeWithoutSuper1 
    { 
		@Override
    protected void finalize() throws Throwable
    {
        try
        {
            //release resources here
        } 
        catch(Throwable t) 
        {
            throw t;
        } 
        finally
        {
           
        }
    }
	
	 protected final Object clone() throws CloneNotSupportedException 
    {
    	CloneWithoutSuper objectBad = new CloneWithoutSuper();     
        objectBad.setDate(new Date(theDate.getTime()));
        return objectBad;
    }
    }
