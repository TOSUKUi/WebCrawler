package crawler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jaunt.component.*;

import crawler.data.Project;

import com.jaunt.*;

public class ReadyForCrawler {
	UserAgent ua;
	String url;
	ReadyForCrawler(String url){
		this.url = url;		
		this.ua = new UserAgent();
		try{
			this.ua.visit(url);
		}catch(JauntException e){
			System.err.println(e);
		}
		
	}	
	
	
	public HashSet<String> projectSet(){
		Pattern project = Pattern.compile("https://readyfor.jp/projects/.+");
		HashSet<String> outs = new HashSet<String>();		
		Elements anchor;
		//System.out.println(this.ua.doc.outerHTML());
		try {
			anchor = this.ua.doc.findEach("<a href>");
			for(Element links : anchor){				
				Matcher mproject = project.matcher(links.getAt("href"));
				if(mproject.find()){					
					outs.add(links.getAt("href"));
				}
			}
		}catch(JauntException e){
				e.printStackTrace();
		}
		return outs;
		
	}
	
	public Project toProject(){
		this.ua.doc.findAttributeValues("Project-visual__body");
		
		
		
		Project p = new Project(0, url, 0, url, 0, 0, null, 0, null);
		return null;
	}
	
	public String toHtml(){
		return this.ua.doc.innerHTML();
	}
	
	
}
