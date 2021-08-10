
import java.net.*;
import java.io.*;
public class UnencryptedSocket{
	// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET
	Socket soc = new Socket("www.google.com",80);
	// EMB-ISSUE: CodeIssueNames.UNENCRYPTED_SOCKET
	Socket soc2 = new Socket("127.0.0.1",5000);
}
