package javacodechecker;

public class CloneWithoutSuper1 implements Cloneable{
	private Date theDate = new Date();

    public void setDate(Date theDate) 
    {
        this.theDate = (Date) theDate.clone();
    }
        
    // EMB-ISSUE:CodeIssueNames.CLONE_WITHOUT_SUPER/no-detect 
    protected final Object clone() throws CloneNotSupportedException 
    {
    	CloneWithoutSuper objectBad = new CloneWithoutSuper();
    	super.clone();
        objectBad.setDate(new Date(theDate.getTime()));
        return objectBad;
    }
    
    public void bad() throws CloneNotSupportedException
    { 
        
    	CloneWithoutSuper myClone = (CloneWithoutSuper)clone();

        myClone.setDate(new Date());
    }

}
