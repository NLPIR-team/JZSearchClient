package com.lingjoin.jzsearchAgent;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface CJZSearchAgentLibrary extends Library {

	CJZSearchAgentLibrary instance=(CJZSearchAgentLibrary) Native.loadLibrary("JZSearchAgent", CJZSearchAgentLibrary.class);
	
	public String jzsearch_query_client(String query_line,int nStart,int nPageCount,String sHostIP,int nPortID);
	
	public boolean jzsearch_query_client_exit();
}
