package crawler;


public class CrawlController {
	public static void main(String[] args){
		String url = "https://readyfor.jp/projects/hotrelax";
		//TestCrawler tc = new TestCrawler();
		ReadyForCrawler basiccrawler = new ReadyForCrawler(url);		
		System.out.println(basiccrawler.projectSet());
	}
	
	
}
