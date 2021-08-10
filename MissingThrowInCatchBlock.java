import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;
public class MissingThrowInCatchBlock{
	public static void main(String args[]) {
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(getUrl());
		} 
		// EMB-ISSUE: CodeIssueNames.MISSING_THROW_IN_CATCH_BLOCK/no-detect
		catch (SQLException e) {
			throw new IllegalArgumentException("Integer already added.");
		}
	    try {
	    	PreparedStatement  ps = ((java.sql.Connection) conn).prepareStatement("");
	    } 
    	// EMB-ISSUE: CodeIssueNames.MISSING_THROW_IN_CATCH_BLOCK
	    catch (SQLException throwables) {
	        new SARDScannerException(throwables);
	    }
	    try {
			addInteger(1);
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
			
		}
	  }
	
}
