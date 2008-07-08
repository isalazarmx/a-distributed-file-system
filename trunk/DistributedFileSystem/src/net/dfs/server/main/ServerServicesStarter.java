/**
 * 
 */
package net.dfs.server.main;

import net.dfs.server.filesplitter.SplitFile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerServicesStarter {
	private Log log = LogFactory.getLog(ServerServicesStarter.class);

	public static void main(String args []){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("net\\dfs\\server\\filespace\\creator\\spring-server.xml");
		SplitFile splitfile = (SplitFile) context.getBean("splitfile");
		
		splitfile.split();
		
	}
}