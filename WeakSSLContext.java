import javax.net.ssl.SSLContext;

public class WeakSSLContext {
	// EMB-ISSUE: CodeIssueNames.WEAK_SSLCONTEXT
	SSLContext context1 = SSLContext.getInstance("SSL");
	// EMB-ISSUE: CodeIssueNames.WEAK_SSLCONTEXT/no-detect
	SSLContext sslContext = SSLContext.getInstance("TLS");
}
