public abstract class KorgusegaKujund{
	double korgus;
	public KorgusegaKujund(double uusKorgus){
		korgus=uusKorgus;
	}
	public abstract double pohjaPindala();
	public double ruumala(){
		return pohjaPindala()*korgus;
	}
}