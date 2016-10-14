import java.util.*;
public class Proov1{
	public static void main(String[] arg){
		Silinder s1=new Silinder(10, 3);
		System.out.println(s1.ruumala());
		List<KorgusegaKujund> kujundid=new ArrayList<KorgusegaKujund>();
		kujundid.add(s1);
		kujundid.add(new Risttahukas(3, 4, 5));
		for(KorgusegaKujund k: kujundid){
			System.out.println(k.ruumala());
		}
	}
}