package wayfair;

import java.util.HashMap;

public class SubDomainVisitCount {

	public static void main(String[] args) {
		String[] domains = {"900 google.mail.com" , "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		
		System.out.println(subDomainVisits(domains));

	}
	private static HashMap<String, Integer> subDomainVisits(String[] domains){
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(String si : domains) {
			String[] s = si.split(" ");
			int val = Integer.valueOf(s[0]);
			String[] ss = s[1].split("\\.");
			String dom = "";
			
			for(int i=ss.length-1;i>=0;i--) {
				dom = ss[i] + (dom.length() > 0 ? "." : "") + dom;
				hm.putIfAbsent(dom, 0);
				hm.put(dom, hm.get(dom) + val);
			}
					
		}
		return hm;
	}

}
