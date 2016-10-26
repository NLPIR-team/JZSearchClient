package com.lingjoin.jzsearchAgent;

public class JZSearchClient {

	String sHostIP=null;
	int nPortID=0;
	
	public JZSearchClient(String ip,int port){
		this.sHostIP=ip;
		this.nPortID=port;
	}
	
	public String search(String query,int nStart,int nPageCount){
		if(sHostIP==null||sHostIP.isEmpty())
			try {
				throw new Exception("IP is null!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		return CJZSearchAgentLibrary.instance.jzsearch_query_client(query, nStart, nPageCount, sHostIP, nPortID);
	}
	
	public boolean exit(){
		return CJZSearchAgentLibrary.instance.jzsearch_query_client_exit();
	}
}
